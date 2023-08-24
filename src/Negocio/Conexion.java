package Negocio;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * @authors G2 SoftwareSolutions
 */
public class Conexion {

    Correo email = new Correo();
    
    Connection cn;
    Statement st;
    ResultSet rs;

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
    
    //Codigo para presentar las tablas y aplicar filtros de busqueda
    public void busqueda_y_despliegue(JTable jTabla, String selectTabla, String SQL) {
        try {
            cn = conectar();
            st = cn.createStatement();
            rs = st.executeQuery(SQL);
            if (selectTabla.equals("Users")) {
                Object[] users = new Object[4];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"N°Cédula", "Usuario", "Correo electrónico", "Rol"});
                while (rs.next()) {
                    users[0] = rs.getString("Cedula");
                    users[1] = rs.getString("Nombre_Usuario");
                    users[2] = rs.getString("Correo");
                    users[3] = rs.getString("Rol");
                    tabla.addRow(users);
                }
                jTabla.setModel(tabla);
            }
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
