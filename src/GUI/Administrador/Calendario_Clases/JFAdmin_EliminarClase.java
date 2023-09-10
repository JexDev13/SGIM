package GUI.Administrador.Calendario_Clases;

import static GUI.Administrador.Calendario_Clases.JFAdmin_AsignarEstudiante.jTFBuscar_AsignarHorario;
import static GUI.Administrador.Calendario_Clases.JFAdmin_AsignarEstudiante.jTFBuscar_Estudiante;
import static GUI.Administrador.Calendario_Clases.JFAdmin_AsignarEstudiante.jTFCodigo_Clase;
import static GUI.Administrador.Calendario_Clases.JFAdmin_EliminarEstudiante.jTFBuscar_AsignarHorario;
import static GUI.Administrador.Calendario_Clases.JFAdmin_EliminarEstudiante.jTFBuscar_Estudiante;
import static GUI.Administrador.Calendario_Clases.JFAdmin_InsertarClase.jTFApellidos;
import static GUI.Administrador.Calendario_Clases.JFAdmin_InsertarClase.jTFCorreo;
import static GUI.Administrador.Calendario_Clases.JFAdmin_InsertarClase.jTFNombres;
import Negocio.Conexion;
import Negocio.Diseño;
import Negocio.Validaciones;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_EliminarClase extends javax.swing.JFrame {

    private int x;
    private int y;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();
    Conexion con = new Conexion();
    Validaciones val = new Validaciones();
    String SQL;
    String titulo = null;
    String mensaje = null;
    String tabla = "Clases";

    public JFAdmin_EliminarClase() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPDatosClaseEliminar = new javax.swing.JPanel();
        jTFCodigo_EliminarClase = new javax.swing.JTextField();
        jLabelMateria = new javax.swing.JLabel();
        jTFMateria_EliminarClase = new javax.swing.JTextField();
        jLabelAula = new javax.swing.JLabel();
        jTFAula_EliminarClase = new javax.swing.JTextField();
        jTFHorario_EliminarClase = new javax.swing.JTextField();
        jLabelHorario = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelHorario1 = new javax.swing.JLabel();
        jTFHorario_EliminarClase1 = new javax.swing.JTextField();
        jPanelDatoClase = new javax.swing.JPanel();
        jTFBuscar_EliminarClase = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jPFondo = new javax.swing.JPanel();
        jButtonMinimizar1 = new javax.swing.JButton();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JBIngreso1 = new javax.swing.JButton();
        JBCancela1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 378));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(380, 378));
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
        jLabelTitulo.setText("Eliminar Clase");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

        jPDatosClaseEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosClaseEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar"));

        jTFCodigo_EliminarClase.setEditable(false);
        jTFCodigo_EliminarClase.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_EliminarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelMateria.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelMateria.setText("Materia");

        jTFMateria_EliminarClase.setEditable(false);
        jTFMateria_EliminarClase.setBackground(new java.awt.Color(255, 255, 255));
        jTFMateria_EliminarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAula.setText("Aula");

        jTFAula_EliminarClase.setEditable(false);
        jTFAula_EliminarClase.setBackground(new java.awt.Color(255, 255, 255));
        jTFAula_EliminarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFHorario_EliminarClase.setEditable(false);
        jTFHorario_EliminarClase.setBackground(new java.awt.Color(255, 255, 255));
        jTFHorario_EliminarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelHorario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelHorario.setText("Ced. Profesor");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Código Clase");

        jLabelHorario1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelHorario1.setText("Nombre");

        jTFHorario_EliminarClase1.setEditable(false);
        jTFHorario_EliminarClase1.setBackground(new java.awt.Color(255, 255, 255));
        jTFHorario_EliminarClase1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPDatosClaseEliminarLayout = new javax.swing.GroupLayout(jPDatosClaseEliminar);
        jPDatosClaseEliminar.setLayout(jPDatosClaseEliminarLayout);
        jPDatosClaseEliminarLayout.setHorizontalGroup(
            jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosClaseEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFMateria_EliminarClase, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jTFCodigo_EliminarClase)))
                    .addGroup(jPDatosClaseEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAula)
                            .addComponent(jLabelHorario)
                            .addComponent(jLabelHorario1))
                        .addGap(23, 23, 23)
                        .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFHorario_EliminarClase1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jTFAula_EliminarClase)
                            .addComponent(jTFHorario_EliminarClase))))
                .addContainerGap())
        );
        jPDatosClaseEliminarLayout.setVerticalGroup(
            jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_EliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFMateria_EliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAula_EliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAula))
                .addGap(6, 6, 6)
                .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFHorario_EliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHorario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFHorario_EliminarClase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHorario1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPDatosClaseEliminar);
        jPDatosClaseEliminar.setBounds(10, 120, 360, 190);

        jPanelDatoClase.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoClase.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la clase"));

        jTFBuscar_EliminarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_EliminarClase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarClaseKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarClaseKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código clase");

        javax.swing.GroupLayout jPanelDatoClaseLayout = new javax.swing.GroupLayout(jPanelDatoClase);
        jPanelDatoClase.setLayout(jPanelDatoClaseLayout);
        jPanelDatoClaseLayout.setHorizontalGroup(
            jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jTFBuscar_EliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelDatoClaseLayout.setVerticalGroup(
            jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                        .addComponent(jLCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addComponent(jTFBuscar_EliminarClase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoClase);
        jPanelDatoClase.setBounds(10, 40, 360, 70);

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jPFondo.add(jPanel1);
        jPanel1.setBounds(0, 30, 380, 290);

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
        JBIngreso1.setBounds(80, 330, 89, 32);

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
        JBCancela1.setBounds(190, 330, 89, 32);

        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 380, 380);

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

    private void jTFBuscar_EliminarClaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarClaseKeyTyped

    }//GEN-LAST:event_jTFBuscar_EliminarClaseKeyTyped

    private void jTFBuscar_EliminarClaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarClaseKeyReleased
        String parametroBusqueda = jTFBuscar_EliminarClase.getText();
        if (parametroBusqueda.length() >= 1) {
            this.SQL = """
                       Select 
                          Codigo_clase, 
                          Materia, 
                          Aula, 
                          c.Cedula_profesor, 
                          CONCAT(P.Nombres, ' ', P.Apellidos) as ProfesorAsignado
                       from Clases c JOIN Personas p 
                       on c.cedula_profesor = p.cedula WHERE Codigo_clase LIKE '%""" + parametroBusqueda + "%';";
            con.despliegueFields(SQL, "Horarios", jTFCodigo_EliminarClase, jTFMateria_EliminarClase, jTFAula_EliminarClase, jTFHorario_EliminarClase,
                    jTFHorario_EliminarClase1, null, null, null, "insertar");
        } else {
            limpiarCampos();
        }
    }//GEN-LAST:event_jTFBuscar_EliminarClaseKeyReleased

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
        String codClase = jTFBuscar_EliminarClase.getText();
        if (codClase.isEmpty()) {
            titulo = "ADVERTENCIA";
            mensaje = "Todos los campos deben estar llenos";
            emitirMensaje(mensaje, titulo);
        } else {
            this.SQL = "Select count(*) from Clases where Codigo_clase = '" + codClase + "'";
            if (con.busquedaCod("Personas", SQL, "count(*)") < 1) {
                titulo = "ADVERTENCIA";
                mensaje = "La clase a al que hace referencia no existe";
                emitirMensaje(mensaje, titulo);
            } else {
                this.SQL = "SELECT COUNT(*) FROM Asignacion_cupos WHERE Codigo_Clase  = '" + codClase + "'";
                if (con.busquedaCod("Personas", SQL, "count(*)") >= 1) {
                    titulo = "ADVERTENCIA";
                    mensaje = "La clase que estas intentando tiene estudiantes asignados, elimina la lista de estudiantes primero";
                    emitirMensaje(mensaje, titulo);
                } else {
                    int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la clase?" + "\n     -Esta accion no podrá ser revertida y se eliminaran todos los horarios asociados a la misma", "Eliminar clase", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ICONCANCELAR);
                    if (seleccion == 0) {
                        this.SQL = "Delete from Clases WHERE Codigo_Clase = '" + codClase + "';";
                        if (con.actualizarEliminarTablas(SQL) == true) {
                            titulo = "RESULTADO";
                            mensaje = "Clase borrada exitosamente";
                            dispose();
                            jTFBuscar_EliminarClase.setText("");
                        } else {
                            titulo = "ERROR: Borrado";
                            mensaje = "La clase NO fue borrada debido a un error";
                        }
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
        jTFBuscar_EliminarClase.setText("");
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    public void limpiarCampos() {
        this.jTFCodigo_EliminarClase.setText("");
        this.jTFMateria_EliminarClase.setText("");
        this.jTFAula_EliminarClase.setText("");
        this.jTFHorario_EliminarClase.setText("");
        this.jTFHorario_EliminarClase1.setText("");
    }

    private void emitirMensaje(String mensaje, String titulo) {
        getToolkit().beep();
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelAula;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelHorario1;
    private javax.swing.JLabel jLabelMateria;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosClaseEliminar;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDatoClase;
    public static javax.swing.JTextField jTFAula_EliminarClase;
    public static javax.swing.JTextField jTFBuscar_EliminarClase;
    public static javax.swing.JTextField jTFCodigo_EliminarClase;
    public static javax.swing.JTextField jTFHorario_EliminarClase;
    public static javax.swing.JTextField jTFHorario_EliminarClase1;
    public static javax.swing.JTextField jTFMateria_EliminarClase;
    // End of variables declaration//GEN-END:variables
}
