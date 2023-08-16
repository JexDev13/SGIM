package GUI.Administrador.Calendario_Clases;

import GUI.Administrador.Calendario_Clases.*;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_ActualizarClase extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdmin_ActualizarClase() {
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
        jBResgistrar_Clase = new javax.swing.JButton();
        jPDatosClaseActualizar = new javax.swing.JPanel();
        jTFCodigo_ActualizarClase = new javax.swing.JTextField();
        jTFAula_ActualizarClase = new javax.swing.JTextField();
        jChBAula_ActualizarClase = new javax.swing.JCheckBox();
        jChBHorario_ActualizarClase = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jFormattedTextFieldHorario_ActualizarClase = new javax.swing.JFormattedTextField();
        jPanelDatoClase = new javax.swing.JPanel();
        jTFBuscar_ActualizarClase = new javax.swing.JTextField();
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
        jLabelTitulo.setText("Actualizar Clase");
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
        jBCancelar.setBounds(190, 280, 110, 40);

        jBResgistrar_Clase.setForeground(new java.awt.Color(58, 160, 141));
        jBResgistrar_Clase.setText("Guardar");
        jBResgistrar_Clase.setBorder(null);
        jBResgistrar_Clase.setBorderPainted(false);
        jBResgistrar_Clase.setHideActionText(true);
        jBResgistrar_Clase.setMaximumSize(new java.awt.Dimension(89, 32));
        jBResgistrar_Clase.setMinimumSize(new java.awt.Dimension(89, 32));
        jBResgistrar_Clase.setPreferredSize(new java.awt.Dimension(89, 32));
        jBResgistrar_Clase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBResgistrar_ClaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBResgistrar_ClaseMouseExited(evt);
            }
        });
        jBResgistrar_Clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResgistrar_ClaseActionPerformed(evt);
            }
        });
        getContentPane().add(jBResgistrar_Clase);
        jBResgistrar_Clase.setBounds(40, 280, 110, 40);

        jPDatosClaseActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosClaseActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jTFCodigo_ActualizarClase.setEditable(false);
        jTFCodigo_ActualizarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFAula_ActualizarClase.setEditable(false);
        jTFAula_ActualizarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBAula_ActualizarClase.setBackground(new java.awt.Color(255, 255, 255));
        jChBAula_ActualizarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBAula_ActualizarClase.setText("Aula");
        jChBAula_ActualizarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBAula_ActualizarClaseActionPerformed(evt);
            }
        });

        jChBHorario_ActualizarClase.setBackground(new java.awt.Color(255, 255, 255));
        jChBHorario_ActualizarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBHorario_ActualizarClase.setText("Horario");
        jChBHorario_ActualizarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBHorario_ActualizarClaseActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Código Clase");

        jFormattedTextFieldHorario_ActualizarClase.setEditable(false);
        jFormattedTextFieldHorario_ActualizarClase.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout jPDatosClaseActualizarLayout = new javax.swing.GroupLayout(jPDatosClaseActualizar);
        jPDatosClaseActualizar.setLayout(jPDatosClaseActualizarLayout);
        jPDatosClaseActualizarLayout.setHorizontalGroup(
            jPDatosClaseActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosClaseActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosClaseActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jChBAula_ActualizarClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jChBHorario_ActualizarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldHorario_ActualizarClase)
                    .addComponent(jTFCodigo_ActualizarClase, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jTFAula_ActualizarClase))
                .addContainerGap())
        );
        jPDatosClaseActualizarLayout.setVerticalGroup(
            jPDatosClaseActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosClaseActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_ActualizarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBAula_ActualizarClase)
                    .addComponent(jTFAula_ActualizarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBHorario_ActualizarClase)
                    .addComponent(jFormattedTextFieldHorario_ActualizarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPDatosClaseActualizar);
        jPDatosClaseActualizar.setBounds(10, 120, 360, 140);

        jPanelDatoClase.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoClase.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la Clase"));

        jTFBuscar_ActualizarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_ActualizarClase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarClaseKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarClaseKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código clase:");

        javax.swing.GroupLayout jPanelDatoClaseLayout = new javax.swing.GroupLayout(jPanelDatoClase);
        jPanelDatoClase.setLayout(jPanelDatoClaseLayout);
        jPanelDatoClaseLayout.setHorizontalGroup(
            jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodigo)
                .addGap(79, 79, 79)
                .addComponent(jTFBuscar_ActualizarClase, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoClaseLayout.setVerticalGroup(
            jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_ActualizarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoClase);
        jPanelDatoClase.setBounds(10, 40, 360, 70);
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 380, 350);

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

    private void jBResgistrar_ClaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResgistrar_ClaseMouseEntered
        this.jBResgistrar_Clase.setText("GUARDAR");
    }//GEN-LAST:event_jBResgistrar_ClaseMouseEntered

    private void jBResgistrar_ClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResgistrar_ClaseMouseExited
        this.jBResgistrar_Clase.setText("guardar");
    }//GEN-LAST:event_jBResgistrar_ClaseMouseExited

    private void jBResgistrar_ClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResgistrar_ClaseActionPerformed

    }//GEN-LAST:event_jBResgistrar_ClaseActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jChBAula_ActualizarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBAula_ActualizarClaseActionPerformed
        if (jChBAula_ActualizarClase.isSelected()) {
            this.jTFAula_ActualizarClase.setEditable(true);
        } else {
            this.jTFAula_ActualizarClase.setEditable(false);
        }
    }//GEN-LAST:event_jChBAula_ActualizarClaseActionPerformed

    private void jChBHorario_ActualizarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBHorario_ActualizarClaseActionPerformed
        if (jChBHorario_ActualizarClase.isSelected()) {
            this.jFormattedTextFieldHorario_ActualizarClase.setEditable(true);
        } else {
            this.jFormattedTextFieldHorario_ActualizarClase.setEditable(false);
        }
    }//GEN-LAST:event_jChBHorario_ActualizarClaseActionPerformed

    private void jTFBuscar_ActualizarClaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarClaseKeyTyped

    }//GEN-LAST:event_jTFBuscar_ActualizarClaseKeyTyped

    private void jTFBuscar_ActualizarClaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarClaseKeyReleased

    }//GEN-LAST:event_jTFBuscar_ActualizarClaseKeyReleased

    public void limpiarCampos() {
        this.jTFAula_ActualizarClase.setText("");
        this.jTFCodigo_ActualizarClase.setText("");
        this.jTFBuscar_ActualizarClase.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBResgistrar_Clase;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jChBAula_ActualizarClase;
    private javax.swing.JCheckBox jChBHorario_ActualizarClase;
    private javax.swing.JFormattedTextField jFormattedTextFieldHorario_ActualizarClase;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosClaseActualizar;
    private javax.swing.JPanel jPanelDatoClase;
    public static javax.swing.JTextField jTFAula_ActualizarClase;
    public static javax.swing.JTextField jTFBuscar_ActualizarClase;
    public static javax.swing.JTextField jTFCodigo_ActualizarClase;
    // End of variables declaration//GEN-END:variables
}
