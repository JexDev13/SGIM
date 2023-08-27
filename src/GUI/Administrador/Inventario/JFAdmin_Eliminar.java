package GUI.Administrador.Inventario;

import Negocio.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_Eliminar extends javax.swing.JFrame {

    private int x;
    private int y;
    private Conexion con = new Conexion();
    private String SQL;

    public JFAdmin_Eliminar() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBIngreso1 = new javax.swing.JButton();
        JBCancela1 = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jPDatosEliminar = new javax.swing.JPanel();
        jTFCodigo_Eliminar = new javax.swing.JTextField();
        jLabelNom = new javax.swing.JLabel();
        jTFNombre_Eliminar = new javax.swing.JTextField();
        jLabelFabAut = new javax.swing.JLabel();
        jTFFabricanteAutor_Eliminar = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTFCategoria_Eliminar = new javax.swing.JTextField();
        jLabelCategoria = new javax.swing.JLabel();
        jTFCondicion_Eliminar = new javax.swing.JTextField();
        jLabelCondicion = new javax.swing.JLabel();
        jTFEstado_Eliminar = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanelDato = new javax.swing.JPanel();
        jTFBuscar_Eliminar = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jPFondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jButtonMinimizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 499));
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
        getContentPane().setLayout(null);

        JBIngreso1.setBackground(new java.awt.Color(255, 255, 254));
        JBIngreso1.setForeground(new java.awt.Color(250, 183, 22));
        JBIngreso1.setText("aceptar");
        JBIngreso1.setBorder(null);
        JBIngreso1.setBorderPainted(false);
        JBIngreso1.setDefaultCapable(false);
        JBIngreso1.setFocusPainted(false);
        JBIngreso1.setHideActionText(true);
        JBIngreso1.setPreferredSize(new java.awt.Dimension(89, 32));
        JBIngreso1.setRequestFocusEnabled(false);
        JBIngreso1.setRolloverEnabled(false);
        JBIngreso1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBIngreso1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBIngreso1MouseExited(evt);
            }
        });
        JBIngreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngreso1ActionPerformed(evt);
            }
        });
        getContentPane().add(JBIngreso1);
        JBIngreso1.setBounds(90, 450, 89, 32);

        JBCancela1.setBackground(new java.awt.Color(255, 255, 254));
        JBCancela1.setForeground(new java.awt.Color(250, 183, 22));
        JBCancela1.setText("cancelar");
        JBCancela1.setBorder(null);
        JBCancela1.setBorderPainted(false);
        JBCancela1.setFocusPainted(false);
        JBCancela1.setPreferredSize(new java.awt.Dimension(89, 32));
        JBCancela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCancela1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCancela1MouseExited(evt);
            }
        });
        JBCancela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancela1ActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancela1);
        JBCancela1.setBounds(200, 450, 89, 32);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Eliminar");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

        jPDatosEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar"));

        jTFCodigo_Eliminar.setEditable(false);
        jTFCodigo_Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_Eliminar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelNom.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNom.setText("Nombre");

        jTFNombre_Eliminar.setEditable(false);
        jTFNombre_Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombre_Eliminar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelFabAut.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelFabAut.setText("Fabricante/Autor");

        jTFFabricanteAutor_Eliminar.setEditable(false);
        jTFFabricanteAutor_Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        jTFFabricanteAutor_Eliminar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelEstado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelEstado.setText("Estado Alquiler");

        jTFCategoria_Eliminar.setEditable(false);
        jTFCategoria_Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        jTFCategoria_Eliminar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCategoria.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCategoria.setText("Categoría");

        jTFCondicion_Eliminar.setEditable(false);
        jTFCondicion_Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        jTFCondicion_Eliminar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCondicion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCondicion.setText("Condición");

        jTFEstado_Eliminar.setEditable(false);
        jTFEstado_Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        jTFEstado_Eliminar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Código");

        javax.swing.GroupLayout jPDatosEliminarLayout = new javax.swing.GroupLayout(jPDatosEliminar);
        jPDatosEliminar.setLayout(jPDatosEliminarLayout);
        jPDatosEliminarLayout.setHorizontalGroup(
            jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFabAut)
                            .addComponent(jLabelCategoria)
                            .addComponent(jLabelEstado)
                            .addComponent(jLabelCondicion))
                        .addGap(41, 41, 41)
                        .addGroup(jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCondicion_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTFEstado_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFCategoria_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFFabricanteAutor_Eliminar))
                        .addGap(19, 19, 19))
                    .addGroup(jPDatosEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosEliminarLayout.createSequentialGroup()
                                .addComponent(jLabelNom)
                                .addGap(18, 18, 18))
                            .addGroup(jPDatosEliminarLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNombre_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jTFCodigo_Eliminar))
                        .addContainerGap())))
        );
        jPDatosEliminarLayout.setVerticalGroup(
            jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombre_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNom))
                .addGap(18, 18, 18)
                .addGroup(jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFabricanteAutor_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFabAut))
                .addGap(18, 18, 18)
                .addGroup(jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCategoria_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategoria))
                .addGap(18, 18, 18)
                .addGroup(jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEstado_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado))
                .addGap(18, 18, 18)
                .addGroup(jPDatosEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCondicion_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCondicion))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPDatosEliminar);
        jPDatosEliminar.setBounds(10, 140, 360, 280);

        jPanelDato.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDato.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos"));

        jTFBuscar_Eliminar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_Eliminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFBuscar_EliminarFocusLost(evt);
            }
        });
        jTFBuscar_Eliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código:");

        javax.swing.GroupLayout jPanelDatoLayout = new javax.swing.GroupLayout(jPanelDato);
        jPanelDato.setLayout(jPanelDatoLayout);
        jPanelDatoLayout.setHorizontalGroup(
            jPanelDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLCodigo)
                .addGap(55, 55, 55)
                .addComponent(jTFBuscar_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoLayout.setVerticalGroup(
            jPanelDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDato);
        jPanelDato.setBounds(10, 40, 360, 100);
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 380, 500);

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPFondo.add(jPanel1);
        jPanel1.setBounds(0, 30, 380, 400);

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
        jButtonSalirIcon1.setBounds(350, 0, 30, 30);

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
        jButtonMinimizar1.setBounds(320, 0, 30, 30);

        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 380, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFBuscar_EliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarKeyTyped

    }//GEN-LAST:event_jTFBuscar_EliminarKeyTyped

    private void jTFBuscar_EliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarKeyReleased

    }//GEN-LAST:event_jTFBuscar_EliminarKeyReleased

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("aceptar");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed

        if (jTFBuscar_Eliminar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Colocar código");
        } else {
            if (jTFBuscar_Eliminar.getText().startsWith("INSTR-")) {
                this.SQL = """
                           SELECT COUNT(*) AS count FROM instrumentos WHERE Codigo = '""" + jTFBuscar_Eliminar.getText() + "';";
                try {
                    ResultSet resultado = con.query(SQL);
                    if (resultado.next()) {
                        int count = resultado.getInt("count");
                        if (count > 0) {
                            this.SQL = """
                   SELECT Codigo,Nombre,Fabricante,Categoria,EstadoAlquiler,Condicion FROM instrumentos WHERE """
                                    + " " + "Codigo" + " LIKE '%" + jTFBuscar_Eliminar.getText() + "%';";
                            ResultSet resultado1 = con.query(SQL);
                            if (resultado1.next()) {
                                jTFCodigo_Eliminar.setText(resultado1.getString("Codigo"));
                                jTFNombre_Eliminar.setText(resultado1.getString("Nombre"));
                                jTFFabricanteAutor_Eliminar.setText(resultado1.getString("Fabricante"));
                                jTFCategoria_Eliminar.setText(resultado1.getString("Categoria"));
                                jTFEstado_Eliminar.setText(resultado1.getString("EstadoAlquiler"));
                                jTFCondicion_Eliminar.setText(resultado1.getString("Condicion"));
                            }
                            int resultado2 = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el producto?");
                                if (resultado2 == JOptionPane.YES_OPTION) {
                                    this.SQL = """
                           DELETE FROM instrumentos WHERE Codigo = '""" + jTFBuscar_Eliminar.getText() + "';";
                                    con.update(SQL);
                                    JOptionPane.showMessageDialog(null, "Producto eliminado");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Producto no eliminado");
                                }
                        } else {
                            JOptionPane.showMessageDialog(null, "Código de producto no encontrado");
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JFAdmin_Insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (jTFBuscar_Eliminar.getText().startsWith("LIBR-")) {
                this.SQL = """
                           SELECT COUNT(*) AS count FROM libros WHERE Codigo = '""" + jTFBuscar_Eliminar.getText() + "';";
                try {
                    ResultSet resultado = con.query(SQL);
                    if (resultado.next()) {
                        int count = resultado.getInt("count");
                        if (count > 0) {
                            this.SQL = """
                   SELECT Codigo,Nombre,Categoria,Autor,EstadoAlquiler,Condicion FROM libros WHERE """
                                    + " " + "Codigo" + " LIKE '%" + jTFBuscar_Eliminar.getText() + "%';";
                            ResultSet resultado1 = con.query(SQL);
                            if (resultado1.next()) {
                                jTFCodigo_Eliminar.setText(resultado1.getString("Codigo"));
                                jTFNombre_Eliminar.setText(resultado1.getString("Nombre"));
                                jTFFabricanteAutor_Eliminar.setText(resultado1.getString("Autor"));
                                jTFCategoria_Eliminar.setText(resultado1.getString("Categoria"));
                                jTFEstado_Eliminar.setText(resultado1.getString("EstadoAlquiler"));
                                jTFCondicion_Eliminar.setText(resultado1.getString("Condicion"));

                                int resultado2 = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el producto?");
                                if (resultado2 == JOptionPane.YES_OPTION) {
                                    this.SQL = """
                           DELETE FROM libros WHERE Codigo = '""" + jTFBuscar_Eliminar.getText() + "';";
                                    con.update(SQL);
                                    JOptionPane.showMessageDialog(null, "Producto eliminado");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Producto no eliminado");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Código de producto no encontrado");
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JFAdmin_Insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_JBIngreso1ActionPerformed

    private void JBCancela1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseEntered
        this.JBCancela1.setText("CANCELAR");
    }//GEN-LAST:event_JBCancela1MouseEntered

    private void JBCancela1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseExited
        this.JBCancela1.setText("cancelar");
    }//GEN-LAST:event_JBCancela1MouseExited

    private void JBCancela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancela1ActionPerformed
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

    private void jTFBuscar_EliminarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarFocusLost
        if (jTFBuscar_Eliminar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Colocar código");
        }else {
            //colocar datos en campos
        }
    }//GEN-LAST:event_jTFBuscar_EliminarFocusLost

//    public void limpiarCampos(){
//        this.jTFCodigo_EliminarEst.setText("");
//        this.jTFNombres_EliminarEst.setText("");
//        this.jTFApellidos_EliminarEst.setText("");
//        this.jTFCelu_EliminarEst.setText("");
//        this.jTFSectorEst_EliminarEst.setText("");
//        this.jTFFacultad_EliminarEst.setText("");
//        this.jTFCorreo_EliminarEst.setText("");
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCondicion;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFabAut;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosEliminar;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDato;
    public static javax.swing.JTextField jTFBuscar_Eliminar;
    public static javax.swing.JTextField jTFCategoria_Eliminar;
    public static javax.swing.JTextField jTFCodigo_Eliminar;
    public static javax.swing.JTextField jTFCondicion_Eliminar;
    public static javax.swing.JTextField jTFEstado_Eliminar;
    public static javax.swing.JTextField jTFFabricanteAutor_Eliminar;
    public static javax.swing.JTextField jTFNombre_Eliminar;
    // End of variables declaration//GEN-END:variables
}
