package GUI.Administrador.Profesores;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_Eliminar extends javax.swing.JFrame {
    private int x;
    private int y;
    public JFAdmin_Eliminar() {
        initComponents();
        setLocationRelativeTo(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jButtonMinimizar1 = new javax.swing.JButton();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_EliminarEst = new javax.swing.JTextField();
        jLCedula = new javax.swing.JLabel();
        jPDatosEstudianteEliminar = new javax.swing.JPanel();
        jTFCodigo_EliminarEst = new javax.swing.JTextField();
        jLabelNom = new javax.swing.JLabel();
        jTFNombres_EliminarEst = new javax.swing.JTextField();
        jLabelApe = new javax.swing.JLabel();
        jTFApellidos_EliminarEst = new javax.swing.JTextField();
        jLabelSector = new javax.swing.JLabel();
        jTFCelu_EliminarEst = new javax.swing.JTextField();
        jLabelCelu = new javax.swing.JLabel();
        jTFFacultad_EliminarEst = new javax.swing.JTextField();
        jLabelCorre = new javax.swing.JLabel();
        jTFCorreo_EliminarEst = new javax.swing.JTextField();
        jLabelFacu = new javax.swing.JLabel();
        jTFSectorEst_EliminarEst = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabelCorre1 = new javax.swing.JLabel();
        jTFCorreo_EliminarEst1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(400, 520));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 520));
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

        jPanel1.setBackground(new java.awt.Color(250, 183, 22));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setText("ELIMINAR PROFESOR");
        jPanel1.add(jLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 211, 40));

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
        jPanel1.add(jButtonMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, 30));

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
        jPanel1.add(jButtonSalirIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatoEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del profesor"));

        jTFBuscar_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_EliminarEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarEstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarEstKeyTyped(evt);
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
                .addGap(85, 85, 85)
                .addComponent(jTFBuscar_EliminarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoEstudianteLayout.setVerticalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCedula))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelDatoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPDatosEstudianteEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEstudianteEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar"));

        jTFCodigo_EliminarEst.setEditable(false);
        jTFCodigo_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelNom.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNom.setText("Nombres");

        jTFNombres_EliminarEst.setEditable(false);
        jTFNombres_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombres_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelApe.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelApe.setText("Apellidos");

        jTFApellidos_EliminarEst.setEditable(false);
        jTFApellidos_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFApellidos_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelSector.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelSector.setText("Dirección");

        jTFCelu_EliminarEst.setEditable(false);
        jTFCelu_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCelu_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCelu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCelu.setText("N°Teléfono.");

        jTFFacultad_EliminarEst.setEditable(false);
        jTFFacultad_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFFacultad_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCorre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCorre.setText("Correo electrónico");

        jTFCorreo_EliminarEst.setEditable(false);
        jTFCorreo_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCorreo_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelFacu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelFacu.setText("Nivel Académico");

        jTFSectorEst_EliminarEst.setEditable(false);
        jTFSectorEst_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFSectorEst_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("N° Cédula");

        jLabelCorre1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCorre1.setText("Sueldo Base:");

        jTFCorreo_EliminarEst1.setEditable(false);
        jTFCorreo_EliminarEst1.setBackground(new java.awt.Color(255, 255, 255));
        jTFCorreo_EliminarEst1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPDatosEstudianteEliminarLayout = new javax.swing.GroupLayout(jPDatosEstudianteEliminar);
        jPDatosEstudianteEliminar.setLayout(jPDatosEstudianteEliminarLayout);
        jPDatosEstudianteEliminarLayout.setHorizontalGroup(
            jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApe)
                            .addComponent(jLabelCelu)
                            .addComponent(jLabelSector)
                            .addComponent(jLabelFacu)
                            .addComponent(jLabelCorre))
                        .addGap(18, 18, 18)
                        .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFFacultad_EliminarEst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jTFSectorEst_EliminarEst, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFCelu_EliminarEst, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFApellidos_EliminarEst)
                            .addComponent(jTFCorreo_EliminarEst))
                        .addGap(19, 19, 19))
                    .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                                .addComponent(jLabelNom)
                                .addGap(18, 18, 18))
                            .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNombres_EliminarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jTFCodigo_EliminarEst))
                        .addContainerGap())
                    .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                        .addComponent(jLabelCorre1)
                        .addGap(18, 18, 18)
                        .addComponent(jTFCorreo_EliminarEst1))))
        );
        jPDatosEstudianteEliminarLayout.setVerticalGroup(
            jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombres_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidos_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApe))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCelu_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelu))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFSectorEst_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSector))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFacultad_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFacu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCorreo_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCorre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCorreo_EliminarEst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCorre1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.add(jPDatosEstudianteEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 400, 400);

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
        jPanel3.add(JBIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 460, 400, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFBuscar_EliminarEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarEstKeyTyped

    }//GEN-LAST:event_jTFBuscar_EliminarEstKeyTyped

    private void jTFBuscar_EliminarEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarEstKeyReleased

    }//GEN-LAST:event_jTFBuscar_EliminarEstKeyReleased

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

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

//    public void limpiarCampos(){
//        this.jTFCodigo_EliminarEst.setText("");
//        this.jTFNombres_EliminarEst.setText("");
//        this.jTFApellidos_EliminarEst.setText("");
//        this.jTFCelu_EliminarEst.setText("");
//        this.jTFSectorEst_EliminarEst.setText("");
//        this.jTFFacultad_EliminarEst.setText("");
//        this.jTFCorreo_EliminarEst.setText("");
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelApe;
    private javax.swing.JLabel jLabelCelu;
    private javax.swing.JLabel jLabelCorre;
    private javax.swing.JLabel jLabelCorre1;
    private javax.swing.JLabel jLabelFacu;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelSector;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JPanel jPDatosEstudianteEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelDatoEstudiante;
    public static javax.swing.JTextField jTFApellidos_EliminarEst;
    public static javax.swing.JTextField jTFBuscar_EliminarEst;
    public static javax.swing.JTextField jTFCelu_EliminarEst;
    public static javax.swing.JTextField jTFCodigo_EliminarEst;
    public static javax.swing.JTextField jTFCorreo_EliminarEst;
    public static javax.swing.JTextField jTFCorreo_EliminarEst1;
    public static javax.swing.JTextField jTFFacultad_EliminarEst;
    public static javax.swing.JTextField jTFNombres_EliminarEst;
    public static javax.swing.JTextField jTFSectorEst_EliminarEst;
    // End of variables declaration//GEN-END:variables
}