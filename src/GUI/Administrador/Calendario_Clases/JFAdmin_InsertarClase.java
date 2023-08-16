package GUI.Administrador.Calendario_Clases;

import GUI.Administrador.Calendario_Clases.*;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_InsertarClase extends javax.swing.JFrame {

    public JFAdmin_InsertarClase() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonSalirIcon = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        jLCodigo = new javax.swing.JLabel();
        jLMateria = new javax.swing.JLabel();
        jLAula = new javax.swing.JLabel();
        jLHorario = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jTFMateria = new javax.swing.JTextField();
        jTFAula = new javax.swing.JTextField();
        jBAceptar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jFormattedTextFieldHorario = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("   Insertar Clase");

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

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Cod. Clase:");

        jLMateria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLMateria.setText("Materia:");

        jLAula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLAula.setText("Aula:");

        jLHorario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLHorario.setText("Horario:");

        jBAceptar.setText("Aceptar");

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jFormattedTextFieldHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jBAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLHorario)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldHorario))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLAula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFAula, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jButtonMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jButtonSalirIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLCodigo)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMateria)
                    .addComponent(jTFMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAula))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLHorario)
                    .addComponent(jFormattedTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
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
        this.jTFAula.setText("");
        this.jTFCodigo.setText("");
        this.jTFMateria.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JFormattedTextField jFormattedTextFieldHorario;
    private javax.swing.JLabel jLAula;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLHorario;
    private javax.swing.JLabel jLMateria;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTFAula;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFMateria;
    // End of variables declaration//GEN-END:variables
}
