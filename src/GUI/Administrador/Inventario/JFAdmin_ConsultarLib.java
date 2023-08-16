package GUI.Administrador.Inventario;

import GUI.Administrador.Inventario.*;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_ConsultarLib extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdmin_ConsultarLib() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPDatoConsultadoLibro = new javax.swing.JPanel();
        jTFCodigo_Lib = new javax.swing.JTextField();
        jTFDato_Lib = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jButtonMinimizar1 = new javax.swing.JButton();
        jButtonSalirIcon1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();
        JBCancela1 = new javax.swing.JButton();
        jPFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 239));
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

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Consultar Dato de Libro");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 240, 30);

        jPDatoConsultadoLibro.setBackground(new java.awt.Color(255, 255, 255));
        jPDatoConsultadoLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dato Consultado"));

        jTFCodigo_Lib.setEditable(false);
        jTFCodigo_Lib.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_Lib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFDato_Lib.setEditable(false);
        jTFDato_Lib.setBackground(new java.awt.Color(255, 255, 255));
        jTFDato_Lib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFDato_Lib.setActionCommand("<Not Set>");
        jTFDato_Lib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDato_LibActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Código:");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel21.setText("Dato Elegido:");

        javax.swing.GroupLayout jPDatoConsultadoLibroLayout = new javax.swing.GroupLayout(jPDatoConsultadoLibro);
        jPDatoConsultadoLibro.setLayout(jPDatoConsultadoLibroLayout);
        jPDatoConsultadoLibroLayout.setHorizontalGroup(
            jPDatoConsultadoLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatoConsultadoLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatoConsultadoLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatoConsultadoLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCodigo_Lib, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jTFDato_Lib))
                .addContainerGap())
        );
        jPDatoConsultadoLibroLayout.setVerticalGroup(
            jPDatoConsultadoLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatoConsultadoLibroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatoConsultadoLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_Lib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPDatoConsultadoLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDato_Lib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(190, 190, 190))
        );

        getContentPane().add(jPDatoConsultadoLibro);
        jPDatoConsultadoLibro.setBounds(10, 60, 360, 120);

        jLabelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 40, 380, 150);

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
        getContentPane().add(jButtonMinimizar1);
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
        getContentPane().add(jButtonSalirIcon1);
        jButtonSalirIcon1.setBounds(350, 0, 30, 30);

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
        getContentPane().add(JBIngreso1);
        JBIngreso1.setBounds(80, 200, 89, 32);

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
        getContentPane().add(JBCancela1);
        JBCancela1.setBounds(190, 200, 89, 32);

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);
        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 380, 240);

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

    private void jTFDato_LibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDato_LibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDato_LibActionPerformed

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
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_JBCancela1ActionPerformed

    public void limpiarCampos() {
        this.jTFDato_Lib.setText("");
        this.jTFCodigo_Lib.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatoConsultadoLibro;
    private javax.swing.JPanel jPFondo;
    public static javax.swing.JTextField jTFCodigo_Lib;
    public static javax.swing.JTextField jTFDato_Lib;
    // End of variables declaration//GEN-END:variables
}
