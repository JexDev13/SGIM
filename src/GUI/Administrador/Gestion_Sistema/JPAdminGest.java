package GUI.Administrador.Gestion_Sistema;

import Negocio.Conexion;
import Negocio.Diseño;

/*
 * @authors G2 SoftwareSolutions
 */
public class JPAdminGest extends javax.swing.JPanel {

    Diseño gui = new Diseño();
    JFAdmin_desbloquear conInst = new JFAdmin_desbloquear();
    JFAdmin_InsertarUsuario inser = new JFAdmin_InsertarUsuario();
    JFAdmin_ActualizarUsuario act = new JFAdmin_ActualizarUsuario();
    JFAdmin_EliminarUsuario elim = new JFAdmin_EliminarUsuario();
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
        jButtonActualizarEstu1 = new javax.swing.JButton();
        jLTitTabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsers = new javax.swing.JTable();
        jBDesbloquear = new javax.swing.JButton();
        jBAdministrador = new javax.swing.JButton();
        jBInactivos = new javax.swing.JButton();

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

        jButtonActualizarEstu1.setBackground(new java.awt.Color(250, 183, 22));
        jButtonActualizarEstu1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarEstu1.setText("actualizar");
        jButtonActualizarEstu1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizarEstu1.setBorderPainted(false);
        jButtonActualizarEstu1.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonActualizarEstu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarEstu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarEstu1MouseExited(evt);
            }
        });
        jButtonActualizarEstu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarEstu1ActionPerformed(evt);
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
        jBDesbloquear.setText("(des)bloquear");
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

        jBAdministrador.setBackground(new java.awt.Color(250, 183, 22));
        jBAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jBAdministrador.setText("administrador");
        jBAdministrador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBAdministrador.setBorderPainted(false);
        jBAdministrador.setPreferredSize(new java.awt.Dimension(73, 40));
        jBAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAdministradorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAdministradorMouseExited(evt);
            }
        });
        jBAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdministradorActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLTitTabla)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonActualizarEstu1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBDesbloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLLupa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonActualizarEstu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBDesbloquear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBFiltroUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFiltro))
                .addGap(1, 1, 1)
                .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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
                Parametro_de_busqueda = "Cedula";
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

    private void jButtonActualizarEstu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarEstu1MouseEntered
        this.jButtonActualizarEstu1.setText("ACTUALIZAR");
    }//GEN-LAST:event_jButtonActualizarEstu1MouseEntered

    private void jButtonActualizarEstu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarEstu1MouseExited
        this.jButtonActualizarEstu1.setText("actualizar");
    }//GEN-LAST:event_jButtonActualizarEstu1MouseExited

    private void jButtonActualizarEstu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarEstu1ActionPerformed
        act.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarEstu1ActionPerformed

    private void jBDesbloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesbloquearActionPerformed
        conInst.setVisible(true);
    }//GEN-LAST:event_jBDesbloquearActionPerformed

    private void jBDesbloquearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDesbloquearMouseExited
        this.jBDesbloquear.setText("(des)bloquear");
    }//GEN-LAST:event_jBDesbloquearMouseExited

    private void jBDesbloquearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDesbloquearMouseEntered
        this.jBDesbloquear.setText("(DES)BLOQUEAR");
    }//GEN-LAST:event_jBDesbloquearMouseEntered

    private void jBAdministradorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAdministradorMouseEntered
        this.jBAdministrador.setText("ADMINISTRADOR");
    }//GEN-LAST:event_jBAdministradorMouseEntered

    private void jBAdministradorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAdministradorMouseExited
        this.jBAdministrador.setText("administrador");
    }//GEN-LAST:event_jBAdministradorMouseExited

    private void jBAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdministradorActionPerformed
        JFAdministradores admin = new JFAdministradores();
        admin.setVisible(true);
    }//GEN-LAST:event_jBAdministradorActionPerformed

    private void jBInactivosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInactivosMouseEntered
        this.jBInactivos.setText("USUARIOS INACTIVOS");
    }//GEN-LAST:event_jBInactivosMouseEntered

    private void jBInactivosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInactivosMouseExited
        this.jBInactivos.setText("usuarios inactivos");
    }//GEN-LAST:event_jBInactivosMouseExited

    private void jBInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInactivosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBInactivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdministrador;
    private javax.swing.JButton jBDesbloquear;
    private javax.swing.JButton jBInactivos;
    private javax.swing.JButton jButtonActualizarEstu1;
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
