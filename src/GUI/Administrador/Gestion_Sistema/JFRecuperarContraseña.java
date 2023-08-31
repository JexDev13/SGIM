package GUI.Administrador.Gestion_Sistema;

import Negocio.Conexion;
import Negocio.Diseño;
import Negocio.Validaciones;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFRecuperarContraseña extends javax.swing.JFrame {

    private int x;
    private int y;

    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();
    Conexion conect = new Conexion();
    Validaciones val = new Validaciones();

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
        jLtitulo1 = new javax.swing.JLabel();
        JTFUser = new javax.swing.JTextField();
        jLInstructivo1 = new javax.swing.JLabel();
        jTextAreaTexto = new javax.swing.JTextArea();
        JBCancela = new javax.swing.JButton();
        JBRecCont = new javax.swing.JButton();
        JBRecUsu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(506, 346));
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
        jButtonSalirIcon1.setBounds(480, 0, 30, 30);

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
        jButtonMinimizar1.setBounds(450, 0, 30, 30);

        jLabelTitulo1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setText("Recuperar usuario y contraseña");
        jPFondo.add(jLabelTitulo1);
        jLabelTitulo1.setBounds(6, 0, 245, 30);

        jPContenido.setBackground(new java.awt.Color(255, 255, 255));
        jPContenido.setLayout(null);

        jLtitulo1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLtitulo1.setText("¿Olvidaste tu usuario o contraseña? ");
        jLtitulo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPContenido.add(jLtitulo1);
        jLtitulo1.setBounds(10, 10, 440, 36);

        JTFUser.setText("cédula");
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
        JTFUser.setBounds(130, 90, 270, 30);

        jLInstructivo1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLInstructivo1.setText("Escribe el número de cédula con el que te registraste.");
        jPContenido.add(jLInstructivo1);
        jLInstructivo1.setBounds(10, 50, 290, 30);

        jTextAreaTexto.setColumns(20);
        jTextAreaTexto.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jTextAreaTexto.setRows(5);
        jTextAreaTexto.setText("Cuando solicitas recuperación de usuario o contraseña \nel sistema te enviara al correo asociado la \ninformación de recuperación de tus datos, por tú \nseguridad te recomendamos cambiar tu contraseña \ncada vez que realices una recuperación.");
        jTextAreaTexto.setBorder(null);
        jPContenido.add(jTextAreaTexto);
        jTextAreaTexto.setBounds(10, 130, 490, 110);

        jPFondo.add(jPContenido);
        jPContenido.setBounds(0, 29, 510, 250);

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
        JBCancela.setBounds(340, 290, 150, 40);

        JBRecCont.setBackground(new java.awt.Color(255, 255, 254));
        JBRecCont.setForeground(new java.awt.Color(250, 183, 22));
        JBRecCont.setText("Recuperar contraseña");
        JBRecCont.setBorder(null);
        JBRecCont.setBorderPainted(false);
        JBRecCont.setDefaultCapable(false);
        JBRecCont.setFocusPainted(false);
        JBRecCont.setHideActionText(true);
        JBRecCont.setPreferredSize(new java.awt.Dimension(89, 32));
        JBRecCont.setRequestFocusEnabled(false);
        JBRecCont.setRolloverEnabled(false);
        JBRecCont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBRecContMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBRecContMouseExited(evt);
            }
        });
        JBRecCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRecContActionPerformed(evt);
            }
        });
        jPFondo.add(JBRecCont);
        JBRecCont.setBounds(180, 290, 150, 40);

        JBRecUsu.setBackground(new java.awt.Color(255, 255, 254));
        JBRecUsu.setForeground(new java.awt.Color(250, 183, 22));
        JBRecUsu.setText("Recuperar usuario");
        JBRecUsu.setBorder(null);
        JBRecUsu.setBorderPainted(false);
        JBRecUsu.setDefaultCapable(false);
        JBRecUsu.setFocusPainted(false);
        JBRecUsu.setHideActionText(true);
        JBRecUsu.setPreferredSize(new java.awt.Dimension(89, 32));
        JBRecUsu.setRequestFocusEnabled(false);
        JBRecUsu.setRolloverEnabled(false);
        JBRecUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBRecUsuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBRecUsuMouseExited(evt);
            }
        });
        JBRecUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRecUsuActionPerformed(evt);
            }
        });
        jPFondo.add(JBRecUsu);
        JBRecUsu.setBounds(20, 290, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
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
        if (JTFUser.getText().equalsIgnoreCase("cédula")) {
            JTFUser.setText("");
        }
    }//GEN-LAST:event_JTFUserFocusGained

    private void JTFUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFUserFocusLost
        if (JTFUser.getText().isEmpty() || JTFUser.getText().isBlank()) {
            this.JTFUser.setText("cédula");
        }
    }//GEN-LAST:event_JTFUserFocusLost

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void JBCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelaActionPerformed
        String mensaje = "Si cancela ningún dato sera cambiado";
        emitirMensaje(mensaje);
        dispose();
    }//GEN-LAST:event_JBCancelaActionPerformed

    private void JBCancelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancelaMouseExited
        this.JBCancela.setText("cancelar");
    }//GEN-LAST:event_JBCancelaMouseExited

    private void JBCancelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancelaMouseEntered
        this.JBCancela.setText("CANCELAR");
    }//GEN-LAST:event_JBCancelaMouseEntered

    private void JBRecContMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBRecContMouseEntered
        this.JBRecCont.setText("RECUPERAR CONTRASEÑA");
    }//GEN-LAST:event_JBRecContMouseEntered

    private void JBRecContMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBRecContMouseExited
        this.JBRecCont.setText("Recuperar contraseña");
    }//GEN-LAST:event_JBRecContMouseExited

    private void JBRecContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRecContActionPerformed
        String tipo = "Contrasena";
        String cedula = this.JTFUser.getText();
        if (val.validadorDeCedula(cedula)) {
            ejecutarRecuperacionEnHilo(tipo, cedula);
            dispose();
        } else {
            String mensaje = "La cédula ingresada no es válida en el territorio Ecuatoriano";
            emitirMensaje(mensaje);
        }
    }//GEN-LAST:event_JBRecContActionPerformed

    private void JBRecUsuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBRecUsuMouseEntered
        this.JBRecUsu.setText("RECUPERAR USUARIO");
    }//GEN-LAST:event_JBRecUsuMouseEntered

    private void JBRecUsuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBRecUsuMouseExited
        this.JBRecUsu.setText("Recuperar usuario");
    }//GEN-LAST:event_JBRecUsuMouseExited

    private void JBRecUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRecUsuActionPerformed
        String tipo = "Nombre_Usuario";
        String cedula = this.JTFUser.getText();
        if (val.validadorDeCedula(cedula)) {
            ejecutarRecuperacionEnHilo(tipo, cedula);
            dispose();
        } else {
            String mensaje = "La cédula ingresada no es válida en el territorio Ecuatoriano";
            emitirMensaje(mensaje);
        }
    }//GEN-LAST:event_JBRecUsuActionPerformed

    private void ejecutarRecuperacionEnHilo(String tipo, String cedula) {
        Thread thread = new Thread(() -> {
            String mensaje = "El usuario no existe, correo no enviado";
            boolean respuesta = conect.recuperarDatos(tipo, cedula);
            if (respuesta) {
                mensaje = tipo.equals("Contrasena") ? "Contraseña enviada al correo" : "Usuario enviado al correo";
            }
            emitirMensaje(mensaje+"\nRevisa tu bandeja de entrada y sigue las instrucciones");
        });

        thread.start();
    }

    private void emitirMensaje(String mensaje) {
        getToolkit().beep();
        String titulo = "Recuperar usuario y contraseña";
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
        this.JTFUser.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela;
    private javax.swing.JButton JBRecCont;
    private javax.swing.JButton JBRecUsu;
    private javax.swing.JTextField JTFUser;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JLabel jLInstructivo1;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLtitulo1;
    private javax.swing.JPanel jPContenido;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JTextArea jTextAreaTexto;
    // End of variables declaration//GEN-END:variables
}
