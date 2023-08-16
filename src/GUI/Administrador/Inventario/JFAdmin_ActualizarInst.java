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

        jLabelTitulo = new javax.swing.JLabel();
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
        jLabelTitulo.setText("Actualizar Instrumento");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

        jPDatosInstrumentoActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosInstrumentoActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jTFFabricante_ActualizarInst.setEditable(false);
        jTFFabricante_ActualizarInst.setBackground(new java.awt.Color(255, 255, 255));
        jTFFabricante_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFEstado_ActualizarInst.setEditable(false);
        jTFEstado_ActualizarInst.setBackground(new java.awt.Color(255, 255, 255));
        jTFEstado_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCodigo_ActualizarInst.setEditable(false);
        jTFCodigo_ActualizarInst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCategoria_ActualizarInst.setEditable(false);
        jTFCategoria_ActualizarInst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCategoria_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCategoria_ActualizarInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCategoria_ActualizarInstActionPerformed(evt);
            }
        });
        jTFCategoria_ActualizarInst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCategoria_ActualizarInstKeyTyped(evt);
            }
        });

        jTFNombre_ActualizarInst.setEditable(false);
        jTFNombre_ActualizarInst.setBackground(new java.awt.Color(255, 255, 255));
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
        jTFCondicion_ActualizarInst.setBackground(new java.awt.Color(255, 255, 255));
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
                    .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPDatosInstrumentoActualizarLayout.createSequentialGroup()
                            .addComponent(jChBFabricante_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFFabricante_ActualizarInst, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                        .addGroup(jPDatosInstrumentoActualizarLayout.createSequentialGroup()
                            .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jChBNombre_ActualizarInst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPDatosInstrumentoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFCodigo_ActualizarInst, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                .addComponent(jTFNombre_ActualizarInst))))
                    .addGroup(jPDatosInstrumentoActualizarLayout.createSequentialGroup()
                        .addComponent(jChBCondicion_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCondicion_ActualizarInst))
                    .addGroup(jPDatosInstrumentoActualizarLayout.createSequentialGroup()
                        .addComponent(jChBCategoria_ActualizarInst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCategoria_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatosInstrumentoActualizarLayout.createSequentialGroup()
                        .addComponent(jChBEstado_ActualizarInst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFEstado_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

    private void jTFCategoria_ActualizarInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCategoria_ActualizarInstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCategoria_ActualizarInstActionPerformed

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
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JCheckBox jChBCategoria_ActualizarInst;
    private javax.swing.JCheckBox jChBCondicion_ActualizarInst;
    private javax.swing.JCheckBox jChBEstado_ActualizarInst;
    private javax.swing.JCheckBox jChBFabricante_ActualizarInst;
    private javax.swing.JCheckBox jChBNombre_ActualizarInst;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosInstrumentoActualizar;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
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
