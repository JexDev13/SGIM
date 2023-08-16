package GUI.Administrador.Profesores;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_InsertarProf extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdmin_InsertarProf() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLSueldo = new javax.swing.JLabel();
        jCBPiano = new javax.swing.JCheckBox();
        jCBGuitarra = new javax.swing.JCheckBox();
        jCBViolin = new javax.swing.JCheckBox();
        jCBOtro = new javax.swing.JCheckBox();
        jTFCedula = new javax.swing.JTextField();
        jTFNombres = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        jTFNivel = new javax.swing.JTextField();
        jTFDireccion = new javax.swing.JTextField();
        jTFTelef = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jTFSueldo = new javax.swing.JTextField();
        jLCedula = new javax.swing.JLabel();
        jLNombres = new javax.swing.JLabel();
        jLApellidos = new javax.swing.JLabel();
        jLNivel = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jLTelf = new javax.swing.JLabel();
        jLCorreo = new javax.swing.JLabel();
        jLEspecial = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(290, 403));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(290, 403));
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
        getContentPane().add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 30, 30));

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
        getContentPane().add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 30, 30));

        jPanel1.setBackground(new java.awt.Color(250, 183, 22));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setText("Insertar PROFESOR");
        jPanel1.add(jLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 49));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLSueldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLSueldo.setText("Sueldo base:");
        jPanel2.add(jLSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 263, -1, -1));

        jCBPiano.setBackground(new java.awt.Color(255, 255, 255));
        jCBPiano.setText("Piano");
        jCBPiano.setContentAreaFilled(false);
        jPanel2.add(jCBPiano, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 229, -1, -1));

        jCBGuitarra.setBackground(new java.awt.Color(255, 255, 255));
        jCBGuitarra.setText("Guitarra");
        jCBGuitarra.setContentAreaFilled(false);
        jPanel2.add(jCBGuitarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 229, -1, -1));

        jCBViolin.setBackground(new java.awt.Color(255, 255, 255));
        jCBViolin.setText("Violín");
        jCBViolin.setContentAreaFilled(false);
        jPanel2.add(jCBViolin, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 229, -1, -1));

        jCBOtro.setBackground(new java.awt.Color(255, 255, 255));
        jCBOtro.setText("Otro");
        jCBOtro.setContentAreaFilled(false);
        jPanel2.add(jCBOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 229, -1, -1));
        jPanel2.add(jTFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 11, 170, -1));
        jPanel2.add(jTFNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 37, 170, -1));
        jPanel2.add(jTFApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 63, 170, -1));
        jPanel2.add(jTFNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 94, 136, -1));
        jPanel2.add(jTFDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 125, 174, -1));
        jPanel2.add(jTFTelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 151, 163, -1));
        jPanel2.add(jTFCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 182, 117, -1));
        jPanel2.add(jTFSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 262, 139, -1));

        jLCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCedula.setText("N°Cédula:");
        jPanel2.add(jLCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 12, -1, -1));

        jLNombres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNombres.setText("Nombres:");
        jPanel2.add(jLNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 38, -1, -1));

        jLApellidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLApellidos.setText("Apellidos:");
        jPanel2.add(jLApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 64, -1, -1));

        jLNivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNivel.setText("Nivel académico:");
        jPanel2.add(jLNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 95, -1, -1));

        jLDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDireccion.setText("Dirección:");
        jPanel2.add(jLDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 126, -1, -1));

        jLTelf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLTelf.setText("N°Teléfono:");
        jPanel2.add(jLTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 152, -1, -1));

        jLCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCorreo.setText("Correo electrónico:");
        jPanel2.add(jLCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 183, -1, -1));

        jLEspecial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLEspecial.setText("Especialización:");
        jPanel2.add(jLEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 208, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 290, 310));

        jPanel3.setBackground(new java.awt.Color(250, 183, 22));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(JBIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBCancela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 354, 290, 50));

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

    public void borrarCampos() {
        this.jTFApellidos.setText("");
        this.jTFCedula.setText("");
        this.jTFCorreo.setText("");
        this.jTFDireccion.setText("");
        this.jTFNivel.setText("");
        this.jTFNombres.setText("");
        this.jTFSueldo.setText("");
        this.jTFTelef.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jCBGuitarra;
    private javax.swing.JCheckBox jCBOtro;
    private javax.swing.JCheckBox jCBPiano;
    private javax.swing.JCheckBox jCBViolin;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLEspecial;
    private javax.swing.JLabel jLNivel;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLSueldo;
    private javax.swing.JLabel jLTelf;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFCedula;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFNivel;
    private javax.swing.JTextField jTFNombres;
    private javax.swing.JTextField jTFSueldo;
    private javax.swing.JTextField jTFTelef;
    // End of variables declaration//GEN-END:variables
}
