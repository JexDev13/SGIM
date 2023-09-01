package GUI.Administrador.Pagos;

import Negocio.Diseño;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import Negocio.Conexion;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_RegistrarPago extends javax.swing.JFrame {

    private int x;
    private int y;
    Diseño diseño = new Diseño();
    private Conexion con = new Conexion();
    private String SQL;
    private double valorPension;

    public JFAdmin_RegistrarPago() {
        initComponents();
        setLocationRelativeTo(this);
        diseño.jComboUsers(this.jComboBoxMetodo);
        jTFCedula.setEditable(false);
        jTFValor.setEditable(false);
        JBFactura.setVisible(false);
        this.SQL = """
                           SELECT valor_pension FROM variables_del_sistema WHERE id = 1;""";
        ResultSet resultado0 = con.query(SQL);
        try {
            if (resultado0.next()) {
                valorPension = resultado0.getDouble("valor_pension");
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFAdmin_RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLValor = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();
        jLNivel1 = new javax.swing.JLabel();
        jComboBoxMetodo1 = new javax.swing.JComboBox<>();
        jLNivel = new javax.swing.JLabel();
        jComboBoxMetodo = new javax.swing.JComboBox<>();
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
        jPanel2.add(jLCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTFCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCedulaFocusLost(evt);
            }
        });
        jPanel2.add(jTFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 230, -1));

        jLValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLValor.setText("Valor ($):");
        jPanel2.add(jLValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jTFValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFValorFocusLost(evt);
            }
        });
        jPanel2.add(jTFValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 250, 240, -1));

        jLNivel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNivel1.setText("Tipo:");
        jPanel2.add(jLNivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jComboBoxMetodo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir Tipo...", "Abono", "Total" }));
        jComboBoxMetodo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxMetodo1FocusLost(evt);
            }
        });
        jComboBoxMetodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMetodo1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxMetodo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 230, -1));

        jLNivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNivel.setText("Método de  Pago:");
        jPanel2.add(jLNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jComboBoxMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir Método...", "Tarjeta de Crédito", "Tarjeta de Débito", "Transferencia Bancaria", "Efectivo" }));
        jComboBoxMetodo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxMetodoFocusLost(evt);
            }
        });
        jPanel2.add(jComboBoxMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 190, -1));

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

    public void borrarCampos() {
        this.jTFCedula.setText("");
        this.jTFValor.setText("");
    }

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

    private void JBFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBFacturaMouseEntered
        this.JBFactura.setText("ACEPTAR");
    }//GEN-LAST:event_JBFacturaMouseEntered

    private void JBFacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBFacturaMouseExited
        this.JBFactura.setText("aceptar");
    }//GEN-LAST:event_JBFacturaMouseExited

    private void JBFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFacturaActionPerformed
        
        
        JBFactura.requestFocusInWindow();
        if (jTFCedula.getText().isEmpty() || jTFValor.getText().isEmpty() || jComboBoxMetodo.getSelectedItem().equals("Elegir Método...") || jComboBoxMetodo1.getSelectedItem().equals("Elegir Tipo...")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else if (!isValidNumber(jTFValor.getText())){
            JOptionPane.showMessageDialog(null, "Valor inválido. Ingrese solo números y decimales.");
            jTFValor.setText("");
        } else {
            int tipo = 0;
            this.SQL = """
                           SELECT COUNT(*) AS count FROM estudiantes WHERE Cedula_Estudiante = '""" + jTFCedula.getText() + "';";
            try {
                ResultSet resultado = con.query(SQL);
                if (resultado.next()) {
                    int count = resultado.getInt("count");
                    if (count > 0) {
                        this.SQL = """
                           SELECT Total_cancelado FROM estudiantes_pagados WHERE Cedula_Estudiante = '""" + jTFCedula.getText() + "';";
                        try {
                            ResultSet resultado1 = con.query(SQL);
                            if (resultado1.next()) {
                                double valorTotal = resultado1.getDouble("Total_cancelado");
                                if (valorTotal + Double.parseDouble(jTFValor.getText()) > valorPension) {
                                    JOptionPane.showMessageDialog(null, "Valor ingresado mayor al máximo");
                                    jTFValor.setText("");
                                } else {
                                    if (jComboBoxMetodo1.getSelectedItem().equals("Abono")) {
                                        tipo = 1;
                                        this.SQL = """
                           INSERT INTO pagos (Cedula_estudiante,Metodo_pago,Monto,Fecha_pago,Mes_pagado,Abono) VALUES """ + "('" + jTFCedula.getText() + "', '" + jComboBoxMetodo.getSelectedItem() + "', " + jTFValor.getText() + ", '" + obtenerFecha() + "', '" + obtenerMes() + "', " + tipo + ");";
                                        con.update(SQL);
                                        JOptionPane.showMessageDialog(null, "Pago registrado exitosamente");
                                        borrarCampos();
                                        this.dispose();
                                    } else if (jComboBoxMetodo1.getSelectedItem().equals("Total")) {
                                        tipo = 0;
                                        this.SQL = """
                           INSERT INTO pagos (Cedula_estudiante,Metodo_pago,Monto,Fecha_pago,Mes_pagado,Abono) VALUES """ + "('" + jTFCedula.getText() + "', '" + jComboBoxMetodo.getSelectedItem() + "', 100, '" + obtenerFecha() + "', '" + obtenerMes() + "', " + tipo + ");";
                                        con.update(SQL);
                                        JOptionPane.showMessageDialog(null, "Pago registrado exitosamente");
                                        borrarCampos();
                                    }
                                }
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(JFAdmin_RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "El estudiante no existe");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(JFAdmin_RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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

    private void jComboBoxMetodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMetodo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMetodo1ActionPerformed

    private void jTFCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCedulaFocusLost

    }//GEN-LAST:event_jTFCedulaFocusLost

    private void jComboBoxMetodoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxMetodoFocusLost
        if (jComboBoxMetodo.getSelectedItem().equals("Elegir Método...")) {
            jTFCedula.setEditable(false);
            jTFValor.setEditable(false);
            JBFactura.setVisible(false);
            JOptionPane.showMessageDialog(null, "Seleccione un método");

        } else {
            jTFCedula.setEditable(true);
            jTFValor.setEditable(true);
        }
    }//GEN-LAST:event_jComboBoxMetodoFocusLost

    private void jComboBoxMetodo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxMetodo1FocusLost
        if (jComboBoxMetodo1.getSelectedItem().equals("Elegir Tipo...")) {
            jTFCedula.setEditable(false);
            jTFValor.setEditable(false);
            JBFactura.setVisible(false);
            JOptionPane.showMessageDialog(null, "Seleccione un tipo");

        } else if (jComboBoxMetodo1.getSelectedItem().equals("Abono")) {
            jTFCedula.setEditable(true);
            jTFValor.setEditable(true);
            JBFactura.setVisible(true);
        } else {
            jTFValor.setText(Double.toString(valorPension));
            jTFCedula.setEditable(true);
            jTFValor.setEditable(false);
            JBFactura.setVisible(true);
        }
    }//GEN-LAST:event_jComboBoxMetodo1FocusLost

    private void jTFValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFValorFocusLost
        // controlar que solo ingrese 3 numeros y 2 decimales
        if (!jTFValor.getText().isEmpty()) {
            if (!isValidNumber(jTFValor.getText())) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Ingrese solo números y decimales.");
                jTFValor.setText("");
            }else if (Double.parseDouble(jTFValor.getText()) > valorPension) {
                JOptionPane.showMessageDialog(null, "Valor mayor a total");
                jTFValor.setText("");
            }
        }
    }//GEN-LAST:event_jTFValorFocusLost

    private String obtenerFecha() {
        Date fechaActual = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada = sdf.format(fechaActual);
        return fechaFormateada;
    }

    private String obtenerMes() {
        Date fechaActual = new Date(System.currentTimeMillis());

        // Formatear la fecha para obtener el mes (0-11)
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        int mes = Integer.parseInt(sdf.format(fechaActual)) - 1; // Ajustar a índice de 0 a 11

        // Obtener el nombre del mes en español
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("es", "ES"));
        String nombreMes = symbols.getMonths()[mes];
        return nombreMes;
    }
    
    private boolean isValidNumber(String text) {
        return Pattern.matches("^\\d*\\.?\\d*$", text);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBFactura;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JComboBox<String> jComboBoxMetodo;
    private javax.swing.JComboBox<String> jComboBoxMetodo1;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLNivel;
    private javax.swing.JLabel jLNivel1;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFCedula;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
}
