package GUI.Administrador.Inventario;

import GUI.Administrador.Inventario.*;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_ActualizarLib extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdmin_ActualizarLib() {
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
        jBResgistrar_Libro = new javax.swing.JButton();
        jPDatosLibroActualizar = new javax.swing.JPanel();
        jTFAutor_ActualizarLib = new javax.swing.JTextField();
        jTFEstado_ActualizarLib = new javax.swing.JTextField();
        jTFCodigo_ActualizarLib = new javax.swing.JTextField();
        jTFCategoria_ActualizarInst = new javax.swing.JTextField();
        jTFNombre_ActualizarLib = new javax.swing.JTextField();
        jChBNombre_ActualizarLib = new javax.swing.JCheckBox();
        jChBAutor_ActualizarLib = new javax.swing.JCheckBox();
        jChBEstado_ActualizarLib = new javax.swing.JCheckBox();
        jChBCategoria_ActualizarLib = new javax.swing.JCheckBox();
        jTFCondicion_ActualizarLib = new javax.swing.JTextField();
        jChBCondicion_ActualizarLib = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jPanelDatoLibro = new javax.swing.JPanel();
        jTFBuscar_ActualizarLib = new javax.swing.JTextField();
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
        jLabelTitulo.setText("Actualizar Libro");
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

        jBResgistrar_Libro.setForeground(new java.awt.Color(58, 160, 141));
        jBResgistrar_Libro.setText("Guardar");
        jBResgistrar_Libro.setBorder(null);
        jBResgistrar_Libro.setBorderPainted(false);
        jBResgistrar_Libro.setHideActionText(true);
        jBResgistrar_Libro.setMaximumSize(new java.awt.Dimension(89, 32));
        jBResgistrar_Libro.setMinimumSize(new java.awt.Dimension(89, 32));
        jBResgistrar_Libro.setPreferredSize(new java.awt.Dimension(89, 32));
        jBResgistrar_Libro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBResgistrar_LibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBResgistrar_LibroMouseExited(evt);
            }
        });
        jBResgistrar_Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResgistrar_LibroActionPerformed(evt);
            }
        });
        getContentPane().add(jBResgistrar_Libro);
        jBResgistrar_Libro.setBounds(50, 430, 110, 40);

        jPDatosLibroActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosLibroActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jTFAutor_ActualizarLib.setEditable(false);
        jTFAutor_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFEstado_ActualizarLib.setEditable(false);
        jTFEstado_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCodigo_ActualizarLib.setEditable(false);
        jTFCodigo_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCategoria_ActualizarInst.setEditable(false);
        jTFCategoria_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCategoria_ActualizarInst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCategoria_ActualizarInstKeyTyped(evt);
            }
        });

        jTFNombre_ActualizarLib.setEditable(false);
        jTFNombre_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBNombre_ActualizarLib.setBackground(new java.awt.Color(255, 255, 255));
        jChBNombre_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBNombre_ActualizarLib.setText("Nombre");
        jChBNombre_ActualizarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBNombre_ActualizarLibActionPerformed(evt);
            }
        });

        jChBAutor_ActualizarLib.setBackground(new java.awt.Color(255, 255, 255));
        jChBAutor_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBAutor_ActualizarLib.setText("Autor");
        jChBAutor_ActualizarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBAutor_ActualizarLibActionPerformed(evt);
            }
        });

        jChBEstado_ActualizarLib.setBackground(new java.awt.Color(255, 255, 255));
        jChBEstado_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBEstado_ActualizarLib.setText("Estado Alquiler");
        jChBEstado_ActualizarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBEstado_ActualizarLibActionPerformed(evt);
            }
        });

        jChBCategoria_ActualizarLib.setBackground(new java.awt.Color(255, 255, 255));
        jChBCategoria_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBCategoria_ActualizarLib.setText("Categoría");
        jChBCategoria_ActualizarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBCategoria_ActualizarLibActionPerformed(evt);
            }
        });

        jTFCondicion_ActualizarLib.setEditable(false);
        jTFCondicion_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBCondicion_ActualizarLib.setBackground(new java.awt.Color(255, 255, 255));
        jChBCondicion_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBCondicion_ActualizarLib.setText("Condición");
        jChBCondicion_ActualizarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBCondicion_ActualizarLibActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Código");

        javax.swing.GroupLayout jPDatosLibroActualizarLayout = new javax.swing.GroupLayout(jPDatosLibroActualizar);
        jPDatosLibroActualizar.setLayout(jPDatosLibroActualizarLayout);
        jPDatosLibroActualizarLayout.setHorizontalGroup(
            jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                        .addComponent(jChBAutor_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFAutor_ActualizarLib))
                    .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jChBNombre_ActualizarLib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo_ActualizarLib)
                            .addComponent(jTFNombre_ActualizarLib)))
                    .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                        .addComponent(jChBCategoria_ActualizarLib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCategoria_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jChBCondicion_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChBEstado_ActualizarLib))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCondicion_ActualizarLib)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLibroActualizarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTFEstado_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPDatosLibroActualizarLayout.setVerticalGroup(
            jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBNombre_ActualizarLib)
                    .addComponent(jTFNombre_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBAutor_ActualizarLib)
                    .addComponent(jTFAutor_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCategoria_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBCategoria_ActualizarLib))
                .addGap(18, 18, 18)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBEstado_ActualizarLib)
                    .addComponent(jTFEstado_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCondicion_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBCondicion_ActualizarLib))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPDatosLibroActualizar);
        jPDatosLibroActualizar.setBounds(10, 120, 360, 300);

        jPanelDatoLibro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Libro"));

        jTFBuscar_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_ActualizarLib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarLibKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarLibKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código:");

        javax.swing.GroupLayout jPanelDatoLibroLayout = new javax.swing.GroupLayout(jPanelDatoLibro);
        jPanelDatoLibro.setLayout(jPanelDatoLibroLayout);
        jPanelDatoLibroLayout.setHorizontalGroup(
            jPanelDatoLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodigo)
                .addGap(79, 79, 79)
                .addComponent(jTFBuscar_ActualizarLib, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoLibroLayout.setVerticalGroup(
            jPanelDatoLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoLibroLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDatoLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoLibro);
        jPanelDatoLibro.setBounds(10, 40, 360, 70);
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

    private void jBResgistrar_LibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResgistrar_LibroMouseEntered
        this.jBResgistrar_Libro.setText("GUARDAR");
    }//GEN-LAST:event_jBResgistrar_LibroMouseEntered

    private void jBResgistrar_LibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResgistrar_LibroMouseExited
        this.jBResgistrar_Libro.setText("guardar");
    }//GEN-LAST:event_jBResgistrar_LibroMouseExited

    private void jBResgistrar_LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResgistrar_LibroActionPerformed

    }//GEN-LAST:event_jBResgistrar_LibroActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jChBNombre_ActualizarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBNombre_ActualizarLibActionPerformed
        if (jChBNombre_ActualizarLib.isSelected()) {
            this.jTFNombre_ActualizarLib.setEditable(true);
        } else {
            this.jTFNombre_ActualizarLib.setEditable(false);
        }
    }//GEN-LAST:event_jChBNombre_ActualizarLibActionPerformed

    private void jChBAutor_ActualizarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBAutor_ActualizarLibActionPerformed
        if (jChBAutor_ActualizarLib.isSelected()) {
            this.jTFAutor_ActualizarLib.setEditable(true);
        } else {
            this.jTFAutor_ActualizarLib.setEditable(false);
        }
    }//GEN-LAST:event_jChBAutor_ActualizarLibActionPerformed

    private void jChBEstado_ActualizarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBEstado_ActualizarLibActionPerformed
        if (jChBEstado_ActualizarLib.isSelected()) {
            this.jTFEstado_ActualizarLib.setEditable(true);
        } else {
            this.jTFEstado_ActualizarLib.setEditable(false);
        }
    }//GEN-LAST:event_jChBEstado_ActualizarLibActionPerformed

    private void jChBCategoria_ActualizarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBCategoria_ActualizarLibActionPerformed
        if (jChBCategoria_ActualizarLib.isSelected()) {
            this.jTFCategoria_ActualizarInst.setEditable(true);
        } else {
            this.jTFCategoria_ActualizarInst.setEditable(false);
        }
    }//GEN-LAST:event_jChBCategoria_ActualizarLibActionPerformed

    private void jChBCondicion_ActualizarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBCondicion_ActualizarLibActionPerformed
        if (this.jChBCondicion_ActualizarLib.isSelected()) {
            this.jTFCondicion_ActualizarLib.setEditable(true);
        } else {
            this.jTFCondicion_ActualizarLib.setEditable(false);
        }
    }//GEN-LAST:event_jChBCondicion_ActualizarLibActionPerformed

    private void jTFCategoria_ActualizarInstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCategoria_ActualizarInstKeyTyped

    }//GEN-LAST:event_jTFCategoria_ActualizarInstKeyTyped

    private void jTFBuscar_ActualizarLibKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarLibKeyTyped

    }//GEN-LAST:event_jTFBuscar_ActualizarLibKeyTyped

    private void jTFBuscar_ActualizarLibKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarLibKeyReleased

    }//GEN-LAST:event_jTFBuscar_ActualizarLibKeyReleased

    public void limpiarCampos() {
        this.jTFAutor_ActualizarLib.setText("");
        this.jTFCondicion_ActualizarLib.setText("");
        this.jTFNombre_ActualizarLib.setText("");
        this.jTFCategoria_ActualizarInst.setText("");
        this.jTFCodigo_ActualizarLib.setText("");
        this.jTFBuscar_ActualizarLib.setText("");
        this.jTFEstado_ActualizarLib.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBResgistrar_Libro;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jChBAutor_ActualizarLib;
    private javax.swing.JCheckBox jChBCategoria_ActualizarLib;
    private javax.swing.JCheckBox jChBCondicion_ActualizarLib;
    private javax.swing.JCheckBox jChBEstado_ActualizarLib;
    private javax.swing.JCheckBox jChBNombre_ActualizarLib;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosLibroActualizar;
    private javax.swing.JPanel jPanelDatoLibro;
    public static javax.swing.JTextField jTFAutor_ActualizarLib;
    public static javax.swing.JTextField jTFBuscar_ActualizarLib;
    public static javax.swing.JTextField jTFCategoria_ActualizarInst;
    public static javax.swing.JTextField jTFCodigo_ActualizarLib;
    public static javax.swing.JTextField jTFCondicion_ActualizarLib;
    public static javax.swing.JTextField jTFEstado_ActualizarLib;
    public static javax.swing.JTextField jTFNombre_ActualizarLib;
    // End of variables declaration//GEN-END:variables
}
