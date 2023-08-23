package GUI.Administrador.Profesores;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdminProfActualizar extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdminProfActualizar() {
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
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_ActualizarEst = new javax.swing.JTextField();
        jLCedula = new javax.swing.JLabel();
        jPDatosEstudianteActualizar = new javax.swing.JPanel();
        jTFApellidos_ActualizarEst = new javax.swing.JTextField();
        jTFCorreo_ActualizarEst = new javax.swing.JTextField();
        jTFSector_ActualizarEst = new javax.swing.JTextField();
        jTFCodigo_ActualizarEst = new javax.swing.JTextField();
        jTFCelular_ActualizarEst = new javax.swing.JTextField();
        jTFNombres_ActualizarEst = new javax.swing.JTextField();
        jChBSector_ActualizarEst = new javax.swing.JCheckBox();
        jChBCelular_ActualizarEst = new javax.swing.JCheckBox();
        jChBCorreo_ActualizarEst = new javax.swing.JCheckBox();
        jTFFacultad_ActualizarEst = new javax.swing.JTextField();
        jChBFacultad_ActualizarEst = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jTFCorreo_ActualizarEst1 = new javax.swing.JTextField();
        jChBCorreo_ActualizarEst1 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(400, 523));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 523));
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
        jLabelTitulo1.setText("ACTUALIZAR PROFESOR");
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jTFBuscar_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel2.add(jPanelDatoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 360, -1));

        jPDatosEstudianteActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEstudianteActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jTFApellidos_ActualizarEst.setEditable(false);
        jTFApellidos_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCorreo_ActualizarEst.setEditable(false);
        jTFCorreo_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCorreo_ActualizarEst.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCorreo_ActualizarEstFocusLost(evt);
            }
        });

        jTFSector_ActualizarEst.setEditable(false);
        jTFSector_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCodigo_ActualizarEst.setEditable(false);
        jTFCodigo_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCelular_ActualizarEst.setEditable(false);
        jTFCelular_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCelular_ActualizarEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCelular_ActualizarEstKeyTyped(evt);
            }
        });

        jTFNombres_ActualizarEst.setEditable(false);
        jTFNombres_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBSector_ActualizarEst.setBackground(new java.awt.Color(255, 255, 255));
        jChBSector_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBSector_ActualizarEst.setText("Dirección");
        jChBSector_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBSector_ActualizarEstActionPerformed(evt);
            }
        });

        jChBCelular_ActualizarEst.setBackground(new java.awt.Color(255, 255, 255));
        jChBCelular_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBCelular_ActualizarEst.setText("N°Teléfono");
        jChBCelular_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBCelular_ActualizarEstActionPerformed(evt);
            }
        });

        jChBCorreo_ActualizarEst.setBackground(new java.awt.Color(255, 255, 255));
        jChBCorreo_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBCorreo_ActualizarEst.setText("Correo electrónico");
        jChBCorreo_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBCorreo_ActualizarEstActionPerformed(evt);
            }
        });

        jTFFacultad_ActualizarEst.setEditable(false);
        jTFFacultad_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBFacultad_ActualizarEst.setBackground(new java.awt.Color(255, 255, 255));
        jChBFacultad_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBFacultad_ActualizarEst.setText("Nivel Académico");
        jChBFacultad_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBFacultad_ActualizarEstActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("N° Cédula");

        jTFCorreo_ActualizarEst1.setEditable(false);
        jTFCorreo_ActualizarEst1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCorreo_ActualizarEst1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCorreo_ActualizarEst1FocusLost(evt);
            }
        });

        jChBCorreo_ActualizarEst1.setBackground(new java.awt.Color(255, 255, 255));
        jChBCorreo_ActualizarEst1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBCorreo_ActualizarEst1.setText("Sueldo Base:");
        jChBCorreo_ActualizarEst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBCorreo_ActualizarEst1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel21.setText("Apellidos");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel22.setText("Nombres");

        javax.swing.GroupLayout jPDatosEstudianteActualizarLayout = new javax.swing.GroupLayout(jPDatosEstudianteActualizar);
        jPDatosEstudianteActualizar.setLayout(jPDatosEstudianteActualizarLayout);
        jPDatosEstudianteActualizarLayout.setHorizontalGroup(
            jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTFApellidos_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo_ActualizarEst)
                            .addComponent(jTFNombres_ActualizarEst)))
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addComponent(jChBCelular_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCelular_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jChBSector_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChBFacultad_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jChBCorreo_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCorreo_ActualizarEst)
                            .addComponent(jTFFacultad_ActualizarEst)
                            .addComponent(jTFSector_ActualizarEst)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addComponent(jChBCorreo_ActualizarEst1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCorreo_ActualizarEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jTFNombres_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidos_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCelular_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBCelular_ActualizarEst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBSector_ActualizarEst)
                    .addComponent(jTFSector_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFacultad_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBFacultad_ActualizarEst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChBCorreo_ActualizarEst)
                    .addComponent(jTFCorreo_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChBCorreo_ActualizarEst1)
                    .addComponent(jTFCorreo_ActualizarEst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPDatosEstudianteActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 90, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 400));

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
        jPanel3.add(JBCancela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

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
        jPanel3.add(JBIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 400, 70));

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

    private void jChBSector_ActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBSector_ActualizarEstActionPerformed
        if (jChBSector_ActualizarEst.isSelected()) {
            this.jTFSector_ActualizarEst.setEditable(true);
        } else {
            this.jTFSector_ActualizarEst.setEditable(false);
        }
    }//GEN-LAST:event_jChBSector_ActualizarEstActionPerformed

    private void jChBCelular_ActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBCelular_ActualizarEstActionPerformed
        if (jChBCelular_ActualizarEst.isSelected()) {
            this.jTFCelular_ActualizarEst.setEditable(true);
        } else {
            this.jTFCelular_ActualizarEst.setEditable(false);
        }
    }//GEN-LAST:event_jChBCelular_ActualizarEstActionPerformed

    private void jChBCorreo_ActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBCorreo_ActualizarEstActionPerformed
        if (jChBCorreo_ActualizarEst.isSelected()) {
            this.jTFCorreo_ActualizarEst.setEditable(true);
        } else {
            this.jTFCorreo_ActualizarEst.setEditable(false);
        }
    }//GEN-LAST:event_jChBCorreo_ActualizarEstActionPerformed

    private void jChBFacultad_ActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBFacultad_ActualizarEstActionPerformed
        if (this.jChBFacultad_ActualizarEst.isSelected()) {
            this.jTFFacultad_ActualizarEst.setEditable(true);
        } else {
            this.jTFFacultad_ActualizarEst.setEditable(false);
        }
    }//GEN-LAST:event_jChBFacultad_ActualizarEstActionPerformed

    private void jTFCorreo_ActualizarEstFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCorreo_ActualizarEstFocusLost

    }//GEN-LAST:event_jTFCorreo_ActualizarEstFocusLost

    private void jTFCelular_ActualizarEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCelular_ActualizarEstKeyTyped

    }//GEN-LAST:event_jTFCelular_ActualizarEstKeyTyped

    private void jTFBuscar_ActualizarEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarEstKeyTyped

    }//GEN-LAST:event_jTFBuscar_ActualizarEstKeyTyped

    private void jTFBuscar_ActualizarEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarEstKeyReleased

    }//GEN-LAST:event_jTFBuscar_ActualizarEstKeyReleased

    private void jChBCorreo_ActualizarEst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBCorreo_ActualizarEst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChBCorreo_ActualizarEst1ActionPerformed

    private void jTFCorreo_ActualizarEst1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCorreo_ActualizarEst1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCorreo_ActualizarEst1FocusLost

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

    public void limpiarCampos() {
        this.jTFApellidos_ActualizarEst.setText("");
        this.jTFFacultad_ActualizarEst.setText("");
        this.jTFNombres_ActualizarEst.setText("");
        this.jTFCelular_ActualizarEst.setText("");
        this.jTFCodigo_ActualizarEst.setText("");
        this.jTFCorreo_ActualizarEst.setText("");
        this.jTFBuscar_ActualizarEst.setText("");
        this.jTFSector_ActualizarEst.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jChBCelular_ActualizarEst;
    private javax.swing.JCheckBox jChBCorreo_ActualizarEst;
    private javax.swing.JCheckBox jChBCorreo_ActualizarEst1;
    private javax.swing.JCheckBox jChBFacultad_ActualizarEst;
    private javax.swing.JCheckBox jChBSector_ActualizarEst;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JPanel jPDatosEstudianteActualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelDatoEstudiante;
    public static javax.swing.JTextField jTFApellidos_ActualizarEst;
    public static javax.swing.JTextField jTFBuscar_ActualizarEst;
    public static javax.swing.JTextField jTFCelular_ActualizarEst;
    public static javax.swing.JTextField jTFCodigo_ActualizarEst;
    public static javax.swing.JTextField jTFCorreo_ActualizarEst;
    public static javax.swing.JTextField jTFCorreo_ActualizarEst1;
    public static javax.swing.JTextField jTFFacultad_ActualizarEst;
    public static javax.swing.JTextField jTFNombres_ActualizarEst;
    public static javax.swing.JTextField jTFSector_ActualizarEst;
    // End of variables declaration//GEN-END:variables
}
