package GUI.Administrador.Inventario;

import Negocio.Diseño;
import javax.swing.JOptionPane;
import Negocio.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_Prestamo extends javax.swing.JFrame {

    private int x;
    private int y;
    private Conexion con = new Conexion();
    private String SQL;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();

    public JFAdmin_Prestamo() {
        initComponents();
        setLocationRelativeTo(this);
        jTFCodigo_buscar.setText("");
        jTFNoCedula_Buscar.setText("");
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
        jTFNoCedula_Buscar = new javax.swing.JTextField();
        jTFCodigo_buscar = new javax.swing.JTextField();
        jLNoCedula = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTFCodigo_elem = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTFNombre_Element = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTFFabricante = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTFCategoria = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTFEstado = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTFCondicion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTFCedula = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();

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
        jButtonMinimizar.setBounds(330, 0, 30, 30);

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
        jButtonSalirIcon.setBounds(360, 0, 30, 30);

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
        JBCancela1.setBounds(200, 450, 89, 32);

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
        JBIngreso1.setBounds(90, 450, 89, 32);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText(" Préstamo");
        jPFondo.add(jLabelTitulo);
        jLabelTitulo.setBounds(0, 0, 200, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTFNoCedula_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNoCedula_BuscarKeyReleased(evt);
            }
        });

        jTFCodigo_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCodigo_buscarKeyReleased(evt);
            }
        });

        jLNoCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNoCedula.setText("N°Cédula Estudiante:");

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Elemento"));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel22.setText("Código:");

        jTFCodigo_elem.setEditable(false);
        jTFCodigo_elem.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Nombre:");

        jTFNombre_Element.setEditable(false);
        jTFNombre_Element.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel23.setText("Fabricante:");

        jTFFabricante.setEditable(false);
        jTFFabricante.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFFabricante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFFabricanteKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel24.setText("Categoría:");

        jTFCategoria.setEditable(false);
        jTFCategoria.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCategoriaKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel25.setText("Estado alquiler:");

        jTFEstado.setEditable(false);
        jTFEstado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFEstadoKeyTyped(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel26.setText("Condición:");

        jTFCondicion.setEditable(false);
        jTFCondicion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCondicion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCondicionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFEstado))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTFCondicion))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCategoria))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFCodigo_elem, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jTFFabricante)
                                    .addComponent(jTFNombre_Element))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_elem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombre_Element, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudiante"));

        jTFCedula.setEditable(false);
        jTFCedula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel27.setText("N° Cédula");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel21.setText("Nombre:");

        jTFNombre.setEditable(false);
        jTFNombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jTFNombre))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLNoCedula)
                                .addGap(18, 18, 18)
                                .addComponent(jTFNoCedula_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLCodigo)
                                .addGap(88, 88, 88)
                                .addComponent(jTFCodigo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jTFCodigo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNoCedula)
                    .addComponent(jTFNoCedula_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPFondo.add(jPanel1);
        jPanel1.setBounds(0, 30, 390, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (jTFCodigo_buscar.getText().trim().isEmpty() || jTFNoCedula_Buscar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            // verificar si existe codigo
            // verificar si existe cedula
            // si existen registrar el prestamo
            if (jTFCodigo_buscar.getText().trim().startsWith("INSTR-")) {
                this.SQL = """
                           SELECT COUNT(*) AS count FROM instrumentos WHERE Codigo = '""" + jTFCodigo_buscar.getText().trim() + "';";
                try {
                    ResultSet resultado = con.query(SQL);
                    if (resultado.next()) {
                        int count = resultado.getInt("count");
                        if (count > 0) {
                            this.SQL = """
                           SELECT COUNT(*) AS count FROM estudiantes WHERE Cedula_Estudiante = '""" + jTFNoCedula_Buscar.getText().trim() + "';";
                            try {
                                ResultSet resultado1 = con.query(SQL);
                                if (resultado1.next()) {
                                    int count1 = resultado1.getInt("count");
                                    if (count1 > 0) {
                                        this.SQL = """
                           UPDATE instrumentos SET EstadoAlquiler = 'Alquilado' WHERE Codigo = '""" + jTFCodigo_buscar.getText().trim() + "';";
                                        con.update(SQL);
                                        this.SQL = """
                           Insert into prestamos_Instrumentos (Cedula_estudiante,Codigo_instrumento,Fecha) values ('""" + jTFNoCedula_Buscar.getText().trim() + "', '" + jTFCodigo_buscar.getText().trim() + "', '" + obtenerFecha() + "');";
                                        con.update(SQL);
                                        JOptionPane.showMessageDialog(null, "Préstamo registrado");
                                        jTFCodigo_buscar.setText("");
                                        jTFNoCedula_Buscar.setText("");
                                        this.dispose();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
                                    }
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(JFAdmin_Insertar.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Código de producto no encontrado");
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JFAdmin_Insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (jTFCodigo_buscar.getText().trim().startsWith("LIBR-")) {
                this.SQL = """
                           SELECT COUNT(*) AS count FROM libros WHERE Codigo = '""" + jTFCodigo_buscar.getText().trim() + "';";
                try {
                    ResultSet resultado = con.query(SQL);
                    if (resultado.next()) {
                        int count = resultado.getInt("count");
                        if (count > 0) {
                            this.SQL = """
                           SELECT COUNT(*) AS count FROM estudiantes WHERE Cedula_Estudiante = '""" + jTFNoCedula_Buscar.getText().trim() + "';";
                            try {
                                ResultSet resultado1 = con.query(SQL);
                                if (resultado1.next()) {
                                    int count1 = resultado1.getInt("count");
                                    if (count1 > 0) {
                                        this.SQL = """
                           UPDATE libros SET EstadoAlquiler = 'Alquilado' WHERE Codigo = '""" + jTFCodigo_buscar.getText().trim() + "';";
                                        con.update(SQL);
                                        this.SQL = """
                           Insert into prestamos_Libros (Cedula_estudiante,Codigo_libro,Fecha) values ('""" + jTFNoCedula_Buscar.getText().trim() + "', '" + jTFCodigo_buscar.getText().trim() + "', '" + obtenerFecha() + "');";
                                        con.update(SQL);
                                        JOptionPane.showMessageDialog(null, "Préstamo registrado");
                                        jTFCodigo_buscar.setText("");
                                        jTFNoCedula_Buscar.setText("");
                                        this.dispose();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
                                    }
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(JFAdmin_Insertar.class.getName()).log(Level.SEVERE, null, ex);
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
        String tituo = "¿Cancelar ingreso?";
        String mensaje = "Si cancela los datos ingresados no serán guardados";
        emitirMensaje(mensaje, tituo);
        borrarCampos();
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jTFFabricanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFabricanteKeyTyped

    }//GEN-LAST:event_jTFFabricanteKeyTyped

    private void jTFCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCategoriaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCategoriaKeyTyped

    private void jTFEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFEstadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEstadoKeyTyped

    private void jTFCondicionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCondicionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCondicionKeyTyped

    private void jTFNoCedula_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNoCedula_BuscarKeyReleased
        String parametroBusqueda = this.jTFNoCedula_Buscar.getText().trim();
        if (parametroBusqueda.length() == 10) {
            this.SQL = "SELECT Cedula as Cedula_Estudiante, CONCAT(Nombres,' ',Apellidos) as Nombre FROM Personas WHERE Rol = 'Estudiante' AND Cedula LIKE '%" + parametroBusqueda + "%';";
            con.despliegueFields(SQL, "Estudiantes", 
                    jTFCedula, 
                    jTFNombre,
                    null,
                    null,
                    null,
                    null, 
                    null, 
                    null, "actualizar");
        } else {
            borrarCampos();
        }
    }//GEN-LAST:event_jTFNoCedula_BuscarKeyReleased

    private void jTFCodigo_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigo_buscarKeyReleased
        String parametroBusqueda = this.jTFCodigo_buscar.getText().trim();
        if (parametroBusqueda.length() >= 1) {
            this.SQL = """
                   select Codigo, Nombre, Categoria, Fabricante as creador, EstadoAlquiler, Condicion from instrumentos WHERE Codigo like '%""" + parametroBusqueda + "%'\n"
                    + """
                   UNION
                   select Codigo, Nombre, Categoria, Autor as creador, EstadoAlquiler, Condicion from libros WHERE Codigo like '% """ + parametroBusqueda + "%';";
            con.despliegueFields(SQL, "Renta",
                    jTFCodigo_elem,
                    jTFNombre_Element,
                    jTFFabricante,
                    jTFCategoria,
                    jTFEstado,
                    jTFCondicion,
                    null,
                    null, "actualizar");
        } else {
            borrarCampos();
        }
    }//GEN-LAST:event_jTFCodigo_buscarKeyReleased

    public void borrarCampos() {
        this.jTFCodigo_buscar.setText("");
        jTFCodigo_elem.setText("");
        jTFNombre_Element.setText("");
        jTFFabricante.setText("");
        jTFCategoria.setText("");
        jTFEstado.setText("");
        jTFCondicion.setText("");
    }

    private String obtenerFecha() {
        Date fechaActual = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada = sdf.format(fechaActual);
        return fechaFormateada;
    }

    private void emitirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLNoCedula;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JTextField jTFCategoria;
    public static javax.swing.JTextField jTFCedula;
    private javax.swing.JTextField jTFCodigo_buscar;
    public static javax.swing.JTextField jTFCodigo_elem;
    public static javax.swing.JTextField jTFCondicion;
    public static javax.swing.JTextField jTFEstado;
    public static javax.swing.JTextField jTFFabricante;
    private javax.swing.JTextField jTFNoCedula_Buscar;
    public static javax.swing.JTextField jTFNombre;
    public static javax.swing.JTextField jTFNombre_Element;
    // End of variables declaration//GEN-END:variables
}
