package GUI.Administrador.Calendario_Clases;

import Negocio.Diseño;

/*
 * @authors G2 SoftwareSolutions
 */
public class JPAdminCal extends javax.swing.JPanel {
    Diseño gui = new Diseño();
    JFAdmin_ActualizarClase actClase = new JFAdmin_ActualizarClase();
    JFAdmin_AsignarEstudiante asgEst = new JFAdmin_AsignarEstudiante();
    JFAdmin_AsignarProfesor asgProf = new JFAdmin_AsignarProfesor();
    JFAdmin_AsistenciaClase asisClase = new JFAdmin_AsistenciaClase();
    JFAdmin_ConsultarClase consClase = new JFAdmin_ConsultarClase();
    JFAdmin_EliminarClase elimClase = new JFAdmin_EliminarClase();
    JFAdmin_InsertarClase insClase = new JFAdmin_InsertarClase();
    public JPAdminCal() {
        initComponents();
        gui.jComboUsers(this.jCBFiltroClase);
        gui.jtableHead(jTClases);
        gui.jComboUsers(jCBFiltroMes);
        gui.jComboUsers(jCBFiltroAnio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTClases = new javax.swing.JTable();
        jLTitTabla = new javax.swing.JLabel();
        jButtonNuevaClase = new javax.swing.JButton();
        jButtonActualizarClase = new javax.swing.JButton();
        jButtonEliminarClase = new javax.swing.JButton();
        jLLupa = new javax.swing.JLabel();
        jTFBusquedaClase = new javax.swing.JTextField();
        jLFiltro = new javax.swing.JLabel();
        jCBFiltroClase = new javax.swing.JComboBox<>();
        jButtonConsultarClase = new javax.swing.JButton();
        jCBFiltroMes = new javax.swing.JComboBox<>();
        jCBFiltroAnio = new javax.swing.JComboBox<>();
        jButtonAsignarProf = new javax.swing.JButton();
        jButtonAsignarEst = new javax.swing.JButton();
        jButtonAsistencia = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTClases.setAutoCreateRowSorter(true);
        jTClases.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTClases.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ));
        jTClases.setGridColor(new java.awt.Color(250, 183, 22));
        jTClases.setRowSelectionAllowed(false);
        jTClases.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTClases.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTClases.getTableHeader().setResizingAllowed(false);
        jTClases.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTClases);

        jLTitTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla.setText("Clases");

        jButtonNuevaClase.setBackground(new java.awt.Color(250, 183, 22));
        jButtonNuevaClase.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevaClase.setText("nuevo");
        jButtonNuevaClase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevaClase.setBorderPainted(false);
        jButtonNuevaClase.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevaClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevaClaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevaClaseMouseExited(evt);
            }
        });
        jButtonNuevaClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaClaseActionPerformed(evt);
            }
        });

        jButtonActualizarClase.setBackground(new java.awt.Color(250, 183, 22));
        jButtonActualizarClase.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarClase.setText("actualizar");
        jButtonActualizarClase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizarClase.setBorderPainted(false);
        jButtonActualizarClase.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonActualizarClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarClaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarClaseMouseExited(evt);
            }
        });
        jButtonActualizarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarClaseActionPerformed(evt);
            }
        });

        jButtonEliminarClase.setBackground(new java.awt.Color(250, 183, 22));
        jButtonEliminarClase.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarClase.setText("eliminar");
        jButtonEliminarClase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminarClase.setBorderPainted(false);
        jButtonEliminarClase.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarClaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarClaseMouseExited(evt);
            }
        });
        jButtonEliminarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarClaseActionPerformed(evt);
            }
        });

        jLLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N

        jTFBusquedaClase.setForeground(new java.awt.Color(102, 102, 102));
        jTFBusquedaClase.setText("Colocar código clase");
        jTFBusquedaClase.setBorder(null);
        jTFBusquedaClase.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFBusquedaClaseFocusLost(evt);
            }
        });
        jTFBusquedaClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFBusquedaClaseMousePressed(evt);
            }
        });
        jTFBusquedaClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBusquedaClaseActionPerformed(evt);
            }
        });
        jTFBusquedaClase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBusquedaClaseKeyReleased(evt);
            }
        });

        jLFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        jCBFiltroClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar...", "Horario de clase", "Aula de clase", "Materia de clase", "Cupo de clase", " " }));
        jCBFiltroClase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroClaseActionPerformed(evt);
            }
        });

        jButtonConsultarClase.setBackground(new java.awt.Color(250, 183, 22));
        jButtonConsultarClase.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarClase.setText("consultar");
        jButtonConsultarClase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonConsultarClase.setBorderPainted(false);
        jButtonConsultarClase.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonConsultarClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConsultarClaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultarClaseMouseExited(evt);
            }
        });
        jButtonConsultarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarClaseActionPerformed(evt);
            }
        });

        jCBFiltroMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jCBFiltroMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroMesActionPerformed(evt);
            }
        });

        jCBFiltroAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2022", "2023", " " }));
        jCBFiltroAnio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroAnioActionPerformed(evt);
            }
        });

        jButtonAsignarProf.setBackground(new java.awt.Color(250, 183, 22));
        jButtonAsignarProf.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAsignarProf.setText("asignar Profesor");
        jButtonAsignarProf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonAsignarProf.setBorderPainted(false);
        jButtonAsignarProf.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonAsignarProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAsignarProfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAsignarProfMouseExited(evt);
            }
        });
        jButtonAsignarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignarProfActionPerformed(evt);
            }
        });

        jButtonAsignarEst.setBackground(new java.awt.Color(250, 183, 22));
        jButtonAsignarEst.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAsignarEst.setText("asignar Estudiantes");
        jButtonAsignarEst.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonAsignarEst.setBorderPainted(false);
        jButtonAsignarEst.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonAsignarEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAsignarEstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAsignarEstMouseExited(evt);
            }
        });
        jButtonAsignarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignarEstActionPerformed(evt);
            }
        });

        jButtonAsistencia.setBackground(new java.awt.Color(250, 183, 22));
        jButtonAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAsistencia.setText("asistencia");
        jButtonAsistencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonAsistencia.setBorderPainted(false);
        jButtonAsistencia.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAsistenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAsistenciaMouseExited(evt);
            }
        });
        jButtonAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsistenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jCBFiltroMes, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jCBFiltroAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNuevaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonActualizarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jLLupa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFBusquedaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLFiltro))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonAsignarProf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(jButtonAsignarEst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(jButtonAsistencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBFiltroClase, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConsultarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBFiltroClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonConsultarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLLupa)
                                    .addComponent(jTFBusquedaClase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAsignarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAsignarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonNuevaClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonActualizarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonEliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLFiltro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBFiltroMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBFiltroAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevaClaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevaClaseMouseEntered
        this.jButtonNuevaClase.setText("NUEVO");
    }//GEN-LAST:event_jButtonNuevaClaseMouseEntered

    private void jButtonNuevaClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevaClaseMouseExited
        this.jButtonNuevaClase.setText("nuevo");
    }//GEN-LAST:event_jButtonNuevaClaseMouseExited

    private void jButtonNuevaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaClaseActionPerformed
        insClase.setVisible(true);
    }//GEN-LAST:event_jButtonNuevaClaseActionPerformed

    private void jButtonActualizarClaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarClaseMouseEntered
        this.jButtonActualizarClase.setText("ACTUALIZAR");
    }//GEN-LAST:event_jButtonActualizarClaseMouseEntered

    private void jButtonActualizarClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarClaseMouseExited
        this.jButtonActualizarClase.setText("actualizar");
    }//GEN-LAST:event_jButtonActualizarClaseMouseExited

    private void jButtonActualizarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarClaseActionPerformed
        actClase.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarClaseActionPerformed

    private void jButtonEliminarClaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarClaseMouseEntered
        this.jButtonEliminarClase.setText("ELIMINAR");
    }//GEN-LAST:event_jButtonEliminarClaseMouseEntered

    private void jButtonEliminarClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarClaseMouseExited
        this.jButtonEliminarClase.setText("eliminar");
    }//GEN-LAST:event_jButtonEliminarClaseMouseExited

    private void jButtonEliminarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarClaseActionPerformed
        elimClase.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarClaseActionPerformed

    private void jTFBusquedaClaseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBusquedaClaseFocusLost
        if(jTFBusquedaClase.getText().isEmpty()){this.jTFBusquedaClase.setText("Buscar nombre");}
    }//GEN-LAST:event_jTFBusquedaClaseFocusLost

    private void jTFBusquedaClaseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBusquedaClaseMousePressed
        if(jTFBusquedaClase.getText().equalsIgnoreCase("Buscar nombre")){jTFBusquedaClase.setText("");}
    }//GEN-LAST:event_jTFBusquedaClaseMousePressed

    private void jTFBusquedaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBusquedaClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBusquedaClaseActionPerformed

    private void jTFBusquedaClaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaClaseKeyReleased

    }//GEN-LAST:event_jTFBusquedaClaseKeyReleased

    private void jCBFiltroClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroClaseActionPerformed

    private void jButtonConsultarClaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarClaseMouseEntered
        this.jButtonConsultarClase.setText("CONSULTAR");
    }//GEN-LAST:event_jButtonConsultarClaseMouseEntered

    private void jButtonConsultarClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarClaseMouseExited
        this.jButtonConsultarClase.setText("consultar");
    }//GEN-LAST:event_jButtonConsultarClaseMouseExited

    private void jButtonConsultarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarClaseActionPerformed
        consClase.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarClaseActionPerformed

    private void jCBFiltroMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroMesActionPerformed

    private void jCBFiltroAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroAnioActionPerformed

    private void jButtonAsignarProfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAsignarProfMouseEntered
        this.jButtonAsignarProf.setText("ASIGNAR PROFESOR");
    }//GEN-LAST:event_jButtonAsignarProfMouseEntered

    private void jButtonAsignarProfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAsignarProfMouseExited
        this.jButtonAsignarProf.setText("asignar profesor");
    }//GEN-LAST:event_jButtonAsignarProfMouseExited

    private void jButtonAsignarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsignarProfActionPerformed
        asgProf.setVisible(true);
    }//GEN-LAST:event_jButtonAsignarProfActionPerformed

    private void jButtonAsignarEstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAsignarEstMouseEntered
        this.jButtonAsignarEst.setText("ASIGNAR ESTUDIANTE");
    }//GEN-LAST:event_jButtonAsignarEstMouseEntered

    private void jButtonAsignarEstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAsignarEstMouseExited
        this.jButtonAsignarEst.setText("asignar estudiante");
    }//GEN-LAST:event_jButtonAsignarEstMouseExited

    private void jButtonAsignarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsignarEstActionPerformed
        asgEst.setVisible(true);
    }//GEN-LAST:event_jButtonAsignarEstActionPerformed

    private void jButtonAsistenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAsistenciaMouseEntered
        this.jButtonAsistencia.setText("ASISTENCIA");
    }//GEN-LAST:event_jButtonAsistenciaMouseEntered

    private void jButtonAsistenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAsistenciaMouseExited
        this.jButtonAsistencia.setText("asistencia");
    }//GEN-LAST:event_jButtonAsistenciaMouseExited

    private void jButtonAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsistenciaActionPerformed
        asisClase.setVisible(true);
    }//GEN-LAST:event_jButtonAsistenciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarClase;
    private javax.swing.JButton jButtonAsignarEst;
    private javax.swing.JButton jButtonAsignarProf;
    private javax.swing.JButton jButtonAsistencia;
    private javax.swing.JButton jButtonConsultarClase;
    private javax.swing.JButton jButtonEliminarClase;
    private javax.swing.JButton jButtonNuevaClase;
    private javax.swing.JComboBox<String> jCBFiltroAnio;
    private javax.swing.JComboBox<String> jCBFiltroClase;
    private javax.swing.JComboBox<String> jCBFiltroMes;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JLabel jLLupa;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTClases;
    private javax.swing.JTextField jTFBusquedaClase;
    // End of variables declaration//GEN-END:variables
}
