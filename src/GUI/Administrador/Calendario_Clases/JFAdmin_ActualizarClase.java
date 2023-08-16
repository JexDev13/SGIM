package GUI.Administrador.Calendario_Clases;

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

        jLabelTitulo = new javax.swing.JLabel();
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
        jPFondo = new javax.swing.JPanel();
        jButtonMinimizar1 = new javax.swing.JButton();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JBIngreso1 = new javax.swing.JButton();
        JBCancela1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 338));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(380, 338));
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
        jLabelTitulo.setText("Actualizar Clase");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

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

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPFondo.add(jPanel1);
        jPanel1.setBounds(0, 30, 380, 250);

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
        JBIngreso1.setBounds(90, 290, 89, 32);

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
        JBCancela1.setBounds(200, 290, 89, 32);

        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 380, 340);

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
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    public void limpiarCampos() {
        this.jTFAula_ActualizarClase.setText("");
        this.jTFCodigo_ActualizarClase.setText("");
        this.jTFBuscar_ActualizarClase.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JCheckBox jChBAula_ActualizarClase;
    private javax.swing.JCheckBox jChBHorario_ActualizarClase;
    private javax.swing.JFormattedTextField jFormattedTextFieldHorario_ActualizarClase;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosClaseActualizar;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDatoClase;
    public static javax.swing.JTextField jTFAula_ActualizarClase;
    public static javax.swing.JTextField jTFBuscar_ActualizarClase;
    public static javax.swing.JTextField jTFCodigo_ActualizarClase;
    // End of variables declaration//GEN-END:variables
}
