package GUI.Administrador.Pagos;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_EliminarPago extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdmin_EliminarPago() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanelDatoPago = new javax.swing.JPanel();
        jTFBuscar_CodTran = new javax.swing.JTextField();
        jLCodTran = new javax.swing.JLabel();
        jPDatosPagoEliminar = new javax.swing.JPanel();
        jTFCedula_EliminarPago = new javax.swing.JTextField();
        jLabelCodTran = new javax.swing.JLabel();
        jTFCodTran_EliminarPago = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jTFMetodo_EliminarPago = new javax.swing.JTextField();
        jLabelMetodo = new javax.swing.JLabel();
        jTFValor_EliminarPago = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jTFFecha_EliminarPago = new javax.swing.JTextField();
        jLabelCedula = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 397));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 397));
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
        getContentPane().add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, 30));

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
        getContentPane().add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        jPanel1.setBackground(new java.awt.Color(250, 183, 22));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setText("ELIMINAR PAGO");
        jPanel1.add(jLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatoPago.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoPago.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Pago"));

        jTFBuscar_CodTran.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_CodTran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_CodTranKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_CodTranKeyTyped(evt);
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
                .addComponent(jTFBuscar_CodTran, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoPagoLayout.setVerticalGroup(
            jPanelDatoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_CodTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodTran))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.add(jPanelDatoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, -1));
        jPanelDatoPago.getAccessibleContext().setAccessibleName("Datos del estudiante");

        jPDatosPagoEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosPagoEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar"));

        jTFCedula_EliminarPago.setEditable(false);
        jTFCedula_EliminarPago.setBackground(new java.awt.Color(255, 255, 255));
        jTFCedula_EliminarPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCodTran.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCodTran.setText("Cod. Transacción");

        jTFCodTran_EliminarPago.setEditable(false);
        jTFCodTran_EliminarPago.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodTran_EliminarPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelFecha.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelFecha.setText("Fecha de Pago");

        jTFMetodo_EliminarPago.setEditable(false);
        jTFMetodo_EliminarPago.setBackground(new java.awt.Color(255, 255, 255));
        jTFMetodo_EliminarPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelMetodo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelMetodo.setText("Método Pago");

        jTFValor_EliminarPago.setEditable(false);
        jTFValor_EliminarPago.setBackground(new java.awt.Color(255, 255, 255));
        jTFValor_EliminarPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelValor.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelValor.setText("Valor");

        jTFFecha_EliminarPago.setEditable(false);
        jTFFecha_EliminarPago.setBackground(new java.awt.Color(255, 255, 255));
        jTFFecha_EliminarPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCedula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCedula.setText("N° Cédula");

        javax.swing.GroupLayout jPDatosPagoEliminarLayout = new javax.swing.GroupLayout(jPDatosPagoEliminar);
        jPDatosPagoEliminar.setLayout(jPDatosPagoEliminarLayout);
        jPDatosPagoEliminarLayout.setHorizontalGroup(
            jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosPagoEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosPagoEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMetodo)
                            .addComponent(jLabelFecha)
                            .addComponent(jLabelValor))
                        .addGap(21, 21, 21)
                        .addGroup(jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFValor_EliminarPago, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(jTFFecha_EliminarPago)))
                    .addGroup(jPDatosPagoEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodTran)
                            .addComponent(jLabelCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFMetodo_EliminarPago)
                            .addGroup(jPDatosPagoEliminarLayout.createSequentialGroup()
                                .addGroup(jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTFCodTran_EliminarPago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(jTFCedula_EliminarPago, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(6, 6, 6))
        );
        jPDatosPagoEliminarLayout.setVerticalGroup(
            jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosPagoEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCedula_EliminarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodTran_EliminarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodTran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFMetodo_EliminarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMetodo))
                .addGap(6, 6, 6)
                .addGroup(jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFecha_EliminarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha))
                .addGap(6, 6, 6)
                .addGroup(jPDatosPagoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFValor_EliminarPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPDatosPagoEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 370, 180));

        jPanel2.setBackground(new java.awt.Color(250, 183, 22));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(JBCancela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        JBIngreso1.setBackground(new java.awt.Color(255, 255, 254));
        JBIngreso1.setForeground(new java.awt.Color(250, 183, 22));
        JBIngreso1.setText("Eliminar");
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
        jPanel2.add(JBIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 400, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBuscar_CodTranKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_CodTranKeyReleased

    }//GEN-LAST:event_jTFBuscar_CodTranKeyReleased

    private void jTFBuscar_CodTranKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_CodTranKeyTyped

    }//GEN-LAST:event_jTFBuscar_CodTranKeyTyped

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLCodTran;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCodTran;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelMetodo;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPDatosPagoEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelDatoPago;
    public static javax.swing.JTextField jTFBuscar_CodTran;
    public static javax.swing.JTextField jTFCedula_EliminarPago;
    public static javax.swing.JTextField jTFCodTran_EliminarPago;
    public static javax.swing.JTextField jTFFecha_EliminarPago;
    public static javax.swing.JTextField jTFMetodo_EliminarPago;
    public static javax.swing.JTextField jTFValor_EliminarPago;
    // End of variables declaration//GEN-END:variables
}
