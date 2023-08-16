package GUI.Administrador.General;

import GUI.Administrador.Gestion_Sistema.JFRecuperarContraseña;
import Negocio.Conexion;
import Negocio.Imagenes;
import Negocio.Diseño;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFLogin extends javax.swing.JFrame {

    Imagenes img = new Imagenes();
    ImageIcon ICONERROR = img.getICONERROR();
    Diseño gui = new Diseño();
    Conexion conectar = new Conexion();
    JFRecuperarContraseña recuperar = new JFRecuperarContraseña();

    public JFLogin() {
        initComponents();
        this.JPFPass.setText("Contraseña");
        this.JPFPass.setEchoChar((char) 0);
        this.JBIngreso.requestFocus();
        setIconImage(getIconImage());
        gui.jComboUsers(this.jCBUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBSalir = new javax.swing.JButton();
        jPLogin = new javax.swing.JPanel();
        jBVerPass = new javax.swing.JButton();
        JBIngreso = new javax.swing.JButton();
        jLPass = new javax.swing.JLabel();
        JPFPass = new javax.swing.JPasswordField();
        jLUser = new javax.swing.JLabel();
        JTFUser = new javax.swing.JTextField();
        jCBUsuario = new javax.swing.JComboBox<>();
        jLUser1 = new javax.swing.JLabel();
        jBOlvidarContra = new javax.swing.JButton();
        jPEncabezado = new javax.swing.JPanel();
        jLImagen = new javax.swing.JLabel();
        jLEncabezado = new javax.swing.JLabel();
        jLBienvenida = new javax.swing.JLabel();
        jLCreditos = new javax.swing.JLabel();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(155, 186, 31));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBSalir.setForeground(new java.awt.Color(255, 183, 183));
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir opaco 32.png"))); // NOI18N
        jBSalir.setText("salir");
        jBSalir.setBorderPainted(false);
        jBSalir.setContentAreaFilled(false);
        jBSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir 32.png"))); // NOI18N
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSalirMouseExited(evt);
            }
        });
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, -1, 30));

        jPLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0))));

        jBVerPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver cerrado 24.png"))); // NOI18N
        jBVerPass.setBorderPainted(false);
        jBVerPass.setContentAreaFilled(false);
        jBVerPass.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver abierto 24.png"))); // NOI18N
        jBVerPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBVerPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBVerPassMouseReleased(evt);
            }
        });

        JBIngreso.setBackground(new java.awt.Color(250, 183, 22));
        JBIngreso.setForeground(new java.awt.Color(255, 255, 255));
        JBIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login 32 opaco.png"))); // NOI18N
        JBIngreso.setText("log in");
        JBIngreso.setBorderPainted(false);
        JBIngreso.setFocusPainted(false);
        JBIngreso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login 32.png"))); // NOI18N
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

        jLPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña 32.png"))); // NOI18N

        JPFPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        JPFPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JPFPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JPFPassFocusLost(evt);
            }
        });
        JPFPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JPFPassKeyTyped(evt);
            }
        });

        jLUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario 32.png"))); // NOI18N

        JTFUser.setText("Usuario");
        JTFUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        JTFUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFUserFocusLost(evt);
            }
        });

        jCBUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perfiles de Usuario", "Administrativo", "Profesor", "Estudiante" }));
        jCBUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBUsuario.setPreferredSize(new java.awt.Dimension(72, 25));
        jCBUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBUsuarioActionPerformed(evt);
            }
        });

        jLUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarios_32.png"))); // NOI18N

        jBOlvidarContra.setForeground(java.awt.Color.gray);
        jBOlvidarContra.setText("¿Olvidaste el usuario o contraseña?");
        jBOlvidarContra.setBorderPainted(false);
        jBOlvidarContra.setContentAreaFilled(false);
        jBOlvidarContra.setFocusPainted(false);
        jBOlvidarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBOlvidarContraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBOlvidarContraMouseExited(evt);
            }
        });
        jBOlvidarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOlvidarContraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPLoginLayout = new javax.swing.GroupLayout(jPLogin);
        jPLogin.setLayout(jPLoginLayout);
        jPLoginLayout.setHorizontalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLoginLayout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPLoginLayout.createSequentialGroup()
                        .addComponent(jLPass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPFPass, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBVerPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPLoginLayout.createSequentialGroup()
                        .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLUser)
                            .addComponent(jLUser1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFUser, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBOlvidarContra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPLoginLayout.setVerticalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLUser1)
                    .addComponent(jCBUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUser))
                .addGap(18, 18, 18)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JPFPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPass)
                    .addComponent(jBVerPass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(JBIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBOlvidarContra)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 270, 270));

        jPEncabezado.setBackground(new java.awt.Color(250, 226, 170));
        jPEncabezado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 2, new java.awt.Color(0, 0, 0)));
        jPEncabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_inicio_90.png"))); // NOI18N
        jPEncabezado.add(jLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 90));

        jLEncabezado.setBackground(new java.awt.Color(255, 255, 255));
        jLEncabezado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLEncabezado.setForeground(new java.awt.Color(194, 141, 14));
        jLEncabezado.setText("Este gestor está listo para servirte.");
        jPEncabezado.add(jLEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 40));

        jLBienvenida.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLBienvenida.setForeground(new java.awt.Color(194, 141, 14));
        jLBienvenida.setText("¡Bienvenido!");
        jPEncabezado.add(jLBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 50));

        getContentPane().add(jPEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 270, -1));

        jLCreditos.setForeground(java.awt.Color.gray);
        jLCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCreditos.setText("©G2 SoftwareSolutions");
        jLCreditos.setToolTipText("");
        jLCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCreditosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCreditosMouseExited(evt);
            }
        });
        getContentPane().add(jLCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_login.png"))); // NOI18N
        getContentPane().add(jLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngresoActionPerformed
        String Perfil = this.jCBUsuario.getSelectedItem().toString();
        String User = this.JTFUser.getText();
        String Pass = new String(JPFPass.getPassword());
        int index = this.jCBUsuario.getSelectedIndex();
        String mensaje = "\t\tACCESO DENEGADO \n -Usuario, perfil o contraseña incorrectos";
        boolean login = conectar.logIn(Perfil, User, Pass);
        switch (index) {
            case 0:
                mensaje = "\t\tACCESO DENEGADO \n -Escoja un perfil de usuario primero";
                borrarLogin(mensaje);
                break;
            case 1:
                if (login == true) {
                    //INGRESO AL PERFIL ADMINISTRADOR
                    JFAdminMenu admin = new JFAdminMenu();
                    admin.setVisible(true);
                    dispose();
                    System.out.println("Administrativo");
                } else {
                    borrarLogin(mensaje);
                }
                break;
            case 2:
                if (login == true) {
                    //INGRESO AL PERFIL PROFESOR
                    System.out.println("Profesor");
                    //Futura interfaz
                } else {
                    borrarLogin(mensaje);
                }
                break;
            case 3:
                if (login == true) {
                    //INGRESO AL PERFIL ESTUDIANTE
                    System.out.println("Estudiante");
                    //Futura interfaz
                } else {
                    borrarLogin(mensaje);
                }
                break;
        }
    }//GEN-LAST:event_JBIngresoActionPerformed

    private void JTFUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFUserFocusGained
        if (JTFUser.getText().equalsIgnoreCase("Usuario")) {
            JTFUser.setText("");
        }
    }//GEN-LAST:event_JTFUserFocusGained

    private void JTFUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFUserFocusLost
        if (JTFUser.getText().isEmpty() || JTFUser.getText().isBlank()) {
            this.JTFUser.setText("Usuario");
        }
    }//GEN-LAST:event_JTFUserFocusLost

    private void JPFPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JPFPassFocusGained
        if (JPFPass.getText().equalsIgnoreCase("Contraseña")) {
            JPFPass.setText("");
            this.JPFPass.setEchoChar('•');
        }
    }//GEN-LAST:event_JPFPassFocusGained

    private void JPFPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JPFPassFocusLost
        if (JPFPass.getText().isEmpty() || JPFPass.getText().isBlank()) {
            this.JPFPass.setEchoChar((char) 0);
            this.JPFPass.setText("Contraseña");
        }
    }//GEN-LAST:event_JPFPassFocusLost

    private void jBVerPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVerPassMousePressed
        this.JPFPass.setEchoChar((char) 0);
    }//GEN-LAST:event_jBVerPassMousePressed

    private void jBVerPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVerPassMouseReleased

        if (JPFPass.getText().equalsIgnoreCase("Contraseña")) {
            this.JPFPass.setText("Contraseña");
        } else {

            this.JPFPass.setEchoChar('•');
        }
    }//GEN-LAST:event_jBVerPassMouseReleased

    private void JBIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngresoMouseEntered
        this.JBIngreso.setText("LOG IN");
    }//GEN-LAST:event_JBIngresoMouseEntered

    private void JBIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngresoMouseExited
        this.JBIngreso.setText("log in");
    }//GEN-LAST:event_JBIngresoMouseExited

    private void JPFPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPFPassKeyTyped
        char variable = evt.getKeyChar();
        if (variable == KeyEvent.VK_ENTER) {
            this.JBIngreso.doClick();
        }
    }//GEN-LAST:event_JPFPassKeyTyped

    private void jBSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseEntered
        this.jBSalir.setForeground(new Color(158, 50, 50));
    }//GEN-LAST:event_jBSalirMouseEntered

    private void jBSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseExited
        this.jBSalir.setForeground(new Color(255, 183, 183));
    }//GEN-LAST:event_jBSalirMouseExited

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBUsuarioActionPerformed

    private void jLCreditosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCreditosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCreditosMouseEntered

    private void jLCreditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCreditosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCreditosMouseExited

    private void jBOlvidarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOlvidarContraActionPerformed
        recuperar.setVisible(true);
    }//GEN-LAST:event_jBOlvidarContraActionPerformed

    private void jBOlvidarContraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBOlvidarContraMouseEntered
        this.jBOlvidarContra.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jBOlvidarContraMouseEntered

    private void jBOlvidarContraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBOlvidarContraMouseExited
        this.jBOlvidarContra.setForeground(new Color(128, 128, 128));
    }//GEN-LAST:event_jBOlvidarContraMouseExited

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono_app.png"));
        return retValue;
    }

    private void borrarLogin(String mensaje) {
        String titulo = "ERROR AL INICIAR SESION";
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONERROR);
        this.JPFPass.setEchoChar((char) 0);
        this.JTFUser.setText("Usuario");
        this.JPFPass.setText("Contraseña");
        this.JTFUser.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBIngreso;
    private javax.swing.JPasswordField JPFPass;
    private javax.swing.JTextField JTFUser;
    private javax.swing.JButton jBOlvidarContra;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBVerPass;
    private javax.swing.JComboBox<String> jCBUsuario;
    private javax.swing.JLabel jLBienvenida;
    private javax.swing.JLabel jLCreditos;
    private javax.swing.JLabel jLEncabezado;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jLImagen;
    private javax.swing.JLabel jLPass;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLUser1;
    private javax.swing.JPanel jPEncabezado;
    private javax.swing.JPanel jPLogin;
    // End of variables declaration//GEN-END:variables
}
