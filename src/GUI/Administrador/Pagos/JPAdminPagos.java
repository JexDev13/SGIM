package GUI.Administrador.Pagos;

import Negocio.Conexion;
import Negocio.Diseño;
import javax.swing.JOptionPane;

/*
 * @authors G2 SoftwareSolutions
 */
public class JPAdminPagos extends javax.swing.JPanel {

    private Diseño gui = new Diseño();
    private JFAdmin_RegistrarPago regPag = new JFAdmin_RegistrarPago();
    private JFAdmin_EliminarPago elimPag = new JFAdmin_EliminarPago();
    private JFAdmin_ConsultarPago consPag = new JFAdmin_ConsultarPago();
    private JFAdmin_ActualizarPago actPag = new JFAdmin_ActualizarPago();
    private Conexion con = new Conexion();
    private String selectTabla = "PagosTotales";
    private String SQL;

    public JPAdminPagos() {
        initComponents();
        gui.jtableHead(this.jTPagos);
        jLFiltro.setVisible(false);
        jCBFiltro.setVisible(false);
        this.SQL = """
                   SELECT Codigo_pension,Cedula_estudiante,Mes,Total_cancelado,Pagado_total FROM estudiantes_pagados;""";
            con.busqueda_y_despliegue(this.jTPagos, this.selectTabla, this.SQL);
        obtenerPorcentaje();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonNuevoPago = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jTFBusqueda = new javax.swing.JTextField();
        jSeparator = new javax.swing.JSeparator();
        jLTitTabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPagos = new javax.swing.JTable();
        jTFPorcentajePagado = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLFiltro = new javax.swing.JLabel();
        jCBFiltro = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jButtonNuevoPago.setBackground(new java.awt.Color(250, 183, 22));
        jButtonNuevoPago.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoPago.setText("nuevo");
        jButtonNuevoPago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevoPago.setBorderPainted(false);
        jButtonNuevoPago.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevoPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoPagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoPagoMouseExited(evt);
            }
        });
        jButtonNuevoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoPagoActionPerformed(evt);
            }
        });

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N
        jButtonBuscar.setBorder(null);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTFBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        jTFBusqueda.setText("Cédula Estudiante");
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

        jSeparator.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator.setForeground(new java.awt.Color(250, 183, 22));

        jLTitTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla.setText("Pagos");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTPagos.setAutoCreateRowSorter(true);
        jTPagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTPagos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código Pensión", "N°Cédula", "Mes", "Valor", "Pagado"
            }
        ));
        jTPagos.setGridColor(new java.awt.Color(250, 183, 22));
        jTPagos.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTPagos.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTPagos.getTableHeader().setResizingAllowed(false);
        jTPagos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTPagos);

        jTFPorcentajePagado.setEditable(false);
        jTFPorcentajePagado.setBackground(new java.awt.Color(255, 255, 255));
        jTFPorcentajePagado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFPorcentajePagado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTFPorcentajePagado.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("% Estudiantes Pagados");

        jLFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        jCBFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar...", "Estado de cuenta" }));
        jCBFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNuevoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTFPorcentajePagado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonNuevoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFiltro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPorcentajePagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoPagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoPagoMouseEntered
        this.jButtonNuevoPago.setText("NUEVO");
    }//GEN-LAST:event_jButtonNuevoPagoMouseEntered

    private void jButtonNuevoPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoPagoMouseExited
        this.jButtonNuevoPago.setText("nuevo");
    }//GEN-LAST:event_jButtonNuevoPagoMouseExited

    private void jButtonNuevoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoPagoActionPerformed
        regPag.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoPagoActionPerformed

    private void jTFBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBusquedaFocusLost
        if (jTFBusqueda.getText().isEmpty()) {
            this.jTFBusqueda.setText("Cédula Estudiante");
        }
    }//GEN-LAST:event_jTFBusquedaFocusLost

    private void jTFBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBusquedaMousePressed
        if (jTFBusqueda.getText().equalsIgnoreCase("Cédula Estudiante")) {
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

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        obtenerPorcentaje();
        if (!jTFBusqueda.getText().equalsIgnoreCase("Cédula Estudiante") && !jTFBusqueda.getText().isEmpty()) {
            if (existeCedula(jTFBusqueda.getText())) {
                this.SQL = """
                   SELECT Codigo_pension,Cedula_estudiante,Mes,Total_cancelado,Pagado_total FROM estudiantes_pagados WHERE """
                        + " " + "Cedula_estudiante" + " LIKE '%" + jTFBusqueda.getText() + "%';";
                con.busqueda_y_despliegue(this.jTPagos, this.selectTabla, this.SQL);
                jLFiltro.setVisible(true);
                jCBFiltro.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
                jTFBusqueda.setText("");
            }
        } else {

            jLFiltro.setVisible(false);
            jCBFiltro.setVisible(false);
            this.SQL = """
                   SELECT Codigo_pension,Cedula_estudiante,Mes,Total_cancelado,Pagado_total FROM estudiantes_pagados;""";
            con.busqueda_y_despliegue(this.jTPagos, this.selectTabla, this.SQL);
        }

        if (jCBFiltro.isVisible() && !jCBFiltro.getSelectedItem().equals("Mostrar...")) {
            // agregar logica a cada uno para que verifique si el código existe y jalar el dato necesario de la db.
            if (jCBFiltro.getSelectedItem().equals("Estado de cuenta") && (existeCedula(jTFBusqueda.getText()))) {
                consPag.setTFBuscar_CedulaEst(jTFBusqueda.getText());
                consPag.setVisible(true);
            }
        }
    }

    private boolean existeCedula(String cedula) {
        boolean existe = false;

        for (int row = 0; row < jTPagos.getRowCount(); row++) {
            String cedulaEnTabla = (String) jTPagos.getValueAt(row, 1);
            if (cedulaEnTabla.equals(cedula)) {
                existe = true;
                break;
            }
        }
        return existe;
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void obtenerPorcentaje() {
        int totalEstudiantes = jTPagos.getRowCount();
        int estudiantesConAbono = 0;
        for (int i = 0; i < totalEstudiantes; i++) {
            Object abono = jTPagos.getValueAt(i, 4); // Reemplaza columnaDeAbono con el índice de la columna Abono
            
            if (abono != null && abono.toString().equals("1")) {
                estudiantesConAbono++;
            }
            double porcentaje = (double) estudiantesConAbono / totalEstudiantes * 100;
            
            jTFPorcentajePagado.setText(String.valueOf(porcentaje));
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonNuevoPago;
    private javax.swing.JComboBox<String> jCBFiltro;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextField jTFBusqueda;
    public static javax.swing.JTextField jTFPorcentajePagado;
    private javax.swing.JTable jTPagos;
    // End of variables declaration//GEN-END:variables
}
