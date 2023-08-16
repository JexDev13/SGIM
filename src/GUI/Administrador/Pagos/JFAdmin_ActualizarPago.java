package GUI.Administrador.Pagos;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_ActualizarPago extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdmin_ActualizarPago() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanelDatoPago = new javax.swing.JPanel();
        jTFBuscar_ActualizarPago = new javax.swing.JTextField();
        jLCodTran = new javax.swing.JLabel();
        jPDatosPagoActualizar = new javax.swing.JPanel();
        jTFCodigo_ActualizarPago = new javax.swing.JTextField();
        jTFValor_ActualizarPago = new javax.swing.JTextField();
        jTFCedula_ActualizarPago = new javax.swing.JTextField();
        jChBCedula_ActualizarPago = new javax.swing.JCheckBox();
        jChBMetodo_ActualizarPago = new javax.swing.JCheckBox();
        jChBValor_ActualizarPago = new javax.swing.JCheckBox();
        jLabelCodTran = new javax.swing.JLabel();
        jComboBoxMetodo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(388, 383));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(388, 383));
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 183, 22));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setText("ACTUALIZAR PAGO");
        jPanel1.add(jLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

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
        jPanel1.add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 30, 30));

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
        jPanel1.add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 212, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatoPago.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoPago.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Pago"));

        jTFBuscar_ActualizarPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_ActualizarPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarPagoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarPagoKeyTyped(evt);
            }
        });

        jLCodTran.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodTran.setText("Cod. Transacción:");

        javax.swing.GroupLayout jPanelDatoPagoLayout = new javax.swing.GroupLayout(jPanelDatoPago);
        jPanelDatoPago.setLayout(jPanelDatoPagoLayout);
        jPanelDatoPagoLayout.setHorizontalGroup(
            jPanelDatoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodTran)
                .addGap(18, 18, 18)
                .addComponent(jTFBuscar_ActualizarPago, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoPagoLayout.setVerticalGroup(
            jPanelDatoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoPagoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDatoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_ActualizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodTran))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.add(jPanelDatoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, -1));

        jPDatosPagoActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosPagoActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jTFCodigo_ActualizarPago.setEditable(false);
        jTFCodigo_ActualizarPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFValor_ActualizarPago.setEditable(false);
        jTFValor_ActualizarPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFValor_ActualizarPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFValor_ActualizarPagoKeyTyped(evt);
            }
        });

        jTFCedula_ActualizarPago.setEditable(false);
        jTFCedula_ActualizarPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBCedula_ActualizarPago.setBackground(new java.awt.Color(255, 255, 255));
        jChBCedula_ActualizarPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBCedula_ActualizarPago.setText("N° Cédula Estudiante");
        jChBCedula_ActualizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBCedula_ActualizarPagoActionPerformed(evt);
            }
        });

        jChBMetodo_ActualizarPago.setBackground(new java.awt.Color(255, 255, 255));
        jChBMetodo_ActualizarPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBMetodo_ActualizarPago.setText("Método de Pago");
        jChBMetodo_ActualizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBMetodo_ActualizarPagoActionPerformed(evt);
            }
        });

        jChBValor_ActualizarPago.setBackground(new java.awt.Color(255, 255, 255));
        jChBValor_ActualizarPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBValor_ActualizarPago.setText("Valor");
        jChBValor_ActualizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBValor_ActualizarPagoActionPerformed(evt);
            }
        });

        jLabelCodTran.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCodTran.setText("Cod. Transacción");

        jComboBoxMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir Método...", "Efectivo", "Transferencia", "Tarjeta de crédito/débito", "Cheque" }));

        javax.swing.GroupLayout jPDatosPagoActualizarLayout = new javax.swing.GroupLayout(jPDatosPagoActualizar);
        jPDatosPagoActualizar.setLayout(jPDatosPagoActualizarLayout);
        jPDatosPagoActualizarLayout.setHorizontalGroup(
            jPDatosPagoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosPagoActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosPagoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosPagoActualizarLayout.createSequentialGroup()
                        .addComponent(jChBMetodo_ActualizarPago)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPDatosPagoActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosPagoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jChBCedula_ActualizarPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCodTran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosPagoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo_ActualizarPago, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jTFCedula_ActualizarPago)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosPagoActualizarLayout.createSequentialGroup()
                        .addComponent(jChBValor_ActualizarPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPDatosPagoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFValor_ActualizarPago)
                            .addComponent(jComboBoxMetodo, 0, 169, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPDatosPagoActualizarLayout.setVerticalGroup(
            jPDatosPagoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosPagoActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosPagoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_ActualizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodTran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosPagoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBCedula_ActualizarPago)
                    .addComponent(jTFCedula_ActualizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosPagoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBMetodo_ActualizarPago)
                    .addComponent(jComboBoxMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosPagoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFValor_ActualizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBValor_ActualizarPago))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel6.add(jPDatosPagoActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 370, 160));

        jPanel4.setBackground(new java.awt.Color(250, 183, 22));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBCancela1.setBackground(new java.awt.Color(255, 255, 254));
        JBCancela1.setForeground(new java.awt.Color(250, 183, 22));
        JBCancela1.setText("Cancelar");
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
        jPanel4.add(JBCancela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        JBIngreso1.setBackground(new java.awt.Color(255, 255, 254));
        JBIngreso1.setForeground(new java.awt.Color(250, 183, 22));
        JBIngreso1.setText("Aceptar");
        JBIngreso1.setBorder(null);
        JBIngreso1.setBorderPainted(false);
        JBIngreso1.setDefaultCapable(false);
        JBIngreso1.setFocusPainted(false);
        JBIngreso1.setHideActionText(true);
        JBIngreso1.setPreferredSize(new java.awt.Dimension(89, 32));
        JBIngreso1.setRequestFocusEnabled(false);
        JBIngreso1.setRolloverEnabled(false);
        JBIngreso1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBIngreso1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBIngreso1MouseExited(evt);
            }
        });
        JBIngreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngreso1ActionPerformed(evt);
            }
        });
        jPanel4.add(JBIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 400, 60));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 400, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBuscar_ActualizarPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarPagoKeyReleased

    }//GEN-LAST:event_jTFBuscar_ActualizarPagoKeyReleased

    private void jTFBuscar_ActualizarPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarPagoKeyTyped

    }//GEN-LAST:event_jTFBuscar_ActualizarPagoKeyTyped

    private void jTFValor_ActualizarPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFValor_ActualizarPagoKeyTyped

    }//GEN-LAST:event_jTFValor_ActualizarPagoKeyTyped

    private void jChBCedula_ActualizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBCedula_ActualizarPagoActionPerformed
        if (jChBCedula_ActualizarPago.isSelected()) {
            this.jTFCedula_ActualizarPago.setEditable(true);
        } else {
            this.jTFCedula_ActualizarPago.setEditable(false);
        }
    }//GEN-LAST:event_jChBCedula_ActualizarPagoActionPerformed

    private void jChBMetodo_ActualizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBMetodo_ActualizarPagoActionPerformed
        if (jChBMetodo_ActualizarPago.isSelected()) {
            this.jComboBoxMetodo.setEditable(true);
        } else {
            this.jComboBoxMetodo.setEditable(false);
        }
    }//GEN-LAST:event_jChBMetodo_ActualizarPagoActionPerformed

    private void jChBValor_ActualizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBValor_ActualizarPagoActionPerformed
        if (jChBValor_ActualizarPago.isSelected()) {
            this.jTFValor_ActualizarPago.setEditable(true);
        } else {
            this.jTFValor_ActualizarPago.setEditable(false);
        }
    }//GEN-LAST:event_jChBValor_ActualizarPagoActionPerformed

    public void limpiarCampos() {
        this.jTFCodigo_ActualizarPago.setText("");
        this.jTFCedula_ActualizarPago.setText("");
        this.jTFValor_ActualizarPago.setText("");
    }

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("aceptar");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed

    }//GEN-LAST:event_JBIngreso1ActionPerformed

    private void JBCancela1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseEntered
        this.JBCancela1.setText("CANCELAR");
    }//GEN-LAST:event_JBCancela1MouseEntered

    private void JBCancela1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseExited
        this.JBCancela1.setText("cancelar");
    }//GEN-LAST:event_JBCancela1MouseExited

    private void JBCancela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancela1ActionPerformed
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jChBCedula_ActualizarPago;
    private javax.swing.JCheckBox jChBMetodo_ActualizarPago;
    private javax.swing.JCheckBox jChBValor_ActualizarPago;
    private javax.swing.JComboBox<String> jComboBoxMetodo;
    private javax.swing.JLabel jLCodTran;
    private javax.swing.JLabel jLabelCodTran;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JPanel jPDatosPagoActualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelDatoPago;
    public static javax.swing.JTextField jTFBuscar_ActualizarPago;
    public static javax.swing.JTextField jTFCedula_ActualizarPago;
    public static javax.swing.JTextField jTFCodigo_ActualizarPago;
    public static javax.swing.JTextField jTFValor_ActualizarPago;
    // End of variables declaration//GEN-END:variables
}
