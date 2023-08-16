package GUI.Administrador.Estudiantes;

import Negocio.Diseño;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_InsertarEstudiante extends javax.swing.JFrame {

    private int x;
    private int y;
    
    Diseño diseño = new Diseño();

    public JFAdmin_InsertarEstudiante() {
        initComponents();
        setLocationRelativeTo(this);
        diseño.jComboUsers(this.jComboBoxSexo);
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
        jLNombres = new javax.swing.JLabel();
        jTFNombres = new javax.swing.JTextField();
        jLApellidos = new javax.swing.JLabel();
        jTFApellidos = new javax.swing.JTextField();
        jLNivel = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLDireccion = new javax.swing.JLabel();
        jTFFDNacimiento = new javax.swing.JTextField();
        jLTelf = new javax.swing.JLabel();
        jTFNombresRepre = new javax.swing.JTextField();
        jLCorreo = new javax.swing.JLabel();
        jTFApellidosRepre = new javax.swing.JTextField();
        jLSueldo = new javax.swing.JLabel();
        jTFCorreoRepre = new javax.swing.JTextField();
        jLSueldo1 = new javax.swing.JLabel();
        jTFTelefonoRepre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(290, 399));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(290, 399));
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
        jLabelTitulo.setText("Insertar ESTUDIANTE");
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
        jPanel1.add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 30, 30));

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
        jPanel1.add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 292, 49));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCedula.setText("N°Cédula:");
        jPanel2.add(jLCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, -1));
        jPanel2.add(jTFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 11, 189, -1));

        jLNombres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNombres.setText("Nombres:");
        jPanel2.add(jLNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jPanel2.add(jTFNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 49, 189, -1));

        jLApellidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLApellidos.setText("Apellidos:");
        jPanel2.add(jLApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 76, -1, -1));
        jPanel2.add(jTFApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 75, 189, -1));

        jLNivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNivel.setText("Sexo:");
        jPanel2.add(jLNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, -1, -1));

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino ", "Femenino" }));
        jPanel2.add(jComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 106, 189, -1));

        jLDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDireccion.setText("F. de Nacimiento:");
        jPanel2.add(jLDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 138, -1, -1));
        jPanel2.add(jTFFDNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 137, 155, -1));

        jLTelf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLTelf.setText("Nombres Repre.:");
        jPanel2.add(jLTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, -1, -1));
        jPanel2.add(jTFNombresRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 163, 155, -1));

        jLCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCorreo.setText("Apellidos Repre.:");
        jPanel2.add(jLCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, -1, -1));
        jPanel2.add(jTFApellidosRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 194, 155, -1));

        jLSueldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLSueldo.setText("Coreeo Repre.:");
        jPanel2.add(jLSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 226, 93, -1));
        jPanel2.add(jTFCorreoRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 225, 155, -1));

        jLSueldo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLSueldo1.setText("Telefono Repre.:");
        jPanel2.add(jLSueldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 257, -1, -1));
        jPanel2.add(jTFTelefonoRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 256, 152, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 290, 300));

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
        jPanel3.add(JBIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 292, 49));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void borrarCampos() {
        this.jTFApellidos.setText("");
        this.jTFCedula.setText("");
        this.jTFNombres.setText("");
        this.jTFFDNacimiento.setText("");
        this.jTFNombresRepre.setText("");
        this.jTFApellidosRepre.setText("");
        this.jTFTelefonoRepre.setText("");
        this.jTFCorreoRepre.setText("");
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
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLNivel;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLSueldo;
    private javax.swing.JLabel jLSueldo1;
    private javax.swing.JLabel jLTelf;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFApellidosRepre;
    private javax.swing.JTextField jTFCedula;
    private javax.swing.JTextField jTFCorreoRepre;
    private javax.swing.JTextField jTFFDNacimiento;
    private javax.swing.JTextField jTFNombres;
    private javax.swing.JTextField jTFNombresRepre;
    private javax.swing.JTextField jTFTelefonoRepre;
    // End of variables declaration//GEN-END:variables
}
