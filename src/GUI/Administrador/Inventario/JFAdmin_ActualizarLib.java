package GUI.Administrador.Inventario;

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

        jLabelTitulo = new javax.swing.JLabel();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();
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
        jLabelFondo1 = new javax.swing.JLabel();
        jButtonMinimizar1 = new javax.swing.JButton();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jPFondo = new javax.swing.JPanel();

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

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Actualizar Libro");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

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
        getContentPane().add(JBCancela1);
        JBCancela1.setBounds(210, 440, 89, 32);

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
        getContentPane().add(JBIngreso1);
        JBIngreso1.setBounds(100, 440, 89, 32);

        jPDatosLibroActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosLibroActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jTFAutor_ActualizarLib.setEditable(false);
        jTFAutor_ActualizarLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFAutor_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFEstado_ActualizarLib.setEditable(false);
        jTFEstado_ActualizarLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFEstado_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCodigo_ActualizarLib.setEditable(false);
        jTFCodigo_ActualizarLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCategoria_ActualizarInst.setEditable(false);
        jTFCategoria_ActualizarInst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCategoria_ActualizarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCategoria_ActualizarInst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCategoria_ActualizarInstKeyTyped(evt);
            }
        });

        jTFNombre_ActualizarLib.setEditable(false);
        jTFNombre_ActualizarLib.setBackground(new java.awt.Color(255, 255, 255));
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
        jTFCondicion_ActualizarLib.setBackground(new java.awt.Color(255, 255, 255));
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
                        .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jChBNombre_ActualizarLib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jChBAutor_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFAutor_ActualizarLib, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jTFNombre_ActualizarLib)
                            .addComponent(jTFCodigo_ActualizarLib))
                        .addGap(53, 53, 53))
                    .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                            .addComponent(jChBCategoria_ActualizarLib, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFCategoria_ActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51))
                        .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                            .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                                    .addComponent(jChBCondicion_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFCondicion_ActualizarLib))
                                .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                                    .addComponent(jChBEstado_ActualizarLib)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTFEstado_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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

        jLabelFondo1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo1.setOpaque(true);
        getContentPane().add(jLabelFondo1);
        jLabelFondo1.setBounds(0, 30, 380, 400);

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
        getContentPane().add(jButtonMinimizar1);
        jButtonMinimizar1.setBounds(320, 0, 30, 30);

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
        getContentPane().add(jButtonSalirIcon1);
        jButtonSalirIcon1.setBounds(350, 0, 30, 30);

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);
        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 380, 490);

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

    private void JBCancela1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseEntered
        this.JBCancela1.setText("CANCELAR");
    }//GEN-LAST:event_JBCancela1MouseEntered

    private void JBCancela1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseExited
        this.JBCancela1.setText("cancelar");
    }//GEN-LAST:event_JBCancela1MouseExited

    private void JBCancela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancela1ActionPerformed
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("aceptar");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed

    }//GEN-LAST:event_JBIngreso1ActionPerformed

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

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
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JCheckBox jChBAutor_ActualizarLib;
    private javax.swing.JCheckBox jChBCategoria_ActualizarLib;
    private javax.swing.JCheckBox jChBCondicion_ActualizarLib;
    private javax.swing.JCheckBox jChBEstado_ActualizarLib;
    private javax.swing.JCheckBox jChBNombre_ActualizarLib;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondo1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosLibroActualizar;
    private javax.swing.JPanel jPFondo;
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
