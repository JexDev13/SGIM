package GUI.Administrador.Pagos;

import GUI.Administrador.Pagos.*;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_ConsultarPago extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdmin_ConsultarPago() {
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
        jBAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPagos = new javax.swing.JTable();
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_CedulaEst = new javax.swing.JTextField();
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
        jLabelTitulo.setText("Consulta Pagos");
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

        jBAceptar.setForeground(new java.awt.Color(58, 160, 141));
        jBAceptar.setText("Aceptar");
        jBAceptar.setBorder(null);
        jBAceptar.setBorderPainted(false);
        jBAceptar.setHideActionText(true);
        jBAceptar.setMaximumSize(new java.awt.Dimension(89, 32));
        jBAceptar.setMinimumSize(new java.awt.Dimension(89, 32));
        jBAceptar.setPreferredSize(new java.awt.Dimension(89, 32));
        jBAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAceptarMouseExited(evt);
            }
        });
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAceptar);
        jBAceptar.setBounds(50, 410, 110, 40);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTPagos.setAutoCreateRowSorter(true);
        jTPagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTPagos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código Transacción", "Valor", "Método de Pago"
            }
        ));
        jTPagos.setGridColor(new java.awt.Color(250, 183, 22));
        jTPagos.setRowSelectionAllowed(false);
        jTPagos.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTPagos.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTPagos.getTableHeader().setResizingAllowed(false);
        jTPagos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTPagos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 650, 280);

        jPanelDatoEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Estudiante"));

        jTFBuscar_CedulaEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_CedulaEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_CedulaEstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_CedulaEstKeyTyped(evt);
            }
        });

        jLCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCedula.setText("N° Cédula:");

        javax.swing.GroupLayout jPanelDatoEstudianteLayout = new javax.swing.GroupLayout(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setLayout(jPanelDatoEstudianteLayout);
        jPanelDatoEstudianteLayout.setHorizontalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCedula)
                .addGap(18, 18, 18)
                .addComponent(jTFBuscar_CedulaEst, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoEstudianteLayout.setVerticalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_CedulaEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCedula))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setBounds(10, 40, 360, 70);
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

    private void jBAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAceptarMouseEntered
        this.jBAceptar.setText("GUARDAR");
    }//GEN-LAST:event_jBAceptarMouseEntered

    private void jBAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAceptarMouseExited
        this.jBAceptar.setText("guardar");
    }//GEN-LAST:event_jBAceptarMouseExited

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed

    }//GEN-LAST:event_jBAceptarActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFBuscar_CedulaEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_CedulaEstKeyTyped

    }//GEN-LAST:event_jTFBuscar_CedulaEstKeyTyped

    private void jTFBuscar_CedulaEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_CedulaEstKeyReleased

    }//GEN-LAST:event_jTFBuscar_CedulaEstKeyReleased

    public void limpiarCampos() {
        this.jTFBuscar_CedulaEst.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelDatoEstudiante;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTFBuscar_CedulaEst;
    private javax.swing.JTable jTPagos;
    // End of variables declaration//GEN-END:variables
}
