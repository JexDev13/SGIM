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

        jButtonSalirIcon = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jBResgistrar_estudiante = new javax.swing.JButton();
        jPDatosEstudianteActualizar = new javax.swing.JPanel();
        jTFApellidos_ActualizarEst = new javax.swing.JTextField();
        jTFCorreo_ActualizarEst = new javax.swing.JTextField();
        jTFSector_ActualizarEst = new javax.swing.JTextField();
        jTFCodigo_ActualizarEst = new javax.swing.JTextField();
        jTFCelular_ActualizarEst = new javax.swing.JTextField();
        jTFNombres_ActualizarEst = new javax.swing.JTextField();
        jChBNombre_ActualizarEst = new javax.swing.JCheckBox();
        jChBApellido_ActualizarEst = new javax.swing.JCheckBox();
        jChBSector_ActualizarEst = new javax.swing.JCheckBox();
        jChBCelular_ActualizarEst = new javax.swing.JCheckBox();
        jChBCorreo_ActualizarEst = new javax.swing.JCheckBox();
        jTFFacultad_ActualizarEst = new javax.swing.JTextField();
        jChBFacultad_ActualizarEst = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jTFCorreo_ActualizarEst1 = new javax.swing.JTextField();
        jChBCorreo_ActualizarEst1 = new javax.swing.JCheckBox();
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_ActualizarEst = new javax.swing.JTextField();
        jLCedula = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 475));
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

        jButtonSalirIcon.setBackground(new java.awt.Color(91, 165, 152));
        jButtonSalirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButtonSalirIcon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(48, 108, 97)));
        jButtonSalirIcon.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonSalirIcon.setRequestFocusEnabled(false);
        jButtonSalirIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirIconActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalirIcon);
        jButtonSalirIcon.setBounds(350, 0, 30, 30);

        jButtonMinimizar.setBackground(new java.awt.Color(91, 165, 152));
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar 24.png"))); // NOI18N
        jButtonMinimizar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(57, 116, 104)));
        jButtonMinimizar.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonMinimizar.setRequestFocusEnabled(false);
        jButtonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMinimizar);
        jButtonMinimizar.setBounds(320, 0, 30, 30);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Actualizar Estudiante");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

        jBCancelar.setForeground(new java.awt.Color(58, 160, 141));
        jBCancelar.setText("cancelar");
        jBCancelar.setBorder(null);
        jBCancelar.setBorderPainted(false);
        jBCancelar.setHideActionText(true);
        jBCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBCancelar.setMaximumSize(new java.awt.Dimension(89, 32));
        jBCancelar.setMinimumSize(new java.awt.Dimension(89, 32));
        jBCancelar.setPreferredSize(new java.awt.Dimension(89, 32));
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCancelarMouseExited(evt);
            }
        });
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBCancelar);
        jBCancelar.setBounds(190, 430, 110, 40);

        jBResgistrar_estudiante.setForeground(new java.awt.Color(58, 160, 141));
        jBResgistrar_estudiante.setText("guardar");
        jBResgistrar_estudiante.setBorder(null);
        jBResgistrar_estudiante.setBorderPainted(false);
        jBResgistrar_estudiante.setHideActionText(true);
        jBResgistrar_estudiante.setMaximumSize(new java.awt.Dimension(89, 32));
        jBResgistrar_estudiante.setMinimumSize(new java.awt.Dimension(89, 32));
        jBResgistrar_estudiante.setPreferredSize(new java.awt.Dimension(89, 32));
        jBResgistrar_estudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBResgistrar_estudianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBResgistrar_estudianteMouseExited(evt);
            }
        });
        jBResgistrar_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResgistrar_estudianteActionPerformed(evt);
            }
        });
        getContentPane().add(jBResgistrar_estudiante);
        jBResgistrar_estudiante.setBounds(50, 430, 110, 40);

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

        jChBNombre_ActualizarEst.setBackground(new java.awt.Color(255, 255, 255));
        jChBNombre_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBNombre_ActualizarEst.setText("Nombres");
        jChBNombre_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBNombre_ActualizarEstActionPerformed(evt);
            }
        });

        jChBApellido_ActualizarEst.setBackground(new java.awt.Color(255, 255, 255));
        jChBApellido_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBApellido_ActualizarEst.setText("Apellidos");
        jChBApellido_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBApellido_ActualizarEstActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPDatosEstudianteActualizarLayout = new javax.swing.GroupLayout(jPDatosEstudianteActualizar);
        jPDatosEstudianteActualizar.setLayout(jPDatosEstudianteActualizarLayout);
        jPDatosEstudianteActualizarLayout.setHorizontalGroup(
            jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addComponent(jChBApellido_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTFApellidos_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jChBNombre_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo_ActualizarEst)
                            .addComponent(jTFNombres_ActualizarEst)))
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addComponent(jChBCelular_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jChBNombre_ActualizarEst)
                    .addComponent(jTFNombres_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBApellido_ActualizarEst)
                    .addComponent(jTFApellidos_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPDatosEstudianteActualizar);
        jPDatosEstudianteActualizar.setBounds(10, 120, 360, 300);

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
                .addComponent(jTFBuscar_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoEstudianteLayout.setVerticalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCedula))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setBounds(10, 40, 360, 70);
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 380, 475);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
        limpiarCampos();
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        this.jBCancelar.setText("CANCELAR");
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        this.jBCancelar.setText("cancelar");
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed

    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBResgistrar_estudianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResgistrar_estudianteMouseEntered
        this.jBResgistrar_estudiante.setText("GUARDAR");
    }//GEN-LAST:event_jBResgistrar_estudianteMouseEntered

    private void jBResgistrar_estudianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResgistrar_estudianteMouseExited
        this.jBResgistrar_estudiante.setText("guardar");
    }//GEN-LAST:event_jBResgistrar_estudianteMouseExited

    private void jBResgistrar_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResgistrar_estudianteActionPerformed

    }//GEN-LAST:event_jBResgistrar_estudianteActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

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
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBResgistrar_estudiante;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jChBApellido_ActualizarEst;
    private javax.swing.JCheckBox jChBCelular_ActualizarEst;
    private javax.swing.JCheckBox jChBCorreo_ActualizarEst;
    private javax.swing.JCheckBox jChBCorreo_ActualizarEst1;
    private javax.swing.JCheckBox jChBFacultad_ActualizarEst;
    private javax.swing.JCheckBox jChBNombre_ActualizarEst;
    private javax.swing.JCheckBox jChBSector_ActualizarEst;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosEstudianteActualizar;
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
