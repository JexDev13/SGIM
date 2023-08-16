package GUI.Administrador.Pagos;

import Negocio.Diseño;

/*
 * @authors G2 SoftwareSolutions
 */
public class JPAdminPagos extends javax.swing.JPanel {

    Diseño gui = new Diseño();
    JFAdmin_RegistrarPago regPag = new JFAdmin_RegistrarPago();
    JFAdmin_EliminarPago elimPag = new JFAdmin_EliminarPago();
    JFAdmin_ConsultarPago consPag = new JFAdmin_ConsultarPago();
    JFAdmin_ActualizarPago actPag = new JFAdmin_ActualizarPago();

    public JPAdminPagos() {
        initComponents();
        gui.jtableHead(this.jTPagos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonNuevoPago = new javax.swing.JButton();
        jButtonActualizarPago = new javax.swing.JButton();
        jButtonEliminarPago = new javax.swing.JButton();
        jLLupa = new javax.swing.JLabel();
        jTFBusqueda = new javax.swing.JTextField();
        jSeparator = new javax.swing.JSeparator();
        jLTitTabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPagos = new javax.swing.JTable();
        jButtonConsultarPagos = new javax.swing.JButton();
        jTFPorcentajePagado = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jButtonNuevoPago.setBackground(new java.awt.Color(250, 183, 22));
        jButtonNuevoPago.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoPago.setText("nuevo");
        jButtonNuevoPago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevoPago.setBorderPainted(false);
        jButtonNuevoPago.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevoPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoPagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoPagoMouseExited(evt);
            }
        });
        jButtonNuevoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoPagoActionPerformed(evt);
            }
        });

        jButtonActualizarPago.setBackground(new java.awt.Color(250, 183, 22));
        jButtonActualizarPago.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarPago.setText("actualizar");
        jButtonActualizarPago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizarPago.setBorderPainted(false);
        jButtonActualizarPago.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonActualizarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarPagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarPagoMouseExited(evt);
            }
        });
        jButtonActualizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarPagoActionPerformed(evt);
            }
        });

        jButtonEliminarPago.setBackground(new java.awt.Color(250, 183, 22));
        jButtonEliminarPago.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarPago.setText("eliminar");
        jButtonEliminarPago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminarPago.setBorderPainted(false);
        jButtonEliminarPago.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarPagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarPagoMouseExited(evt);
            }
        });
        jButtonEliminarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarPagoActionPerformed(evt);
            }
        });

        jLLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N

        jTFBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        jTFBusqueda.setText("Cédula Estudiante");
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

        jLTitTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla.setText("Pagos");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTPagos.setAutoCreateRowSorter(true);
        jTPagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTPagos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTPagos.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N°Cédula", "Nombres", "Apellidos", "Método de pago", "Pagado", "Código Transacción"
            }
        ));
        jTPagos.setGridColor(new java.awt.Color(250, 183, 22));
        jTPagos.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTPagos.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTPagos.getTableHeader().setResizingAllowed(false);
        jTPagos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTPagos);

        jButtonConsultarPagos.setBackground(new java.awt.Color(250, 183, 22));
        jButtonConsultarPagos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarPagos.setText("consultar");
        jButtonConsultarPagos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonConsultarPagos.setBorderPainted(false);
        jButtonConsultarPagos.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonConsultarPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConsultarPagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultarPagosMouseExited(evt);
            }
        });
        jButtonConsultarPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarPagosActionPerformed(evt);
            }
        });

        jTFPorcentajePagado.setEditable(false);
        jTFPorcentajePagado.setBackground(new java.awt.Color(255, 255, 255));
        jTFPorcentajePagado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFPorcentajePagado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTFPorcentajePagado.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("% Estudiantes Pagados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNuevoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonActualizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLLupa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTFPorcentajePagado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConsultarPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
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
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNuevoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonActualizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultarPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLTitTabla)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPorcentajePagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoPagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoPagoMouseEntered
        this.jButtonNuevoPago.setText("NUEVO");
    }//GEN-LAST:event_jButtonNuevoPagoMouseEntered

    private void jButtonNuevoPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoPagoMouseExited
        this.jButtonNuevoPago.setText("nuevo");
    }//GEN-LAST:event_jButtonNuevoPagoMouseExited

    private void jButtonNuevoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoPagoActionPerformed
        regPag.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoPagoActionPerformed

    private void jButtonActualizarPagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarPagoMouseEntered
        this.jButtonActualizarPago.setText("ACTUALIZAR");
    }//GEN-LAST:event_jButtonActualizarPagoMouseEntered

    private void jButtonActualizarPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarPagoMouseExited
        this.jButtonActualizarPago.setText("actualizar");
    }//GEN-LAST:event_jButtonActualizarPagoMouseExited

    private void jButtonActualizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarPagoActionPerformed
        actPag.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarPagoActionPerformed

    private void jButtonEliminarPagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarPagoMouseEntered
        this.jButtonEliminarPago.setText("ELIMINAR");
    }//GEN-LAST:event_jButtonEliminarPagoMouseEntered

    private void jButtonEliminarPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarPagoMouseExited
        this.jButtonEliminarPago.setText("eliminar");
    }//GEN-LAST:event_jButtonEliminarPagoMouseExited

    private void jButtonEliminarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarPagoActionPerformed
        elimPag.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarPagoActionPerformed

    private void jTFBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBusquedaFocusLost
        if (jTFBusqueda.getText().isEmpty()) {
            this.jTFBusqueda.setText("Buscar cédula");
        }
    }//GEN-LAST:event_jTFBusquedaFocusLost

    private void jTFBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBusquedaMousePressed
        if (jTFBusqueda.getText().equalsIgnoreCase("Buscar cédula")) {
            jTFBusqueda.setText("");
        }
    }//GEN-LAST:event_jTFBusquedaMousePressed

    private void jTFBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBusquedaActionPerformed

    private void jTFBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaKeyReleased

    }//GEN-LAST:event_jTFBusquedaKeyReleased

    private void jButtonConsultarPagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarPagosMouseEntered
        this.jButtonConsultarPagos.setText("CONSULTAR");
    }//GEN-LAST:event_jButtonConsultarPagosMouseEntered

    private void jButtonConsultarPagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarPagosMouseExited
        this.jButtonConsultarPagos.setText("consultar");
    }//GEN-LAST:event_jButtonConsultarPagosMouseExited

    private void jButtonConsultarPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarPagosActionPerformed
        consPag.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarPagosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarPago;
    private javax.swing.JButton jButtonConsultarPagos;
    private javax.swing.JButton jButtonEliminarPago;
    private javax.swing.JButton jButtonNuevoPago;
    private javax.swing.JLabel jLLupa;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextField jTFBusqueda;
    public static javax.swing.JTextField jTFPorcentajePagado;
    private javax.swing.JTable jTPagos;
    // End of variables declaration//GEN-END:variables
}
