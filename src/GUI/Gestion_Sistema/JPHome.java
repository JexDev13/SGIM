package GUI.Gestion_Sistema;

/*
 * @authors G2 SoftwareSolutions
 */
public class JPHome extends javax.swing.JPanel {

    public JPHome() {
        initComponents();
        this.jTextAreaTexto.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jTextAreaTexto = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(970, 630));
        setMinimumSize(new java.awt.Dimension(970, 630));
        setPreferredSize(new java.awt.Dimension(970, 630));

        jButtonSalir.setBackground(new java.awt.Color(250, 183, 22));
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir opaco 32.png"))); // NOI18N
        jButtonSalir.setText("salir");
        jButtonSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir 32.png"))); // NOI18N
        jButtonSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir 32.png"))); // NOI18N
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseExited(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Cambria Math", 1, 72)); // NOI18N
        jLabelTitulo.setText("Bienvenido");

        jLabelImagen.setText("FOTO");
        jLabelImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextAreaTexto.setColumns(20);
        jTextAreaTexto.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextAreaTexto.setRows(5);
        jTextAreaTexto.setText("\n\n\nParrafo de como funciona el sistema\nAgregar manual de usuario");
        jTextAreaTexto.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTitulo)
                                .addGap(0, 290, Short.MAX_VALUE))
                            .addComponent(jTextAreaTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jTextAreaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        this.jButtonSalir.setText("SALIR");
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        this.jButtonSalir.setText("salir");
    }//GEN-LAST:event_jButtonSalirMouseExited

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextArea jTextAreaTexto;
    // End of variables declaration//GEN-END:variables
}
