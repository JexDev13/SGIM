package GUI.Administrador.Gestion_Sistema;

import static GUI.Administrador.Gestion_Sistema.JFAdmin_EliminarUsuario.jTFApellidos;
import static GUI.Administrador.Gestion_Sistema.JFAdmin_EliminarUsuario.jTFBuscar_EliminarUsu;
import static GUI.Administrador.Gestion_Sistema.JFAdmin_EliminarUsuario.jTFCedula_elim;
import static GUI.Administrador.Gestion_Sistema.JFAdmin_EliminarUsuario.jTFCorreo;
import static GUI.Administrador.Gestion_Sistema.JFAdmin_EliminarUsuario.jTFNombres;
import static GUI.Administrador.Gestion_Sistema.JFAdmin_EliminarUsuario.jTFRol;
import static GUI.Administrador.Gestion_Sistema.JFAdmin_EliminarUsuario.jTFUsuario;
import Negocio.Conexion;
import Negocio.Diseño;
import Negocio.Validaciones;
import java.awt.Color;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_ActualizarUsuario extends javax.swing.JFrame {

    private int x;
    private int y;
    Validaciones val = new Validaciones();
    String SQL;
    Conexion con = new Conexion();
    String tabla = "UsersAct";
    String titulo = null;
    String mensaje = null;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();

    public JFAdmin_ActualizarUsuario() {
        initComponents();
        setLocationRelativeTo(this);
        this.JBGenContra.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPEncabezado = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jPContenido = new javax.swing.JPanel();
        jPDatoUsuario = new javax.swing.JPanel();
        jLNumCedula = new javax.swing.JLabel();
        jTFBuscar_Usuario = new javax.swing.JTextField();
        jPDatosUsuario = new javax.swing.JPanel();
        jTFCedula_Act = new javax.swing.JTextField();
        jLNumCedulaDatosAct = new javax.swing.JLabel();
        jChBContraseña = new javax.swing.JCheckBox();
        JBGenContra = new javax.swing.JButton();
        jTFContrGen = new javax.swing.JTextField();
        jLNumCedulaDatosAct1 = new javax.swing.JLabel();
        jLNumCedulaDatosAct2 = new javax.swing.JLabel();
        jTFCUsuarioAct = new javax.swing.JTextField();
        jLNumCedulaDatosAct3 = new javax.swing.JLabel();
        jTFCUsuarioAct1 = new javax.swing.JTextField();
        jPie = new javax.swing.JPanel();
        JBCancelar = new javax.swing.JButton();
        JBAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(308, 392));
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPEncabezado.setBackground(new java.awt.Color(250, 183, 22));
        jPEncabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Actualizar usuario");
        jPEncabezado.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 30));

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
        jPEncabezado.add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 30, 30));

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
        jPEncabezado.add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 30));

        getContentPane().add(jPEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPContenido.setBackground(new java.awt.Color(255, 255, 255));
        jPContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPDatoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPDatoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del usuario"));

        jLNumCedula.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLNumCedula.setText("N° Cédula");

        jTFBuscar_Usuario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBuscar_UsuarioActionPerformed(evt);
            }
        });
        jTFBuscar_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_UsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_UsuarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPDatoUsuarioLayout = new javax.swing.GroupLayout(jPDatoUsuario);
        jPDatoUsuario.setLayout(jPDatoUsuarioLayout);
        jPDatoUsuarioLayout.setHorizontalGroup(
            jPDatoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNumCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jTFBuscar_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPDatoUsuarioLayout.setVerticalGroup(
            jPDatoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatoUsuarioLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPDatoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNumCedula))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPContenido.add(jPDatoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, -1));

        jPDatosUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jTFCedula_Act.setEditable(false);
        jTFCedula_Act.setBackground(new java.awt.Color(255, 255, 255));
        jTFCedula_Act.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCedula_Act.setEnabled(false);

        jLNumCedulaDatosAct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLNumCedulaDatosAct.setText("N° Cédula");

        jChBContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jChBContraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jChBContraseña.setText("Contraseña");
        jChBContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBContraseñaActionPerformed(evt);
            }
        });

        JBGenContra.setBackground(new java.awt.Color(250, 183, 22));
        JBGenContra.setForeground(new java.awt.Color(255, 255, 255));
        JBGenContra.setText("Generar nueva contraseña");
        JBGenContra.setBorder(null);
        JBGenContra.setBorderPainted(false);
        JBGenContra.setDefaultCapable(false);
        JBGenContra.setFocusPainted(false);
        JBGenContra.setHideActionText(true);
        JBGenContra.setPreferredSize(new java.awt.Dimension(89, 32));
        JBGenContra.setRequestFocusEnabled(false);
        JBGenContra.setRolloverEnabled(false);
        JBGenContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBGenContraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBGenContraMouseExited(evt);
            }
        });
        JBGenContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGenContraActionPerformed(evt);
            }
        });

        jTFContrGen.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFContrGen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFContrGenKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFContrGenKeyTyped(evt);
            }
        });

        jLNumCedulaDatosAct1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLNumCedulaDatosAct1.setText("Contr. generada");

        jLNumCedulaDatosAct2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLNumCedulaDatosAct2.setText("Usuario");

        jTFCUsuarioAct.setEditable(false);
        jTFCUsuarioAct.setBackground(new java.awt.Color(255, 255, 255));
        jTFCUsuarioAct.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCUsuarioAct.setEnabled(false);

        jLNumCedulaDatosAct3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLNumCedulaDatosAct3.setText("Rol");

        jTFCUsuarioAct1.setEditable(false);
        jTFCUsuarioAct1.setBackground(new java.awt.Color(255, 255, 255));
        jTFCUsuarioAct1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCUsuarioAct1.setEnabled(false);

        javax.swing.GroupLayout jPDatosUsuarioLayout = new javax.swing.GroupLayout(jPDatosUsuario);
        jPDatosUsuario.setLayout(jPDatosUsuarioLayout);
        jPDatosUsuarioLayout.setHorizontalGroup(
            jPDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosUsuarioLayout.createSequentialGroup()
                        .addGroup(jPDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jChBContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addGroup(jPDatosUsuarioLayout.createSequentialGroup()
                                .addComponent(jLNumCedulaDatosAct3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosUsuarioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBGenContra, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDatosUsuarioLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTFCUsuarioAct1))))
                    .addGroup(jPDatosUsuarioLayout.createSequentialGroup()
                        .addGroup(jPDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNumCedulaDatosAct2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNumCedulaDatosAct, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFCUsuarioAct, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jTFCedula_Act))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPDatosUsuarioLayout.createSequentialGroup()
                        .addComponent(jLNumCedulaDatosAct1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFContrGen)))
                .addContainerGap())
        );
        jPDatosUsuarioLayout.setVerticalGroup(
            jPDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCedula_Act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNumCedulaDatosAct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNumCedulaDatosAct2)
                    .addComponent(jTFCUsuarioAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNumCedulaDatosAct3)
                    .addComponent(jTFCUsuarioAct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBGenContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNumCedulaDatosAct1)
                    .addComponent(jTFContrGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPContenido.add(jPDatosUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 290, -1));

        getContentPane().add(jPContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 310, 300));

        jPie.setBackground(new java.awt.Color(250, 183, 22));
        jPie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBCancelar.setBackground(new java.awt.Color(255, 255, 254));
        JBCancelar.setForeground(new java.awt.Color(250, 183, 22));
        JBCancelar.setText("cancelar");
        JBCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 163, 0)));
        JBCancelar.setFocusPainted(false);
        JBCancelar.setPreferredSize(new java.awt.Dimension(89, 32));
        JBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCancelarMouseExited(evt);
            }
        });
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        jPie.add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        JBAceptar.setBackground(new java.awt.Color(255, 255, 254));
        JBAceptar.setForeground(new java.awt.Color(250, 183, 22));
        JBAceptar.setText("aceptar");
        JBAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 163, 0)));
        JBAceptar.setDefaultCapable(false);
        JBAceptar.setFocusPainted(false);
        JBAceptar.setHideActionText(true);
        JBAceptar.setPreferredSize(new java.awt.Dimension(89, 32));
        JBAceptar.setRequestFocusEnabled(false);
        JBAceptar.setRolloverEnabled(false);
        JBAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBAceptarMouseExited(evt);
            }
        });
        JBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAceptarActionPerformed(evt);
            }
        });
        jPie.add(JBAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        getContentPane().add(jPie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 310, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBuscar_UsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_UsuarioKeyReleased
        String parametroBusqueda = jTFBuscar_Usuario.getText();
        if (parametroBusqueda.length() == 10) {
            this.SQL = "SELECT u.Cedula, u.Nombre_Usuario, u.Rol FROM Users u WHERE u.Cedula LIKE '%" + parametroBusqueda + "%';";
            con.despliegueFields(SQL, "Admins", jTFCedula_Act, jTFCUsuarioAct, jTFCUsuarioAct1, null,
                    null, null, null, null, "acutalizar");
        } else {
            borrarCampos();
        }
    }//GEN-LAST:event_jTFBuscar_UsuarioKeyReleased

    private void jTFBuscar_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_UsuarioKeyTyped

    }//GEN-LAST:event_jTFBuscar_UsuarioKeyTyped

    public void limpiarCampos() {
        this.jTFCedula_Act.setText("");
    }

    private void JBAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBAceptarMouseEntered
        this.JBAceptar.setText("ACEPTAR");
    }//GEN-LAST:event_JBAceptarMouseEntered

    private void JBAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBAceptarMouseExited
        this.JBAceptar.setText("aceptar");
    }//GEN-LAST:event_JBAceptarMouseExited

    private void JBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAceptarActionPerformed
        String parametroBusqueda = this.jTFBuscar_Usuario.getText();
        if (parametroBusqueda.isEmpty()) {
            titulo = "ADVERTENCIA";
            mensaje = "Todos los campos deben estar llenos";
            emitirMensaje(mensaje, titulo);
        } else {
            if (!val.validadorDeCedula(parametroBusqueda)) {
                titulo = "ERROR DE FORMATO";
                mensaje = "La cédula ingresada no es válida en el territorio Ecuatoriano";
                emitirMensaje(mensaje, titulo);
            } else {
                this.SQL = "Select count(*) from Users where Cedula like '%" + parametroBusqueda + "%'";
                if (con.busquedaCod("Personas", SQL, "count(*)") < 1) {
                    getToolkit().beep();
                    titulo = "ADVERTENCIA";
                    mensaje = "El usuario al que hace referencia no existe";
                    emitirMensaje(mensaje, titulo);
                } else {
                    int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea actualizar la contraseña del usuario?" + "\n     -Esta accion no podrá ser revertida", "Actualizar contraseña", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ICONCANCELAR);
                    if (seleccion == 0) {
                        this.SQL = "UPDATE Users SET Contrasena = '" + jTFContrGen.getText() + "' WHERE Cedula = '" + jTFCedula_Act.getText() + "';";
                        if (con.actualizarEliminarTablas(SQL) == true) {
                            titulo = "RESULTADO";
                            mensaje = "Contraseña cambiada con exito";
                            dispose();
                            emitirMensaje(mensaje, titulo);
                            limpiarCampos();
                            jTFBuscar_Usuario.setText("");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_JBAceptarActionPerformed

    private void JBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancelarMouseEntered
        this.JBCancelar.setText("CANCELAR");
    }//GEN-LAST:event_JBCancelarMouseEntered

    private void JBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancelarMouseExited
        this.JBCancelar.setText("cancelar");
    }//GEN-LAST:event_JBCancelarMouseExited

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        String tituo = "¿Cancelar ingreso?";
        String mensaje = "Si cancela los datos ingresados no serán guardados";
        emitirMensaje(mensaje, tituo);
        dispose();
        borrarCampos();
        jTFBuscar_Usuario.setText("");
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jChBContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChBContraseñaActionPerformed

    private void JBGenContraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBGenContraMouseEntered
        if (this.jChBContraseña.isSelected()) {
            this.JBGenContra.setEnabled(true);
            this.JBGenContra.setForeground(new Color(255, 255, 255));
            this.JBGenContra.setBackground(new Color(255, 232, 158));
            this.JBGenContra.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_JBGenContraMouseEntered

    private void JBGenContraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBGenContraMouseExited
        if (this.jChBContraseña.isSelected()) {
            this.JBGenContra.setBackground(new Color(250, 183, 22));
            this.JBGenContra.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_JBGenContraMouseExited

    private void JBGenContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGenContraActionPerformed
        if (this.jChBContraseña.isSelected()) {
            String contrasena = val.generarContrasena();
            jTFContrGen.setText(contrasena);

        }
    }//GEN-LAST:event_JBGenContraActionPerformed

    private void jTFContrGenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFContrGenKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFContrGenKeyReleased

    private void jTFContrGenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFContrGenKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFContrGenKeyTyped

    private void jTFBuscar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBuscar_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBuscar_UsuarioActionPerformed

    private void borrarCampos() {
        jTFCedula_Act.setText("");
        jTFCUsuarioAct.setText("");
        jTFCUsuarioAct1.setText("");
        jTFContrGen.setText("");
    }

    private void emitirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAceptar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBGenContra;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jChBContraseña;
    private javax.swing.JLabel jLNumCedula;
    private javax.swing.JLabel jLNumCedulaDatosAct;
    private javax.swing.JLabel jLNumCedulaDatosAct1;
    private javax.swing.JLabel jLNumCedulaDatosAct2;
    private javax.swing.JLabel jLNumCedulaDatosAct3;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPContenido;
    private javax.swing.JPanel jPDatoUsuario;
    private javax.swing.JPanel jPDatosUsuario;
    private javax.swing.JPanel jPEncabezado;
    private javax.swing.JPanel jPie;
    public static javax.swing.JTextField jTFBuscar_Usuario;
    public static javax.swing.JTextField jTFCUsuarioAct;
    public static javax.swing.JTextField jTFCUsuarioAct1;
    public static javax.swing.JTextField jTFCedula_Act;
    public static javax.swing.JTextField jTFContrGen;
    // End of variables declaration//GEN-END:variables
}
