package GUI.Administrador.Gestion_Sistema;

import Negocio.Diseño;

/*
 * @authors G2 SoftwareSolutions
 */
public class JPAdminGest extends javax.swing.JPanel {

    Diseño gui = new Diseño();
    JFAdmin_desbloquear conInst = new JFAdmin_desbloquear();
    JFAdmin_InsertarUsuario inser = new JFAdmin_InsertarUsuario();
    JFAdmin_ActualizarUsuario act = new JFAdmin_ActualizarUsuario();
    JFAdmin_EliminarUsuario elim = new JFAdmin_EliminarUsuario();

    public JPAdminGest() {
        initComponents();
        gui.jComboUsers(jCBFiltroProf);
        gui.jtableHead(jTInst);
        gui.jtableHead(jTInst1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFBusqueda = new javax.swing.JTextField();
        jLFiltro = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jCBFiltroProf = new javax.swing.JComboBox<>();
        jLLupa = new javax.swing.JLabel();
        jButtonNuevoEstu1 = new javax.swing.JButton();
        jButtonActualizarEstu1 = new javax.swing.JButton();
        jButtonEliminarEstu1 = new javax.swing.JButton();
        jLTitTabla = new javax.swing.JLabel();
        jLTitTabla1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTInst = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTInst1 = new javax.swing.JTable();
        jButtonConsultarInst = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

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

        jLFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        jSeparator.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator.setForeground(new java.awt.Color(250, 183, 22));

        jCBFiltroProf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Usuario", "Correo electrónico" }));
        jCBFiltroProf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroProfActionPerformed(evt);
            }
        });

        jLLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N

        jButtonNuevoEstu1.setBackground(new java.awt.Color(250, 183, 22));
        jButtonNuevoEstu1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoEstu1.setText("nuevo");
        jButtonNuevoEstu1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevoEstu1.setBorderPainted(false);
        jButtonNuevoEstu1.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevoEstu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoEstu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoEstu1MouseExited(evt);
            }
        });
        jButtonNuevoEstu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoEstu1ActionPerformed(evt);
            }
        });

        jButtonActualizarEstu1.setBackground(new java.awt.Color(250, 183, 22));
        jButtonActualizarEstu1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarEstu1.setText("actualizar");
        jButtonActualizarEstu1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizarEstu1.setBorderPainted(false);
        jButtonActualizarEstu1.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonActualizarEstu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarEstu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarEstu1MouseExited(evt);
            }
        });
        jButtonActualizarEstu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarEstu1ActionPerformed(evt);
            }
        });

        jButtonEliminarEstu1.setBackground(new java.awt.Color(250, 183, 22));
        jButtonEliminarEstu1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarEstu1.setText("eliminar");
        jButtonEliminarEstu1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminarEstu1.setBorderPainted(false);
        jButtonEliminarEstu1.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarEstu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarEstu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarEstu1MouseExited(evt);
            }
        });
        jButtonEliminarEstu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarEstu1ActionPerformed(evt);
            }
        });

        jLTitTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla.setText("Usuarios del sistema");

        jLTitTabla1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla1.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla1.setText("Usuario bloqueados");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(250, 183, 22));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTInst.setAutoCreateRowSorter(true);
        jTInst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTInst.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTInst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "N°Cédula", "Usuario", "Correo electrónico"
            }
        ));
        jTInst.setGridColor(new java.awt.Color(250, 183, 22));
        jTInst.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTInst.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTInst.getTableHeader().setResizingAllowed(false);
        jTInst.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTInst);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTInst1.setAutoCreateRowSorter(true);
        jTInst1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTInst1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTInst1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "N°Cédula", "Usuario", "Correo electrónico"
            }
        ));
        jTInst1.setGridColor(new java.awt.Color(250, 183, 22));
        jTInst1.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTInst1.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTInst1.getTableHeader().setResizingAllowed(false);
        jTInst1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTInst1);

        jButtonConsultarInst.setBackground(new java.awt.Color(250, 183, 22));
        jButtonConsultarInst.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarInst.setText("(des)bloquear");
        jButtonConsultarInst.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonConsultarInst.setBorderPainted(false);
        jButtonConsultarInst.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonConsultarInst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConsultarInstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultarInstMouseExited(evt);
            }
        });
        jButtonConsultarInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarInstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLTitTabla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLFiltro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBFiltroProf, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(344, 344, 344)
                                .addComponent(jButtonConsultarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLLupa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFBusqueda))
                                    .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
                                    .addComponent(jSeparator1)
                                    .addComponent(jLTitTabla1)
                                    .addComponent(jScrollPane3))
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonNuevoEstu1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonActualizarEstu1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarEstu1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLLupa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNuevoEstu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonActualizarEstu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarEstu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonConsultarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCBFiltroProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFiltro))
                        .addGap(25, 25, 25))
                    .addComponent(jLTitTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitTabla1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButtonActualizarEstu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarEstu1MouseEntered
        this.jButtonActualizarEstu1.setText("ACTUALIZAR");
    }//GEN-LAST:event_jButtonActualizarEstu1MouseEntered

    private void jButtonActualizarEstu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarEstu1MouseExited
        this.jButtonActualizarEstu1.setText("actualizar");
    }//GEN-LAST:event_jButtonActualizarEstu1MouseExited

    private void jButtonActualizarEstu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarEstu1ActionPerformed
        act.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarEstu1ActionPerformed

    private void jButtonEliminarEstu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarEstu1MouseEntered
        this.jButtonEliminarEstu1.setText("ELIMINAR");
    }//GEN-LAST:event_jButtonEliminarEstu1MouseEntered

    private void jButtonEliminarEstu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarEstu1MouseExited
        this.jButtonEliminarEstu1.setText("eliminar");
    }//GEN-LAST:event_jButtonEliminarEstu1MouseExited

    private void jButtonEliminarEstu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarEstu1ActionPerformed
        elim.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarEstu1ActionPerformed

    private void jButtonNuevoEstu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoEstu1ActionPerformed
        inser.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoEstu1ActionPerformed

    private void jButtonNuevoEstu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoEstu1MouseExited
        this.jButtonNuevoEstu1.setText("nuevo");
    }//GEN-LAST:event_jButtonNuevoEstu1MouseExited

    private void jButtonNuevoEstu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoEstu1MouseEntered
        this.jButtonNuevoEstu1.setText("NUEVO");
    }//GEN-LAST:event_jButtonNuevoEstu1MouseEntered

    private void jButtonConsultarInstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarInstMouseEntered
        this.jButtonConsultarInst.setText("(DES)BLOQUEAR");
    }//GEN-LAST:event_jButtonConsultarInstMouseEntered

    private void jButtonConsultarInstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarInstMouseExited
        this.jButtonConsultarInst.setText("(des)bloquear");
    }//GEN-LAST:event_jButtonConsultarInstMouseExited

    private void jButtonConsultarInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarInstActionPerformed
        conInst.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarInstActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarEstu1;
    private javax.swing.JButton jButtonConsultarInst;
    private javax.swing.JButton jButtonEliminarEstu1;
    private javax.swing.JButton jButtonNuevoEstu1;
    private javax.swing.JComboBox<String> jCBFiltroProf;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JLabel jLLupa;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JLabel jLTitTabla1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFBusqueda;
    private javax.swing.JTable jTInst;
    private javax.swing.JTable jTInst1;
    // End of variables declaration//GEN-END:variables
}
