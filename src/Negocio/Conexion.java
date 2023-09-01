package Negocio;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
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

    //Abrir conexión
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

    //Validar usuario y contraseña
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

    //Cerrar conexión
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

    //Recuperar contraseña
    public boolean recuperarDatos(String tipo, String cedula) {
        try {
            String resultado;
            String destinatario;
            int envio;
            cn = conectar();
            String query = "SELECT " + tipo + ", correo from Users u JOIN  Personas p ON p.Cedula = u.Cedula WHERE u.cedula = ?;";
            PreparedStatement preparedStatement = cn.prepareStatement(query);
            preparedStatement.setString(1, cedula);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                resultado = resultSet.getString(tipo);
                destinatario = resultSet.getString("correo");
                String mensaje = "<html><body style=\"text-align:center;\">"
                    + "<h1 style=\"font-size:32px;color:rgb(250,183,22);\">Sistema de Gestión e Inventario Mousai-SGIM</h1>"
                    + "<p style=\"font-size:24px;\">Recuperación de " + tipo + ": <strong>" + resultado + "</strong></p>"
                    + "<p style=\"font-size:16px;color:gray;\">Si usted no generó este mensaje, cambie su contraseña inmediatamente.</p>"
                    + "</body></html>";
                envio = email.enviarCorreos(mensaje, destinatario);
                if (envio == 1) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //Código para presentar las tablas y aplicar filtros de busqueda
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
            } else if (selectTabla.equals("Instrumentos")) {
                Object[] instrumentos = new Object[6];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Código", "Nombre", "Fabricante", "Categoría", "Estado Alquiler", "Condición"});
                while (rs.next()) {
                    instrumentos[0] = rs.getString("Codigo");
                    instrumentos[1] = rs.getString("Nombre");
                    instrumentos[2] = rs.getString("Fabricante");
                    instrumentos[3] = rs.getString("Categoria");
                    instrumentos[4] = rs.getString("EstadoAlquiler");
                    instrumentos[5] = rs.getString("Condicion");
                    tabla.addRow(instrumentos);
                }
                jTabla.setModel(tabla);
            } else if (selectTabla.equals("Libros")) {
                Object[] libros = new Object[6];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Código", "Nombre", "Autor", "Categoría", "Estado Alquiler", "Condición"});
                while (rs.next()) {
                    libros[0] = rs.getString("Codigo");
                    libros[1] = rs.getString("Nombre");
                    libros[2] = rs.getString("Autor");
                    libros[3] = rs.getString("Categoria");
                    libros[4] = rs.getString("EstadoAlquiler");
                    libros[5] = rs.getString("Condicion");
                    tabla.addRow(libros);
                }
                jTabla.setModel(tabla);
            } else if (selectTabla.equals("PagosTotales")) {
                Object[] PagosTotales = new Object[5];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Código Pensión", "N°Cédula", "Mes", "Valor", "Estado"});
                while (rs.next()) {
                    PagosTotales[0] = rs.getString("Codigo_pension");
                    PagosTotales[1] = rs.getString("Cedula_estudiante");
                    PagosTotales[2] = rs.getString("Mes");
                    PagosTotales[3] = rs.getString("Total_cancelado");
                    PagosTotales[4] = rs.getString("Pagado_Total");
                    tabla.addRow(PagosTotales);
                }
                jTabla.setModel(tabla);
            } else if (selectTabla.equals("Pagos")) {
                Object[] Pagos = new Object[5];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Código Pago", "Método Pago", "Valor", "Fecha Pago", "Tipo"});
                while (rs.next()) {
                    Pagos[0] = rs.getString("Codigo_pago");
                    Pagos[1] = rs.getString("Metodo_pago");
                    Pagos[2] = rs.getString("Monto");
                    Pagos[3] = rs.getString("Fecha_Pago");
                    Pagos[4] = rs.getString("Abono");
                    tabla.addRow(Pagos);
                }
                jTabla.setModel(tabla);
            } else if (selectTabla.equals("Usuarios_Inactivos")) {
                Object[] inactivos = new Object[4];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Cédula", "Nombres", "Apellidos", "Rol"});
                while (rs.next()) {
                    inactivos[0] = rs.getString("cedula");
                    inactivos[1] = rs.getString("nombres");
                    inactivos[2] = rs.getString("apellidos");
                    inactivos[3] = rs.getString("rol");
                    tabla.addRow(inactivos);
                }
                jTabla.setModel(tabla);
            } else if (selectTabla.equals("Bloqueados")) {
                Object[] bloqueados = new Object[6];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Cédula", "Nombres", "Apellidos", "Correo", "Usuario", "Estado"});
                while (rs.next()) {
                    bloqueados[0] = rs.getString("cedula");
                    bloqueados[1] = rs.getString("nombres");
                    bloqueados[2] = rs.getString("apellidos");
                    bloqueados[3] = rs.getString("Correo");
                    bloqueados[4] = rs.getString("Nombre_Usuario");
                    bloqueados[5] = "Bloqueado";
                    tabla.addRow(bloqueados);
                }
                jTabla.setModel(tabla);
            } else if (selectTabla.equals("Calendario")) {
                Object[] horarios = new Object[7];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Código horario", "Aula", "Materia", "Cédula profesor", "Profesor asignado", "Cupos disponibles", "Horario"});
                while (rs.next()) {
                    horarios[0] = rs.getString("Codigo_horario");
                    horarios[1] = rs.getString("Aula");
                    horarios[2] = rs.getString("Materia");
                    horarios[3] = rs.getString("Cedula_profesor");
                    horarios[4] = rs.getString("ProfesorAsignado");
                    horarios[5] = rs.getString("Cupos_disponibles");
                    horarios[6] = rs.getString("Horario");
                    tabla.addRow(horarios);
                }
                jTabla.setModel(tabla);
            } else if (selectTabla.equals("Clases")) {
                Object[] clases = new Object[5];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Código de clase", "Aula", "Materia", "Cédula profesor", "Profesor asignado"});
                while (rs.next()) {
                    clases[0] = rs.getString("Codigo_Clase");
                    clases[1] = rs.getString("Aula");
                    clases[2] = rs.getString("Materia");
                    clases[3] = rs.getString("Cedula_profesor");
                    clases[4] = rs.getString("ProfesorAsignado");
                    tabla.addRow(clases);
                }
                jTabla.setModel(tabla);
            } else if (selectTabla.equals("Asistencia")) {
                Object[] asistencia = new Object[7];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Código horario", "Cédula", "Estudiante", "Materia", "Aula", "Horario", "Asistencia"});
                while (rs.next()) {
                    asistencia[0] = rs.getString("Codigo_Horario");
                    asistencia[1] = rs.getString("Cedula");
                    asistencia[2] = rs.getString("Estudiante");
                    asistencia[3] = rs.getString("Materia");
                    asistencia[4] = rs.getString("Aula");
                    asistencia[5] = rs.getString("Horario");
                    asistencia[6] = rs.getInt("asistencia") == 0 ? "Presente" : "Ausente";
                    tabla.addRow(asistencia);
                }
                jTabla.setModel(tabla);
            }
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void update(String SQL) {
        try {
            cn = conectar();
            st = cn.createStatement();
            st.executeUpdate(SQL);
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ResultSet query(String SQL) {
        try {
            cn = conectar();
            st = cn.createStatement();
            rs = st.executeQuery(SQL);
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return rs;
    }

    //Validación para cédulas duplicadas
    public boolean cedulaDuplicada(String cedula) {
        try {
            String SQL = "SELECT count(*) as count FROM Personas WHERE Cedula = ?";
            cn = conectar();
            PreparedStatement preparedStatement = cn.prepareStatement(SQL);
            preparedStatement.setString(1, cedula);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt("count");
            return count > 0;
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    //Preparar Querys
    public String prepararAtributos(ArrayList<String> atributosActualizar) {
        String parametro = "";
        Iterator i = atributosActualizar.iterator();
        while (i.hasNext()) {
            parametro += i.next() + ",";
        }
        parametro = parametro.substring(0, parametro.length() - 1);
        return parametro;
    }

    //Ingresar datos a la base de datos
    public boolean insertar_Tablas(String tabla, String parametro) {
        try {
            if (tabla.equals("Admins")) {
                String SQL = "INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES (?, ?, ?, ?,?)";
                PreparedStatement pps = cn.prepareStatement(SQL);

                // Separar el parámetro en elementos individuales
                String[] parametrosSeparados = parametro.split(",");
                // Establecer cada parámetro en el PreparedStatement
                for (int i = 0; i < parametrosSeparados.length; i++) {
                    pps.setString(i + 1, parametrosSeparados[i]);
                }
                pps.setString(parametrosSeparados.length + 1, "Administrativo");
                pps.executeUpdate();
                return true;
            } else if (tabla.equals("Clases")) {
                String SQL = "INSERT INTO Clases (Aula, Materia, Cedula_profesor) VALUES (?, ?, ?);";
                PreparedStatement pps = cn.prepareStatement(SQL);

                // Separar el parámetro en elementos individuales
                String[] parametrosSeparados = parametro.split(",");
                // Establecer cada parámetro en el PreparedStatement
                for (int i = 0; i < parametrosSeparados.length; i++) {
                    pps.setString(i + 1, parametrosSeparados[i]);
                }
                pps.executeUpdate();
                return true;
            } else if (tabla.equals("Horarios")) {
                String SQL = "INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora, Cupos_disponibles) VALUES (?, ?, ?, ?);";
                PreparedStatement pps = cn.prepareStatement(SQL);

                // Separar el parámetro en elementos individuales
                String[] parametrosSeparados = parametro.split(",");
                // Establecer cada parámetro en el PreparedStatement
                for (int i = 0; i < parametrosSeparados.length; i++) {
                    pps.setString(i + 1, parametrosSeparados[i]);
                }
                pps.executeUpdate();
                return true;
            } else if (tabla.equals("Asistencia")) {
                String SQL = "INSERT INTO Asignacion_cupos (Codigo_Clase, Cedula_estudiante, Codigo_Horario) VALUES (?, ?, ?);";
                PreparedStatement pps = cn.prepareStatement(SQL);

                // Separar el parámetro en elementos individuales
                String[] parametrosSeparados = parametro.split(",");
                // Establecer cada parámetro en el PreparedStatement
                for (int i = 0; i < parametrosSeparados.length; i++) {
                    pps.setString(i + 1, parametrosSeparados[i]);
                }
                pps.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Buscar y validar cedulas existentes
    public int busquedaCod(String tabla, String SQL, String columna) {
        int codigo = 0;
        try {
            cn = conectar();
            st = cn.createStatement();
            rs = st.executeQuery(SQL);
            if (tabla.equals("Personas")) {
                while (rs.next()) {
                    codigo = rs.getInt("count(*)");
                }
            } else if (tabla.equals("Variables") && columna.equals("cupos")) {
                while (rs.next()) {
                    codigo = rs.getInt("cupos");
                }
            } else if (tabla.equals("Variables") && columna.equals("valor_pension")) {
                while (rs.next()) {
                    codigo = rs.getInt("valor_pension");
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return codigo;
    }

    //Desplegar en fields
    public void despliegueFields(String SQL, String tabla, JTextField uno, JTextField dos, JTextField tres, JTextField cuatro,
            JTextField cinco, JTextField seis, JTextField siete, JTextField ocho, String operacion) {
        try {
            cn = conectar();
            st = cn.createStatement();
            rs = st.executeQuery(SQL);
            if (tabla.equals("Admins")) {
                while (rs.next()) {
                    if (uno != null) {
                        uno.setText("" + rs.getString("u.Cedula"));
                    }
                    if (dos != null) {
                        dos.setText("" + rs.getString("u.Nombre_Usuario"));
                    }
                    if (tres != null) {
                        tres.setText("" + rs.getString("u.Rol"));
                    }
                    if (cuatro != null) {
                        cuatro.setText("" + rs.getString("p.Correo"));
                    }
                    if (cinco != null) {
                        cinco.setText("" + rs.getString("p.Nombres"));
                    }
                    if (seis != null) {
                        seis.setText("" + rs.getString("p.Apellidos"));
                    }
                }
            } else if (tabla.equals("Users")) {
                while (rs.next()) {
                    if (uno != null) {
                        uno.setText("" + rs.getString("u.Cedula"));
                    }
                    if (dos != null) {
                        dos.setText("" + rs.getString("p.Nombres"));
                    }
                    if (tres != null) {
                        tres.setText("" + rs.getString("p.Apellidos"));
                    }
                    if (cuatro != null) {
                        cuatro.setText("" + rs.getString("u.Nombre_Usuario"));
                    }
                    if (cinco != null) {
                        cinco.setText("" + rs.getString("p.Correo"));
                    }
                }
            } else if (tabla.equals("UsersAct")) {
                while (rs.next()) {
                    if (uno != null) {
                        uno.setText("" + rs.getString("u.Cedula"));
                    }
                    if (dos != null) {
                        dos.setText("" + rs.getString("u.Nombre_Usuario"));
                    }
                    if (tres != null) {
                        tres.setText("" + rs.getString("u.Rol"));
                    }
                }
            } else if (tabla.equals("Clases")) {
                while (rs.next()) {
                    if (uno != null) {
                        uno.setText("" + rs.getString("Nombres"));
                    }
                    if (dos != null) {
                        dos.setText("" + rs.getString("Apellidos"));
                    }
                    if (tres != null) {
                        tres.setText("" + rs.getString("Correo"));
                    }
                }
            } else if (tabla.equals("Horarios")) {
                while (rs.next()) {
                    if (uno != null) {
                        uno.setText("" + rs.getString("Codigo_Clase"));
                    }
                    if (dos != null) {
                        dos.setText("" + rs.getString("Aula"));
                    }
                    if (tres != null) {
                        tres.setText("" + rs.getString("Materia"));
                    }
                    if (cuatro != null) {
                        cuatro.setText("" + rs.getString("c.Cedula_Profesor"));
                    }
                    if (cinco != null) {
                        cinco.setText("" + rs.getString("ProfesorAsignado"));
                    }
                    if (seis != null) {
                        seis.setText("" + rs.getString("Codigo_horario"));
                    }
                    if (siete != null) {
                        siete.setText("" + rs.getString("Horario"));
                    }
                }
            } else if (tabla.equals("Cupos")) {
                while (rs.next()) {
                    if (uno != null) {
                        uno.setText("" + rs.getString("h.Codigo_horario"));
                    }
                    if (dos != null) {
                        dos.setText("" + rs.getString("h.DiaSemana"));
                    }
                    if (tres != null) {
                        tres.setText("" + rs.getString("h.Hora"));
                    }
                    if (cuatro != null) {
                        cuatro.setText("" + rs.getString("c.Codigo_clase"));
                    }
                    if (cinco != null) {
                        cinco.setText("" + rs.getString("c.aula"));
                    }
                    if (seis != null) {
                        seis.setText("" + rs.getString("c.materia"));
                    }
                    if (siete != null) {
                        siete.setText("" + rs.getString("h.cupos_disponibles"));
                    }
                }
            } else if (tabla.equals("Personas")) {
                while (rs.next()) {
                    if (uno != null) {
                        uno.setText("" + rs.getString("Cedula"));
                    }
                    if (dos != null) {
                        dos.setText("" + rs.getString("Nombres"));
                    }
                    if (tres != null) {
                        tres.setText("" + rs.getString("Apellido"));
                    }
                    if (cuatro != null) {
                        cuatro.setText("" + rs.getString("Correo"));
                    }
                }
            } else if (tabla.equals("variables_del_sistema")) {
                while (rs.next()) {
                    if (uno != null) {
                        uno.setText("" + rs.getString("valor_pension"));
                    }
                    if (dos != null) {
                        dos.setText("" + rs.getString("cupos"));
                    }
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //Ejecutar querys para eliminar o actualizar
    public boolean actualizarEliminarTablas(String SQL) {
        int pos;
        try {
            cn = conectar();
            PreparedStatement PS = cn.prepareStatement(SQL);
            pos = PS.executeUpdate();
            if (pos > 0) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        return false;
    }

}
