package GUI.Administrador.Gestion_Sistema;

import Negocio.Conexion;
import Negocio.Diseño;

/*
 * @authors G2 SoftwareSolutions
 */
public class JPAdminGest extends javax.swing.JPanel {

    Diseño gui = new Diseño();
    JFAdmin_desbloquear conInst = new JFAdmin_desbloquear();
    JFAdmin_ActualizarUsuario act = new JFAdmin_ActualizarUsuario();
    Conexion con = new Conexion();

    private String selectTabla = "Users";
    private String SQL;

    public JPAdminGest() {
        initComponents();
        gui.jComboUsers(jCBFiltroUsers);
        gui.jtableHead(jTUsers);

        this.SQL = """
                   SELECT u.Cedula, u.Nombre_Usuario, p.Correo, u.Rol FROM Personas p JOIN Users u ON p.Cedula = u.Cedula;""";
        con.busqueda_y_despliegue(this.jTUsers, this.selectTabla,this.SQL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFBusqueda = new javax.swing.JTextField();
        jLFiltro = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jCBFiltroUsers = new javax.swing.JComboBox<>();
        jLLupa = new javax.swing.JLabel();
        jBActualizarUsuario = new javax.swing.JButton();
        jLTitTabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsers = new javax.swing.JTable();
        jBDesbloquear = new javax.swing.JButton();
        jBNuevoAdmin = new javax.swing.JButton();
        jBInactivos = new javax.swing.JButton();
        jBEliminarAdmin = new javax.swing.JButton();
        jBVariables = new javax.swing.JButton();
        jBAuditoria = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTFBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        jTFBusqueda.setText("Buscar usuario");
        jTFBusqueda.setBorder(null);
        jTFBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFBusquedaFocusLost(evt);
            }
        });
        jTFBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFBusquedaMousePressed(evt);
            }
        });
        jTFBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBusquedaActionPerformed(evt);
            }
        });
        jTFBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBusquedaKeyReleased(evt);
            }
        });

        jLFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        jSeparator.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator.setForeground(new java.awt.Color(250, 183, 22));

        jCBFiltroUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Cédula", "Usuario", "Rol" }));
        jCBFiltroUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroUsersActionPerformed(evt);
            }
        });

        jLLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N

        jBActualizarUsuario.setBackground(new java.awt.Color(250, 183, 22));
        jBActualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jBActualizarUsuario.setText("actualizar usuarios");
        jBActualizarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBActualizarUsuario.setBorderPainted(false);
        jBActualizarUsuario.setPreferredSize(new java.awt.Dimension(73, 40));
        jBActualizarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBActualizarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBActualizarUsuarioMouseExited(evt);
            }
        });
        jBActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarUsuarioActionPerformed(evt);
            }
        });

        jLTitTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla.setText("Usuarios del sistema");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTUsers.setAutoCreateRowSorter(true);
        jTUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTUsers.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N°Cédula", "Usuario", "Correo electrónico", "Rol"
            }
        ));
        jTUsers.setGridColor(new java.awt.Color(250, 183, 22));
        jTUsers.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTUsers.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTUsers.getTableHeader().setResizingAllowed(false);
        jTUsers.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTUsers);

        jBDesbloquear.setBackground(new java.awt.Color(250, 183, 22));
        jBDesbloquear.setForeground(new java.awt.Color(255, 255, 255));
        jBDesbloquear.setText("(des)bloquear estudiantes");
        jBDesbloquear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBDesbloquear.setBorderPainted(false);
        jBDesbloquear.setPreferredSize(new java.awt.Dimension(73, 40));
        jBDesbloquear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDesbloquearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDesbloquearMouseExited(evt);
            }
        });
        jBDesbloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesbloquearActionPerformed(evt);
            }
        });

        jBNuevoAdmin.setBackground(new java.awt.Color(250, 183, 22));
        jBNuevoAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jBNuevoAdmin.setText("nuevo administrador");
        jBNuevoAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBNuevoAdmin.setBorderPainted(false);
        jBNuevoAdmin.setPreferredSize(new java.awt.Dimension(73, 40));
        jBNuevoAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBNuevoAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBNuevoAdminMouseExited(evt);
            }
        });
        jBNuevoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoAdminActionPerformed(evt);
            }
        });

        jBInactivos.setBackground(new java.awt.Color(250, 183, 22));
        jBInactivos.setForeground(new java.awt.Color(255, 255, 255));
        jBInactivos.setText("usuarios inactivos");
        jBInactivos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBInactivos.setBorderPainted(false);
        jBInactivos.setPreferredSize(new java.awt.Dimension(73, 40));
        jBInactivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBInactivosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBInactivosMouseExited(evt);
            }
        });
        jBInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInactivosActionPerformed(evt);
            }
        });

        jBEliminarAdmin.setBackground(new java.awt.Color(250, 183, 22));
        jBEliminarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminarAdmin.setText("eliminar administrador");
        jBEliminarAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBEliminarAdmin.setBorderPainted(false);
        jBEliminarAdmin.setPreferredSize(new java.awt.Dimension(73, 40));
        jBEliminarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEliminarAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEliminarAdminMouseExited(evt);
            }
        });
        jBEliminarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarAdminActionPerformed(evt);
            }
        });

        jBVariables.setBackground(new java.awt.Color(250, 183, 22));
        jBVariables.setForeground(new java.awt.Color(255, 255, 255));
        jBVariables.setText("variables del sistema");
        jBVariables.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBVariables.setBorderPainted(false);
        jBVariables.setPreferredSize(new java.awt.Dimension(73, 40));
        jBVariables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVariablesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVariablesMouseExited(evt);
            }
        });
        jBVariables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVariablesActionPerformed(evt);
            }
        });

        jBAuditoria.setBackground(new java.awt.Color(250, 183, 22));
        jBAuditoria.setForeground(new java.awt.Color(255, 255, 255));
        jBAuditoria.setText("auditoria del sistema");
        jBAuditoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBAuditoria.setBorderPainted(false);
        jBAuditoria.setPreferredSize(new java.awt.Dimension(73, 40));
        jBAuditoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAuditoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAuditoriaMouseExited(evt);
            }
        });
        jBAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAuditoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTitTabla)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBNuevoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBEliminarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBAuditoria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jBActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBDesbloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLFiltro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCBFiltroUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLLupa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFBusqueda))
                                .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBDesbloquear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLLupa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBFiltroUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFiltro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAuditoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBusquedaFocusLost
        if (jTFBusqueda.getText().isEmpty()) {
            this.jTFBusqueda.setText("Buscar usuario");
        }
    }//GEN-LAST:event_jTFBusquedaFocusLost

    private void jTFBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBusquedaMousePressed
        if (jTFBusqueda.getText().equalsIgnoreCase("Buscar usuario")) {
            jTFBusqueda.setText("");
        }
    }//GEN-LAST:event_jTFBusquedaMousePressed

    private void jTFBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBusquedaActionPerformed

    private void jTFBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaKeyReleased
        String Parametro_de_busqueda = "Nombre_Usuario";
        String Busqueda = this.jTFBusqueda.getText();
        switch (this.jCBFiltroUsers.getSelectedIndex()) {
            case 0 ->  {
                Parametro_de_busqueda = "Nombre_Usuario";
            }
            case 1 ->  {
                Parametro_de_busqueda = "u.Cedula";
            }
            case 2 ->  {
                Parametro_de_busqueda = "Nombre_Usuario";
            }
            case 3 ->  {
                Parametro_de_busqueda = "Rol";
            }
        }
        this.SQL = """
                   SELECT u.Cedula, u.Nombre_Usuario, p.Correo, u.Rol FROM Personas p JOIN Users u ON p.Cedula = u.Cedula WHERE """ 
                + " " + Parametro_de_busqueda + " LIKE '%" + Busqueda+ "%';";
        con.busqueda_y_despliegue(this.jTUsers, this.selectTabla, this.SQL);
    }//GEN-LAST:event_jTFBusquedaKeyReleased

    private void jCBFiltroUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroUsersActionPerformed

    private void jBActualizarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActualizarUsuarioMouseEntered
        this.jBActualizarUsuario.setText("ACTUALIZAR USUARIOS");
    }//GEN-LAST:event_jBActualizarUsuarioMouseEntered

    private void jBActualizarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActualizarUsuarioMouseExited
        this.jBActualizarUsuario.setText("actualizar usuarios");
    }//GEN-LAST:event_jBActualizarUsuarioMouseExited

    private void jBActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarUsuarioActionPerformed
        act.setVisible(true);
    }//GEN-LAST:event_jBActualizarUsuarioActionPerformed

    private void jBDesbloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesbloquearActionPerformed
        conInst.setVisible(true);
    }//GEN-LAST:event_jBDesbloquearActionPerformed

    private void jBDesbloquearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDesbloquearMouseExited
        this.jBDesbloquear.setText("(des)bloquear estudiantes");
    }//GEN-LAST:event_jBDesbloquearMouseExited

    private void jBDesbloquearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDesbloquearMouseEntered
        this.jBDesbloquear.setText("(DES)BLOQUEAR ESTUDIANTES");
    }//GEN-LAST:event_jBDesbloquearMouseEntered

    private void jBNuevoAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNuevoAdminMouseEntered
        this.jBNuevoAdmin.setText("NUEVO ADMINISTRADOR");
    }//GEN-LAST:event_jBNuevoAdminMouseEntered

    private void jBNuevoAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNuevoAdminMouseExited
        this.jBNuevoAdmin.setText("nuevo administrador");
    }//GEN-LAST:event_jBNuevoAdminMouseExited

    private void jBNuevoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoAdminActionPerformed
        JFAdmin_InsertarAdmin inser = new JFAdmin_InsertarAdmin();
        inser.setVisible(true);
    }//GEN-LAST:event_jBNuevoAdminActionPerformed

    private void jBInactivosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInactivosMouseEntered
        this.jBInactivos.setText("USUARIOS INACTIVOS");
    }//GEN-LAST:event_jBInactivosMouseEntered

    private void jBInactivosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInactivosMouseExited
        this.jBInactivos.setText("usuarios inactivos");
    }//GEN-LAST:event_jBInactivosMouseExited

    private void jBInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInactivosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBInactivosActionPerformed

    private void jBEliminarAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarAdminMouseEntered
        this.jBEliminarAdmin.setText("ELIMINAR ADMINISTRADOR");
    }//GEN-LAST:event_jBEliminarAdminMouseEntered

    private void jBEliminarAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarAdminMouseExited
        this.jBEliminarAdmin.setText("eliminar administrador");
    }//GEN-LAST:event_jBEliminarAdminMouseExited

    private void jBEliminarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarAdminActionPerformed
        JFAdmin_EliminarUsuario elim = new JFAdmin_EliminarUsuario();
        elim.setVisible(true);
    }//GEN-LAST:event_jBEliminarAdminActionPerformed

    private void jBVariablesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVariablesMouseEntered
        this.jBVariables.setText("VARIABLES DEL SISTEMA");
    }//GEN-LAST:event_jBVariablesMouseEntered

    private void jBVariablesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVariablesMouseExited
       this.jBVariables.setText("variables del sistema");
    }//GEN-LAST:event_jBVariablesMouseExited

    private void jBVariablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVariablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBVariablesActionPerformed

    private void jBAuditoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAuditoriaMouseEntered
        this.jBAuditoria.setText("AUDITORIA DEL SISTEMA");
    }//GEN-LAST:event_jBAuditoriaMouseEntered

    private void jBAuditoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAuditoriaMouseExited
        this.jBAuditoria.setText("auditoria del sistema");
    }//GEN-LAST:event_jBAuditoriaMouseExited

    private void jBAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAuditoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAuditoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarUsuario;
    private javax.swing.JButton jBAuditoria;
    private javax.swing.JButton jBDesbloquear;
    private javax.swing.JButton jBEliminarAdmin;
    private javax.swing.JButton jBInactivos;
    private javax.swing.JButton jBNuevoAdmin;
    private javax.swing.JButton jBVariables;
    private javax.swing.JComboBox<String> jCBFiltroUsers;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JLabel jLLupa;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextField jTFBusqueda;
    private javax.swing.JTable jTUsers;
    // End of variables declaration//GEN-END:variables
}
