package GUI.Administrador.Inventario;

import GUI.Administrador.Inventario.*;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_EliminarInst extends javax.swing.JFrame {
    private int x;
    private int y;
    public JFAdmin_EliminarInst() {
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
        jBEliminar_Inst = new javax.swing.JButton();
        jPDatosInstEliminar = new javax.swing.JPanel();
        jTFCodigo_EliminarInst = new javax.swing.JTextField();
        jLabelNom = new javax.swing.JLabel();
        jTFNombre_EliminarInst = new javax.swing.JTextField();
        jLabelFab = new javax.swing.JLabel();
        jTFFabricante_EliminarInst = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTFCategoria_EliminarInst = new javax.swing.JTextField();
        jLabelCategoria = new javax.swing.JLabel();
        jTFCondicion_EliminarInst = new javax.swing.JTextField();
        jLabelCondicion = new javax.swing.JLabel();
        jTFEstado_EliminarInst = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanelDatoInst = new javax.swing.JPanel();
        jTFBuscar_EliminarInst = new javax.swing.JTextField();
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
        jLabelTitulo.setText("Eliminar Instrumento");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

        jBCancelar.setForeground(new java.awt.Color(58, 160, 141));
        jBCancelar.setText("Cancelar");
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

        jBEliminar_Inst.setForeground(new java.awt.Color(58, 160, 141));
        jBEliminar_Inst.setText("Eliminar");
        jBEliminar_Inst.setBorder(null);
        jBEliminar_Inst.setBorderPainted(false);
        jBEliminar_Inst.setHideActionText(true);
        jBEliminar_Inst.setMaximumSize(new java.awt.Dimension(89, 32));
        jBEliminar_Inst.setMinimumSize(new java.awt.Dimension(89, 32));
        jBEliminar_Inst.setPreferredSize(new java.awt.Dimension(89, 32));
        jBEliminar_Inst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEliminar_InstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEliminar_InstMouseExited(evt);
            }
        });
        jBEliminar_Inst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminar_InstActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminar_Inst);
        jBEliminar_Inst.setBounds(80, 430, 110, 40);

        jPDatosInstEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosInstEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar"));

        jTFCodigo_EliminarInst.setEditable(false);
        jTFCodigo_EliminarInst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_EliminarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelNom.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNom.setText("Nombre");

        jTFNombre_EliminarInst.setEditable(false);
        jTFNombre_EliminarInst.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombre_EliminarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelFab.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelFab.setText("Fabricante");

        jTFFabricante_EliminarInst.setEditable(false);
        jTFFabricante_EliminarInst.setBackground(new java.awt.Color(255, 255, 255));
        jTFFabricante_EliminarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelEstado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelEstado.setText("Estado Alquiler");

        jTFCategoria_EliminarInst.setEditable(false);
        jTFCategoria_EliminarInst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCategoria_EliminarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCategoria.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCategoria.setText("Categoria");

        jTFCondicion_EliminarInst.setEditable(false);
        jTFCondicion_EliminarInst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCondicion_EliminarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCondicion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCondicion.setText("Condición");

        jTFEstado_EliminarInst.setEditable(false);
        jTFEstado_EliminarInst.setBackground(new java.awt.Color(255, 255, 255));
        jTFEstado_EliminarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Código");

        javax.swing.GroupLayout jPDatosInstEliminarLayout = new javax.swing.GroupLayout(jPDatosInstEliminar);
        jPDatosInstEliminar.setLayout(jPDatosInstEliminarLayout);
        jPDatosInstEliminarLayout.setHorizontalGroup(
            jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosInstEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosInstEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFab)
                            .addComponent(jLabelCategoria)
                            .addComponent(jLabelEstado)
                            .addComponent(jLabelCondicion))
                        .addGap(41, 41, 41)
                        .addGroup(jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCondicion_EliminarInst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jTFEstado_EliminarInst, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFCategoria_EliminarInst, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFFabricante_EliminarInst))
                        .addGap(19, 19, 19))
                    .addGroup(jPDatosInstEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosInstEliminarLayout.createSequentialGroup()
                                .addComponent(jLabelNom)
                                .addGap(18, 18, 18))
                            .addGroup(jPDatosInstEliminarLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNombre_EliminarInst, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jTFCodigo_EliminarInst))
                        .addContainerGap())))
        );
        jPDatosInstEliminarLayout.setVerticalGroup(
            jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosInstEliminarLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_EliminarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombre_EliminarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNom))
                .addGap(18, 18, 18)
                .addGroup(jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFabricante_EliminarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFab))
                .addGap(18, 18, 18)
                .addGroup(jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCategoria_EliminarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategoria))
                .addGap(18, 18, 18)
                .addGroup(jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEstado_EliminarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado))
                .addGap(18, 18, 18)
                .addGroup(jPDatosInstEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCondicion_EliminarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCondicion))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPDatosInstEliminar);
        jPDatosInstEliminar.setBounds(10, 120, 360, 290);

        jPanelDatoInst.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoInst.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Instrumento"));

        jTFBuscar_EliminarInst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_EliminarInst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarInstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarInstKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código:");

        javax.swing.GroupLayout jPanelDatoInstLayout = new javax.swing.GroupLayout(jPanelDatoInst);
        jPanelDatoInst.setLayout(jPanelDatoInstLayout);
        jPanelDatoInstLayout.setHorizontalGroup(
            jPanelDatoInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoInstLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodigo)
                .addGap(85, 85, 85)
                .addComponent(jTFBuscar_EliminarInst, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoInstLayout.setVerticalGroup(
            jPanelDatoInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoInstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_EliminarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoInst);
        jPanelDatoInst.setBounds(10, 40, 360, 70);
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

    private void jBEliminar_InstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminar_InstMouseEntered
        this.jBEliminar_Inst.setText("ELIMINAR");
    }//GEN-LAST:event_jBEliminar_InstMouseEntered

    private void jBEliminar_InstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminar_InstMouseExited
        this.jBEliminar_Inst.setText("eliminar");
    }//GEN-LAST:event_jBEliminar_InstMouseExited

    private void jBEliminar_InstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminar_InstActionPerformed

    }//GEN-LAST:event_jBEliminar_InstActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFBuscar_EliminarInstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarInstKeyTyped

    }//GEN-LAST:event_jTFBuscar_EliminarInstKeyTyped

    private void jTFBuscar_EliminarInstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarInstKeyReleased

    }//GEN-LAST:event_jTFBuscar_EliminarInstKeyReleased

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
    private javax.swing.JButton jBEliminar_Inst;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCondicion;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFab;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosInstEliminar;
    private javax.swing.JPanel jPanelDatoInst;
    public static javax.swing.JTextField jTFBuscar_EliminarInst;
    public static javax.swing.JTextField jTFCategoria_EliminarInst;
    public static javax.swing.JTextField jTFCodigo_EliminarInst;
    public static javax.swing.JTextField jTFCondicion_EliminarInst;
    public static javax.swing.JTextField jTFEstado_EliminarInst;
    public static javax.swing.JTextField jTFFabricante_EliminarInst;
    public static javax.swing.JTextField jTFNombre_EliminarInst;
    // End of variables declaration//GEN-END:variables
}