package GUI.Administrador.Calendario_Clases;

import GUI.Administrador.Calendario_Clases.*;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_ConsultarClase extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdmin_ConsultarClase() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalirIcon = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jPDatoConsultadoClase = new javax.swing.JPanel();
        jTFCodigo_Clase = new javax.swing.JTextField();
        jTFDato_Clase = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
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
        jLabelTitulo.setText("Consultar Dato de Clase");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 240, 30);

        jPDatoConsultadoClase.setBackground(new java.awt.Color(255, 255, 255));
        jPDatoConsultadoClase.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dato Consultado"));

        jTFCodigo_Clase.setEditable(false);
        jTFCodigo_Clase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFDato_Clase.setEditable(false);
        jTFDato_Clase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFDato_Clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDato_ClaseActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Código:");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel21.setText("Dato Elegido:");

        javax.swing.GroupLayout jPDatoConsultadoClaseLayout = new javax.swing.GroupLayout(jPDatoConsultadoClase);
        jPDatoConsultadoClase.setLayout(jPDatoConsultadoClaseLayout);
        jPDatoConsultadoClaseLayout.setHorizontalGroup(
            jPDatoConsultadoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatoConsultadoClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatoConsultadoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatoConsultadoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCodigo_Clase, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jTFDato_Clase))
                .addContainerGap())
        );
        jPDatoConsultadoClaseLayout.setVerticalGroup(
            jPDatoConsultadoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatoConsultadoClaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatoConsultadoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_Clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPDatoConsultadoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDato_Clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(190, 190, 190))
        );

        getContentPane().add(jPDatoConsultadoClase);
        jPDatoConsultadoClase.setBounds(10, 60, 360, 120);
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 380, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
        limpiarCampos();
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFDato_ClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDato_ClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDato_ClaseActionPerformed

    public void limpiarCampos() {
        this.jTFDato_Clase.setText("");
        this.jTFCodigo_Clase.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatoConsultadoClase;
    public static javax.swing.JTextField jTFCodigo_Clase;
    public static javax.swing.JTextField jTFDato_Clase;
    // End of variables declaration//GEN-END:variables
}
