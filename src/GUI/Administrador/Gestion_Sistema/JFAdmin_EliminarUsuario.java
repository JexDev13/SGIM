package GUI.Administrador.Gestion_Sistema;

import Negocio.Conexion;
import Negocio.Diseño;
import Negocio.Validaciones;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_EliminarUsuario extends javax.swing.JFrame {

    private int x;
    private int y;
    String SQL;
    Conexion con = new Conexion();
    String tabla = "Personas";
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();
    Validaciones val = new Validaciones();
    String titulo = null;
    String mensaje = null;

    public JFAdmin_EliminarUsuario() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEncabezado = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jPanelContenido = new javax.swing.JPanel();
        jPanelDatoAdmin = new javax.swing.JPanel();
        jTFBuscar_EliminarUsu = new javax.swing.JTextField();
        jLCedula = new javax.swing.JLabel();
        jPDatosAdminEliminar = new javax.swing.JPanel();
        jTFCedula_elim = new javax.swing.JTextField();
        jLUser = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jLRol = new javax.swing.JLabel();
        jTFRol = new javax.swing.JTextField();
        jLCorreo = new javax.swing.JLabel();
        jTFCorreo = new javax.swing.JTextField();
        jLNCedulaAdmin = new javax.swing.JLabel();
        jLNombres = new javax.swing.JLabel();
        jTFNombres = new javax.swing.JTextField();
        jLApellidos = new javax.swing.JLabel();
        jTFApellidos = new javax.swing.JTextField();
        jPanelPie = new javax.swing.JPanel();
        JBCancelar = new javax.swing.JButton();
        JBAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(366, 419));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(366, 419));
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelEncabezado.setBackground(new java.awt.Color(250, 183, 22));
        jPanelEncabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Eliminar administrador");
        jPanelEncabezado.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 30));

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
        jPanelEncabezado.add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 30));

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
        jPanelEncabezado.add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, 30));

        getContentPane().add(jPanelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));

        jPanelContenido.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatoAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del usuario"));

        jTFBuscar_EliminarUsu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_EliminarUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarUsuKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarUsuKeyTyped(evt);
            }
        });

        jLCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCedula.setText("N°Cédula:");

        javax.swing.GroupLayout jPanelDatoAdminLayout = new javax.swing.GroupLayout(jPanelDatoAdmin);
        jPanelDatoAdmin.setLayout(jPanelDatoAdminLayout);
        jPanelDatoAdminLayout.setHorizontalGroup(
            jPanelDatoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jTFBuscar_EliminarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelDatoAdminLayout.setVerticalGroup(
            jPanelDatoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_EliminarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCedula))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelContenido.add(jPanelDatoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, -1));
        jPanelDatoAdmin.getAccessibleContext().setAccessibleName("Datos del estudiante");

        jPDatosAdminEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosAdminEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar"));

        jTFCedula_elim.setEditable(false);
        jTFCedula_elim.setBackground(new java.awt.Color(255, 255, 255));
        jTFCedula_elim.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLUser.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLUser.setText("Usuario");

        jTFUsuario.setEditable(false);
        jTFUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTFUsuario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLRol.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLRol.setText("Rol");

        jTFRol.setEditable(false);
        jTFRol.setBackground(new java.awt.Color(255, 255, 255));
        jTFRol.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLCorreo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLCorreo.setText("Correo electrónico");

        jTFCorreo.setEditable(false);
        jTFCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jTFCorreo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLNCedulaAdmin.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLNCedulaAdmin.setText("N° Cédula");

        jLNombres.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLNombres.setText("Nombres");

        jTFNombres.setEditable(false);
        jTFNombres.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombres.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLApellidos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLApellidos.setText("Apellidos");

        jTFApellidos.setEditable(false);
        jTFApellidos.setBackground(new java.awt.Color(255, 255, 255));
        jTFApellidos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPDatosAdminEliminarLayout = new javax.swing.GroupLayout(jPDatosAdminEliminar);
        jPDatosAdminEliminar.setLayout(jPDatosAdminEliminarLayout);
        jPDatosAdminEliminarLayout.setHorizontalGroup(
            jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosAdminEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosAdminEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNCedulaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPDatosAdminEliminarLayout.createSequentialGroup()
                                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLUser)
                                    .addComponent(jLRol)
                                    .addComponent(jLNombres)
                                    .addComponent(jLCorreo))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPDatosAdminEliminarLayout.createSequentialGroup()
                        .addComponent(jLApellidos)
                        .addGap(88, 88, 88)))
                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jTFCorreo)
                    .addComponent(jTFRol)
                    .addComponent(jTFUsuario)
                    .addComponent(jTFNombres)
                    .addComponent(jTFCedula_elim))
                .addContainerGap())
        );
        jPDatosAdminEliminarLayout.setVerticalGroup(
            jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosAdminEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCedula_elim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNCedulaAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUser)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRol)
                    .addComponent(jTFRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCorreo)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelContenido.add(jPDatosAdminEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 350, 230));

        getContentPane().add(jPanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 370, 330));

        jPanelPie.setBackground(new java.awt.Color(250, 183, 22));
        jPanelPie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBCancelar.setBackground(new java.awt.Color(255, 255, 254));
        JBCancelar.setForeground(new java.awt.Color(250, 183, 22));
        JBCancelar.setText("cancelar");
        JBCancelar.setBorder(null);
        JBCancelar.setBorderPainted(false);
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
        jPanelPie.add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        JBAceptar.setBackground(new java.awt.Color(255, 255, 254));
        JBAceptar.setForeground(new java.awt.Color(250, 183, 22));
        JBAceptar.setText("aceptar");
        JBAceptar.setBorder(null);
        JBAceptar.setBorderPainted(false);
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
        jPanelPie.add(JBAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        getContentPane().add(jPanelPie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 370, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBuscar_EliminarUsuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarUsuKeyReleased
        String parametroBusqueda = this.jTFBuscar_EliminarUsu.getText();
        if (parametroBusqueda.length() == 10) {
            this.SQL = "SELECT u.Cedula, p.Nombres, p.Apellidos, u.Nombre_Usuario, u.Rol, p. Correo FROM "
                    + "Users u JOIN Personas p ON p.Cedula = u.Cedula WHERE u.Cedula LIKE '%" + parametroBusqueda + "%';";
            con.despliegueFields(SQL, "Admins", jTFCedula_elim, jTFUsuario, jTFRol, jTFCorreo,
                    jTFNombres, jTFApellidos, null, null, "eliminar");
        } else {
            borrarCampos();
        }
    }//GEN-LAST:event_jTFBuscar_EliminarUsuKeyReleased

    private void jTFBuscar_EliminarUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarUsuKeyTyped

    }//GEN-LAST:event_jTFBuscar_EliminarUsuKeyTyped

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void JBAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBAceptarMouseEntered
        this.JBAceptar.setText("ACEPTAR");
    }//GEN-LAST:event_JBAceptarMouseEntered

    private void JBAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBAceptarMouseExited
        this.JBAceptar.setText("aceptar");
    }//GEN-LAST:event_JBAceptarMouseExited

    private void JBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAceptarActionPerformed
        if (jTFBuscar_EliminarUsu.getText().isEmpty()) {
            titulo = "ADVERTENCIA";
            mensaje = "Todos los campos deben estar llenos";
            emitirMensaje(mensaje, titulo);
        } else {
            String parametroBusqueda = this.jTFBuscar_EliminarUsu.getText();
            if (!val.validadorDeCedula(parametroBusqueda)) {
                titulo = "ERROR DE FORMATO";
                mensaje = "La cédula ingresada no es válida en el territorio Ecuatoriano";
                emitirMensaje(mensaje, titulo);
            } else {
                this.SQL = "Select count(*) from Personas where Cedula like '%" + parametroBusqueda + "%'";
                if (con.busquedaCod(tabla, SQL, "count(*)") < 1) {
                    titulo = "ADVERTENCIA";
                    mensaje = "El administrador al que hace referencia no existe";
                    emitirMensaje(mensaje, titulo);
                } else {
                    int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea desactivar el elemento?" + "\n     -Esta accion podrá ser revertida", "Inactivar administrador", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ICONCANCELAR);
                    if (seleccion == 0) {
                        this.SQL = "DELETE from Admins Where Cedula_Admin = '" + parametroBusqueda + "';";
                        if (con.actualizarEliminarTablas(SQL) == true) {
                            titulo = "RESULTADO";
                            mensaje = "Elemento inactivado exitosamente";
                            dispose();
                            emitirMensaje(mensaje, titulo);
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
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void emitirMensaje(String mensaje, String titulo) {
        getToolkit().beep();
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    private void borrarCampos() {
        jTFCedula_elim.setText("");
        jTFCorreo.setText("");
        jTFRol.setText("");
        jTFUsuario.setText("");
        jTFNombres.setText("");
        jTFApellidos.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAceptar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLNCedulaAdmin;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLRol;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosAdminEliminar;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelDatoAdmin;
    private javax.swing.JPanel jPanelEncabezado;
    private javax.swing.JPanel jPanelPie;
    public static javax.swing.JTextField jTFApellidos;
    public static javax.swing.JTextField jTFBuscar_EliminarUsu;
    public static javax.swing.JTextField jTFCedula_elim;
    public static javax.swing.JTextField jTFCorreo;
    public static javax.swing.JTextField jTFNombres;
    public static javax.swing.JTextField jTFRol;
    public static javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
