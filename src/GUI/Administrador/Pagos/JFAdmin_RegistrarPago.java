package GUI.Administrador.Pagos;

import Negocio.Diseño;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_RegistrarPago extends javax.swing.JFrame {
    
    private int x;
    private int y;
    Diseño diseño = new Diseño();
    
    public JFAdmin_RegistrarPago() {
        initComponents();
        setLocationRelativeTo(this);
        diseño.jComboUsers(this.jComboBoxMetodo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLCedula = new javax.swing.JLabel();
        jTFCedula = new javax.swing.JTextField();
        jLCodTran = new javax.swing.JLabel();
        jTFCodTran = new javax.swing.JTextField();
        jLNivel = new javax.swing.JLabel();
        jComboBoxMetodo = new javax.swing.JComboBox<>();
        jLFecha = new javax.swing.JLabel();
        jLValor = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();
        jFormattedTextFieldFecha = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        JBCancela1 = new javax.swing.JButton();
        JBFactura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(290, 399));
        setUndecorated(true);
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

        jLabelTitulo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Registrar Pago");
        jPanel1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

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
        jPanel1.add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 30, 30));

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
        jPanel1.add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 49));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCedula.setText("N°Cédula:");
        jPanel2.add(jLCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, -1));
        jPanel2.add(jTFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 11, 230, -1));

        jLCodTran.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodTran.setText("Cod. Transacción:");
        jPanel2.add(jLCodTran, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel2.add(jTFCodTran, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 190, -1));

        jLNivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNivel.setText("Método de  Pago:");
        jPanel2.add(jLNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jComboBoxMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir Método...", "Efectivo", "Transferencia", "Tarjeta de crédito/débito", "Cheque" }));
        jPanel2.add(jComboBoxMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, -1));

        jLFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLFecha.setText("Fecha de pago:");
        jPanel2.add(jLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLValor.setText("Valor:");
        jPanel2.add(jLValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        jPanel2.add(jTFValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 250, 240, -1));

        jFormattedTextFieldFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jPanel2.add(jFormattedTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 200, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 310, 300));

        jPanel3.setBackground(new java.awt.Color(250, 183, 22));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBCancela1.setBackground(new java.awt.Color(255, 255, 254));
        JBCancela1.setForeground(new java.awt.Color(250, 183, 22));
        JBCancela1.setText("cancelar");
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
        jPanel3.add(JBCancela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        JBFactura.setBackground(new java.awt.Color(255, 255, 254));
        JBFactura.setForeground(new java.awt.Color(250, 183, 22));
        JBFactura.setText("aceptar");
        JBFactura.setBorder(null);
        JBFactura.setBorderPainted(false);
        JBFactura.setDefaultCapable(false);
        JBFactura.setFocusPainted(false);
        JBFactura.setHideActionText(true);
        JBFactura.setPreferredSize(new java.awt.Dimension(89, 32));
        JBFactura.setRequestFocusEnabled(false);
        JBFactura.setRolloverEnabled(false);
        JBFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBFacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBFacturaMouseExited(evt);
            }
        });
        JBFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFacturaActionPerformed(evt);
            }
        });
        jPanel3.add(JBFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 310, 49));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void borrarCampos()
    {
        this.jTFCedula.setText("");
        this.jTFCodTran.setText("");
        this.jTFValor.setText("");
    }
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);
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

    private void JBFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBFacturaMouseEntered
        this.JBFactura.setText("ACEPTAR");
    }//GEN-LAST:event_JBFacturaMouseEntered

    private void JBFacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBFacturaMouseExited
        this.JBFactura.setText("aceptar");
    }//GEN-LAST:event_JBFacturaMouseExited

    private void JBFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFacturaActionPerformed

    }//GEN-LAST:event_JBFacturaActionPerformed

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
    private javax.swing.JButton JBFactura;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JComboBox<String> jComboBoxMetodo;
    private javax.swing.JFormattedTextField jFormattedTextFieldFecha;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLCodTran;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLNivel;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFCedula;
    private javax.swing.JTextField jTFCodTran;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
}