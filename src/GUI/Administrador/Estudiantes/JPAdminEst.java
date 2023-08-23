package GUI.Administrador.Estudiantes;

import Negocio.Diseño;

/*
 * @authors G2 SoftwareSolutions
 */
public class JPAdminEst extends javax.swing.JPanel {

    Diseño gui = new Diseño();
    JFAdmin_InsertarEstudiante inser = new JFAdmin_InsertarEstudiante();
    JFAdmin_ActualizarEstudiante act = new JFAdmin_ActualizarEstudiante();
    JFAdmin_EliminarEstudiante elim = new JFAdmin_EliminarEstudiante();

    public JPAdminEst() {
        initComponents();
        gui.jtableHead(this.jTEstudiante);
        gui.jComboUsers(jCBFiltroProf);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonNuevoEstudiante = new javax.swing.JButton();
        jButtonActualizarEstudiante = new javax.swing.JButton();
        jButtonEliminarEstudiante = new javax.swing.JButton();
        jLLupa = new javax.swing.JLabel();
        jTFBusqueda = new javax.swing.JTextField();
        jSeparator = new javax.swing.JSeparator();
        jLFiltro = new javax.swing.JLabel();
        jCBFiltroProf = new javax.swing.JComboBox<>();
        jLTitTabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTEstudiante = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jButtonNuevoEstudiante.setBackground(new java.awt.Color(250, 183, 22));
        jButtonNuevoEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoEstudiante.setText("nuevo");
        jButtonNuevoEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevoEstudiante.setBorderPainted(false);
        jButtonNuevoEstudiante.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevoEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoEstudianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoEstudianteMouseExited(evt);
            }
        });
        jButtonNuevoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoEstudianteActionPerformed(evt);
            }
        });

        jButtonActualizarEstudiante.setBackground(new java.awt.Color(250, 183, 22));
        jButtonActualizarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarEstudiante.setText("actualizar");
        jButtonActualizarEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizarEstudiante.setBorderPainted(false);
        jButtonActualizarEstudiante.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonActualizarEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarEstudianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarEstudianteMouseExited(evt);
            }
        });
        jButtonActualizarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarEstudianteActionPerformed(evt);
            }
        });

        jButtonEliminarEstudiante.setBackground(new java.awt.Color(250, 183, 22));
        jButtonEliminarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarEstudiante.setText("eliminar");
        jButtonEliminarEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminarEstudiante.setBorderPainted(false);
        jButtonEliminarEstudiante.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarEstudianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarEstudianteMouseExited(evt);
            }
        });
        jButtonEliminarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarEstudianteActionPerformed(evt);
            }
        });

        jLLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N

        jTFBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        jTFBusqueda.setText("Buscar nombre");
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

        jSeparator.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator.setForeground(new java.awt.Color(250, 183, 22));

        jLFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        jCBFiltroProf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "N°Cédula del profesor", "Nombre del profesor", "Apellido del profesor", "Especialización musical" }));
        jCBFiltroProf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroProfActionPerformed(evt);
            }
        });

        jLTitTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla.setText("ESTUDIANTE");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTEstudiante.setAutoCreateRowSorter(true);
        jTEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, ""},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°Cédula", "Nombres", "Apellidos", "Sexo", "Fecha de Nacimiento", "Nombres representante", "Apellidos representante", "Correo electrónico representante", "N°Celular representante"
            }
        ));
        jTEstudiante.setGridColor(new java.awt.Color(250, 183, 22));
        jTEstudiante.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTEstudiante.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTEstudiante.getTableHeader().setResizingAllowed(false);
        jTEstudiante.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTEstudiante);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNuevoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonActualizarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLLupa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFBusqueda))
                    .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBFiltroProf, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLLupa)
                            .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLFiltro)
                            .addComponent(jCBFiltroProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNuevoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonActualizarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(jLTitTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoEstudianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoEstudianteMouseEntered
        this.jButtonNuevoEstudiante.setText("NUEVO");
    }//GEN-LAST:event_jButtonNuevoEstudianteMouseEntered

    private void jButtonNuevoEstudianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoEstudianteMouseExited
        this.jButtonNuevoEstudiante.setText("nuevo");
    }//GEN-LAST:event_jButtonNuevoEstudianteMouseExited

    private void jButtonNuevoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoEstudianteActionPerformed
        inser.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoEstudianteActionPerformed

    private void jButtonActualizarEstudianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarEstudianteMouseEntered
        this.jButtonActualizarEstudiante.setText("ACTUALIZAR");
    }//GEN-LAST:event_jButtonActualizarEstudianteMouseEntered

    private void jButtonActualizarEstudianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarEstudianteMouseExited
        this.jButtonActualizarEstudiante.setText("actualizar");
    }//GEN-LAST:event_jButtonActualizarEstudianteMouseExited

    private void jButtonActualizarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarEstudianteActionPerformed
        act.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarEstudianteActionPerformed

    private void jButtonEliminarEstudianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarEstudianteMouseEntered
        this.jButtonEliminarEstudiante.setText("ELIMINAR");
    }//GEN-LAST:event_jButtonEliminarEstudianteMouseEntered

    private void jButtonEliminarEstudianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarEstudianteMouseExited
        this.jButtonEliminarEstudiante.setText("eliminar");
    }//GEN-LAST:event_jButtonEliminarEstudianteMouseExited

    private void jButtonEliminarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarEstudianteActionPerformed
        elim.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarEstudianteActionPerformed

    private void jTFBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBusquedaFocusLost
        if (jTFBusqueda.getText().isEmpty()) {
            this.jTFBusqueda.setText("Buscar nombre");
        }
    }//GEN-LAST:event_jTFBusquedaFocusLost

    private void jTFBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBusquedaMousePressed
        if (jTFBusqueda.getText().equalsIgnoreCase("Buscar nombre")) {
            jTFBusqueda.setText("");
        }
    }//GEN-LAST:event_jTFBusquedaMousePressed

    private void jTFBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBusquedaActionPerformed

    private void jTFBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaKeyReleased

    }//GEN-LAST:event_jTFBusquedaKeyReleased

    private void jCBFiltroProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroProfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarEstudiante;
    private javax.swing.JButton jButtonEliminarEstudiante;
    private javax.swing.JButton jButtonNuevoEstudiante;
    private javax.swing.JComboBox<String> jCBFiltroProf;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JLabel jLLupa;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTable jTEstudiante;
    private javax.swing.JTextField jTFBusqueda;
    // End of variables declaration//GEN-END:variables
}
