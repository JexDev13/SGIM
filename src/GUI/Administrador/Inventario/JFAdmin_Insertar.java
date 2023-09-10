package GUI.Administrador.Inventario;

import Negocio.Diseño;
import Negocio.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_Insertar extends javax.swing.JFrame {

    private int x;
    private int y;
    private Conexion con = new Conexion();
    private String SQL;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();

    public JFAdmin_Insertar() {
        initComponents();
        setLocationRelativeTo(this);
        jTFCodigo.setEditable(false);
        jTFNombre.setEditable(false);
        jTFCategoria.setEditable(false);
        jTFFabricanteAutor.setEditable(false);
        jTextAreaCondicion.setEditable(false);
        JBIngreso1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTFCategoria = new javax.swing.JTextField();
        jTFFabricanteAutor = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFCodigo = new javax.swing.JTextField();
        jLCategoria = new javax.swing.JLabel();
        jLFabricanteAutor = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jLTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLCondicion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCondicion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(292, 239));
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

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

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
        jPFondo.add(jButtonMinimizar);
        jButtonMinimizar.setBounds(320, 0, 30, 30);

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
        jPFondo.add(jButtonSalirIcon);
        jButtonSalirIcon.setBounds(350, 0, 30, 30);

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
        jPFondo.add(JBCancela1);
        JBCancela1.setBounds(200, 460, 89, 32);

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
        jPFondo.add(JBIngreso1);
        JBIngreso1.setBounds(50, 460, 89, 32);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText(" Nuevo");
        jPFondo.add(jLabelTitulo);
        jLabelTitulo.setBounds(0, 0, 200, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTFCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCategoriaFocusLost(evt);
            }
        });

        jTFFabricanteAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFFabricanteAutorFocusLost(evt);
            }
        });
        jTFFabricanteAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFabricanteAutorActionPerformed(evt);
            }
        });

        jTFNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNombreFocusLost(evt);
            }
        });

        jTFCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodigoFocusLost(evt);
            }
        });

        jLCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCategoria.setText("Categoría:");

        jLFabricanteAutor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLFabricanteAutor.setText("Elaborador:");

        jLNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNombre.setText("Nombre:");

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código:");

        jLTipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLTipo.setText("Tipo:");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar tipo...", "Instrumento", "Libro" }));
        jComboBoxTipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxTipoFocusLost(evt);
            }
        });

        jLCondicion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCondicion.setText("Condición:");

        jTextAreaCondicion.setColumns(20);
        jTextAreaCondicion.setRows(5);
        jTextAreaCondicion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAreaCondicionFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaCondicion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTipo)
                            .addComponent(jLCodigo)
                            .addComponent(jLNombre)
                            .addComponent(jLCategoria)
                            .addComponent(jLFabricanteAutor))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFCategoria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFFabricanteAutor)
                            .addComponent(jComboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLCondicion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTipo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCategoria)
                    .addComponent(jTFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFabricanteAutor)
                    .addComponent(jTFFabricanteAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCondicion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPFondo.add(jPanel1);
        jPanel1.setBounds(0, 30, 380, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("aceptar");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed
        JBIngreso1.requestFocusInWindow();
        if (jComboBoxTipo.getSelectedItem().equals("Seleccionar tipo...")) {
            JOptionPane.showMessageDialog(null, "Seleccione un tipo");
        } else if (jTFCodigo.getText().length() == 10 && jComboBoxTipo.getSelectedItem().equals("Libro")) {
            JOptionPane.showMessageDialog(null, "Seleccione el tipo adecuado para el código");
        } else if (jTFCodigo.getText().length() == 9 && jComboBoxTipo.getSelectedItem().equals("Instrumento")) {
            JOptionPane.showMessageDialog(null, "Seleccione el tipo adecuado para el código");
        } else if (jTFCodigo.getText().isEmpty() || jTFNombre.getText().isEmpty() || jTFCategoria.getText().isEmpty() || jTFFabricanteAutor.getText().isEmpty() || jTextAreaCondicion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            if (jTFCodigo.getText().startsWith("INSTR-")) {
                this.SQL = """
                           SELECT COUNT(*) AS count FROM instrumentos WHERE Codigo = '""" + jTFCodigo.getText() + "';";
                try {
                    ResultSet resultado = con.query(SQL);
                    if (resultado.next()) {
                        int count = resultado.getInt("count");
                        if (count > 0) {
                            JOptionPane.showMessageDialog(null, "El código ya existe");
                        } else {
                            this.SQL = """
                           INSERT INTO instrumentos (Codigo, Nombre, Fabricante, Categoria, EstadoAlquiler, Condicion) VALUES """ + "('" + jTFCodigo.getText() + "', '" + jTFNombre.getText() + "', '" + jTFFabricanteAutor.getText() + "', '" + jTFCategoria.getText() + "', '" + "No Alquilado" + "', '" + jTextAreaCondicion.getText() + "');";
                            con.update(SQL);
                            JOptionPane.showMessageDialog(null, "Instrumento registrado exitosamente");
                            borrarCampos();
                            this.dispose();
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JFAdmin_Insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (jTFCodigo.getText().startsWith("LIBR-")) {
                this.SQL = """
                           SELECT COUNT(*) AS count FROM libros WHERE Codigo = '""" + jTFCodigo.getText() + "';";
                try {
                    ResultSet resultado = con.query(SQL);
                    if (resultado.next()) {
                        int count = resultado.getInt("count");
                        if (count > 0) {
                            JOptionPane.showMessageDialog(null, "El código ya existe");
                        } else {
                            this.SQL = """
                           INSERT INTO libros (Codigo, Nombre, Autor, Categoria, EstadoAlquiler, Condicion) VALUES """ + "('" + jTFCodigo.getText() + "', '" + jTFNombre.getText() + "', '" + jTFFabricanteAutor.getText() + "', '" + jTFCategoria.getText() + "', '" + "No Alquilado" + "', '" + jTextAreaCondicion.getText() + "')";
                            con.update(SQL);
                            JOptionPane.showMessageDialog(null, "Libro registrado exitosamente");
                            borrarCampos();
                            this.dispose();
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
        String tituo = "¿Cancelar ingreso?";
        String mensaje = "Si cancela los datos ingresados no serán guardados";
        emitirMensaje(mensaje, tituo);
        borrarCampos();
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jTFFabricanteAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFabricanteAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFabricanteAutorActionPerformed

    private void jTFCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoFocusLost
        if (jTFCodigo.isEditable()) {
            if (jComboBoxTipo.getSelectedItem().equals("Instrumento")) {
                if (!jTFCodigo.getText().isEmpty()) {
                    if (jTFCodigo.getText().length() != 10) {
                        JOptionPane.showMessageDialog(null, "Código con número de caracteres incorrectos");
                        jTFCodigo.setText("");
                    } else if (!jTFCodigo.getText().startsWith("INSTR-") || !jTFCodigo.getText().matches("INSTR-\\d{4}")) {
                        JOptionPane.showMessageDialog(null, "Formato de código incorrecto");
                        jTFCodigo.setText("");
                    }
                }
            } else {
                if (!jTFCodigo.getText().isEmpty()) {
                    if (jTFCodigo.getText().length() != 9) {
                        JOptionPane.showMessageDialog(null, "Código con número de caracteres incorrectos");
                        jTFCodigo.setText("");
                    } else if (!jTFCodigo.getText().startsWith("LIBR-") || !jTFCodigo.getText().matches("LIBR-\\d{4}")) {
                        JOptionPane.showMessageDialog(null, "Formato de código incorrecto");
                        jTFCodigo.setText("");
                    }
                }
            }
        }
    }//GEN-LAST:event_jTFCodigoFocusLost

    private void jComboBoxTipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxTipoFocusLost
        if(jComboBoxTipo.getSelectedItem().equals("Seleccionar tipo...")) {
            jTFCodigo.setEditable(false);
            jTFNombre.setEditable(false);
            jTFCategoria.setEditable(false);
            jTFFabricanteAutor.setEditable(false);
            jTextAreaCondicion.setEditable(false);
            JBIngreso1.setVisible(false);
            JOptionPane.showMessageDialog(null, "Seleccione un tipo");
            
        }else {
            jTFCodigo.setEditable(true);
            jTFNombre.setEditable(true);
            jTFCategoria.setEditable(true);
            jTFFabricanteAutor.setEditable(true);
            jTextAreaCondicion.setEditable(true);
            JBIngreso1.setVisible(true);
        }
    }//GEN-LAST:event_jComboBoxTipoFocusLost

    private void jTFNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNombreFocusLost
        if (jTFNombre.isEditable()) {
            if (jTFNombre.getText().length() > 50) {
                JOptionPane.showMessageDialog(null, "Nombre con exceso de caracteres");
                jTFNombre.setText("");
            }
        }
    }//GEN-LAST:event_jTFNombreFocusLost

    private void jTFCategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCategoriaFocusLost
        if (jTFCategoria.isEditable()) {
            if (jTFCategoria.getText().length() > 30) {
                JOptionPane.showMessageDialog(null, "Categoria con exceso de caracteres");
                jTFCategoria.setText("");
            }
        }
    }//GEN-LAST:event_jTFCategoriaFocusLost

    private void jTFFabricanteAutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFFabricanteAutorFocusLost
        if (jTFFabricanteAutor.isEditable()) {
            if (jTFFabricanteAutor.getText().length() > 50) {
                JOptionPane.showMessageDialog(null, "Elaborador con exceso de caracteres");
                jTFFabricanteAutor.setText("");
            }
        }
    }//GEN-LAST:event_jTFFabricanteAutorFocusLost

    private void jTextAreaCondicionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaCondicionFocusLost
        if (jTextAreaCondicion.isEditable()) {
            if (jTextAreaCondicion.getText().length() > 200) {
                JOptionPane.showMessageDialog(null, "Condición con exceso de caracteres");
                jTextAreaCondicion.setText("");
            }
        }
    }//GEN-LAST:event_jTextAreaCondicionFocusLost

    public void borrarCampos() {
        this.jTFCodigo.setText("");
        this.jTFCategoria.setText("");
        this.jTFFabricanteAutor.setText("");
        this.jTFNombre.setText("");
        this.jTextAreaCondicion.setText("");
    }
    
    private void emitirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLCategoria;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCondicion;
    private javax.swing.JLabel jLFabricanteAutor;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCategoria;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFFabricanteAutor;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextArea jTextAreaCondicion;
    // End of variables declaration//GEN-END:variables
}
