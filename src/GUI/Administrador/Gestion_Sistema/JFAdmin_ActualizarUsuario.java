package GUI.Administrador.Gestion_Sistema;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_ActualizarUsuario extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdmin_ActualizarUsuario() {
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
        jPanel4 = new javax.swing.JPanel();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_ActualizarEst = new javax.swing.JTextField();
        jLCedula = new javax.swing.JLabel();
        jPDatosEstudianteActualizar = new javax.swing.JPanel();
        jTFApellidos_ActualizarEst = new javax.swing.JTextField();
        jTFCodigo_ActualizarEst = new javax.swing.JTextField();
        jTFNombres_ActualizarEst = new javax.swing.JTextField();
        jChBNombre_ActualizarEst = new javax.swing.JCheckBox();
        jChBApellido_ActualizarEst = new javax.swing.JCheckBox();
        jChBFechaNacimiento_ActualizarEst = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jCBUsuario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 379));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 379));
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
        jLabelTitulo1.setText("ACTUALIZAR USUARIO");
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

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

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 400, 60));

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

        jPanelDatoEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Estudiante"));

        jTFBuscar_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_ActualizarEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarEstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarEstKeyTyped(evt);
            }
        });

        jLCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCedula.setText("N°Cédula:");

        javax.swing.GroupLayout jPanelDatoEstudianteLayout = new javax.swing.GroupLayout(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setLayout(jPanelDatoEstudianteLayout);
        jPanelDatoEstudianteLayout.setHorizontalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCedula)
                .addGap(79, 79, 79)
                .addComponent(jTFBuscar_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoEstudianteLayout.setVerticalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCedula))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.add(jPanelDatoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, -1));

        jPDatosEstudianteActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEstudianteActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jTFApellidos_ActualizarEst.setEditable(false);
        jTFApellidos_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCodigo_ActualizarEst.setEditable(false);
        jTFCodigo_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFNombres_ActualizarEst.setEditable(false);
        jTFNombres_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBNombre_ActualizarEst.setBackground(new java.awt.Color(255, 255, 255));
        jChBNombre_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBNombre_ActualizarEst.setText("Usuario");
        jChBNombre_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBNombre_ActualizarEstActionPerformed(evt);
            }
        });

        jChBApellido_ActualizarEst.setBackground(new java.awt.Color(255, 255, 255));
        jChBApellido_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBApellido_ActualizarEst.setText("Correo electrónico");
        jChBApellido_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBApellido_ActualizarEstActionPerformed(evt);
            }
        });

        jChBFechaNacimiento_ActualizarEst.setBackground(new java.awt.Color(255, 255, 255));
        jChBFechaNacimiento_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBFechaNacimiento_ActualizarEst.setText("Rol");
        jChBFechaNacimiento_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBFechaNacimiento_ActualizarEstActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("N° Cédula");

        jCBUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perfiles de Usuario", "Administrativo", "Profesor", "Estudiante" }));
        jCBUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBUsuario.setPreferredSize(new java.awt.Dimension(72, 25));
        jCBUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDatosEstudianteActualizarLayout = new javax.swing.GroupLayout(jPDatosEstudianteActualizar);
        jPDatosEstudianteActualizar.setLayout(jPDatosEstudianteActualizarLayout);
        jPDatosEstudianteActualizarLayout.setHorizontalGroup(
            jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addComponent(jChBApellido_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFApellidos_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jChBNombre_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo_ActualizarEst)
                            .addComponent(jTFNombres_ActualizarEst)))
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addComponent(jChBFechaNacimiento_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPDatosEstudianteActualizarLayout.setVerticalGroup(
            jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBNombre_ActualizarEst)
                    .addComponent(jTFNombres_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBApellido_ActualizarEst)
                    .addComponent(jTFApellidos_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBFechaNacimiento_ActualizarEst)
                    .addComponent(jCBUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel6.add(jPDatosEstudianteActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 160));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBuscar_ActualizarEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarEstKeyReleased

    }//GEN-LAST:event_jTFBuscar_ActualizarEstKeyReleased

    private void jTFBuscar_ActualizarEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarEstKeyTyped

    }//GEN-LAST:event_jTFBuscar_ActualizarEstKeyTyped

    private void jChBNombre_ActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBNombre_ActualizarEstActionPerformed
        if (jChBNombre_ActualizarEst.isSelected()) {
            this.jTFNombres_ActualizarEst.setEditable(true);
        } else {
            this.jTFNombres_ActualizarEst.setEditable(false);
        }
    }//GEN-LAST:event_jChBNombre_ActualizarEstActionPerformed

    private void jChBApellido_ActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBApellido_ActualizarEstActionPerformed
        if (jChBApellido_ActualizarEst.isSelected()) {
            this.jTFApellidos_ActualizarEst.setEditable(true);
        } else {
            this.jTFApellidos_ActualizarEst.setEditable(false);
        }
    }//GEN-LAST:event_jChBApellido_ActualizarEstActionPerformed

    private void jChBFechaNacimiento_ActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBFechaNacimiento_ActualizarEstActionPerformed
        if (jChBFechaNacimiento_ActualizarEst.isSelected()) {
            this.jCBUsuario.setEditable(true);
        } else {
            this.jCBUsuario.setEditable(false);
        }
    }//GEN-LAST:event_jChBFechaNacimiento_ActualizarEstActionPerformed

    public void limpiarCampos() {
        this.jTFApellidos_ActualizarEst.setText("");
        this.jTFCodigo_ActualizarEst.setText("");
        this.jTFNombres_ActualizarEst.setText("");
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

    private void jCBUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JComboBox<String> jCBUsuario;
    private javax.swing.JCheckBox jChBApellido_ActualizarEst;
    private javax.swing.JCheckBox jChBFechaNacimiento_ActualizarEst;
    private javax.swing.JCheckBox jChBNombre_ActualizarEst;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JPanel jPDatosEstudianteActualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelDatoEstudiante;
    public static javax.swing.JTextField jTFApellidos_ActualizarEst;
    public static javax.swing.JTextField jTFBuscar_ActualizarEst;
    public static javax.swing.JTextField jTFCodigo_ActualizarEst;
    public static javax.swing.JTextField jTFNombres_ActualizarEst;
    // End of variables declaration//GEN-END:variables
}
