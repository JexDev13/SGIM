package GUI.Administrador.Gestion_Sistema;

import Negocio.Conexion;
import Negocio.Diseño;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_ActualizarVariables extends javax.swing.JFrame {

    private int x;
    private int y;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();
    String SQL;
    Conexion con = new Conexion();
    String tabla = "variables_del_sistema";
    String titulo = null;
    String mensaje = null;

    public JFAdmin_ActualizarVariables() {
        initComponents();
        setLocationRelativeTo(this);
        presentarDatos();
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
        jPanel4 = new javax.swing.JPanel();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPDatosEstudianteActualizar = new javax.swing.JPanel();
        jTFPension = new javax.swing.JTextField();
        jChBPension = new javax.swing.JCheckBox();
        jTFCupos = new javax.swing.JTextField();
        jChBCupos = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 208));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 208));
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
        jLabelTitulo1.setText("Variables del sistema");
        jPanel1.add(jLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

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
        jPanel1.add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, 30));

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
        jPanel1.add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(250, 183, 22));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel4.add(JBCancela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

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
        jPanel4.add(JBIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, 60));

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

        jPDatosEstudianteActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEstudianteActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cambiar variables"));

        jTFPension.setEditable(false);
        jTFPension.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFPension.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFPensionFocusLost(evt);
            }
        });

        jChBPension.setBackground(new java.awt.Color(255, 255, 255));
        jChBPension.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBPension.setText("Pensión mensual ($):");
        jChBPension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBPensionActionPerformed(evt);
            }
        });

        jTFCupos.setEditable(false);
        jTFCupos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCuposActionPerformed(evt);
            }
        });

        jChBCupos.setBackground(new java.awt.Color(255, 255, 255));
        jChBCupos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBCupos.setText("Cupos por clase:");
        jChBCupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBCuposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDatosEstudianteActualizarLayout = new javax.swing.GroupLayout(jPDatosEstudianteActualizar);
        jPDatosEstudianteActualizar.setLayout(jPDatosEstudianteActualizarLayout);
        jPDatosEstudianteActualizarLayout.setHorizontalGroup(
            jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChBCupos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBPension))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCupos, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jTFPension))
                .addContainerGap())
        );
        jPDatosEstudianteActualizarLayout.setVerticalGroup(
            jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBPension)
                    .addComponent(jTFPension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChBCupos)
                    .addComponent(jTFCupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel6.add(jPDatosEstudianteActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 100));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("aceptar");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed
        String cupos = this.jTFCupos.getText();
        String pension = this.jTFPension.getText();
        if (cupos.isEmpty() || pension.isEmpty()) {
            titulo = "ADVERTENCIA";
            mensaje = "Las variables del sistema no pueden estar vacías";
            emitirMensaje(mensaje, titulo);
        } else {
            if (jChBCupos.isSelected()) {
                this.SQL = "UPDATE variables_del_sistema SET cupos = " + cupos + " WHERE id = 1;";
                mensaje = "Máximo de cupos cambiado con exito";
                if (con.actualizarEliminarTablas(SQL) == true) {
                    titulo = "RESULTADO";
                    dispose();
                    emitirMensaje(mensaje, titulo);
                }
            }
            if (jChBPension.isSelected()) {
                if (!isValidNumber(jTFPension.getText())) {
                    JOptionPane.showMessageDialog(null, "Valor inválido. Ingrese solo números y decimales con punto.");
                } else {
                    this.SQL = "UPDATE variables_del_sistema SET valor_pension = " + pension + " WHERE id = 1;";
                    mensaje = "Pensión cambiada con éxito";
                    if (con.actualizarEliminarTablas(SQL) == true) {
                        titulo = "RESULTADO";
                        dispose();
                        emitirMensaje(mensaje, titulo);
                    }
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

    private void jChBCuposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBCuposActionPerformed
        if (this.jChBCupos.isSelected()) {
            this.jTFCupos.setEditable(true);
        } else {
            this.jTFCupos.setEditable(false);
        }
    }//GEN-LAST:event_jChBCuposActionPerformed

    private void jChBPensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBPensionActionPerformed
        if (jChBPension.isSelected()) {
            this.jTFPension.setEditable(true);
        } else {
            this.jTFPension.setEditable(false);
        }
    }//GEN-LAST:event_jChBPensionActionPerformed

    private void jTFCuposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCuposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCuposActionPerformed

    private void jTFPensionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPensionFocusLost
        if (!jTFPension.getText().isEmpty()) {
            if (!isValidNumber(jTFPension.getText())) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Ingrese solo números y decimales.");
            }
        }
    }//GEN-LAST:event_jTFPensionFocusLost

    private void emitirMensaje(String mensaje, String titulo) {
        getToolkit();
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    public void presentarDatos() {
        this.SQL = "Select * from variables_del_sistema where id = 1;";
        con.despliegueFields(SQL, tabla, jTFPension, jTFCupos, null, null,
                null, null, null, null, "acutalizar");
    }

    private boolean isValidNumber(String text) {
        return Pattern.matches("^\\d*\\.?\\d*$", text);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jChBCupos;
    private javax.swing.JCheckBox jChBPension;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JPanel jPDatosEstudianteActualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JTextField jTFCupos;
    public static javax.swing.JTextField jTFPension;
    // End of variables declaration//GEN-END:variables
}
