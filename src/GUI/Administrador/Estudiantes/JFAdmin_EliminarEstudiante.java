package GUI.Administrador.Estudiantes;

import static GUI.Administrador.Estudiantes.JFAdmin_ActualizarEstudiante.jTFApellidosRepre_ActualizarEst;
import static GUI.Administrador.Estudiantes.JFAdmin_ActualizarEstudiante.jTFBuscar_ActualizarEst;
import static GUI.Administrador.Estudiantes.JFAdmin_ActualizarEstudiante.jTFCodigo_ActualizarEst;
import static GUI.Administrador.Estudiantes.JFAdmin_ActualizarEstudiante.jTFCorreo_ActualizarEst;
import static GUI.Administrador.Estudiantes.JFAdmin_ActualizarEstudiante.jTFFechaNacimiento_ActualizarEst;
import static GUI.Administrador.Estudiantes.JFAdmin_ActualizarEstudiante.jTFFechaNacimiento_ActualizarSexo;
import static GUI.Administrador.Estudiantes.JFAdmin_ActualizarEstudiante.jTFNombresRepre_ActualizarEst;
import static GUI.Administrador.Estudiantes.JFAdmin_ActualizarEstudiante.jTFNombres_ActualizarEst;
import static GUI.Administrador.Estudiantes.JFAdmin_ActualizarEstudiante.jTFTelefono_ActualizarEst;
import Negocio.Conexion;
import Negocio.Diseño;
import Negocio.Validaciones;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_EliminarEstudiante extends javax.swing.JFrame {

    private int x;
    private int y;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();
    Conexion con = new Conexion();
    Validaciones val = new Validaciones();
    String SQL;
    String titulo = null;
    String mensaje = null;
    String tabla = "Personas";

    public JFAdmin_EliminarEstudiante() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_EliminarEst = new javax.swing.JTextField();
        jLCedula = new javax.swing.JLabel();
        jPDatosEstudianteEliminar1 = new javax.swing.JPanel();
        jTFCodigo_EliminarEst = new javax.swing.JTextField();
        jLabelNom1 = new javax.swing.JLabel();
        jTFNombres_EliminarEst = new javax.swing.JTextField();
        jLabelApe1 = new javax.swing.JLabel();
        jTFSexo_EliminarEst = new javax.swing.JTextField();
        jLabelSector1 = new javax.swing.JLabel();
        jTFFecha_EliminarEst = new javax.swing.JTextField();
        jLabelCelu1 = new javax.swing.JLabel();
        jTFApellidosRe_EliminarEst = new javax.swing.JTextField();
        jLabelCorre2 = new javax.swing.JLabel();
        jTFCorreo_EliminarEst = new javax.swing.JTextField();
        jLabelFacu1 = new javax.swing.JLabel();
        jTFNombresRe_EliminarEst = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabelCorre3 = new javax.swing.JLabel();
        jTFTelf_EliminarEst = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 523));
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, 30));

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
        getContentPane().add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        jPanel1.setBackground(new java.awt.Color(250, 183, 22));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setText("ELIMINAR ESTUDIANTE");
        jPanel1.add(jLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jPanel2.setBackground(new java.awt.Color(250, 183, 22));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(JBCancela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

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
        jPanel2.add(JBIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 400, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatoEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del eliminar"));
        jPanelDatoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanelDatoEstudianteKeyReleased(evt);
            }
        });

        jTFBuscar_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_EliminarEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarEstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarEstKeyTyped(evt);
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
                .addGap(85, 85, 85)
                .addComponent(jTFBuscar_EliminarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoEstudianteLayout.setVerticalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCedula))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.add(jPanelDatoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanelDatoEstudiante.getAccessibleContext().setAccessibleName("Datos del estudiante");

        jPDatosEstudianteEliminar1.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEstudianteEliminar1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar"));

        jTFCodigo_EliminarEst.setEditable(false);
        jTFCodigo_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelNom1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNom1.setText("Nombre");

        jTFNombres_EliminarEst.setEditable(false);
        jTFNombres_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombres_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelApe1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelApe1.setText("Sexo");

        jTFSexo_EliminarEst.setEditable(false);
        jTFSexo_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFSexo_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelSector1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelSector1.setText("Nombres Repre.");

        jTFFecha_EliminarEst.setEditable(false);
        jTFFecha_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFFecha_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCelu1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCelu1.setText("F. de Nacimiento");

        jTFApellidosRe_EliminarEst.setEditable(false);
        jTFApellidosRe_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFApellidosRe_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCorre2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCorre2.setText("Correo elec. Repre.");

        jTFCorreo_EliminarEst.setEditable(false);
        jTFCorreo_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCorreo_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelFacu1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelFacu1.setText("Apellidos Repre.");

        jTFNombresRe_EliminarEst.setEditable(false);
        jTFNombresRe_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombresRe_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel21.setText("N° Cédula");

        jLabelCorre3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCorre3.setText("Telefono Repre.");

        jTFTelf_EliminarEst.setEditable(false);
        jTFTelf_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFTelf_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPDatosEstudianteEliminar1Layout = new javax.swing.GroupLayout(jPDatosEstudianteEliminar1);
        jPDatosEstudianteEliminar1.setLayout(jPDatosEstudianteEliminar1Layout);
        jPDatosEstudianteEliminar1Layout.setHorizontalGroup(
            jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteEliminar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEstudianteEliminar1Layout.createSequentialGroup()
                        .addComponent(jLabelCorre3)
                        .addGap(18, 18, 18)
                        .addComponent(jTFTelf_EliminarEst))
                    .addGroup(jPDatosEstudianteEliminar1Layout.createSequentialGroup()
                        .addComponent(jLabelCorre2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jTFCorreo_EliminarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                    .addGroup(jPDatosEstudianteEliminar1Layout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPDatosEstudianteEliminar1Layout.createSequentialGroup()
                                    .addComponent(jLabelNom1)
                                    .addGap(18, 18, 18))
                                .addGroup(jPDatosEstudianteEliminar1Layout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPDatosEstudianteEliminar1Layout.createSequentialGroup()
                                .addComponent(jLabelApe1)
                                .addGap(46, 46, 46)))
                        .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFSexo_EliminarEst)
                            .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFNombres_EliminarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addComponent(jTFCodigo_EliminarEst))))
                    .addGroup(jPDatosEstudianteEliminar1Layout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCelu1)
                            .addComponent(jLabelSector1)
                            .addComponent(jLabelFacu1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFApellidosRe_EliminarEst)
                            .addComponent(jTFNombresRe_EliminarEst)
                            .addComponent(jTFFecha_EliminarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPDatosEstudianteEliminar1Layout.setVerticalGroup(
            jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteEliminar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombres_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNom1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFSexo_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApe1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFecha_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelu1))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombresRe_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSector1))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidosRe_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFacu1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCorreo_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCorre2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTelf_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCorre3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPDatosEstudianteEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 280));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBuscar_EliminarEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarEstKeyReleased
        String parametroBusqueda = this.jTFBuscar_EliminarEst.getText();
        if (parametroBusqueda.length() == 10) {
            this.SQL = "SELECT e.Cedula_Estudiante, CONCAT(p.Nombres,' ',p.Apellidos) as Nombre, e.FechaNacimiento, e.Sexo, e.NombresRepresentante, e.ApellidosRepresentante, p.Correo, e.TelefonoRepresentante FROM Estudiantes e JOIN Personas p ON p.Cedula = e.Cedula_Estudiante WHERE e.Cedula_Estudiante LIKE '%" + parametroBusqueda + "%';";
            con.despliegueFields(SQL, "Estudiantes", 
                    jTFCodigo_EliminarEst, 
                    jTFNombres_EliminarEst,
                    jTFFecha_EliminarEst,
                    jTFSexo_EliminarEst,
                    jTFNombresRe_EliminarEst,
                    jTFApellidosRe_EliminarEst, 
                    jTFCorreo_EliminarEst, 
                    jTFTelf_EliminarEst, "actualizar");
        } else {
            limpiarCampos();
        }
    }//GEN-LAST:event_jTFBuscar_EliminarEstKeyReleased

    private void jTFBuscar_EliminarEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarEstKeyTyped

    }//GEN-LAST:event_jTFBuscar_EliminarEstKeyTyped

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
        if (jTFBuscar_EliminarEst.getText().isEmpty()) {
            titulo = "ADVERTENCIA";
            mensaje = "Todos los campos deben estar llenos";
            emitirMensaje(mensaje, titulo);
        } else {
            String parametroBusqueda = this.jTFBuscar_EliminarEst.getText();
            if (!val.validadorDeCedula(parametroBusqueda)) {
                titulo = "ERROR DE FORMATO";
                mensaje = "La cédula ingresada no es válida en el territorio Ecuatoriano";
                emitirMensaje(mensaje, titulo);
            } else {
                this.SQL = "Select count(*) from Personas where Cedula like '%" + parametroBusqueda + "%'";
                if (con.busquedaCod(tabla, SQL, "count(*)") < 1) {
                    titulo = "ADVERTENCIA";
                    mensaje = "El Estudiante al que hace referencia no existe";
                    emitirMensaje(mensaje, titulo);
                } else {
                    int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el estudiante?" + "\n     -Esta accion podrá ser revertida", "Eliminar Estudiante", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ICONCANCELAR);
                    if (seleccion == 0) {
                        this.SQL = "DELETE from Estudiantes Where Cedula_Estudiante = '" + parametroBusqueda + "';";
                        if (con.actualizarEliminarTablas(SQL) == true) {
                            titulo = "RESULTADO";
                            mensaje = "Estudiante Eliminado exitosamente";
                            dispose();
                            emitirMensaje(mensaje, titulo);
                        }
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
        String mensaje = "Si cancela los datos ingresados no serán eliminados";
        emitirMensaje(mensaje, tituo);
        limpiarCampos();
        jTFBuscar_EliminarEst.setText("");
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jPanelDatoEstudianteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanelDatoEstudianteKeyReleased
        String parametroBusqueda = this.jTFBuscar_EliminarEst.getText();
        if (parametroBusqueda.length() == 10) {
            this.SQL = "SELECT e.Cedula_Estudiante, CONCAT(p.Nombres,' ',p.Apellidos) as Nombre, e.FechaNacimiento, e.Sexo, e.NombresRepresentante, e.ApellidosRepresentante, p.Correo, e.TelefonoRepresentante FROM Estudiantes e JOIN Personas p ON p.Cedula = e.Cedula_Estudiante WHERE e.Cedula_Estudiante LIKE '%" + parametroBusqueda + "%';";
            con.despliegueFields(SQL, "Estudiantes",
                    this.jTFCodigo_EliminarEst,
                    this.jTFNombres_EliminarEst,
                    this.jTFSexo_EliminarEst,
                    this.jTFFecha_EliminarEst,
                    this.jTFNombresRe_EliminarEst,
                    this.jTFApellidosRe_EliminarEst,
                    this.jTFCorreo_EliminarEst,
                    this.jTFTelf_EliminarEst, "acutalizar");
        } else {
            limpiarCampos();
        }
    }//GEN-LAST:event_jPanelDatoEstudianteKeyReleased

    public void limpiarCampos() {
        jTFCodigo_EliminarEst.setText("");
        jTFNombres_EliminarEst.setText("");
        jTFSexo_EliminarEst.setText("");
        jTFFecha_EliminarEst.setText("");
        jTFNombresRe_EliminarEst.setText("");
        jTFApellidosRe_EliminarEst.setText("");
        jTFCorreo_EliminarEst.setText("");
        jTFTelf_EliminarEst.setText("");
    }

    private void emitirMensaje(String mensaje, String titulo) {
        getToolkit().beep();
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabelApe1;
    private javax.swing.JLabel jLabelCelu1;
    private javax.swing.JLabel jLabelCorre2;
    private javax.swing.JLabel jLabelCorre3;
    private javax.swing.JLabel jLabelFacu1;
    private javax.swing.JLabel jLabelNom1;
    private javax.swing.JLabel jLabelSector1;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JPanel jPDatosEstudianteEliminar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelDatoEstudiante;
    private javax.swing.JTextField jTFApellidosRe_EliminarEst;
    public static javax.swing.JTextField jTFBuscar_EliminarEst;
    private javax.swing.JTextField jTFCodigo_EliminarEst;
    private javax.swing.JTextField jTFCorreo_EliminarEst;
    private javax.swing.JTextField jTFFecha_EliminarEst;
    private javax.swing.JTextField jTFNombresRe_EliminarEst;
    private javax.swing.JTextField jTFNombres_EliminarEst;
    private javax.swing.JTextField jTFSexo_EliminarEst;
    private javax.swing.JTextField jTFTelf_EliminarEst;
    // End of variables declaration//GEN-END:variables
}
