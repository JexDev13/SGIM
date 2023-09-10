package GUI.Administrador.Inventario;

import Negocio.Conexion;
import Negocio.Diseño;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_Actualizar extends javax.swing.JFrame {

    private int x;
    private int y;
    private Conexion con = new Conexion();
    private String SQL;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();

    public JFAdmin_Actualizar() {
        initComponents();
        setLocationRelativeTo(this);
        this.jTextAreaCondicion.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPDatosActualizar = new javax.swing.JPanel();
        jTFCodigo_Actualizar = new javax.swing.JTextField();
        jChBCondicion_Actualizar = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCondicion = new javax.swing.JTextArea();
        jPanelDato = new javax.swing.JPanel();
        jTFBuscar_Actualizar = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jPFondo = new javax.swing.JPanel();
        JBIngreso1 = new javax.swing.JButton();
        JBCancela1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jButtonMinimizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 484));
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
        getContentPane().setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Actualizar");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

        jPDatosActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jTFCodigo_Actualizar.setEditable(false);
        jTFCodigo_Actualizar.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBCondicion_Actualizar.setBackground(new java.awt.Color(255, 255, 255));
        jChBCondicion_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBCondicion_Actualizar.setText("Condición");
        jChBCondicion_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBCondicion_ActualizarActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Código");

        jTextAreaCondicion.setColumns(20);
        jTextAreaCondicion.setRows(5);
        jTextAreaCondicion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAreaCondicionFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaCondicion);

        javax.swing.GroupLayout jPDatosActualizarLayout = new javax.swing.GroupLayout(jPDatosActualizar);
        jPDatosActualizar.setLayout(jPDatosActualizarLayout);
        jPDatosActualizarLayout.setHorizontalGroup(
            jPDatosActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPDatosActualizarLayout.createSequentialGroup()
                        .addComponent(jChBCondicion_Actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatosActualizarLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFCodigo_Actualizar)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPDatosActualizarLayout.setVerticalGroup(
            jPDatosActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosActualizarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatosActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChBCondicion_Actualizar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPDatosActualizar);
        jPDatosActualizar.setBounds(10, 150, 360, 270);

        jPanelDato.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDato.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos"));

        jTFBuscar_Actualizar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_Actualizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFBuscar_ActualizarFocusLost(evt);
            }
        });
        jTFBuscar_Actualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código:");

        javax.swing.GroupLayout jPanelDatoLayout = new javax.swing.GroupLayout(jPanelDato);
        jPanelDato.setLayout(jPanelDatoLayout);
        jPanelDatoLayout.setHorizontalGroup(
            jPanelDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLCodigo)
                .addGap(69, 69, 69)
                .addComponent(jTFBuscar_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoLayout.setVerticalGroup(
            jPanelDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDato);
        jPanelDato.setBounds(10, 40, 360, 100);

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

        JBIngreso1.setBackground(new java.awt.Color(255, 255, 254));
        JBIngreso1.setForeground(new java.awt.Color(250, 183, 22));
        JBIngreso1.setText("aceptar");
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
        jPFondo.add(JBIngreso1);
        JBIngreso1.setBounds(90, 440, 89, 32);

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
        jPFondo.add(JBCancela1);
        JBCancela1.setBounds(200, 440, 89, 32);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPFondo.add(jPanel1);
        jPanel1.setBounds(0, 30, 380, 400);

        jButtonSalirIcon1.setBackground(new java.awt.Color(250, 183, 22));
        jButtonSalirIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButtonSalirIcon1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalirIcon1.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonSalirIcon1.setRequestFocusEnabled(false);
        jButtonSalirIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirIcon1ActionPerformed(evt);
            }
        });
        jPFondo.add(jButtonSalirIcon1);
        jButtonSalirIcon1.setBounds(350, 0, 30, 30);

        jButtonMinimizar1.setBackground(new java.awt.Color(250, 183, 22));
        jButtonMinimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar 24.png"))); // NOI18N
        jButtonMinimizar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonMinimizar1.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonMinimizar1.setRequestFocusEnabled(false);
        jButtonMinimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizar1ActionPerformed(evt);
            }
        });
        jPFondo.add(jButtonMinimizar1);
        jButtonMinimizar1.setBounds(320, 0, 30, 30);

        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 380, 500);

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

    private void jChBCondicion_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBCondicion_ActualizarActionPerformed
        if (this.jChBCondicion_Actualizar.isSelected()) {
            this.jTextAreaCondicion.setEditable(true);
        } else {
            this.jTextAreaCondicion.setEditable(false);
        }
    }//GEN-LAST:event_jChBCondicion_ActualizarActionPerformed

    private void jTFBuscar_ActualizarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarKeyTyped

    }//GEN-LAST:event_jTFBuscar_ActualizarKeyTyped

    private void jTFBuscar_ActualizarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarKeyReleased
        if (jTFBuscar_Actualizar.getText().startsWith("INSTR-")) {
            this.SQL = """
                   SELECT Codigo,Condicion FROM instrumentos WHERE """
                    + " " + "Codigo" + " LIKE '%" + jTFBuscar_Actualizar.getText() + "%';";
            ResultSet resultado1 = con.query(SQL);
            try {
                if (resultado1.next()) {
                    jTFCodigo_Actualizar.setText(resultado1.getString("Codigo"));
                    jTextAreaCondicion.setText(resultado1.getString("Condicion"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(JFAdmin_Actualizar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (jTFBuscar_Actualizar.getText().startsWith("LIBR-")) {
            this.SQL = """
                   SELECT Codigo,Condicion FROM libros WHERE """
                    + " " + "Codigo" + " LIKE '%" + jTFBuscar_Actualizar.getText() + "%';";
            ResultSet resultado1 = con.query(SQL);
            try {
                if (resultado1.next()) {
                    jTFCodigo_Actualizar.setText(resultado1.getString("Codigo"));
                    jTextAreaCondicion.setText(resultado1.getString("Condicion"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(JFAdmin_Actualizar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTFBuscar_ActualizarKeyReleased

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("aceptar");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed
        JBIngreso1.requestFocusInWindow();
        if (jTFBuscar_Actualizar.getText().isEmpty() || jTextAreaCondicion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar todos los campos");
        } else {
            if (jTFBuscar_Actualizar.getText().startsWith("INSTR-")) {
                this.SQL = """
                           SELECT COUNT(*) AS count FROM instrumentos WHERE Codigo = '""" + jTFBuscar_Actualizar.getText() + "';";
                try {
                    ResultSet resultado = con.query(SQL);
                    if (resultado.next()) {
                        int count = resultado.getInt("count");
                        if (count > 0) {

                            this.SQL = """
                           UPDATE instrumentos SET Condicion = '""" + jTextAreaCondicion.getText() + "' WHERE Codigo = '" + jTFBuscar_Actualizar.getText() + "';";
                            con.update(SQL);
                            JOptionPane.showMessageDialog(null, "Producto actualizado");
                            limpiarCampos();
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Código de producto no encontrado");
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JFAdmin_Insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (jTFBuscar_Actualizar.getText().startsWith("LIBR-")) {
                this.SQL = """
                           SELECT COUNT(*) AS count FROM libros WHERE Codigo = '""" + jTFBuscar_Actualizar.getText() + "';";
                try {
                    ResultSet resultado = con.query(SQL);
                    if (resultado.next()) {
                        int count = resultado.getInt("count");
                        if (count > 0) {
                            this.SQL = """
                           UPDATE libros SET Condicion = '""" + jTextAreaCondicion.getText() + "' WHERE Codigo = '" + jTFBuscar_Actualizar.getText() + "';";
                            con.update(SQL);
                            JOptionPane.showMessageDialog(null, "Producto actualizado");
                            limpiarCampos();
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Código de producto no encontrado");
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JFAdmin_Insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_JBIngreso1ActionPerformed

    private void JBCancela1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseEntered
        this.JBCancela1.setText("CANCELAR");
    }//GEN-LAST:event_JBCancela1MouseEntered

    private void JBCancela1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseExited
        this.JBCancela1.setText("cancelar");
    }//GEN-LAST:event_JBCancela1MouseExited

    private void JBCancela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancela1ActionPerformed
        String tituo = "¿Cancelar ingreso?";
        String mensaje = "Si cancela los datos ingresados no serán guardados";
        emitirMensaje(mensaje, tituo);
        limpiarCampos();
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

    private void jTextAreaCondicionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaCondicionFocusLost
        if (jTextAreaCondicion.getText().length() > 200) {
            JOptionPane.showMessageDialog(null, "Condición con exceso de caracteres");
            jTextAreaCondicion.setText("");
        }
    }//GEN-LAST:event_jTextAreaCondicionFocusLost

    private void jTFBuscar_ActualizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarFocusLost
//        if (jTFBuscar_Actualizar.getText().startsWith("INSTR-")) {
//            this.SQL = """
//                   SELECT Codigo,Condicion FROM instrumentos WHERE """
//                    + " " + "Codigo" + " LIKE '%" + jTFBuscar_Actualizar.getText() + "%';";
//            ResultSet resultado1 = con.query(SQL);
//            try {
//                if (resultado1.next()) {
//                    jTFCodigo_Actualizar.setText(resultado1.getString("Codigo"));
//                    jTextAreaCondicion.setText(resultado1.getString("Condicion"));
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(JFAdmin_Actualizar.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else if (jTFBuscar_Actualizar.getText().startsWith("LIBR-")) {
//            this.SQL = """
//                   SELECT Codigo,Condicion FROM libros WHERE """
//                    + " " + "Codigo" + " LIKE '%" + jTFBuscar_Actualizar.getText() + "%';";
//            ResultSet resultado1 = con.query(SQL);
//            try {
//                if (resultado1.next()) {
//                    jTFCodigo_Actualizar.setText(resultado1.getString("Codigo"));
//                    jTextAreaCondicion.setText(resultado1.getString("Condicion"));
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(JFAdmin_Actualizar.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }//GEN-LAST:event_jTFBuscar_ActualizarFocusLost

    public void limpiarCampos() {
        this.jTFCodigo_Actualizar.setText("");
        this.jTFBuscar_Actualizar.setText("");
    }
    
    private void emitirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JCheckBox jChBCondicion_Actualizar;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosActualizar;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDato;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTFBuscar_Actualizar;
    public static javax.swing.JTextField jTFCodigo_Actualizar;
    private javax.swing.JTextArea jTextAreaCondicion;
    // End of variables declaration//GEN-END:variables
}
