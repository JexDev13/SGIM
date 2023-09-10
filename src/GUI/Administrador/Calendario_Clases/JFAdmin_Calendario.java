package GUI.Administrador.Calendario_Clases;

import Negocio.Conexion;
import Negocio.Diseño;
import Negocio.Validaciones;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_Calendario extends javax.swing.JFrame {

    private int x;
    private int y;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();
    Conexion con = new Conexion();
    Validaciones val = new Validaciones();
    ButtonGroup buttonGroup = new ButtonGroup();

    private String selectTabla = "Calendario";
    private String SQL;
    String titulo = null;
    String mensaje = null;

    public JFAdmin_Calendario() {
        initComponents();
        setLocationRelativeTo(this);
        dis.jtableHead(jTClases);
        dis.jComboUsers(jCBFiltroUsers);
        this.SQL = """
                   SELECT
                       H.Codigo_horario,
                       C.Codigo_Clase,
                       C.Aula,
                       C.Materia,
                       C.Cedula_profesor,
                       CONCAT(P.Nombres, ' ', P.Apellidos) AS ProfesorAsignado,
                       H.Cupos_disponibles,
                       CONCAT(H.DiaSemana, ' ', H.Hora) AS Horario
                   FROM Clases C JOIN Horarios H 
                   ON C.Codigo_Clase = H.Codigo_Clase JOIN Personas P 
                   ON C.Cedula_Profesor = P.Cedula;""";
        con.busqueda_y_despliegue(jTClases, this.selectTabla, this.SQL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jBAumentarcupos = new javax.swing.JButton();
        jLTitTabla = new javax.swing.JLabel();
        jBAsignarHorario = new javax.swing.JButton();
        jButtonEliminarClases2 = new javax.swing.JButton();
        jLLupa = new javax.swing.JLabel();
        jTFBusqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jCBFiltroUsers = new javax.swing.JComboBox<>();
        jLFiltro = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClases = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        JBCancela1 = new javax.swing.JButton();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jButtonMinimizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(840, 595));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(840, 595));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

        jBAumentarcupos.setBackground(new java.awt.Color(250, 183, 22));
        jBAumentarcupos.setForeground(new java.awt.Color(255, 255, 255));
        jBAumentarcupos.setText("aumentar cupos");
        jBAumentarcupos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBAumentarcupos.setBorderPainted(false);
        jBAumentarcupos.setPreferredSize(new java.awt.Dimension(73, 40));
        jBAumentarcupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAumentarcuposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAumentarcuposMouseExited(evt);
            }
        });
        jBAumentarcupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAumentarcuposActionPerformed(evt);
            }
        });
        jPFondo.add(jBAumentarcupos);
        jBAumentarcupos.setBounds(180, 40, 150, 40);

        jLTitTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla.setText("Calendario");
        jPFondo.add(jLTitTabla);
        jLTitTabla.setBounds(20, 90, 150, 26);

        jBAsignarHorario.setBackground(new java.awt.Color(250, 183, 22));
        jBAsignarHorario.setForeground(new java.awt.Color(255, 255, 255));
        jBAsignarHorario.setText("asignar horarios");
        jBAsignarHorario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBAsignarHorario.setBorderPainted(false);
        jBAsignarHorario.setPreferredSize(new java.awt.Dimension(73, 40));
        jBAsignarHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAsignarHorarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAsignarHorarioMouseExited(evt);
            }
        });
        jBAsignarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAsignarHorarioActionPerformed(evt);
            }
        });
        jPFondo.add(jBAsignarHorario);
        jBAsignarHorario.setBounds(20, 40, 150, 40);

        jButtonEliminarClases2.setBackground(new java.awt.Color(250, 183, 22));
        jButtonEliminarClases2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarClases2.setText("asistencia");
        jButtonEliminarClases2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminarClases2.setBorderPainted(false);
        jButtonEliminarClases2.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarClases2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarClases2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarClases2MouseExited(evt);
            }
        });
        jButtonEliminarClases2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarClases2ActionPerformed(evt);
            }
        });
        jPFondo.add(jButtonEliminarClases2);
        jButtonEliminarClases2.setBounds(340, 40, 150, 40);

        jLLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N
        jPFondo.add(jLLupa);
        jLLupa.setBounds(660, 40, 24, 24);

        jTFBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        jTFBusqueda.setText("Buscar clase");
        jTFBusqueda.setBorder(null);
        jTFBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFBusquedaFocusLost(evt);
            }
        });
        jTFBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFBusquedaMousePressed(evt);
            }
        });
        jTFBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBusquedaActionPerformed(evt);
            }
        });
        jTFBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBusquedaKeyReleased(evt);
            }
        });
        jPFondo.add(jTFBusqueda);
        jTFBusqueda.setBounds(690, 40, 110, 30);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(250, 183, 22));
        jPFondo.add(jSeparator1);
        jSeparator1.setBounds(690, 60, 0, 3);

        jCBFiltroUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Aula", "Materia", "Profesor asignado", "Horario" }));
        jCBFiltroUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroUsersActionPerformed(evt);
            }
        });
        jPFondo.add(jCBFiltroUsers);
        jCBFiltroUsers.setBounds(690, 80, 129, 22);

        jLFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N
        jPFondo.add(jLFiltro);
        jLFiltro.setBounds(660, 80, 24, 24);

        jSeparator.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator.setForeground(new java.awt.Color(250, 183, 22));
        jPFondo.add(jSeparator);
        jSeparator.setBounds(660, 70, 160, 3);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTClases.setAutoCreateRowSorter(true);
        jTClases.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTClases.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código clase", "Aula", "Materia", "Cédula profesor", "Profesor", "Cupos disponibles", "Horario"
            }
        ));
        jTClases.setGridColor(new java.awt.Color(250, 183, 22));
        jTClases.setRowSelectionAllowed(false);
        jTClases.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTClases.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTClases.getTableHeader().setResizingAllowed(false);
        jTClases.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTClases);

        jPFondo.add(jScrollPane1);
        jScrollPane1.setBounds(20, 122, 800, 380);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Calendario");
        jPFondo.add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 270, 30);

        jLabelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setOpaque(true);
        jPFondo.add(jLabelFondo);
        jLabelFondo.setBounds(0, 30, 840, 490);

        JBCancela1.setBackground(new java.awt.Color(255, 255, 254));
        JBCancela1.setForeground(new java.awt.Color(250, 183, 22));
        JBCancela1.setText("cerrar");
        JBCancela1.setBorder(null);
        JBCancela1.setBorderPainted(false);
        JBCancela1.setFocusPainted(false);
        JBCancela1.setPreferredSize(new java.awt.Dimension(89, 40));
        JBCancela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCancela1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCancela1MouseExited(evt);
            }
        });
        JBCancela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancela1ActionPerformed(evt);
            }
        });
        jPFondo.add(JBCancela1);
        JBCancela1.setBounds(20, 540, 150, 40);

        jButtonSalirIcon1.setBackground(new java.awt.Color(250, 183, 22));
        jButtonSalirIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButtonSalirIcon1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalirIcon1.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonSalirIcon1.setRequestFocusEnabled(false);
        jButtonSalirIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirIcon1ActionPerformed(evt);
            }
        });
        jPFondo.add(jButtonSalirIcon1);
        jButtonSalirIcon1.setBounds(810, 0, 30, 30);

        jButtonMinimizar1.setBackground(new java.awt.Color(250, 183, 22));
        jButtonMinimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar 24.png"))); // NOI18N
        jButtonMinimizar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonMinimizar1.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonMinimizar1.setRequestFocusEnabled(false);
        jButtonMinimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizar1ActionPerformed(evt);
            }
        });
        jPFondo.add(jButtonMinimizar1);
        jButtonMinimizar1.setBounds(780, 0, 30, 30);

        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 840, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

    private void JBCancela1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseEntered
        this.JBCancela1.setText("CERRAR");
    }//GEN-LAST:event_JBCancela1MouseEntered

    private void JBCancela1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseExited
        this.JBCancela1.setText("cerrar");
    }//GEN-LAST:event_JBCancela1MouseExited

    private void JBCancela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancela1ActionPerformed
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jTFBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBusquedaFocusLost
        if (jTFBusqueda.getText().isEmpty()) {
            this.jTFBusqueda.setText("Buscar clase");
        }
    }//GEN-LAST:event_jTFBusquedaFocusLost

    private void jTFBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBusquedaMousePressed
        if (jTFBusqueda.getText().equalsIgnoreCase("Buscar clase")) {
            jTFBusqueda.setText("");
        }
    }//GEN-LAST:event_jTFBusquedaMousePressed

    private void jTFBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBusquedaActionPerformed

    private void jTFBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaKeyReleased
        String Parametro_de_busqueda = null;
        String Busqueda = this.jTFBusqueda.getText();
        switch (this.jCBFiltroUsers.getSelectedIndex()) {
            case 0 -> {
                Parametro_de_busqueda = "Aula";
            }
            case 1 -> {
                Parametro_de_busqueda = "Aula";
            }
            case 2 -> {
                Parametro_de_busqueda = "Materia";
            }
            case 3 -> {
                Parametro_de_busqueda = "CONCAT(P.Nombres, ' ', P.Apellidos)";
            }
            case 4 -> {
                Parametro_de_busqueda = "CONCAT(H.DiaSemana, ' ', H.Hora)";
            }
        }
        this.SQL = """
        SELECT
        H.Codigo_horario,
        C.Codigo_Clase,
        C.Aula,
        C.Materia,
        C.Cedula_profesor,
        CONCAT(P.Nombres, ' ', P.Apellidos) AS ProfesorAsignado,
        H.Cupos_disponibles,
        CONCAT(H.DiaSemana, ' ', H.Hora) AS Horario
        FROM Clases C JOIN Horarios H
        ON C.Codigo_Clase = H.Codigo_Clase JOIN Personas P
        ON C.Cedula_Profesor = P.Cedula WHERE """
                + " " + Parametro_de_busqueda + " LIKE '%" + Busqueda + "%';";
        con.busqueda_y_despliegue(jTClases, this.selectTabla, this.SQL);
    }//GEN-LAST:event_jTFBusquedaKeyReleased

    private void jCBFiltroUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroUsersActionPerformed

    private void jBAsignarHorarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAsignarHorarioMouseEntered
        jBAsignarHorario.setText("ASIGNAR HORARIOS");
    }//GEN-LAST:event_jBAsignarHorarioMouseEntered

    private void jBAsignarHorarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAsignarHorarioMouseExited
        jBAsignarHorario.setText("asignar horarios");
    }//GEN-LAST:event_jBAsignarHorarioMouseExited

    private void jBAsignarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAsignarHorarioActionPerformed
        JFAdmin_AsignarHorarios hor = new JFAdmin_AsignarHorarios();
        hor.setVisible(true);
    }//GEN-LAST:event_jBAsignarHorarioActionPerformed

    private void jBAumentarcuposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAumentarcuposMouseEntered
        this.jBAumentarcupos.setText("AUMENTAR CUPOS");
    }//GEN-LAST:event_jBAumentarcuposMouseEntered

    private void jBAumentarcuposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAumentarcuposMouseExited
        this.jBAumentarcupos.setText("aumentar cupos");
    }//GEN-LAST:event_jBAumentarcuposMouseExited

    private void jBAumentarcuposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAumentarcuposActionPerformed
        JFAdmin_ActCupos cupo = new JFAdmin_ActCupos();
        cupo.setVisible(true);
    }//GEN-LAST:event_jBAumentarcuposActionPerformed

    private void jButtonEliminarClases2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarClases2MouseEntered
        this.jButtonEliminarClases2.setText("ASISTENCIA");
    }//GEN-LAST:event_jButtonEliminarClases2MouseEntered

    private void jButtonEliminarClases2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarClases2MouseExited
        this.jButtonEliminarClases2.setText("asistencia");
    }//GEN-LAST:event_jButtonEliminarClases2MouseExited

    private void jButtonEliminarClases2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarClases2ActionPerformed
        JFAdmin_AsistenciaClase asis = new JFAdmin_AsistenciaClase();
        asis.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarClases2ActionPerformed

    private void emitirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton JBCancela1;
    private javax.swing.JButton jBAsignarHorario;
    private javax.swing.JButton jBAumentarcupos;
    private javax.swing.JButton jButtonEliminarClases2;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JComboBox<String> jCBFiltroUsers;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JLabel jLLupa;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTClases;
    private javax.swing.JTextField jTFBusqueda;
    // End of variables declaration//GEN-END:variables
}
