package GUI.Administrador.Inventario;

import GUI.Administrador.Inventario.*;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_EliminarLib extends javax.swing.JFrame {
    private int x;
    private int y;
    public JFAdmin_EliminarLib() {
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
        jBEliminar_Lib = new javax.swing.JButton();
        jPDatosLibEliminar = new javax.swing.JPanel();
        jTFCodigo_EliminarLib = new javax.swing.JTextField();
        jLabelNom = new javax.swing.JLabel();
        jTFNombre_EliminarLib = new javax.swing.JTextField();
        jLabelAut = new javax.swing.JLabel();
        jTFAutor_EliminarLib = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTFCategoria_EliminarLib = new javax.swing.JTextField();
        jLabelCategoria = new javax.swing.JLabel();
        jTFCondicion_EliminarLib = new javax.swing.JTextField();
        jLabelCondicion = new javax.swing.JLabel();
        jTFEstado_EliminarLib = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanelDatoLib = new javax.swing.JPanel();
        jTFBuscar_EliminarLib = new javax.swing.JTextField();
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
        jLabelTitulo.setText("Eliminar Libro");
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

        jBEliminar_Lib.setForeground(new java.awt.Color(58, 160, 141));
        jBEliminar_Lib.setText("Eliminar");
        jBEliminar_Lib.setBorder(null);
        jBEliminar_Lib.setBorderPainted(false);
        jBEliminar_Lib.setHideActionText(true);
        jBEliminar_Lib.setMaximumSize(new java.awt.Dimension(89, 32));
        jBEliminar_Lib.setMinimumSize(new java.awt.Dimension(89, 32));
        jBEliminar_Lib.setPreferredSize(new java.awt.Dimension(89, 32));
        jBEliminar_Lib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEliminar_LibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEliminar_LibMouseExited(evt);
            }
        });
        jBEliminar_Lib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminar_LibActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminar_Lib);
        jBEliminar_Lib.setBounds(80, 430, 110, 40);

        jPDatosLibEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosLibEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar"));

        jTFCodigo_EliminarLib.setEditable(false);
        jTFCodigo_EliminarLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_EliminarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelNom.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNom.setText("Nombre");

        jTFNombre_EliminarLib.setEditable(false);
        jTFNombre_EliminarLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombre_EliminarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelAut.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAut.setText("Autor");

        jTFAutor_EliminarLib.setEditable(false);
        jTFAutor_EliminarLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFAutor_EliminarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelEstado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelEstado.setText("Estado Alquiler");

        jTFCategoria_EliminarLib.setEditable(false);
        jTFCategoria_EliminarLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFCategoria_EliminarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCategoria.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCategoria.setText("Categoria");

        jTFCondicion_EliminarLib.setEditable(false);
        jTFCondicion_EliminarLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFCondicion_EliminarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCondicion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCondicion.setText("Condición");

        jTFEstado_EliminarLib.setEditable(false);
        jTFEstado_EliminarLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFEstado_EliminarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Código");

        javax.swing.GroupLayout jPDatosLibEliminarLayout = new javax.swing.GroupLayout(jPDatosLibEliminar);
        jPDatosLibEliminar.setLayout(jPDatosLibEliminarLayout);
        jPDatosLibEliminarLayout.setHorizontalGroup(
            jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLibEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosLibEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAut)
                            .addComponent(jLabelCategoria)
                            .addComponent(jLabelEstado)
                            .addComponent(jLabelCondicion))
                        .addGap(41, 41, 41)
                        .addGroup(jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCondicion_EliminarLib, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jTFEstado_EliminarLib, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFCategoria_EliminarLib, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFAutor_EliminarLib))
                        .addGap(19, 19, 19))
                    .addGroup(jPDatosLibEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosLibEliminarLayout.createSequentialGroup()
                                .addComponent(jLabelNom)
                                .addGap(18, 18, 18))
                            .addGroup(jPDatosLibEliminarLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNombre_EliminarLib, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jTFCodigo_EliminarLib))
                        .addContainerGap())))
        );
        jPDatosLibEliminarLayout.setVerticalGroup(
            jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLibEliminarLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_EliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombre_EliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNom))
                .addGap(18, 18, 18)
                .addGroup(jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAutor_EliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAut))
                .addGap(18, 18, 18)
                .addGroup(jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCategoria_EliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategoria))
                .addGap(18, 18, 18)
                .addGroup(jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEstado_EliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado))
                .addGap(18, 18, 18)
                .addGroup(jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCondicion_EliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCondicion))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPDatosLibEliminar);
        jPDatosLibEliminar.setBounds(10, 120, 360, 290);

        jPanelDatoLib.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoLib.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Instrumento"));

        jTFBuscar_EliminarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_EliminarLib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarLibKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarLibKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código:");

        javax.swing.GroupLayout jPanelDatoLibLayout = new javax.swing.GroupLayout(jPanelDatoLib);
        jPanelDatoLib.setLayout(jPanelDatoLibLayout);
        jPanelDatoLibLayout.setHorizontalGroup(
            jPanelDatoLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoLibLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodigo)
                .addGap(85, 85, 85)
                .addComponent(jTFBuscar_EliminarLib, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoLibLayout.setVerticalGroup(
            jPanelDatoLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoLibLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_EliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoLib);
        jPanelDatoLib.setBounds(10, 40, 360, 70);
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

    private void jBEliminar_LibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminar_LibMouseEntered
        this.jBEliminar_Lib.setText("ELIMINAR");
    }//GEN-LAST:event_jBEliminar_LibMouseEntered

    private void jBEliminar_LibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminar_LibMouseExited
        this.jBEliminar_Lib.setText("eliminar");
    }//GEN-LAST:event_jBEliminar_LibMouseExited

    private void jBEliminar_LibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminar_LibActionPerformed

    }//GEN-LAST:event_jBEliminar_LibActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFBuscar_EliminarLibKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarLibKeyTyped

    }//GEN-LAST:event_jTFBuscar_EliminarLibKeyTyped

    private void jTFBuscar_EliminarLibKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarLibKeyReleased

    }//GEN-LAST:event_jTFBuscar_EliminarLibKeyReleased

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
    private javax.swing.JButton jBEliminar_Lib;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelAut;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCondicion;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosLibEliminar;
    private javax.swing.JPanel jPanelDatoLib;
    public static javax.swing.JTextField jTFAutor_EliminarLib;
    public static javax.swing.JTextField jTFBuscar_EliminarLib;
    public static javax.swing.JTextField jTFCategoria_EliminarLib;
    public static javax.swing.JTextField jTFCodigo_EliminarLib;
    public static javax.swing.JTextField jTFCondicion_EliminarLib;
    public static javax.swing.JTextField jTFEstado_EliminarLib;
    public static javax.swing.JTextField jTFNombre_EliminarLib;
    // End of variables declaration//GEN-END:variables
}