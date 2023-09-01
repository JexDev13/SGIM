package GUI.Administrador.Inventario;

import Negocio.Diseño;
import javax.swing.JOptionPane;
import Negocio.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_Prestamo extends javax.swing.JFrame {

    private int x;
    private int y;
    private Conexion con = new Conexion();
    private String SQL;

    public JFAdmin_Prestamo() {
        initComponents();
        setLocationRelativeTo(this);
        jTFCodigo.setText("");
        jTFNoCedula.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTFNoCedula = new javax.swing.JTextField();
        jTFCodigo = new javax.swing.JTextField();
        jLNoCedula = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(292, 239));
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

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

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
        jPFondo.add(jButtonMinimizar);
        jButtonMinimizar.setBounds(320, 0, 30, 30);

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
        jPFondo.add(jButtonSalirIcon);
        jButtonSalirIcon.setBounds(350, 0, 30, 30);

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
        JBCancela1.setBounds(200, 190, 89, 32);

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
        JBIngreso1.setBounds(60, 190, 89, 32);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText(" Préstamo");
        jPFondo.add(jLabelTitulo);
        jLabelTitulo.setBounds(0, 0, 200, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLNoCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNoCedula.setText("N°Cédula Estudiante:");

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCodigo)
                    .addComponent(jLNoCedula))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jTFNoCedula, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNoCedula)
                    .addComponent(jTFNoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPFondo.add(jPanel1);
        jPanel1.setBounds(0, 30, 380, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        if (jTFCodigo.getText().isEmpty() || jTFNoCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            // verificar si existe codigo
            // verificar si existe cedula
            // si existen registrar el prestamo
            if (jTFCodigo.getText().startsWith("INSTR-")) {
                this.SQL = """
                           SELECT COUNT(*) AS count FROM instrumentos WHERE Codigo = '""" + jTFCodigo.getText() + "';";
                try {
                    ResultSet resultado = con.query(SQL);
                    if (resultado.next()) {
                        int count = resultado.getInt("count");
                        if (count > 0) {
                            this.SQL = """
                           SELECT COUNT(*) AS count FROM estudiantes WHERE Cedula_Estudiante = '""" + jTFNoCedula.getText() + "';";
                            try {
                                ResultSet resultado1 = con.query(SQL);
                                if (resultado1.next()) {
                                    int count1 = resultado1.getInt("count");
                                    if (count1 > 0) {
                                        this.SQL = """
                           UPDATE instrumentos SET EstadoAlquiler = 'Alquilado' WHERE Codigo = '""" + jTFCodigo.getText() + "';";
                                        con.update(SQL);
                                        this.SQL = """
                           Insert into prestamos_Instrumentos (Cedula_estudiante,Codigo_instrumento,Fecha) values ('""" + jTFNoCedula.getText() + "', '" + jTFCodigo.getText() + "', '" + obtenerFecha() + "');";
                                        con.update(SQL);
                                        JOptionPane.showMessageDialog(null, "Préstamo registrado");
                                        jTFCodigo.setText("");
                                        jTFNoCedula.setText("");
                                        this.dispose();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
                                    }
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(JFAdmin_Insertar.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Código de producto no encontrado");
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JFAdmin_Insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (jTFCodigo.getText().startsWith("LIBR-")) {
                this.SQL = """
                           SELECT COUNT(*) AS count FROM libros WHERE Codigo = '""" + jTFCodigo.getText() + "';";
                try {
                    ResultSet resultado = con.query(SQL);
                    if (resultado.next()) {
                        int count = resultado.getInt("count");
                        if (count > 0) {
                            this.SQL = """
                           SELECT COUNT(*) AS count FROM estudiantes WHERE Cedula_Estudiante = '""" + jTFNoCedula.getText() + "';";
                            try {
                                ResultSet resultado1 = con.query(SQL);
                                if (resultado1.next()) {
                                    int count1 = resultado1.getInt("count");
                                    if (count1 > 0) {
                                        this.SQL = """
                           UPDATE libros SET EstadoAlquiler = 'Alquilado' WHERE Codigo = '""" + jTFCodigo.getText() + "';";
                                        con.update(SQL);
                                        this.SQL = """
                           Insert into prestamos_Libros (Cedula_estudiante,Codigo_libro,Fecha) values ('""" + jTFNoCedula.getText() + "', '" + jTFCodigo.getText() + "', '" + obtenerFecha() + "');";
                                        con.update(SQL);
                                        JOptionPane.showMessageDialog(null, "Préstamo registrado");
                                        jTFCodigo.setText("");
                                        jTFNoCedula.setText("");
                                        this.dispose();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
                                    }
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(JFAdmin_Insertar.class.getName()).log(Level.SEVERE, null, ex);
                            }

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
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    public void borrarCampos() {
        this.jTFCodigo.setText("");
        this.jTFNoCedula.setText("");
    }

    private String obtenerFecha() {
        Date fechaActual = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada = sdf.format(fechaActual);
        return fechaFormateada;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLNoCedula;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFNoCedula;
    // End of variables declaration//GEN-END:variables
}
