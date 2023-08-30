package GUI.Administrador.Inventario;

import Negocio.Diseño;
import Negocio.Conexion;
import javax.swing.JOptionPane;

/*
 * @authors G2 SoftwareSolutions
 */
public class JPAdminInv extends javax.swing.JPanel {

    private Diseño gui = new Diseño();
    private JFAdmin_Actualizar act = new JFAdmin_Actualizar();
    private JFAdmin_Consultar cons = new JFAdmin_Consultar();
    private JFAdmin_Eliminar elim = new JFAdmin_Eliminar();
    private JFAdmin_Insertar ins = new JFAdmin_Insertar();
    private JFAdmin_Prestamo pres = new JFAdmin_Prestamo();
    private JFAdmin_Devolucion dev = new JFAdmin_Devolucion();
    private Conexion con = new Conexion();
    private String selectTabla = "Instrumentos";
    private String selectTabla1 = "Libros";
    private String SQL;
    private String SQL1;

    public JPAdminInv() {
        initComponents();
        gui.jComboUsers(this.jCBFiltro);
        gui.jtableHead(jTInst);
        gui.jtableHead(jTLib);
        jLFiltro.setVisible(false);
        jCBFiltro.setVisible(false);
        
        mostrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLFiltro = new javax.swing.JLabel();
        jTFBusqueda = new javax.swing.JTextField();
        jCBFiltro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTInst = new javax.swing.JTable();
        jLTitTabla = new javax.swing.JLabel();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTLib = new javax.swing.JTable();
        jLTitTabla1 = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jButtonActualizar = new javax.swing.JButton();
        jButtonPrestamo = new javax.swing.JButton();
        jButtonDevolucion = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        jTFBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        jTFBusqueda.setText("Colocar código");
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

        jCBFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar...", "Nombre", "Categoría", "Elaborador", "Estado de Alquiler", "Condición" }));
        jCBFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTInst.setAutoCreateRowSorter(true);
        jTInst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTInst.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTInst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Fabricante", "Categoría", "Estado Alquiler", "Condición"
            }
        ));
        jTInst.setGridColor(new java.awt.Color(250, 183, 22));
        jTInst.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTInst.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTInst.getTableHeader().setResizingAllowed(false);
        jTInst.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTInst);

        jLTitTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla.setText("Inventario Instrumentos");

        jButtonNuevo.setBackground(new java.awt.Color(250, 183, 22));
        jButtonNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevo.setBorderPainted(false);
        jButtonNuevo.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoMouseExited(evt);
            }
        });
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(250, 183, 22));
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminar.setBorderPainted(false);
        jButtonEliminar.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseExited(evt);
            }
        });
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTLib.setAutoCreateRowSorter(true);
        jTLib.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTLib.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTLib.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Autor", "Categoría", "Estado Alquiler", "Condición"
            }
        ));
        jTLib.setGridColor(new java.awt.Color(250, 183, 22));
        jTLib.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTLib.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTLib.getTableHeader().setResizingAllowed(false);
        jTLib.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTLib);

        jLTitTabla1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla1.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla1.setText("Inventario Libros");

        jSeparator.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator.setForeground(new java.awt.Color(250, 183, 22));

        jButtonActualizar.setBackground(new java.awt.Color(250, 183, 22));
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizar.setBorderPainted(false);
        jButtonActualizar.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarMouseExited(evt);
            }
        });
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonPrestamo.setBackground(new java.awt.Color(250, 183, 22));
        jButtonPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPrestamo.setText("Préstamo");
        jButtonPrestamo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonPrestamo.setBorderPainted(false);
        jButtonPrestamo.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonPrestamoMouseExited(evt);
            }
        });
        jButtonPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrestamoActionPerformed(evt);
            }
        });

        jButtonDevolucion.setBackground(new java.awt.Color(250, 183, 22));
        jButtonDevolucion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDevolucion.setText("Devolución");
        jButtonDevolucion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonDevolucion.setBorderPainted(false);
        jButtonDevolucion.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonDevolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonDevolucionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonDevolucionMouseExited(evt);
            }
        });
        jButtonDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolucionActionPerformed(evt);
            }
        });

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(107, 107, 107)
                                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLTitTabla))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLFiltro)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCBFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(jButtonBuscar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTFBusqueda)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTitTabla1))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLFiltro)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLTitTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBusquedaFocusLost
        if (jTFBusqueda.getText().isEmpty()) {
            this.jTFBusqueda.setText("Colocar código");
        }
    }//GEN-LAST:event_jTFBusquedaFocusLost

    private void jTFBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBusquedaMousePressed
        if (jTFBusqueda.getText().equalsIgnoreCase("Colocar código")) {
            jTFBusqueda.setText("");
        }
    }//GEN-LAST:event_jTFBusquedaMousePressed

    private void jTFBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBusquedaActionPerformed

    private void jTFBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaKeyReleased

    }//GEN-LAST:event_jTFBusquedaKeyReleased

    private void jCBFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroActionPerformed

    private void jButtonNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoMouseEntered
        this.jButtonNuevo.setText("NUEVO");
        mostrarDatos();
    }//GEN-LAST:event_jButtonNuevoMouseEntered

    private void jButtonNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoMouseExited
        this.jButtonNuevo.setText("nuevo");
    }//GEN-LAST:event_jButtonNuevoMouseExited

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        ins.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseEntered
        this.jButtonEliminar.setText("ELIMINAR");
    }//GEN-LAST:event_jButtonEliminarMouseEntered

    private void jButtonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseExited
        this.jButtonEliminar.setText("eliminar");
    }//GEN-LAST:event_jButtonEliminarMouseExited

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        elim.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarMouseEntered
        this.jButtonActualizar.setText("ACTUALIZAR");
    }//GEN-LAST:event_jButtonActualizarMouseEntered

    private void jButtonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarMouseExited
        this.jButtonActualizar.setText("actualizar");
    }//GEN-LAST:event_jButtonActualizarMouseExited

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        act.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPrestamoMouseEntered
        this.jButtonPrestamo.setText("PRÉSTAMO");
    }//GEN-LAST:event_jButtonPrestamoMouseEntered

    private void jButtonPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPrestamoMouseExited
        this.jButtonPrestamo.setText("préstamo");
    }//GEN-LAST:event_jButtonPrestamoMouseExited

    private void jButtonPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrestamoActionPerformed
        pres.setVisible(true);
    }//GEN-LAST:event_jButtonPrestamoActionPerformed

    private void jButtonDevolucionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDevolucionMouseEntered
        this.jButtonDevolucion.setText("DEVOLUCIÓN");
    }//GEN-LAST:event_jButtonDevolucionMouseEntered

    private void jButtonDevolucionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDevolucionMouseExited
        this.jButtonDevolucion.setText("devolución");
    }//GEN-LAST:event_jButtonDevolucionMouseExited

    private void jButtonDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolucionActionPerformed
        dev.setVisible(true);
    }//GEN-LAST:event_jButtonDevolucionActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // Verificar si el codigo existe y mostrarlo en la tabla adecuada para abrir lo siguiente

        if (!jTFBusqueda.getText().equalsIgnoreCase("Colocar código") && !jTFBusqueda.getText().isEmpty()) {
            if (jTFBusqueda.getText().startsWith("INSTR-")) {
                if (existeCodigoInstrumento(jTFBusqueda.getText())) {
                    this.SQL = """
                   SELECT Codigo,Nombre,Fabricante,Categoria,EstadoAlquiler,Condicion FROM instrumentos WHERE """
                            + " " + "Codigo" + " LIKE '%" + jTFBusqueda.getText() + "%';";
                    con.busqueda_y_despliegue(this.jTInst, this.selectTabla, this.SQL);
                    jLFiltro.setVisible(true);
                    jCBFiltro.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Codigo de producto no encontrado");
                    jTFBusqueda.setText("");
                }
            } else if (jTFBusqueda.getText().startsWith("LIBR-")) {
                if (existeCodigoLibro(jTFBusqueda.getText())) {
                    this.SQL = """
                   SELECT Codigo,Nombre,Autor,Categoria,EstadoAlquiler,Condicion FROM libros WHERE """
                            + " " + "Codigo" + " LIKE '%" + jTFBusqueda.getText() + "%';";
                    con.busqueda_y_despliegue(this.jTLib, this.selectTabla1, this.SQL);
                    jLFiltro.setVisible(true);
                    jCBFiltro.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Código de producto no encontrado");
                    jTFBusqueda.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Código de producto no encontrado");
                jTFBusqueda.setText("");
            }

        } else {

            jLFiltro.setVisible(false);
            jCBFiltro.setVisible(false);
            this.SQL = """
                   SELECT Codigo,Nombre,Fabricante,Categoria,EstadoAlquiler,Condicion FROM instrumentos;""";
            con.busqueda_y_despliegue(this.jTInst, this.selectTabla, this.SQL);

            this.SQL1 = """
                   SELECT Codigo,Nombre,Autor,Categoria,EstadoAlquiler,Condicion FROM libros;""";
            con.busqueda_y_despliegue(this.jTLib, this.selectTabla1, this.SQL1);
        }

        if (jCBFiltro.isVisible() && !jCBFiltro.getSelectedItem().equals("Mostrar...")) {
            // agregar logica a cada uno para que verifique si el código existe y jalar el dato necesario de la db.
            if (jCBFiltro.getSelectedItem().equals("Nombre") && (existeCodigoInstrumento(jTFBusqueda.getText()) || existeCodigoLibro(jTFBusqueda.getText()))) {
                cons.setTFCodigo(jTFBusqueda.getText());
                cons.setTFNomDato("Nombre:");
                if (jTFBusqueda.getText().startsWith("INSTR-")) {
                    cons.setTFDato(jTInst.getValueAt(0, 1).toString());
                } else {
                    cons.setTFDato(jTLib.getValueAt(0, 1).toString());
                }
                cons.setVisible(true);
            } else if (jCBFiltro.getSelectedItem().equals("Categoría") && (existeCodigoInstrumento(jTFBusqueda.getText()) || existeCodigoLibro(jTFBusqueda.getText()))) {
                cons.setTFCodigo(jTFBusqueda.getText());
                cons.setTFNomDato("Categoría:");
                if (jTFBusqueda.getText().startsWith("INSTR-")) {
                    cons.setTFDato(jTInst.getValueAt(0, 3).toString());
                } else {
                    cons.setTFDato(jTLib.getValueAt(0, 3).toString());
                }
                cons.setVisible(true);
            } else if (jCBFiltro.getSelectedItem().equals("Elaborador") && (existeCodigoInstrumento(jTFBusqueda.getText()) || existeCodigoLibro(jTFBusqueda.getText()))) {
                cons.setTFCodigo(jTFBusqueda.getText());
                cons.setTFNomDato("Elaborador:");
                if (jTFBusqueda.getText().startsWith("INSTR-")) {
                    cons.setTFDato(jTInst.getValueAt(0, 2).toString());
                } else {
                    cons.setTFDato(jTLib.getValueAt(0, 2).toString());
                }
                cons.setVisible(true);
            } else if (jCBFiltro.getSelectedItem().equals("Estado de Alquiler") && (existeCodigoInstrumento(jTFBusqueda.getText()) || existeCodigoLibro(jTFBusqueda.getText()))) {
                cons.setTFCodigo(jTFBusqueda.getText());
                cons.setTFNomDato("Estado de Alquiler:");
                if (jTFBusqueda.getText().startsWith("INSTR-")) {
                    cons.setTFDato(jTInst.getValueAt(0, 4).toString());
                } else {
                    cons.setTFDato(jTLib.getValueAt(0, 4).toString());
                }
                cons.setVisible(true);
            } else if (jCBFiltro.getSelectedItem().equals("Condición") && (existeCodigoInstrumento(jTFBusqueda.getText()) || existeCodigoLibro(jTFBusqueda.getText()))) {
                cons.setTFCodigo(jTFBusqueda.getText());
                cons.setTFNomDato("Condición:");
                if (jTFBusqueda.getText().startsWith("INSTR-")) {
                    cons.setTFDato(jTInst.getValueAt(0, 5).toString());
                } else {
                    cons.setTFDato(jTLib.getValueAt(0, 5).toString());
                }
                cons.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private boolean existeCodigoInstrumento(String codigo) {
        boolean existe = false;

        for (int row = 0; row < jTInst.getRowCount(); row++) {
            String codigoEnTabla = (String) jTInst.getValueAt(row, 0);
            if (codigoEnTabla.equals(codigo)) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    private boolean existeCodigoLibro(String codigo) {
        boolean existe = false;

        for (int row = 0; row < jTLib.getRowCount(); row++) {
            String codigoEnTabla = (String) jTLib.getValueAt(row, 0);
            if (codigoEnTabla.equals(codigo)) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    public void mostrarDatos() {
        this.SQL = """
                   SELECT Codigo,Nombre,Fabricante,Categoria,EstadoAlquiler,Condicion FROM instrumentos;""";
        con.busqueda_y_despliegue(this.jTInst, this.selectTabla,this.SQL);
        
        this.SQL1 = """
                   SELECT Codigo,Nombre,Autor,Categoria,EstadoAlquiler,Condicion FROM libros;""";
        con.busqueda_y_despliegue(this.jTLib, this.selectTabla1,this.SQL1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonDevolucion;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonPrestamo;
    private javax.swing.JComboBox<String> jCBFiltro;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JLabel jLTitTabla1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextField jTFBusqueda;
    private javax.swing.JTable jTInst;
    private javax.swing.JTable jTLib;
    // End of variables declaration//GEN-END:variables
}
