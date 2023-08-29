package GUI.Administrador.Gestion_Sistema;

import Negocio.Conexion;
import Negocio.Diseño;
import Negocio.Validaciones;
import static com.sun.source.tree.Tree.Kind.OR;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_desbloquear extends javax.swing.JFrame {

    private int x;
    private int y;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();
    Conexion con = new Conexion();
    Validaciones val = new Validaciones();
    ButtonGroup buttonGroup = new ButtonGroup();
    String SQL;
    String tabla = "Bloqueados";
    String titulo = null;
    String mensaje = null;

    public JFAdmin_desbloquear() {
        initComponents();
        setLocationRelativeTo(this);
        buttonGroup.add(jRBBloquear);
        buttonGroup.add(jRBDesbloquear);
        dis.jtableHead(jTPagos);
        this.SQL = """
                   Select u.cedula, p.Nombres, p.Apellidos, p.correo, u.Nombre_Usuario, u.bloqueo from Users u JOIN Personas p
                   ON p.Cedula = u.cedula WHERE u.bloqueo = 1 and u.rol = 'estudiante';""";
        con.busqueda_y_despliegue(this.jTPagos, tabla, this.SQL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanelDatoAdmin1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPagos = new javax.swing.JTable();
        jPDatoConsultadoInstrumento = new javax.swing.JPanel();
        jTFCedula = new javax.swing.JTextField();
        jTFNombres = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLNombres = new javax.swing.JLabel();
        jRBBloquear = new javax.swing.JRadioButton();
        jRBDesbloquear = new javax.swing.JRadioButton();
        jLApellidos = new javax.swing.JLabel();
        jTFApellidos = new javax.swing.JTextField();
        jLUsuari = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jLCorreo = new javax.swing.JLabel();
        jTFCorreo = new javax.swing.JTextField();
        jPanelDatoAdmin = new javax.swing.JPanel();
        jTFBuscar_EliminarUsu = new javax.swing.JTextField();
        jLCedula = new javax.swing.JLabel();
        jLabelFondo1 = new javax.swing.JLabel();
        jPFondo = new javax.swing.JPanel();
        JBIngreso1 = new javax.swing.JButton();
        JBCancela1 = new javax.swing.JButton();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jButtonMinimizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(840, 389));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(840, 389));
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
        jLabelTitulo.setText("Desbloquear o bloquear estudiantes");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 270, 30);

        jPanelDatoAdmin1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoAdmin1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estudiantes bloqueados"));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTPagos.setAutoCreateRowSorter(true);
        jTPagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTPagos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTPagos.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombres", "Apellidos", "Correo", "Usuario", "Estado"
            }
        ));
        jTPagos.setGridColor(new java.awt.Color(250, 183, 22));
        jTPagos.setRowSelectionAllowed(false);
        jTPagos.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTPagos.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTPagos.getTableHeader().setResizingAllowed(false);
        jTPagos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTPagos);

        javax.swing.GroupLayout jPanelDatoAdmin1Layout = new javax.swing.GroupLayout(jPanelDatoAdmin1);
        jPanelDatoAdmin1.setLayout(jPanelDatoAdmin1Layout);
        jPanelDatoAdmin1Layout.setHorizontalGroup(
            jPanelDatoAdmin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoAdmin1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoAdmin1Layout.setVerticalGroup(
            jPanelDatoAdmin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoAdmin1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelDatoAdmin1);
        jPanelDatoAdmin1.setBounds(380, 30, 450, 280);

        jPDatoConsultadoInstrumento.setBackground(new java.awt.Color(255, 255, 255));
        jPDatoConsultadoInstrumento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del estudiante"));

        jTFCedula.setEditable(false);
        jTFCedula.setBackground(new java.awt.Color(255, 255, 255));
        jTFCedula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFNombres.setEditable(false);
        jTFNombres.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombres.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombresActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Cédula:");

        jLNombres.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLNombres.setText("Nombres:");

        jRBBloquear.setBackground(new java.awt.Color(255, 255, 255));
        jRBBloquear.setText("Bloquear usuario");

        jRBDesbloquear.setBackground(new java.awt.Color(255, 255, 255));
        jRBDesbloquear.setText("Desbloquear usuario");

        jLApellidos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLApellidos.setText("Apellidos:");

        jTFApellidos.setEditable(false);
        jTFApellidos.setBackground(new java.awt.Color(255, 255, 255));
        jTFApellidos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFApellidosActionPerformed(evt);
            }
        });

        jLUsuari.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLUsuari.setText("Usuario:");

        jTFUsuario.setEditable(false);
        jTFUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTFUsuario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsuarioActionPerformed(evt);
            }
        });

        jLCorreo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLCorreo.setText("Correo:");

        jTFCorreo.setEditable(false);
        jTFCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jTFCorreo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDatoConsultadoInstrumentoLayout = new javax.swing.GroupLayout(jPDatoConsultadoInstrumento);
        jPDatoConsultadoInstrumento.setLayout(jPDatoConsultadoInstrumentoLayout);
        jPDatoConsultadoInstrumentoLayout.setHorizontalGroup(
            jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatoConsultadoInstrumentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombres)
                    .addComponent(jLApellidos)
                    .addComponent(jLUsuari)
                    .addComponent(jLCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCorreo)
                    .addComponent(jTFUsuario)
                    .addComponent(jTFApellidos)
                    .addComponent(jTFCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(jTFNombres))
                .addContainerGap())
            .addGroup(jPDatoConsultadoInstrumentoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jRBBloquear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBDesbloquear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPDatoConsultadoInstrumentoLayout.setVerticalGroup(
            jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatoConsultadoInstrumentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUsuari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBBloquear)
                    .addComponent(jRBDesbloquear))
                .addGap(82, 82, 82))
        );

        getContentPane().add(jPDatoConsultadoInstrumento);
        jPDatoConsultadoInstrumento.setBounds(10, 100, 360, 210);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
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

        getContentPane().add(jPanelDatoAdmin);
        jPanelDatoAdmin.setBounds(10, 30, 360, 67);

        jLabelFondo1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo1.setOpaque(true);
        getContentPane().add(jLabelFondo1);
        jLabelFondo1.setBounds(0, 30, 840, 290);

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

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
        JBIngreso1.setBounds(310, 340, 89, 32);

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
        JBCancela1.setBounds(420, 340, 89, 32);

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
        jButtonSalirIcon1.setBounds(810, 0, 30, 30);

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
        jButtonMinimizar1.setBounds(780, 0, 30, 30);

        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 840, 450);

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

    private void jTFNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombresActionPerformed

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("aceptar");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed
        String parametroBusqueda = jTFBuscar_EliminarUsu.getText();
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
                this.SQL = "Select count(*) from Estudiantes where Cedula_Estudiante like '%" + parametroBusqueda + "%'";
                if (con.busquedaCod(tabla, SQL, "count(*)") < 1) {
                    getToolkit().beep();
                    titulo = "ADVERTENCIA";
                    mensaje = "El estudiante al que hace referencia no existe";
                    emitirMensaje(mensaje, titulo);
                } else {
                    int seleccion;
                    if (jRBBloquear.isSelected()) {
                        seleccion = JOptionPane.showConfirmDialog(null, "¿Desea bloquear al estudiante?" + "\n     -Se podrá volver a desbloquear despues", "Bloquear estudiante", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ICONCANCELAR);
                        this.SQL = "UPDATE Users SET bloqueo = 1 WHERE Rol = 'estudiante' AND Cedula = '" + parametroBusqueda + "';";
                        mensaje = "Elemento bloqueado exitosamente";
                        con.actualizarEliminarTablas(SQL);
                    }else if (jRBDesbloquear.isSelected()) {
                        seleccion = JOptionPane.showConfirmDialog(null, "¿Desea desbloquear al estudiante?" + "\n     -Se podrá volver a bloquear despues", "Desbloquear estudiante", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ICONCANCELAR);
                        this.SQL = "UPDATE Users SET bloqueo = 0 WHERE Rol = 'estudiante' AND Cedula = '" + parametroBusqueda + "';";
                        mensaje = "Elemento desbloqueado exitosamente";
                    }
                    titulo = "RESULTADO";
                    if (con.actualizarEliminarTablas(SQL)) {
                        dispose();
                        emitirMensaje(mensaje, titulo);
                    }else
                    {
                        mensaje = "Ocurrio un error realizando la acción";
                        emitirMensaje(mensaje, titulo);
                    }
                    
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
        limpiarCampos();
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jTFApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFApellidosActionPerformed

    private void jTFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsuarioActionPerformed

    private void jTFCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCorreoActionPerformed

    private void jTFBuscar_EliminarUsuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarUsuKeyReleased
        String parametroBusqueda = this.jTFBuscar_EliminarUsu.getText();
        if (parametroBusqueda.length() == 10) {
            this.SQL = "SELECT u.Cedula, p.Nombres, p.Apellidos, u.Nombre_Usuario, p.Correo FROM "
                    + "Users u JOIN Personas p ON p.Cedula = u.Cedula WHERE u.Cedula LIKE '%" + parametroBusqueda + "%';";
            con.despliegueFields(SQL, "Users", jTFCedula, jTFNombres, jTFApellidos, jTFUsuario,
                    jTFCorreo, null, null, null, "bloquear");
        } else {
            limpiarCampos();
        }
    }//GEN-LAST:event_jTFBuscar_EliminarUsuKeyReleased

    private void jTFBuscar_EliminarUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarUsuKeyTyped

    }//GEN-LAST:event_jTFBuscar_EliminarUsuKeyTyped

    public void limpiarCampos() {
        this.jTFCedula.setText("");
        this.jTFNombres.setText("");
        this.jTFApellidos.setText("");
        this.jTFUsuario.setText("");
        this.jTFCorreo.setText("");
        buttonGroup.clearSelection();
    }

    private void emitirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLUsuari;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelFondo1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatoConsultadoInstrumento;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanelDatoAdmin;
    private javax.swing.JPanel jPanelDatoAdmin1;
    private javax.swing.JRadioButton jRBBloquear;
    private javax.swing.JRadioButton jRBDesbloquear;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTFApellidos;
    public static javax.swing.JTextField jTFBuscar_EliminarUsu;
    public static javax.swing.JTextField jTFCedula;
    public static javax.swing.JTextField jTFCorreo;
    public static javax.swing.JTextField jTFNombres;
    public static javax.swing.JTextField jTFUsuario;
    private javax.swing.JTable jTPagos;
    // End of variables declaration//GEN-END:variables
}
