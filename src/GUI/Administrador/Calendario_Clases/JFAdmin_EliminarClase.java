package GUI.Administrador.Calendario_Clases;

import GUI.Administrador.Calendario_Clases.*;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_EliminarClase extends javax.swing.JFrame {
    private int x;
    private int y;
    public JFAdmin_EliminarClase() {
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
        jBEliminar_Clase = new javax.swing.JButton();
        jPDatosClaseEliminar = new javax.swing.JPanel();
        jTFCodigo_EliminarClase = new javax.swing.JTextField();
        jLabelMateria = new javax.swing.JLabel();
        jTFMateria_EliminarClase = new javax.swing.JTextField();
        jLabelAula = new javax.swing.JLabel();
        jTFAula_EliminarClase = new javax.swing.JTextField();
        jTFHorario_EliminarClase = new javax.swing.JTextField();
        jLabelHorario = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanelDatoClase = new javax.swing.JPanel();
        jTFBuscar_EliminarClase = new javax.swing.JTextField();
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
        jLabelTitulo.setText("Eliminar Clase");
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
        jBCancelar.setBounds(210, 310, 110, 40);

        jBEliminar_Clase.setForeground(new java.awt.Color(58, 160, 141));
        jBEliminar_Clase.setText("Eliminar");
        jBEliminar_Clase.setBorder(null);
        jBEliminar_Clase.setBorderPainted(false);
        jBEliminar_Clase.setHideActionText(true);
        jBEliminar_Clase.setMaximumSize(new java.awt.Dimension(89, 32));
        jBEliminar_Clase.setMinimumSize(new java.awt.Dimension(89, 32));
        jBEliminar_Clase.setPreferredSize(new java.awt.Dimension(89, 32));
        jBEliminar_Clase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEliminar_ClaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEliminar_ClaseMouseExited(evt);
            }
        });
        jBEliminar_Clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminar_ClaseActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminar_Clase);
        jBEliminar_Clase.setBounds(70, 310, 110, 40);

        jPDatosClaseEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosClaseEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar"));

        jTFCodigo_EliminarClase.setEditable(false);
        jTFCodigo_EliminarClase.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_EliminarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelMateria.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelMateria.setText("Materia");

        jTFMateria_EliminarClase.setEditable(false);
        jTFMateria_EliminarClase.setBackground(new java.awt.Color(255, 255, 255));
        jTFMateria_EliminarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAula.setText("Aula");

        jTFAula_EliminarClase.setEditable(false);
        jTFAula_EliminarClase.setBackground(new java.awt.Color(255, 255, 255));
        jTFAula_EliminarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFHorario_EliminarClase.setEditable(false);
        jTFHorario_EliminarClase.setBackground(new java.awt.Color(255, 255, 255));
        jTFHorario_EliminarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelHorario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelHorario.setText("Horario");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Código Clase");

        javax.swing.GroupLayout jPDatosClaseEliminarLayout = new javax.swing.GroupLayout(jPDatosClaseEliminar);
        jPDatosClaseEliminar.setLayout(jPDatosClaseEliminarLayout);
        jPDatosClaseEliminarLayout.setHorizontalGroup(
            jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosClaseEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAula)
                            .addComponent(jLabelHorario))
                        .addGap(95, 95, 95)
                        .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFHorario_EliminarClase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jTFAula_EliminarClase))
                        .addGap(19, 19, 19))
                    .addGroup(jPDatosClaseEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosClaseEliminarLayout.createSequentialGroup()
                                .addComponent(jLabelMateria)
                                .addGap(18, 18, 18))
                            .addGroup(jPDatosClaseEliminarLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFMateria_EliminarClase, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jTFCodigo_EliminarClase))
                        .addContainerGap())))
        );
        jPDatosClaseEliminarLayout.setVerticalGroup(
            jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_EliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFMateria_EliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAula_EliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAula))
                .addGap(6, 6, 6)
                .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFHorario_EliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHorario))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPDatosClaseEliminar);
        jPDatosClaseEliminar.setBounds(10, 120, 360, 170);

        jPanelDatoClase.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoClase.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la clase"));

        jTFBuscar_EliminarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_EliminarClase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarClaseKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarClaseKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código clase");

        javax.swing.GroupLayout jPanelDatoClaseLayout = new javax.swing.GroupLayout(jPanelDatoClase);
        jPanelDatoClase.setLayout(jPanelDatoClaseLayout);
        jPanelDatoClaseLayout.setHorizontalGroup(
            jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodigo)
                .addGap(85, 85, 85)
                .addComponent(jTFBuscar_EliminarClase, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoClaseLayout.setVerticalGroup(
            jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_EliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoClase);
        jPanelDatoClase.setBounds(10, 40, 360, 70);
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 380, 380);

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

    private void jBEliminar_ClaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminar_ClaseMouseEntered
        this.jBEliminar_Clase.setText("ELIMINAR");
    }//GEN-LAST:event_jBEliminar_ClaseMouseEntered

    private void jBEliminar_ClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminar_ClaseMouseExited
        this.jBEliminar_Clase.setText("eliminar");
    }//GEN-LAST:event_jBEliminar_ClaseMouseExited

    private void jBEliminar_ClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminar_ClaseActionPerformed

    }//GEN-LAST:event_jBEliminar_ClaseActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFBuscar_EliminarClaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarClaseKeyTyped

    }//GEN-LAST:event_jTFBuscar_EliminarClaseKeyTyped

    private void jTFBuscar_EliminarClaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarClaseKeyReleased

    }//GEN-LAST:event_jTFBuscar_EliminarClaseKeyReleased

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
    private javax.swing.JButton jBEliminar_Clase;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelAula;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelMateria;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosClaseEliminar;
    private javax.swing.JPanel jPanelDatoClase;
    public static javax.swing.JTextField jTFAula_EliminarClase;
    public static javax.swing.JTextField jTFBuscar_EliminarClase;
    public static javax.swing.JTextField jTFCodigo_EliminarClase;
    public static javax.swing.JTextField jTFHorario_EliminarClase;
    public static javax.swing.JTextField jTFMateria_EliminarClase;
    // End of variables declaration//GEN-END:variables
}