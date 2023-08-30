package GUI.Administrador.Calendario_Clases;

import Negocio.Conexion;
import Negocio.Diseño;
import Negocio.Validaciones;
import javax.swing.ImageIcon;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_AsistenciaClase extends javax.swing.JFrame {

    private int x;
    private int y;

    Diseño gui = new Diseño();
    ImageIcon ICONCANCELAR = gui.getICONERROR();
    Conexion con = new Conexion();
    Validaciones val = new Validaciones();
    private String selectTabla = "Asistencia";
    private String SQL;
    String titulo = null;
    String mensaje = null;

    public JFAdmin_AsistenciaClase() {
        initComponents();
        setLocationRelativeTo(this);
        gui.jtableHead(jTEstudiantes);
        gui.jComboUsers(jCBFiltroUsers);
        this.SQL = """
                   SELECT
                       AC.Codigo_Horario,
                       P.Cedula,
                       CONCAT(P.Nombres, ' ', P.Apellidos) AS Estudiante,
                       C.Materia,
                       C.Aula,
                       CONCAT(H.DiaSemana, ' ', H.Hora) AS Horario,
                       AC.asistencia
                   FROM Asignacion_cupos AC
                   JOIN Personas P ON AC.Cedula_estudiante = P.Cedula
                   JOIN Clases C ON AC.Codigo_Clase = C.Codigo_Clase
                   JOIN Horarios H ON AC.Codigo_Horario = H.Codigo_Horario;""";
        con.busqueda_y_despliegue(jTEstudiantes, this.selectTabla, this.SQL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTEstudiantes = new javax.swing.JTable();
        jPFondo = new javax.swing.JPanel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jBAsignarEstudiante = new javax.swing.JButton();
        jBEliminarEstudiantes = new javax.swing.JButton();
        jLFiltro = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jCBFiltroUsers = new javax.swing.JComboBox<>();
        jLLupa = new javax.swing.JLabel();
        jTFBusqueda = new javax.swing.JTextField();
        JBCancela1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(750, 468));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(750, 468));
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

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Asistencia");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTEstudiantes.setAutoCreateRowSorter(true);
        jTEstudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código horario", "Cédula estudiante", "Estudiante", "Materia", "Aula", "Horario", "Asistencia"
            }
        ));
        jTEstudiantes.setGridColor(new java.awt.Color(250, 183, 22));
        jTEstudiantes.setRowSelectionAllowed(false);
        jTEstudiantes.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTEstudiantes.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTEstudiantes.getTableHeader().setResizingAllowed(false);
        jTEstudiantes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTEstudiantes);
        if (jTEstudiantes.getColumnModel().getColumnCount() > 0) {
            jTEstudiantes.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 730, 290);

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

        jButtonMinimizar.setBackground(new java.awt.Color(250, 183, 22));
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar 24.png"))); // NOI18N
        jButtonMinimizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonMinimizar.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonMinimizar.setRequestFocusEnabled(false);
        jButtonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizarActionPerformed(evt);
            }
        });
        jPFondo.add(jButtonMinimizar);
        jButtonMinimizar.setBounds(690, 0, 30, 30);

        jButtonSalirIcon.setBackground(new java.awt.Color(250, 183, 22));
        jButtonSalirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButtonSalirIcon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalirIcon.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonSalirIcon.setRequestFocusEnabled(false);
        jButtonSalirIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirIconActionPerformed(evt);
            }
        });
        jPFondo.add(jButtonSalirIcon);
        jButtonSalirIcon.setBounds(720, 0, 30, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jBAsignarEstudiante.setBackground(new java.awt.Color(250, 183, 22));
        jBAsignarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        jBAsignarEstudiante.setText("asignar estudiantes");
        jBAsignarEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBAsignarEstudiante.setBorderPainted(false);
        jBAsignarEstudiante.setPreferredSize(new java.awt.Dimension(73, 40));
        jBAsignarEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAsignarEstudianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAsignarEstudianteMouseExited(evt);
            }
        });
        jBAsignarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAsignarEstudianteActionPerformed(evt);
            }
        });

        jBEliminarEstudiantes.setBackground(new java.awt.Color(250, 183, 22));
        jBEliminarEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminarEstudiantes.setText("eliminar estudiantes");
        jBEliminarEstudiantes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBEliminarEstudiantes.setBorderPainted(false);
        jBEliminarEstudiantes.setPreferredSize(new java.awt.Dimension(73, 40));
        jBEliminarEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEliminarEstudiantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEliminarEstudiantesMouseExited(evt);
            }
        });
        jBEliminarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarEstudiantesActionPerformed(evt);
            }
        });

        jLFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        jSeparator.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator.setForeground(new java.awt.Color(250, 183, 22));

        jCBFiltroUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Código horario", "Cédula estudiante", "Estudiante", "Materia", "Horario" }));
        jCBFiltroUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroUsersActionPerformed(evt);
            }
        });

        jLLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBAsignarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEliminarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLLupa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFBusqueda))
                    .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLFiltro)
                        .addGap(6, 6, 6)
                        .addComponent(jCBFiltroUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLLupa)
                            .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLFiltro)
                            .addComponent(jCBFiltroUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBEliminarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAsignarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(310, Short.MAX_VALUE))
        );

        jPFondo.add(jPanel1);
        jPanel1.setBounds(0, 30, 750, 380);

        JBCancela1.setBackground(new java.awt.Color(255, 255, 254));
        JBCancela1.setForeground(new java.awt.Color(250, 183, 22));
        JBCancela1.setText("cerrar");
        JBCancela1.setBorder(null);
        JBCancela1.setBorderPainted(false);
        JBCancela1.setFocusPainted(false);
        JBCancela1.setPreferredSize(new java.awt.Dimension(89, 32));
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
        JBCancela1.setBounds(10, 420, 150, 40);

        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 750, 470);

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

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void JBCancela1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseEntered
        this.JBCancela1.setText("CERRAR");
    }//GEN-LAST:event_JBCancela1MouseEntered

    private void JBCancela1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseExited
        this.JBCancela1.setText("cerrar");
    }//GEN-LAST:event_JBCancela1MouseExited

    private void JBCancela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancela1ActionPerformed
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jBAsignarEstudianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAsignarEstudianteMouseEntered
        this.jBAsignarEstudiante.setText("ASIGNAR ESTUDIANTES");
    }//GEN-LAST:event_jBAsignarEstudianteMouseEntered

    private void jBAsignarEstudianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAsignarEstudianteMouseExited
        this.jBAsignarEstudiante.setText("asignar estudiantes");
    }//GEN-LAST:event_jBAsignarEstudianteMouseExited

    private void jBAsignarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAsignarEstudianteActionPerformed
        JFAdmin_AsignarEstudiante asgEst = new JFAdmin_AsignarEstudiante();
        asgEst.setVisible(true);
    }//GEN-LAST:event_jBAsignarEstudianteActionPerformed

    private void jBEliminarEstudiantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarEstudiantesMouseEntered
        this.jBEliminarEstudiantes.setText("ELIMINAR ESTUDIANTES");
    }//GEN-LAST:event_jBEliminarEstudiantesMouseEntered

    private void jBEliminarEstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarEstudiantesMouseExited
        this.jBEliminarEstudiantes.setText("eliminar estudiantes");
    }//GEN-LAST:event_jBEliminarEstudiantesMouseExited

    private void jBEliminarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarEstudiantesActionPerformed
        JFAdmin_EliminarEstudiante elim = new JFAdmin_EliminarEstudiante();
        elim.setVisible(true);
    }//GEN-LAST:event_jBEliminarEstudiantesActionPerformed

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
                Parametro_de_busqueda = "AC.Codigo_horario";
            }
            case 1 -> {
                Parametro_de_busqueda = "AC.Codigo_horario";
            }
            case 2 -> {
                Parametro_de_busqueda = "P.Cedula";
            }
            case 3 -> {
                Parametro_de_busqueda = "CONCAT(P.Nombres, ' ', P.Apellidos)";
            }
            case 4 -> {
                Parametro_de_busqueda = "C.Materia";
            }
            case 5 -> {
                Parametro_de_busqueda = "CONCAT(H.DiaSemana, ' ', H.Hora)";
            }
        }
        this.SQL = """
        SELECT
            AC.Codigo_Horario,
            P.Cedula,
            CONCAT(P.Nombres, ' ', P.Apellidos) AS Estudiante,
            C.Materia,
            C.Aula,
            CONCAT(H.DiaSemana, ' ', H.Hora) AS Horario,
            AC.asistencia
        FROM Asignacion_cupos AC
        JOIN Personas P ON AC.Cedula_estudiante = P.Cedula
        JOIN Clases C ON AC.Codigo_Clase = C.Codigo_Clase
        JOIN Horarios H ON AC.Codigo_Horario = H.Codigo_Horario WHERE """
                + " " + Parametro_de_busqueda + " LIKE '%" + Busqueda + "%';";
        con.busqueda_y_despliegue(jTEstudiantes, this.selectTabla, this.SQL);
    }//GEN-LAST:event_jTFBusquedaKeyReleased

    private void jCBFiltroUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroUsersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton JBCancela1;
    private javax.swing.JButton jBAsignarEstudiante;
    private javax.swing.JButton jBEliminarEstudiantes;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JComboBox<String> jCBFiltroUsers;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JLabel jLLupa;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTable jTEstudiantes;
    private javax.swing.JTextField jTFBusqueda;
    // End of variables declaration//GEN-END:variables
}
