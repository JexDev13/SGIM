package GUI.Administrador.Inventario;

import GUI.Administrador.Inventario.*;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_ActualizarInst extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdmin_ActualizarInst() {
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
        jBResgistrar_Instrumento = new javax.swing.JButton();
        jPDatosInstrumentoActualizar = new javax.swing.JPanel();
        jTFFabricante_ActualizarInst = new javax.swing.JTextField();
        jTFEstado_ActualizarInst = new javax.swing.JTextField();
        jTFCodigo_ActualizarInst = new javax.swing.JTextField();
        jTFCategoria_ActualizarInst = new javax.swing.JTextField();
        jTFNombre_ActualizarInst = new javax.swing.JTextField();
        jChBNombre_ActualizarInst = new javax.swing.JCheckBox();
        jChBFabricante_ActualizarInst = new javax.swing.JCheckBox();
        jChBEstado_ActualizarInst = new javax.swing.JCheckBox();
        jChBCategoria_ActualizarInst = new javax.swing.JCheckBox();
        jTFCondicion_ActualizarInst = new javax.swing.JTextField();
        jChBCondicion_ActualizarInst = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jPanelDatoInstrumento = new javax.swing.JPanel();
        jTFBuscar_ActualizarInst = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
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
        jLabelTitulo.setText("Actualizar Instrumento");
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

        jBResgistrar_Instrumento.setForeground(new java.awt.Color(58, 160, 141));
        jBResgistrar_Instrumento.setText("Guardar");
        jBResgistrar_Instrumento.setBorder(null);
        jBResgistrar_Instrumento.setBorderPainted(false);
        jBResgistrar_Instrumento.setHideActionText(true);
        jBResgistrar_Instrumento.setMaximumSize(new java.awt.Dimension(89, 32));
        jBResgistrar_Instrumento.setMinimumSize(new java.awt.Dimension(89, 32));
        jBResgistrar_Instrumento.setPreferredSize(new java.awt.Dimension(89, 32));
        jBResgistrar_Instrumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBResgistrar_InstrumentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBResgistrar_InstrumentoMouseExited(evt);
            }
        });
        jBResgistrar_Instrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResgistrar_InstrumentoActionPerformed(evt);
            }
        });
        getContentPane().add(jBResgistrar_Instrumento);
        jBResgistrar_Instrumento.setBounds(50, 430, 110, 40);

        jPDatosInstrumentoActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosInstrumentoActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jTFFabricante_ActualizarInst.setEditable(false);
        jTFFabricante_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFEstado_ActualizarInst.setEditable(false);
        jTFEstado_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCodigo_ActualizarInst.setEditable(false);
        jTFCodigo_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCategoria_ActualizarInst.setEditable(false);
        jTFCategoria_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCategoria_ActualizarInst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCategoria_ActualizarInstKeyTyped(evt);
            }
        });

        jTFNombre_ActualizarInst.setEditable(false);
        jTFNombre_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBNombre_ActualizarInst.setBackground(new java.awt.Color(255, 255, 255));
        jChBNombre_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBNombre_ActualizarInst.setText("Nombre");
        jChBNombre_ActualizarInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBNombre_ActualizarInstActionPerformed(evt);
            }
        });

        jChBFabricante_ActualizarInst.setBackground(new java.awt.Color(255, 255, 255));
        jChBFabricante_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBFabricante_ActualizarInst.setText("Fabricante");
        jChBFabricante_ActualizarInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBFabricante_ActualizarInstActionPerformed(evt);
            }
        });

        jChBEstado_ActualizarInst.setBackground(new java.awt.Color(255, 255, 255));
        jChBEstado_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBEstado_ActualizarInst.setText("Estado Alquiler");
        jChBEstado_ActualizarInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBEstado_ActualizarInstActionPerformed(evt);
            }
        });

        jChBCategoria_ActualizarInst.setBackground(new java.awt.Color(255, 255, 255));
        jChBCategoria_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBCategoria_ActualizarInst.setText("Categoría");
        jChBCategoria_ActualizarInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBCategoria_ActualizarInstActionPerformed(evt);
            }
        });

        jTFCondicion_ActualizarInst.setEditable(false);
        jTFCondicion_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBCondicion_ActualizarInst.setBackground(new java.awt.Color(255, 255, 255));
        jChBCondicion_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBCondicion_ActualizarInst.setText("Condición");
        jChBCondicion_ActualizarInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBCondicion_ActualizarInstActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Código");

        javax.swing.GroupLayout jPDatosInstrumentoActualizarLayout = new javax.swing.GroupLayout(jPDatosInstrumentoActualizar);
        jPDatosInstrumentoActualizar.setLayout(jPDatosInstrumentoActualizarLayout);
        jPDatosInstrumentoActualizarLayout.setHorizontalGroup(
            jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosInstrumentoActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosInstrumentoActualizarLayout.createSequentialGroup()
                        .addComponent(jChBFabricante_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFFabricante_ActualizarInst))
                    .addGroup(jPDatosInstrumentoActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jChBNombre_ActualizarInst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo_ActualizarInst)
                            .addComponent(jTFNombre_ActualizarInst)))
                    .addGroup(jPDatosInstrumentoActualizarLayout.createSequentialGroup()
                        .addComponent(jChBCategoria_ActualizarInst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCategoria_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatosInstrumentoActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jChBCondicion_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChBEstado_ActualizarInst))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCondicion_ActualizarInst)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosInstrumentoActualizarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTFEstado_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPDatosInstrumentoActualizarLayout.setVerticalGroup(
            jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosInstrumentoActualizarLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBNombre_ActualizarInst)
                    .addComponent(jTFNombre_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBFabricante_ActualizarInst)
                    .addComponent(jTFFabricante_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCategoria_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBCategoria_ActualizarInst))
                .addGap(18, 18, 18)
                .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBEstado_ActualizarInst)
                    .addComponent(jTFEstado_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCondicion_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBCondicion_ActualizarInst))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPDatosInstrumentoActualizar);
        jPDatosInstrumentoActualizar.setBounds(10, 120, 360, 300);

        jPanelDatoInstrumento.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoInstrumento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Instrumento"));

        jTFBuscar_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_ActualizarInst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarInstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarInstKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código:");

        javax.swing.GroupLayout jPanelDatoInstrumentoLayout = new javax.swing.GroupLayout(jPanelDatoInstrumento);
        jPanelDatoInstrumento.setLayout(jPanelDatoInstrumentoLayout);
        jPanelDatoInstrumentoLayout.setHorizontalGroup(
            jPanelDatoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoInstrumentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodigo)
                .addGap(79, 79, 79)
                .addComponent(jTFBuscar_ActualizarInst, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoInstrumentoLayout.setVerticalGroup(
            jPanelDatoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoInstrumentoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDatoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoInstrumento);
        jPanelDatoInstrumento.setBounds(10, 40, 360, 70);
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

    private void jBResgistrar_InstrumentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResgistrar_InstrumentoMouseEntered
        this.jBResgistrar_Instrumento.setText("GUARDAR");
    }//GEN-LAST:event_jBResgistrar_InstrumentoMouseEntered

    private void jBResgistrar_InstrumentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResgistrar_InstrumentoMouseExited
        this.jBResgistrar_Instrumento.setText("guardar");
    }//GEN-LAST:event_jBResgistrar_InstrumentoMouseExited

    private void jBResgistrar_InstrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResgistrar_InstrumentoActionPerformed

    }//GEN-LAST:event_jBResgistrar_InstrumentoActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jChBNombre_ActualizarInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBNombre_ActualizarInstActionPerformed
        if (jChBNombre_ActualizarInst.isSelected()) {
            this.jTFNombre_ActualizarInst.setEditable(true);
        } else {
            this.jTFNombre_ActualizarInst.setEditable(false);
        }
    }//GEN-LAST:event_jChBNombre_ActualizarInstActionPerformed

    private void jChBFabricante_ActualizarInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBFabricante_ActualizarInstActionPerformed
        if (jChBFabricante_ActualizarInst.isSelected()) {
            this.jTFFabricante_ActualizarInst.setEditable(true);
        } else {
            this.jTFFabricante_ActualizarInst.setEditable(false);
        }
    }//GEN-LAST:event_jChBFabricante_ActualizarInstActionPerformed

    private void jChBEstado_ActualizarInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBEstado_ActualizarInstActionPerformed
        if (jChBEstado_ActualizarInst.isSelected()) {
            this.jTFEstado_ActualizarInst.setEditable(true);
        } else {
            this.jTFEstado_ActualizarInst.setEditable(false);
        }
    }//GEN-LAST:event_jChBEstado_ActualizarInstActionPerformed

    private void jChBCategoria_ActualizarInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBCategoria_ActualizarInstActionPerformed
        if (jChBCategoria_ActualizarInst.isSelected()) {
            this.jTFCategoria_ActualizarInst.setEditable(true);
        } else {
            this.jTFCategoria_ActualizarInst.setEditable(false);
        }
    }//GEN-LAST:event_jChBCategoria_ActualizarInstActionPerformed

    private void jChBCondicion_ActualizarInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBCondicion_ActualizarInstActionPerformed
        if (this.jChBCondicion_ActualizarInst.isSelected()) {
            this.jTFCondicion_ActualizarInst.setEditable(true);
        } else {
            this.jTFCondicion_ActualizarInst.setEditable(false);
        }
    }//GEN-LAST:event_jChBCondicion_ActualizarInstActionPerformed

    private void jTFCategoria_ActualizarInstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCategoria_ActualizarInstKeyTyped

    }//GEN-LAST:event_jTFCategoria_ActualizarInstKeyTyped

    private void jTFBuscar_ActualizarInstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarInstKeyTyped

    }//GEN-LAST:event_jTFBuscar_ActualizarInstKeyTyped

    private void jTFBuscar_ActualizarInstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarInstKeyReleased

    }//GEN-LAST:event_jTFBuscar_ActualizarInstKeyReleased

    public void limpiarCampos() {
        this.jTFFabricante_ActualizarInst.setText("");
        this.jTFCondicion_ActualizarInst.setText("");
        this.jTFNombre_ActualizarInst.setText("");
        this.jTFCategoria_ActualizarInst.setText("");
        this.jTFCodigo_ActualizarInst.setText("");
        this.jTFBuscar_ActualizarInst.setText("");
        this.jTFEstado_ActualizarInst.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBResgistrar_Instrumento;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jChBCategoria_ActualizarInst;
    private javax.swing.JCheckBox jChBCondicion_ActualizarInst;
    private javax.swing.JCheckBox jChBEstado_ActualizarInst;
    private javax.swing.JCheckBox jChBFabricante_ActualizarInst;
    private javax.swing.JCheckBox jChBNombre_ActualizarInst;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosInstrumentoActualizar;
    private javax.swing.JPanel jPanelDatoInstrumento;
    public static javax.swing.JTextField jTFBuscar_ActualizarInst;
    public static javax.swing.JTextField jTFCategoria_ActualizarInst;
    public static javax.swing.JTextField jTFCodigo_ActualizarInst;
    public static javax.swing.JTextField jTFCondicion_ActualizarInst;
    public static javax.swing.JTextField jTFEstado_ActualizarInst;
    public static javax.swing.JTextField jTFFabricante_ActualizarInst;
    public static javax.swing.JTextField jTFNombre_ActualizarInst;
    // End of variables declaration//GEN-END:variables
}
