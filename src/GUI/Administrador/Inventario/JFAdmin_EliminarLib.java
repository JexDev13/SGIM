package GUI.Administrador.Inventario;

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

        jPFondo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        JBIngreso1 = new javax.swing.JButton();
        JBCancela1 = new javax.swing.JButton();
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
        jPanel1 = new javax.swing.JPanel();
        jPanelDatoLib = new javax.swing.JPanel();
        jTFBuscar_EliminarLib = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jButtonMinimizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 499));
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

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Eliminar Libro");
        jPFondo.add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

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
        JBIngreso1.setBounds(90, 450, 89, 32);

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
        JBCancela1.setBounds(200, 450, 89, 32);

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
        jLabelCategoria.setText("Categoría");

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
                        .addGap(15, 15, 15)
                        .addGroup(jPDatosLibEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFEstado_EliminarLib, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jTFCategoria_EliminarLib, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFAutor_EliminarLib)
                            .addComponent(jTFCondicion_EliminarLib))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(73, 73, 73))
        );

        jPFondo.add(jPDatosLibEliminar);
        jPDatosLibEliminar.setBounds(10, 140, 360, 290);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelDatoLib.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoLib.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del libro"));
        jPanelDatoLib.setDoubleBuffered(false);

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
                .addComponent(jTFBuscar_EliminarLib, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatoLib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanelDatoLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jPFondo.add(jPanel1);
        jPanel1.setBounds(0, 30, 380, 410);

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

    private void jTFBuscar_EliminarLibKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarLibKeyTyped

    }//GEN-LAST:event_jTFBuscar_EliminarLibKeyTyped

    private void jTFBuscar_EliminarLibKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarLibKeyReleased

    }//GEN-LAST:event_jTFBuscar_EliminarLibKeyReleased

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("aceptar");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed

    }//GEN-LAST:event_JBIngreso1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

    private void JBCancela1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseEntered
        this.JBCancela1.setText("CANCELAR");
    }//GEN-LAST:event_JBCancela1MouseEntered

    private void JBCancela1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseExited
        this.JBCancela1.setText("cancelar");
    }//GEN-LAST:event_JBCancela1MouseExited

    private void JBCancela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancela1ActionPerformed
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

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
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelAut;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCondicion;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosLibEliminar;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDatoLib;
    public static javax.swing.JTextField jTFAutor_EliminarLib;
    public static javax.swing.JTextField jTFBuscar_EliminarLib;
    public static javax.swing.JTextField jTFCategoria_EliminarLib;
    public static javax.swing.JTextField jTFCodigo_EliminarLib;
    public static javax.swing.JTextField jTFCondicion_EliminarLib;
    private javax.swing.JTextField jTFEstado_EliminarLib;
    public static javax.swing.JTextField jTFNombre_EliminarLib;
    // End of variables declaration//GEN-END:variables
}
