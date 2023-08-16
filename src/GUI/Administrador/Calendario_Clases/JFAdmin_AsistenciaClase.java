package GUI.Administrador.Calendario_Clases;

import GUI.Administrador.Calendario_Clases.*;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_AsistenciaClase extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdmin_AsistenciaClase() {
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
        jBResgistrar_Asistencia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTEstudiantes = new javax.swing.JTable();
        jPanelDatoClase = new javax.swing.JPanel();
        jTFBuscar_AsignarClase = new javax.swing.JTextField();
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
        jButtonSalirIcon.setBounds(630, 0, 30, 30);

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
        jButtonMinimizar.setBounds(600, 0, 30, 30);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Asistencia");
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
        jBCancelar.setBounds(210, 410, 110, 40);

        jBResgistrar_Asistencia.setForeground(new java.awt.Color(58, 160, 141));
        jBResgistrar_Asistencia.setText("Guardar");
        jBResgistrar_Asistencia.setBorder(null);
        jBResgistrar_Asistencia.setBorderPainted(false);
        jBResgistrar_Asistencia.setHideActionText(true);
        jBResgistrar_Asistencia.setMaximumSize(new java.awt.Dimension(89, 32));
        jBResgistrar_Asistencia.setMinimumSize(new java.awt.Dimension(89, 32));
        jBResgistrar_Asistencia.setPreferredSize(new java.awt.Dimension(89, 32));
        jBResgistrar_Asistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBResgistrar_AsistenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBResgistrar_AsistenciaMouseExited(evt);
            }
        });
        jBResgistrar_Asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResgistrar_AsistenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jBResgistrar_Asistencia);
        jBResgistrar_Asistencia.setBounds(50, 410, 110, 40);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTEstudiantes.setAutoCreateRowSorter(true);
        jTEstudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código Estudiante", "Nombres Estudiante", "Apellidos Estudiante", "Presente"
            }
        ));
        jTEstudiantes.setGridColor(new java.awt.Color(250, 183, 22));
        jTEstudiantes.setRowSelectionAllowed(false);
        jTEstudiantes.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTEstudiantes.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTEstudiantes.getTableHeader().setResizingAllowed(false);
        jTEstudiantes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTEstudiantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 650, 280);

        jPanelDatoClase.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoClase.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la clase"));

        jTFBuscar_AsignarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_AsignarClase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_AsignarClaseKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_AsignarClaseKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código de la clase:");

        javax.swing.GroupLayout jPanelDatoClaseLayout = new javax.swing.GroupLayout(jPanelDatoClase);
        jPanelDatoClase.setLayout(jPanelDatoClaseLayout);
        jPanelDatoClaseLayout.setHorizontalGroup(
            jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodigo)
                .addGap(18, 18, 18)
                .addComponent(jTFBuscar_AsignarClase, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoClaseLayout.setVerticalGroup(
            jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_AsignarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoClase);
        jPanelDatoClase.setBounds(10, 40, 360, 70);
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 660, 460);

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

    private void jBResgistrar_AsistenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResgistrar_AsistenciaMouseEntered
        this.jBResgistrar_Asistencia.setText("GUARDAR");
    }//GEN-LAST:event_jBResgistrar_AsistenciaMouseEntered

    private void jBResgistrar_AsistenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResgistrar_AsistenciaMouseExited
        this.jBResgistrar_Asistencia.setText("guardar");
    }//GEN-LAST:event_jBResgistrar_AsistenciaMouseExited

    private void jBResgistrar_AsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResgistrar_AsistenciaActionPerformed

    }//GEN-LAST:event_jBResgistrar_AsistenciaActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFBuscar_AsignarClaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_AsignarClaseKeyTyped

    }//GEN-LAST:event_jTFBuscar_AsignarClaseKeyTyped

    private void jTFBuscar_AsignarClaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_AsignarClaseKeyReleased

    }//GEN-LAST:event_jTFBuscar_AsignarClaseKeyReleased

    public void limpiarCampos() {
        this.jTFBuscar_AsignarClase.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBResgistrar_Asistencia;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelDatoClase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTEstudiantes;
    public static javax.swing.JTextField jTFBuscar_AsignarClase;
    // End of variables declaration//GEN-END:variables
}
