package GUI.Administrador.Calendario_Clases;

import Negocio.Conexion;
import Negocio.Diseño;

/*
 * @authors G2 SoftwareSolutions
 */
public class JPAdminCal extends javax.swing.JPanel {

    Diseño gui = new Diseño();
    JFAdmin_ActCupos actClase = new JFAdmin_ActCupos();
    JFAdmin_AsignarEstudiante asgEst = new JFAdmin_AsignarEstudiante();
    JFAdmin_AsignarHorarios asgProf = new JFAdmin_AsignarHorarios();
    JFAdmin_AsistenciaClase asisClase = new JFAdmin_AsistenciaClase();
    JFAdmin_ConsultarClase consClase = new JFAdmin_ConsultarClase();
    JFAdmin_EliminarClase elimClase = new JFAdmin_EliminarClase();

    Conexion con = new Conexion();

    private String selectTabla = "Clases";
    private String SQL;

    public JPAdminCal() {
        initComponents();
        gui.jtableHead(jTClases);
        gui.jComboUsers(jCBFiltroUsers);
        this.SQL = """
                   SELECT
                       C.Codigo_Clase,
                       C.Aula,
                       C.Materia,
                       C.Cedula_Profesor,
                       CONCAT(P.Nombres, ' ', P.Apellidos) AS ProfesorAsignado
                   FROM Clases C JOIN Personas P ON C.Cedula_Profesor = P.Cedula;""";
        con.busqueda_y_despliegue(jTClases, this.selectTabla, this.SQL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitTabla = new javax.swing.JLabel();
        jButtonNuevaClase = new javax.swing.JButton();
        jButtonEliminarClases = new javax.swing.JButton();
        jLLupa = new javax.swing.JLabel();
        jTFBusqueda = new javax.swing.JTextField();
        jSeparator = new javax.swing.JSeparator();
        jCBFiltroUsers = new javax.swing.JComboBox<>();
        jLFiltro = new javax.swing.JLabel();
        jButtonEliminarClases1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClases = new javax.swing.JTable();
        jButtonEliminarClases2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLTitTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla.setText("Clases");

        jButtonNuevaClase.setBackground(new java.awt.Color(250, 183, 22));
        jButtonNuevaClase.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevaClase.setText("nueva clase");
        jButtonNuevaClase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevaClase.setBorderPainted(false);
        jButtonNuevaClase.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevaClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevaClaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevaClaseMouseExited(evt);
            }
        });
        jButtonNuevaClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaClaseActionPerformed(evt);
            }
        });

        jButtonEliminarClases.setBackground(new java.awt.Color(250, 183, 22));
        jButtonEliminarClases.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarClases.setText("eliminar clases");
        jButtonEliminarClases.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminarClases.setBorderPainted(false);
        jButtonEliminarClases.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarClasesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarClasesMouseExited(evt);
            }
        });
        jButtonEliminarClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarClasesActionPerformed(evt);
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

        jSeparator.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator.setForeground(new java.awt.Color(250, 183, 22));

        jCBFiltroUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Aula", "Materia", "Cédula del profesor", "Profesor asignado" }));
        jCBFiltroUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroUsersActionPerformed(evt);
            }
        });

        jLFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        jButtonEliminarClases1.setBackground(new java.awt.Color(250, 183, 22));
        jButtonEliminarClases1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarClases1.setText("horarios");
        jButtonEliminarClases1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminarClases1.setBorderPainted(false);
        jButtonEliminarClases1.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarClases1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarClases1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarClases1MouseExited(evt);
            }
        });
        jButtonEliminarClases1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarClases1ActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTClases.setAutoCreateRowSorter(true);
        jTClases.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTClases.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código horario", "Código clase", "Aula", "Materia", "Cédula profesor", "Profesor"
            }
        ));
        jTClases.setGridColor(new java.awt.Color(250, 183, 22));
        jTClases.setRowSelectionAllowed(false);
        jTClases.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTClases.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTClases.getTableHeader().setResizingAllowed(false);
        jTClases.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTClases);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonNuevaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarClases, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarClases1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarClases2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLFiltro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBFiltroUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLLupa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 746, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLLupa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCBFiltroUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFiltro)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNuevaClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarClases1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarClases2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addGap(78, 78, 78))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevaClaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevaClaseMouseEntered
        this.jButtonNuevaClase.setText("NUEVA CLASE");
    }//GEN-LAST:event_jButtonNuevaClaseMouseEntered

    private void jButtonNuevaClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevaClaseMouseExited
        this.jButtonNuevaClase.setText("nueva clase");
    }//GEN-LAST:event_jButtonNuevaClaseMouseExited

    private void jButtonNuevaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaClaseActionPerformed
        JFAdmin_InsertarClase insClase = new JFAdmin_InsertarClase();
        insClase.setVisible(true);
    }//GEN-LAST:event_jButtonNuevaClaseActionPerformed

    private void jButtonEliminarClasesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarClasesMouseEntered
        jButtonEliminarClases.setText("ELIMINAR CLASE");
    }//GEN-LAST:event_jButtonEliminarClasesMouseEntered

    private void jButtonEliminarClasesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarClasesMouseExited
        jButtonEliminarClases.setText("eliminar clase");
    }//GEN-LAST:event_jButtonEliminarClasesMouseExited

    private void jButtonEliminarClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarClasesActionPerformed
        JFAdmin_EliminarClase elim = new JFAdmin_EliminarClase();
        elim.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarClasesActionPerformed

    private void jCBFiltroUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroUsersActionPerformed

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
                Parametro_de_busqueda = "C.Cedula_Profesor";
            }
            case 4 -> {
                Parametro_de_busqueda = "CONCAT(P.Nombres, ' ', P.Apellidos)";
            }
        }
        this.SQL = """
        SELECT
            C.Codigo_Clase,
            C.Aula,
            C.Materia,
            C.Cedula_Profesor,
            CONCAT(P.Nombres, ' ', P.Apellidos) AS ProfesorAsignado
        FROM Clases C JOIN Personas P ON C.Cedula_Profesor = P.Cedula WHERE """ + " " + Parametro_de_busqueda + " LIKE '%" + Busqueda + "%';";
        con.busqueda_y_despliegue(jTClases, this.selectTabla, this.SQL);
    }//GEN-LAST:event_jTFBusquedaKeyReleased

    private void jTFBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBusquedaActionPerformed

    private void jTFBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBusquedaMousePressed
        if (jTFBusqueda.getText().equalsIgnoreCase("Buscar clase")) {
            jTFBusqueda.setText("");
        }
    }//GEN-LAST:event_jTFBusquedaMousePressed

    private void jTFBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBusquedaFocusLost
        if (jTFBusqueda.getText().isEmpty()) {
            this.jTFBusqueda.setText("Buscar clase");
        }
    }//GEN-LAST:event_jTFBusquedaFocusLost

    private void jButtonEliminarClases1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarClases1MouseEntered
        this.jButtonEliminarClases1.setText("HORARIOS");
    }//GEN-LAST:event_jButtonEliminarClases1MouseEntered

    private void jButtonEliminarClases1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarClases1MouseExited
        this.jButtonEliminarClases1.setText("horarios");
    }//GEN-LAST:event_jButtonEliminarClases1MouseExited

    private void jButtonEliminarClases1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarClases1ActionPerformed
        JFAdmin_Calendario cal = new JFAdmin_Calendario();
        cal.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarClases1ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminarClases;
    private javax.swing.JButton jButtonEliminarClases1;
    private javax.swing.JButton jButtonEliminarClases2;
    private javax.swing.JButton jButtonNuevaClase;
    private javax.swing.JComboBox<String> jCBFiltroUsers;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JLabel jLLupa;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTable jTClases;
    private javax.swing.JTextField jTFBusqueda;
    // End of variables declaration//GEN-END:variables
}
