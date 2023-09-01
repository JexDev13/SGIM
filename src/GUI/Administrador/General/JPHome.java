package GUI.Administrador.General;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;

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
        jBSoporte = new javax.swing.JButton();
        jBManual = new javax.swing.JButton();

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

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoHOme.png"))); // NOI18N

        jTextAreaTexto.setColumns(20);
        jTextAreaTexto.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextAreaTexto.setRows(5);
        jTextAreaTexto.setText("\nSISTEMA DE GESTIÓN PARA LA ESCUELA DE MÚSICA TEMPRANA \n‘MOUSAI’\n\nAutomatiza el control de estudiantes y profesores, \nasignación de clases y horarios, control de \ninventario y administración de pagos a la escuela con\nuna interfaz intuitiva y amigable, ofrece una \nexperiencia fluida y sin complicaciones. ");
        jTextAreaTexto.setBorder(null);

        jBSoporte.setBackground(new java.awt.Color(255, 225, 153));
        jBSoporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/soporte.png"))); // NOI18N
        jBSoporte.setText("buscar soporte técnico");
        jBSoporte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBSoporte.setBorderPainted(false);
        jBSoporte.setPreferredSize(new java.awt.Dimension(73, 40));
        jBSoporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSoporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSoporteMouseExited(evt);
            }
        });
        jBSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSoporteActionPerformed(evt);
            }
        });

        jBManual.setBackground(new java.awt.Color(255, 225, 153));
        jBManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manual.png"))); // NOI18N
        jBManual.setText("descargar manual de usuario");
        jBManual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBManual.setBorderPainted(false);
        jBManual.setPreferredSize(new java.awt.Dimension(73, 40));
        jBManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBManualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBManualMouseExited(evt);
            }
        });
        jBManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBManualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jTextAreaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabelTitulo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBManual, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(357, 357, 357)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabelTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(jTextAreaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBManual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jBSoporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSoporteMouseEntered
        this.jBSoporte.setText("BUSCAR SOPORTE TÉCNICO");
    }//GEN-LAST:event_jBSoporteMouseEntered

    private void jBSoporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSoporteMouseExited
        this.jBSoporte.setText("buscar soporte técnico");
    }//GEN-LAST:event_jBSoporteMouseExited

    private void jBSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSoporteActionPerformed
        JFSoporteTecnico soporteTecnico = new JFSoporteTecnico();
        soporteTecnico.setLocationRelativeTo(null);
        this.setVisible(false);
        soporteTecnico.setVisible(true);
    }//GEN-LAST:event_jBSoporteActionPerformed

    private void jBManualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBManualMouseEntered
        this.jBManual.setText("DESCARGAR MANUAL DE USUARIO");
    }//GEN-LAST:event_jBManualMouseEntered

    private void jBManualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBManualMouseExited
        this.jBManual.setText("descargar manual de usuario");
    }//GEN-LAST:event_jBManualMouseExited

    private void jBManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBManualActionPerformed
        
        try{
            File file = new File("C:\\Users\\Alexander\\OneDrive - Escuela Politécnica Nacional\\SEMESTRE ACTUAL\\INGENIERIA EN SOFTWARE Y REQUERIMIENTOS\\Tabla_GR2SW.pdf");
            if(file.exists()){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(file);
                }else{
                    JOptionPane.showMessageDialog(this, "Archivo Inválido");
                }
            }else{
                JOptionPane.showMessageDialog(this, "El Manual de Usuario no Existe");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBManualActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBManual;
    private javax.swing.JButton jBSoporte;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextArea jTextAreaTexto;
    // End of variables declaration//GEN-END:variables
}
