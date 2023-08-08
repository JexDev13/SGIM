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

        jButtonSalirIcon = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jBEliminar_estudiante = new javax.swing.JButton();
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
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_EliminarEst = new javax.swing.JTextField();
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
        jLabelTitulo.setText("Eliminar Profesor");
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
        jBCancelar.setBounds(200, 430, 110, 40);

        jBEliminar_estudiante.setForeground(new java.awt.Color(58, 160, 141));
        jBEliminar_estudiante.setText("eliminar");
        jBEliminar_estudiante.setBorder(null);
        jBEliminar_estudiante.setBorderPainted(false);
        jBEliminar_estudiante.setHideActionText(true);
        jBEliminar_estudiante.setMaximumSize(new java.awt.Dimension(89, 32));
        jBEliminar_estudiante.setMinimumSize(new java.awt.Dimension(89, 32));
        jBEliminar_estudiante.setPreferredSize(new java.awt.Dimension(89, 32));
        jBEliminar_estudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEliminar_estudianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEliminar_estudianteMouseExited(evt);
            }
        });
        jBEliminar_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminar_estudianteActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminar_estudiante);
        jBEliminar_estudiante.setBounds(80, 430, 110, 40);

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
                            .addComponent(jTFFacultad_EliminarEst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPDatosEstudianteEliminar);
        jPDatosEstudianteEliminar.setBounds(10, 120, 360, 290);

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
                .addComponent(jTFBuscar_EliminarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoEstudianteLayout.setVerticalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCedula))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setBounds(10, 40, 360, 70);
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 380, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
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

    private void jBEliminar_estudianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminar_estudianteMouseEntered
        this.jBEliminar_estudiante.setText("ELIMINAR");
    }//GEN-LAST:event_jBEliminar_estudianteMouseEntered

    private void jBEliminar_estudianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminar_estudianteMouseExited
        this.jBEliminar_estudiante.setText("eliminar");
    }//GEN-LAST:event_jBEliminar_estudianteMouseExited

    private void jBEliminar_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminar_estudianteActionPerformed

    }//GEN-LAST:event_jBEliminar_estudianteActionPerformed

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
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEliminar_estudiante;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelApe;
    private javax.swing.JLabel jLabelCelu;
    private javax.swing.JLabel jLabelCorre;
    private javax.swing.JLabel jLabelCorre1;
    private javax.swing.JLabel jLabelFacu;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelSector;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosEstudianteEliminar;
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