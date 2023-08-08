package GUI.Administrador.Profesores;

import Negocio.Diseño;

/*
 * @authors G2 SoftwareSolutions
 */
public class JPAdminProf extends javax.swing.JPanel {
    Diseño gui = new Diseño();
    JFAdmin_InsertarProf inser = new JFAdmin_InsertarProf();
    JFAdminProfActualizar act = new JFAdminProfActualizar();
    JFAdmin_Eliminar elim = new JFAdmin_Eliminar();
    public JPAdminProf() {
        initComponents();
        gui.jComboUsers(this.jCBFiltroProf);
        gui.jtableHead(jTProf);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLFiltro = new javax.swing.JLabel();
        jTFBusqueda = new javax.swing.JTextField();
        jSeparator = new javax.swing.JSeparator();
        jCBFiltroProf = new javax.swing.JComboBox<>();
        jLLupa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProf = new javax.swing.JTable();
        jLTitTabla = new javax.swing.JLabel();
        jButtonNuevoEstu = new javax.swing.JButton();
        jButtonActualizarEstu = new javax.swing.JButton();
        jButtonEliminarEstu = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

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

        jCBFiltroProf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "N°Cédula del profesor", "Nombre del profesor", "Apellido del profesor", "Especialización musical" }));
        jCBFiltroProf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroProfActionPerformed(evt);
            }
        });

        jLLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTProf.setAutoCreateRowSorter(true);
        jTProf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTProf.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, "ver", null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°Cédula", "Nombre", "Apellido", "Nivel Académico", "Dirección", "N°Teléfono", "Correo electrónico", "Especialización musical", "Estudiantes", "Horarios", "Asistencias"
            }
        ));
        jTProf.setGridColor(new java.awt.Color(250, 183, 22));
        jTProf.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTProf.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTProf.getTableHeader().setResizingAllowed(false);
        jTProf.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTProf);

        jLTitTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla.setText("Profesor");

        jButtonNuevoEstu.setBackground(new java.awt.Color(250, 183, 22));
        jButtonNuevoEstu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoEstu.setText("nuevo");
        jButtonNuevoEstu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevoEstu.setBorderPainted(false);
        jButtonNuevoEstu.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevoEstu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoEstuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoEstuMouseExited(evt);
            }
        });
        jButtonNuevoEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoEstuActionPerformed(evt);
            }
        });

        jButtonActualizarEstu.setBackground(new java.awt.Color(250, 183, 22));
        jButtonActualizarEstu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarEstu.setText("actualizar");
        jButtonActualizarEstu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizarEstu.setBorderPainted(false);
        jButtonActualizarEstu.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonActualizarEstu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarEstuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarEstuMouseExited(evt);
            }
        });
        jButtonActualizarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarEstuActionPerformed(evt);
            }
        });

        jButtonEliminarEstu.setBackground(new java.awt.Color(250, 183, 22));
        jButtonEliminarEstu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarEstu.setText("eliminar");
        jButtonEliminarEstu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminarEstu.setBorderPainted(false);
        jButtonEliminarEstu.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarEstu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarEstuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarEstuMouseExited(evt);
            }
        });
        jButtonEliminarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarEstuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNuevoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonActualizarEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNuevoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonActualizarEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminarEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBusquedaFocusLost
        if(jTFBusqueda.getText().isEmpty()){this.jTFBusqueda.setText("Buscar nombre");}
    }//GEN-LAST:event_jTFBusquedaFocusLost

    private void jTFBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBusquedaMousePressed
        if(jTFBusqueda.getText().equalsIgnoreCase("Buscar nombre")){jTFBusqueda.setText("");}
    }//GEN-LAST:event_jTFBusquedaMousePressed

    private void jTFBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBusquedaActionPerformed

    private void jTFBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaKeyReleased
        
    }//GEN-LAST:event_jTFBusquedaKeyReleased

    private void jCBFiltroProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroProfActionPerformed

    private void jButtonNuevoEstuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoEstuMouseEntered
        this.jButtonNuevoEstu.setText("NUEVO");
    }//GEN-LAST:event_jButtonNuevoEstuMouseEntered

    private void jButtonNuevoEstuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoEstuMouseExited
        this.jButtonNuevoEstu.setText("nuevo");
    }//GEN-LAST:event_jButtonNuevoEstuMouseExited

    private void jButtonNuevoEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoEstuActionPerformed
        inser.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoEstuActionPerformed

    private void jButtonActualizarEstuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarEstuMouseEntered
        this.jButtonActualizarEstu.setText("ACTUALIZAR");
    }//GEN-LAST:event_jButtonActualizarEstuMouseEntered

    private void jButtonActualizarEstuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarEstuMouseExited
        this.jButtonActualizarEstu.setText("actualizar");
    }//GEN-LAST:event_jButtonActualizarEstuMouseExited

    private void jButtonActualizarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarEstuActionPerformed
        act.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarEstuActionPerformed

    private void jButtonEliminarEstuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarEstuMouseEntered
        this.jButtonEliminarEstu.setText("ELIMINAR");
    }//GEN-LAST:event_jButtonEliminarEstuMouseEntered

    private void jButtonEliminarEstuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarEstuMouseExited
        this.jButtonEliminarEstu.setText("eliminar");
    }//GEN-LAST:event_jButtonEliminarEstuMouseExited

    private void jButtonEliminarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarEstuActionPerformed
        elim.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarEstuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarEstu;
    private javax.swing.JButton jButtonEliminarEstu;
    private javax.swing.JButton jButtonNuevoEstu;
    private javax.swing.JComboBox<String> jCBFiltroProf;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JLabel jLLupa;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextField jTFBusqueda;
    private javax.swing.JTable jTProf;
    // End of variables declaration//GEN-END:variables
}
