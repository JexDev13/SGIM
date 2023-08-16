package GUI.Administrador.Gestion_Sistema;

import Negocio.Imagenes;
import javax.swing.ImageIcon;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFRecuperarContraseña extends javax.swing.JFrame {

    private int x;
    private int y;
    
    Imagenes imagen=new Imagenes();
    ImageIcon ICONCANCELAR=imagen.getICONERROR();
    
    public JFRecuperarContraseña() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jButtonMinimizar1 = new javax.swing.JButton();
        jLabelTitulo1 = new javax.swing.JLabel();
        jPContenido = new javax.swing.JPanel();
        jLtitulo = new javax.swing.JLabel();
        jLtitulo1 = new javax.swing.JLabel();
        jLInstructivo = new javax.swing.JLabel();
        JTFUser = new javax.swing.JTextField();
        JBIngreso = new javax.swing.JButton();
        JBCancela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(362, 346));
        setUndecorated(true);
        setResizable(false);
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

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

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
        jButtonSalirIcon1.setBounds(332, 0, 30, 30);

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
        jButtonMinimizar1.setBounds(302, 0, 30, 30);

        jLabelTitulo1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setText("Recuperar usuario y contraseña");
        jPFondo.add(jLabelTitulo1);
        jLabelTitulo1.setBounds(6, 0, 245, 30);

        jPContenido.setBackground(new java.awt.Color(255, 255, 255));
        jPContenido.setLayout(null);

        jLtitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLtitulo.setText("o contraseña?");
        jPContenido.add(jLtitulo);
        jLtitulo.setBounds(10, 60, 320, 48);

        jLtitulo1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLtitulo1.setText("¿Olvidaste tu usuario ");
        jPContenido.add(jLtitulo1);
        jLtitulo1.setBounds(10, 20, 350, 48);

        jLInstructivo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLInstructivo.setText("Escribe tu email para recibir instruscciones para recuperar tus datos.");
        jPContenido.add(jLInstructivo);
        jLInstructivo.setBounds(0, 130, 360, 30);

        JTFUser.setText("email");
        JTFUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        JTFUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFUserFocusLost(evt);
            }
        });
        jPContenido.add(JTFUser);
        JTFUser.setBounds(70, 190, 240, 30);

        jPFondo.add(jPContenido);
        jPContenido.setBounds(0, 29, 362, 250);

        JBIngreso.setBackground(new java.awt.Color(255, 255, 254));
        JBIngreso.setForeground(new java.awt.Color(250, 183, 22));
        JBIngreso.setText("recuperar");
        JBIngreso.setBorder(null);
        JBIngreso.setBorderPainted(false);
        JBIngreso.setDefaultCapable(false);
        JBIngreso.setFocusPainted(false);
        JBIngreso.setHideActionText(true);
        JBIngreso.setPreferredSize(new java.awt.Dimension(89, 32));
        JBIngreso.setRequestFocusEnabled(false);
        JBIngreso.setRolloverEnabled(false);
        JBIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBIngresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBIngresoMouseExited(evt);
            }
        });
        JBIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngresoActionPerformed(evt);
            }
        });
        jPFondo.add(JBIngreso);
        JBIngreso.setBounds(60, 290, 110, 40);
        JBIngreso.getAccessibleContext().setAccessibleParent(this);

        JBCancela.setBackground(new java.awt.Color(255, 255, 254));
        JBCancela.setForeground(new java.awt.Color(250, 183, 22));
        JBCancela.setText("cancelar");
        JBCancela.setBorder(null);
        JBCancela.setBorderPainted(false);
        JBCancela.setFocusPainted(false);
        JBCancela.setPreferredSize(new java.awt.Dimension(89, 32));
        JBCancela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCancelaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCancelaMouseExited(evt);
            }
        });
        JBCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelaActionPerformed(evt);
            }
        });
        jPFondo.add(JBCancela);
        JBCancela.setBounds(190, 290, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

    private void JTFUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFUserFocusGained
        if (JTFUser.getText().equalsIgnoreCase("email")) {
            JTFUser.setText("");
        }
    }//GEN-LAST:event_JTFUserFocusGained

    private void JTFUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFUserFocusLost
        if (JTFUser.getText().isEmpty() || JTFUser.getText().isBlank()) {
            this.JTFUser.setText("email");
        }
    }//GEN-LAST:event_JTFUserFocusLost

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void JBCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelaActionPerformed
        dispose();
    }//GEN-LAST:event_JBCancelaActionPerformed

    private void JBCancelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancelaMouseExited
        this.JBCancela.setText("cancelar");
    }//GEN-LAST:event_JBCancelaMouseExited

    private void JBCancelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancelaMouseEntered
        this.JBCancela.setText("CANCELAR");
    }//GEN-LAST:event_JBCancelaMouseEntered

    private void JBIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngresoActionPerformed

    }//GEN-LAST:event_JBIngresoActionPerformed

    private void JBIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngresoMouseExited
        this.JBIngreso.setText("recuperar");
    }//GEN-LAST:event_JBIngresoMouseExited

    private void JBIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngresoMouseEntered
        this.JBIngreso.setText("RECUPERAR");
    }//GEN-LAST:event_JBIngresoMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela;
    private javax.swing.JButton JBIngreso;
    private javax.swing.JTextField JTFUser;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JLabel jLInstructivo;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JLabel jLtitulo1;
    private javax.swing.JPanel jPContenido;
    private javax.swing.JPanel jPFondo;
    // End of variables declaration//GEN-END:variables
}
