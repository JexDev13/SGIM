package GUI.Administrador.Estudiantes;

import Negocio.Conexion;
import Negocio.Diseño;
import Negocio.Validaciones;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_ActualizarEstudiante extends javax.swing.JFrame {

    private int x;
    private int y;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();
    Conexion con = new Conexion();
    Validaciones val = new Validaciones();
    String SQL;
    String titulo = null;
    String mensaje = null;

    public JFAdmin_ActualizarEstudiante() {
        initComponents();
        setLocationRelativeTo(this);
        this.jTFCodigo_ActualizarEst.setEditable(false);
        this.jTFNombres_ActualizarEst.setEditable(false);
        this.jTFFechaNacimiento_ActualizarEst.setEditable(false);
        this.jTFFechaNacimiento_ActualizarSexo.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_ActualizarEst = new javax.swing.JTextField();
        jLCedula = new javax.swing.JLabel();
        jPDatosEstudianteActualizar = new javax.swing.JPanel();
        jTFCorreo_ActualizarEst = new javax.swing.JTextField();
        jTFNombresRepre_ActualizarEst = new javax.swing.JTextField();
        jTFCodigo_ActualizarEst = new javax.swing.JTextField();
        jTFFechaNacimiento_ActualizarEst = new javax.swing.JTextField();
        jTFNombres_ActualizarEst = new javax.swing.JTextField();
        jChBNombresRepre_ActualizarEst = new javax.swing.JCheckBox();
        jChBCorreo_ActualizarEst = new javax.swing.JCheckBox();
        jTFApellidosRepre_ActualizarEst = new javax.swing.JTextField();
        jChBApellidosRepre_ActualizarEst = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jTFTelefono_ActualizarEst = new javax.swing.JTextField();
        jChBTelefono_ActualizarEst1 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTFFechaNacimiento_ActualizarSexo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(489, 559));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(489, 559));
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 183, 22));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setText("ACTUALIZAR ESTUDIANTE");
        jPanel1.add(jLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

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
        jPanel1.add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 30, 30));

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
        jPanel1.add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 60));

        jPanel4.setBackground(new java.awt.Color(250, 183, 22));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel4.add(JBCancela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

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
        jPanel4.add(JBIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 490, 60));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatoEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Estudiante"));

        jTFBuscar_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_ActualizarEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarEstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarEstKeyTyped(evt);
            }
        });

        jLCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCedula.setText("N°Cédula:");

        javax.swing.GroupLayout jPanelDatoEstudianteLayout = new javax.swing.GroupLayout(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setLayout(jPanelDatoEstudianteLayout);
        jPanelDatoEstudianteLayout.setHorizontalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCedula)
                .addGap(18, 18, 18)
                .addComponent(jTFBuscar_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoEstudianteLayout.setVerticalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCedula))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.add(jPanelDatoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 20, 470, -1));

        jPDatosEstudianteActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEstudianteActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jTFCorreo_ActualizarEst.setEditable(false);
        jTFCorreo_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCorreo_ActualizarEst.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCorreo_ActualizarEstFocusLost(evt);
            }
        });

        jTFNombresRepre_ActualizarEst.setEditable(false);
        jTFNombresRepre_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCodigo_ActualizarEst.setEditable(false);
        jTFCodigo_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFFechaNacimiento_ActualizarEst.setEditable(false);
        jTFFechaNacimiento_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFFechaNacimiento_ActualizarEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFFechaNacimiento_ActualizarEstKeyTyped(evt);
            }
        });

        jTFNombres_ActualizarEst.setEditable(false);
        jTFNombres_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBNombresRepre_ActualizarEst.setBackground(new java.awt.Color(255, 255, 255));
        jChBNombresRepre_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBNombresRepre_ActualizarEst.setText("Nombres Repre");
        jChBNombresRepre_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBNombresRepre_ActualizarEstActionPerformed(evt);
            }
        });

        jChBCorreo_ActualizarEst.setBackground(new java.awt.Color(255, 255, 255));
        jChBCorreo_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBCorreo_ActualizarEst.setText("Correo electrónico");
        jChBCorreo_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBCorreo_ActualizarEstActionPerformed(evt);
            }
        });

        jTFApellidosRepre_ActualizarEst.setEditable(false);
        jTFApellidosRepre_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBApellidosRepre_ActualizarEst.setBackground(new java.awt.Color(255, 255, 255));
        jChBApellidosRepre_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBApellidosRepre_ActualizarEst.setText("Apellidos Repre.");
        jChBApellidosRepre_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBApellidosRepre_ActualizarEstActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Nombres:");

        jTFTelefono_ActualizarEst.setEditable(false);
        jTFTelefono_ActualizarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFTelefono_ActualizarEst.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFTelefono_ActualizarEstFocusLost(evt);
            }
        });
        jTFTelefono_ActualizarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefono_ActualizarEstActionPerformed(evt);
            }
        });

        jChBTelefono_ActualizarEst1.setBackground(new java.awt.Color(255, 255, 255));
        jChBTelefono_ActualizarEst1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBTelefono_ActualizarEst1.setText("Teléfono Repre.");
        jChBTelefono_ActualizarEst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBTelefono_ActualizarEst1ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel22.setText("N° Cédula");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel23.setText("Fech. Nacimiento:");

        jLabel24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel24.setText("Sexo:");

        jTFFechaNacimiento_ActualizarSexo.setEditable(false);
        jTFFechaNacimiento_ActualizarSexo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFFechaNacimiento_ActualizarSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFFechaNacimiento_ActualizarSexoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPDatosEstudianteActualizarLayout = new javax.swing.GroupLayout(jPDatosEstudianteActualizar);
        jPDatosEstudianteActualizar.setLayout(jPDatosEstudianteActualizarLayout);
        jPDatosEstudianteActualizarLayout.setHorizontalGroup(
            jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNombres_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(jTFCodigo_ActualizarEst)))
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jChBTelefono_ActualizarEst1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jChBApellidosRepre_ActualizarEst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jChBCorreo_ActualizarEst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(jChBNombresRepre_ActualizarEst, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFFechaNacimiento_ActualizarEst)
                            .addComponent(jTFFechaNacimiento_ActualizarSexo)
                            .addComponent(jTFCorreo_ActualizarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(jTFApellidosRepre_ActualizarEst)
                            .addComponent(jTFNombresRepre_ActualizarEst)
                            .addComponent(jTFTelefono_ActualizarEst))))
                .addContainerGap())
        );
        jPDatosEstudianteActualizarLayout.setVerticalGroup(
            jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombres_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFFechaNacimiento_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFFechaNacimiento_ActualizarSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBNombresRepre_ActualizarEst)
                    .addComponent(jTFNombresRepre_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidosRepre_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBApellidosRepre_ActualizarEst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChBCorreo_ActualizarEst)
                    .addComponent(jTFCorreo_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChBTelefono_ActualizarEst1)
                    .addComponent(jTFTelefono_ActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jPanel6.add(jPDatosEstudianteActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 470, 310));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 490, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBuscar_ActualizarEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarEstKeyReleased
        String parametroBusqueda = jTFBuscar_ActualizarEst.getText();
        if (parametroBusqueda.length() == 10) {
            this.SQL = "SELECT e.Cedula_Estudiante, CONCAT(p.Nombres,' ',p.Apellidos) as Nombre, e.FechaNacimiento, e.Sexo, e.NombresRepresentante, e.ApellidosRepresentante, p.Correo, e.TelefonoRepresentante FROM Estudiantes e JOIN Personas p ON p.Cedula = e.Cedula_Estudiante WHERE e.Cedula_Estudiante LIKE '%" + parametroBusqueda + "%';";
            con.despliegueFields(SQL, "Estudiantes",
                    jTFCodigo_ActualizarEst,
                    jTFNombres_ActualizarEst,
                    jTFFechaNacimiento_ActualizarEst,
                    jTFFechaNacimiento_ActualizarSexo,
                    jTFNombresRepre_ActualizarEst,
                    jTFApellidosRepre_ActualizarEst,
                    jTFCorreo_ActualizarEst,
                    jTFTelefono_ActualizarEst, "acutalizar");
        } else {
            limpiarCampos();
        }
    }//GEN-LAST:event_jTFBuscar_ActualizarEstKeyReleased

    private void jTFBuscar_ActualizarEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarEstKeyTyped

    }//GEN-LAST:event_jTFBuscar_ActualizarEstKeyTyped

    private void jTFCorreo_ActualizarEstFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCorreo_ActualizarEstFocusLost

    }//GEN-LAST:event_jTFCorreo_ActualizarEstFocusLost

    private void jTFFechaNacimiento_ActualizarEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFechaNacimiento_ActualizarEstKeyTyped

    }//GEN-LAST:event_jTFFechaNacimiento_ActualizarEstKeyTyped

    private void jChBNombresRepre_ActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBNombresRepre_ActualizarEstActionPerformed
        if (jChBNombresRepre_ActualizarEst.isSelected()) {
            this.jTFNombresRepre_ActualizarEst.setEditable(true);
        } else {
            this.jTFNombresRepre_ActualizarEst.setEditable(false);
        }
    }//GEN-LAST:event_jChBNombresRepre_ActualizarEstActionPerformed

    private void jChBCorreo_ActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBCorreo_ActualizarEstActionPerformed
        if (jChBCorreo_ActualizarEst.isSelected()) {
            this.jTFCorreo_ActualizarEst.setEditable(true);
        } else {
            this.jTFCorreo_ActualizarEst.setEditable(false);
        }
    }//GEN-LAST:event_jChBCorreo_ActualizarEstActionPerformed

    private void jChBApellidosRepre_ActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBApellidosRepre_ActualizarEstActionPerformed
        if (this.jChBApellidosRepre_ActualizarEst.isSelected()) {
            this.jTFApellidosRepre_ActualizarEst.setEditable(true);
        } else {
            this.jTFApellidosRepre_ActualizarEst.setEditable(false);
        }
    }//GEN-LAST:event_jChBApellidosRepre_ActualizarEstActionPerformed

    private void jTFTelefono_ActualizarEstFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFTelefono_ActualizarEstFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefono_ActualizarEstFocusLost

    private void jChBTelefono_ActualizarEst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBTelefono_ActualizarEst1ActionPerformed
        if (jChBTelefono_ActualizarEst1.isSelected()) {
            jTFTelefono_ActualizarEst.setEditable(true);
        } else {
            jTFTelefono_ActualizarEst.setEditable(false);
        }
    }//GEN-LAST:event_jChBTelefono_ActualizarEst1ActionPerformed

    private void jTFTelefono_ActualizarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefono_ActualizarEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefono_ActualizarEstActionPerformed

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("aceptar");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed
        String parametroBusqueda = this.jTFBuscar_ActualizarEst.getText();
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
                if (val.emailValidator(jTFCorreo_ActualizarEst.getText())) {
                    this.SQL = "Select count(*) from Personas where Cedula = '" + parametroBusqueda + "'";
                    if (con.busquedaCod("Personas", SQL, "count(*)") < 1) {
                        getToolkit().beep();
                        titulo = "ADVERTENCIA";
                        mensaje = "El Estudiante al que hace referencia no existe";
                        emitirMensaje(mensaje, titulo);
                    } else {
                        int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea actualizar la información del estudiante?" + "\n     -Esta accion podrá ser revertida", "Actualizar Estudiante", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ICONCANCELAR);
                        if (seleccion == 0) {
                            if (jChBCorreo_ActualizarEst.isSelected()) {
                                this.SQL = "UPDATE Personas SET Correo = '" + jTFCorreo_ActualizarEst.getText() + "'WHERE Cedula = '" + parametroBusqueda + "';";
                                con.actualizarEliminarTablas(SQL);
                                this.SQL = "UPDATE Estudiantes SET NombresRepresentante = '" + jTFNombresRepre_ActualizarEst.getText()
                                        + "',ApellidosRepresentante = '" + jTFApellidosRepre_ActualizarEst.getText()
                                        + "', TelefonoRepresentante = '" + jTFTelefono_ActualizarEst.getText()
                                        + "' WHERE Cedula_estudiante = '" + parametroBusqueda + "';";
                                if (con.actualizarEliminarTablas(SQL)) {
                                    titulo = "Ingresado";
                                    mensaje = "Los datos del estudiante fueron actualizados correctamente";
                                    dispose();
                                } else {
                                    titulo = "ERROR: Ingresado";
                                    mensaje = "Los datos del estudiante NO fueron ingresados debido a un error";
                                }
                            } else {
                                this.SQL = "UPDATE Estudiantes SET NombresRepresentante = '" + jTFNombresRepre_ActualizarEst.getText()
                                        + "',ApellidosRepresentante = '" + jTFApellidosRepre_ActualizarEst.getText()
                                        + "', TelefonoRepresentante = '" + jTFTelefono_ActualizarEst.getText()
                                        + "' WHERE Cedula_estudiante = '" + parametroBusqueda + "';";
                                if (con.actualizarEliminarTablas(SQL)) {
                                    titulo = "Ingresado";
                                    mensaje = "Los datos del estudiante fueron actualizados correctamente";
                                    dispose();
                                } else {
                                    titulo = "ERROR: Ingresado";
                                    mensaje = "Los datos del estudiante NO fueron ingresados debido a un error";
                                }
                            }
                            emitirMensaje(mensaje, titulo);
                        }
                    }
                } else {
                    titulo = "ERROR DE FORMATO";
                    mensaje = "El correo ingresado no es válido";
                    emitirMensaje(mensaje, titulo);
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
        jTFBuscar_ActualizarEst.setText("");
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFFechaNacimiento_ActualizarSexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFechaNacimiento_ActualizarSexoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFechaNacimiento_ActualizarSexoKeyTyped

    private void emitirMensaje(String mensaje, String titulo) {
        getToolkit().beep();
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    public void limpiarCampos() {
        this.jTFCodigo_ActualizarEst.setText("");
        this.jTFNombres_ActualizarEst.setText("");
        this.jTFFechaNacimiento_ActualizarEst.setText("");
        this.jTFNombresRepre_ActualizarEst.setText("");
        this.jTFApellidosRepre_ActualizarEst.setText("");
        this.jTFCorreo_ActualizarEst.setText("");
        this.jTFTelefono_ActualizarEst.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jChBApellidosRepre_ActualizarEst;
    private javax.swing.JCheckBox jChBCorreo_ActualizarEst;
    private javax.swing.JCheckBox jChBNombresRepre_ActualizarEst;
    private javax.swing.JCheckBox jChBTelefono_ActualizarEst1;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JPanel jPDatosEstudianteActualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelDatoEstudiante;
    public static javax.swing.JTextField jTFApellidosRepre_ActualizarEst;
    public static javax.swing.JTextField jTFBuscar_ActualizarEst;
    public static javax.swing.JTextField jTFCodigo_ActualizarEst;
    public static javax.swing.JTextField jTFCorreo_ActualizarEst;
    public static javax.swing.JTextField jTFFechaNacimiento_ActualizarEst;
    public static javax.swing.JTextField jTFFechaNacimiento_ActualizarSexo;
    public static javax.swing.JTextField jTFNombresRepre_ActualizarEst;
    public static javax.swing.JTextField jTFNombres_ActualizarEst;
    public static javax.swing.JTextField jTFTelefono_ActualizarEst;
    // End of variables declaration//GEN-END:variables
}
