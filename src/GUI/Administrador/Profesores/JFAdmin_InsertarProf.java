package GUI.Administrador.Profesores;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_InsertarProf extends javax.swing.JFrame {

    public JFAdmin_InsertarProf() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonSalirIcon = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        jLCedula = new javax.swing.JLabel();
        jLNombres = new javax.swing.JLabel();
        jLApellidos = new javax.swing.JLabel();
        jLNivel = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jLTelf = new javax.swing.JLabel();
        jLCorreo = new javax.swing.JLabel();
        jLEspecial = new javax.swing.JLabel();
        jLSueldo = new javax.swing.JLabel();
        jCBPiano = new javax.swing.JCheckBox();
        jCBGuitarra = new javax.swing.JCheckBox();
        jCBViolin = new javax.swing.JCheckBox();
        jCBOtro = new javax.swing.JCheckBox();
        jTFCedula = new javax.swing.JTextField();
        jTFNombres = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        jTFNivel = new javax.swing.JTextField();
        jTFDireccion = new javax.swing.JTextField();
        jTFTelef = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jTFSueldo = new javax.swing.JTextField();
        jBAceptar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("   Insertar Profesor");

        jButtonSalirIcon.setBackground(new java.awt.Color(250, 183, 22));
        jButtonSalirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButtonSalirIcon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalirIcon.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonSalirIcon.setRequestFocusEnabled(false);
        jButtonSalirIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirIconActionPerformed(evt);
            }
        });

        jButtonMinimizar.setBackground(new java.awt.Color(250, 183, 22));
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar 24.png"))); // NOI18N
        jButtonMinimizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonMinimizar.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonMinimizar.setRequestFocusEnabled(false);
        jButtonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizarActionPerformed(evt);
            }
        });

        jLCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCedula.setText("N°Cédula:");

        jLNombres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNombres.setText("Nombres:");

        jLApellidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLApellidos.setText("Apellidos:");

        jLNivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNivel.setText("Nivel académico:");

        jLDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLDireccion.setText("Dirección:");

        jLTelf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLTelf.setText("N°Teléfono:");

        jLCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCorreo.setText("Correo electrónico:");

        jLEspecial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLEspecial.setText("Especialización:");

        jLSueldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLSueldo.setText("Sueldo base:");

        jCBPiano.setText("Piano");

        jCBGuitarra.setText("Guitarra");

        jCBViolin.setText("Violín");

        jCBOtro.setText("Otro");

        jBAceptar.setText("Aceptar");

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLSueldo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFSueldo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCBPiano)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCBGuitarra)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCBViolin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCBOtro)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLCorreo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLTelf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFTelef))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLDireccion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFDireccion))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLNivel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFNivel))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLNombres)
                                        .addComponent(jLCedula)
                                        .addComponent(jLApellidos, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTFApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(jTFNombres)
                                        .addComponent(jTFCedula))))
                            .addComponent(jLEspecial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jButtonMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jButtonSalirIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jBAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalirIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCedula)
                    .addComponent(jTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombres)
                    .addComponent(jTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNivel)
                    .addComponent(jTFNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDireccion)
                    .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelf)
                    .addComponent(jTFTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCorreo)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLEspecial)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBPiano)
                    .addComponent(jCBGuitarra)
                    .addComponent(jCBViolin)
                    .addComponent(jCBOtro))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSueldo)
                    .addComponent(jTFSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAceptar)
                    .addComponent(jBCancelar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        borrarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_jBCancelarActionPerformed

    public void borrarCampos()
    {
        this.jTFApellidos.setText("");
        this.jTFCedula.setText("");
        this.jTFCorreo.setText("");
        this.jTFDireccion.setText("");
        this.jTFNivel.setText("");
        this.jTFNombres.setText("");
        this.jTFSueldo.setText("");
        this.jTFTelef.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jCBGuitarra;
    private javax.swing.JCheckBox jCBOtro;
    private javax.swing.JCheckBox jCBPiano;
    private javax.swing.JCheckBox jCBViolin;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLEspecial;
    private javax.swing.JLabel jLNivel;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLSueldo;
    private javax.swing.JLabel jLTelf;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFCedula;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFNivel;
    private javax.swing.JTextField jTFNombres;
    private javax.swing.JTextField jTFSueldo;
    private javax.swing.JTextField jTFTelef;
    // End of variables declaration//GEN-END:variables
}
