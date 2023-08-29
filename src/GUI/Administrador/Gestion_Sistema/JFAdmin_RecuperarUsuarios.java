package GUI.Administrador.Gestion_Sistema;

import Negocio.Conexion;
import Negocio.Diseño;
import Negocio.Validaciones;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_RecuperarUsuarios extends javax.swing.JFrame {

    private int x;
    private int y;
    private Conexion con = new Conexion();
    private String selectTabla = "Usuarios_Inactivos";
    private String SQL;
    String titulo = null;
    String mensaje = null;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();
    Validaciones val = new Validaciones();
    Diseño gui = new Diseño();

    public JFAdmin_RecuperarUsuarios() {
        initComponents();
        setLocationRelativeTo(this);
        gui.jtableHead(jTPagos);
        this.SQL = """
                   select u.cedula, p.nombres, p.apellidos, u.rol from usuarios_inactivos u join personas p
                   on p.cedula = u.cedula;""";
        con.busqueda_y_despliegue(this.jTPagos, this.selectTabla, this.SQL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPagos = new javax.swing.JTable();
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_CedulaEst = new javax.swing.JTextField();
        jLCedula = new javax.swing.JLabel();
        JBIngreso1 = new javax.swing.JButton();
        jPFondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jButtonMinimizar1 = new javax.swing.JButton();
        JBIngreso2 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(670, 480));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(670, 480));
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

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Usuarios inactivos");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTPagos.setAutoCreateRowSorter(true);
        jTPagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTPagos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTPagos.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombres", "Apellidos", "Rol"
            }
        ));
        jTPagos.setGridColor(new java.awt.Color(250, 183, 22));
        jTPagos.setRowSelectionAllowed(false);
        jTPagos.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTPagos.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTPagos.getTableHeader().setResizingAllowed(false);
        jTPagos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTPagos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 650, 280);

        jPanelDatoEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del usuario"));

        jTFBuscar_CedulaEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_CedulaEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_CedulaEstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_CedulaEstKeyTyped(evt);
            }
        });

        jLCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCedula.setText("N° Cédula:");

        JBIngreso1.setBackground(new java.awt.Color(250, 183, 22));
        JBIngreso1.setForeground(new java.awt.Color(255, 255, 255));
        JBIngreso1.setText("reactivar usuario");
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

        javax.swing.GroupLayout jPanelDatoEstudianteLayout = new javax.swing.GroupLayout(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setLayout(jPanelDatoEstudianteLayout);
        jPanelDatoEstudianteLayout.setHorizontalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLCedula)
                .addGap(18, 18, 18)
                .addComponent(jTFBuscar_CedulaEst, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanelDatoEstudianteLayout.setVerticalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_CedulaEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCedula)
                    .addComponent(JBIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setBounds(10, 40, 650, 70);

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jPFondo.add(jPanel1);
        jPanel1.setBounds(0, 30, 670, 380);

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
        jButtonSalirIcon1.setBounds(640, 0, 30, 30);

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
        jButtonMinimizar1.setBounds(610, 0, 30, 30);

        JBIngreso2.setBackground(new java.awt.Color(255, 255, 254));
        JBIngreso2.setForeground(new java.awt.Color(250, 183, 22));
        JBIngreso2.setText("cerrar");
        JBIngreso2.setBorder(null);
        JBIngreso2.setBorderPainted(false);
        JBIngreso2.setDefaultCapable(false);
        JBIngreso2.setFocusPainted(false);
        JBIngreso2.setHideActionText(true);
        JBIngreso2.setPreferredSize(new java.awt.Dimension(89, 32));
        JBIngreso2.setRequestFocusEnabled(false);
        JBIngreso2.setRolloverEnabled(false);
        JBIngreso2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBIngreso2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBIngreso2MouseExited(evt);
            }
        });
        JBIngreso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngreso2ActionPerformed(evt);
            }
        });
        jPFondo.add(JBIngreso2);
        JBIngreso2.setBounds(280, 430, 89, 32);

        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 670, 480);
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 660, 460);

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

    private void jTFBuscar_CedulaEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_CedulaEstKeyTyped

    }//GEN-LAST:event_jTFBuscar_CedulaEstKeyTyped

    private void jTFBuscar_CedulaEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_CedulaEstKeyReleased
        String parametroBusqueda = jTFBuscar_CedulaEst.getText();
        this.SQL = """
                   SELECT u.cedula, p.nombres, p.apellidos, u.rol FROM usuarios_inactivos u join personas p
                   on p.cedula = u.cedula where u.cedula LIKE '%""" + parametroBusqueda + "%';";
        con.busqueda_y_despliegue(this.jTPagos, this.selectTabla, this.SQL);
    }//GEN-LAST:event_jTFBuscar_CedulaEstKeyReleased

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("REACTIVAR USUARIO");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("reactivar usuario");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed
        String parametroBusqueda = jTFBuscar_CedulaEst.getText();
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
                this.SQL = "Select count(*) from usuarios_inactivos where Cedula like '%" + parametroBusqueda + "%'";
                if (con.busquedaCod(selectTabla, SQL, "count(*)") >= 1) {
                    getToolkit().beep();
                    titulo = "ADVERTENCIA";
                    mensaje = "El usuario al que hace referencia no existe o ya se encuentra activo";
                    emitirMensaje(mensaje, titulo);
                } else {
                    int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea reactivar el elemento?" + "\n     -Se podrá volver a desactivar un usuario", "Activar usuario", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ICONCANCELAR);
                    if (seleccion == 0) {
                        this.SQL = "DELETE from usuarios_inactivos Where Cedula = '" + parametroBusqueda + "';";
                        if (con.actualizarEliminarTablas(SQL) == true) {
                            titulo = "RESULTADO";
                            mensaje = "Elemento activado exitosamente";
                            dispose();
                            emitirMensaje(mensaje, titulo);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_JBIngreso1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

    private void JBIngreso2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso2MouseEntered
        this.JBIngreso2.setText("CERRAR");
    }//GEN-LAST:event_JBIngreso2MouseEntered

    private void JBIngreso2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso2MouseExited
        this.JBIngreso2.setText("cerrar");
    }//GEN-LAST:event_JBIngreso2MouseExited

    private void JBIngreso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso2ActionPerformed
        jTFBuscar_CedulaEst.setText("");
        dispose();
    }//GEN-LAST:event_JBIngreso2ActionPerformed

    private void emitirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton JBIngreso2;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDatoEstudiante;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTFBuscar_CedulaEst;
    private javax.swing.JTable jTPagos;
    // End of variables declaration//GEN-END:variables
}
