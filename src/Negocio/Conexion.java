package Negocio;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/*
 * @authors G2 SoftwareSolutions
 */
public class Conexion {

    Connection cn;
    Correo email = new Correo();

    public Connection getConnection() {
        return cn;
    }

    public Connection conectar() {
        try (InputStream input = getClass().getResourceAsStream("/db.properties")) {
            Properties props = new Properties();
            props.load(input);

            String direccion = props.getProperty("db.url");
            String usuario = props.getProperty("db.user");
            String password = props.getProperty("db.pass");
            cn = DriverManager.getConnection(direccion, usuario, password);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
        return cn;
    }

    public boolean logIn(String perfil, String user, String password) {
        try {
            cn = conectar();
            //Hash, salt y verify de contraseña
            
            // Verificar si el usuario y contraseña son válidos en la base de datos
            String query = "SELECT COUNT(*) as count FROM users WHERE Rol = ? AND Nombre_Usuario = ? AND Contrasena = ?";
            PreparedStatement preparedStatement = cn.prepareStatement(query);
            preparedStatement.setString(1, perfil);
            preparedStatement.setString(2, user);
            preparedStatement.setString(3, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt("count");
            if (count == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void logOut() {
        try {
            if (cn != null && !cn.isClosed()) {
                cn.close();
                cn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean recuperarDatos(String tipo, String cedula) {
        try {
            String resultado;
            String destinatario;
            int envio;
            cn = conectar();
            String query = "SELECT " + tipo +", correo FROM Admins a JOIN  Users u ON u.Cedula = a.Cedula_Admin WHERE cedula = ?;";
            PreparedStatement preparedStatement = cn.prepareStatement(query);
            preparedStatement.setString(1, cedula);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                resultado = resultSet.getString(tipo);
                destinatario = resultSet.getString("correo");
                envio = email.recuperarUsuario(tipo, resultado, destinatario);
                if(envio==1)
                {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
