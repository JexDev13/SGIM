package GUI.Administrador.Calendario_Clases;

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
public class JFAdmin_InsertarClase extends javax.swing.JFrame {

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

    public JFAdmin_InsertarClase() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPContenido = new javax.swing.JPanel();
        jPDatosClase = new javax.swing.JPanel();
        jTFMateria = new javax.swing.JTextField();
        jLMateria = new javax.swing.JLabel();
        jLAula = new javax.swing.JLabel();
        jTFAula = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jTFCedula = new javax.swing.JTextField();
        jPDatosAdminEliminar = new javax.swing.JPanel();
        jLCorreo = new javax.swing.JLabel();
        jTFCorreo = new javax.swing.JTextField();
        jLNombres = new javax.swing.JLabel();
        jTFNombres = new javax.swing.JTextField();
        jLApellidos = new javax.swing.JLabel();
        jTFApellidos = new javax.swing.JTextField();
        jPFondo = new javax.swing.JPanel();
        jButtonMinimizar1 = new javax.swing.JButton();
        jButtonSalirIcon1 = new javax.swing.JButton();
        JBAceptar = new javax.swing.JButton();
        JBCancela1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(280, 343));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(280, 343));
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
        jLabelTitulo.setText("   Insertar Clase");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(0, 0, 167, 30);

        jPContenido.setBackground(new java.awt.Color(255, 255, 255));

        jPDatosClase.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosClase.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la clase"));

        jLMateria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLMateria.setText("Materia:");

        jLAula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLAula.setText("Cédula profesor:");

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Aula:");

        jTFCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCedulaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPDatosClaseLayout = new javax.swing.GroupLayout(jPDatosClase);
        jPDatosClase.setLayout(jPDatosClaseLayout);
        jPDatosClaseLayout.setHorizontalGroup(
            jPDatosClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosClaseLayout.createSequentialGroup()
                        .addGroup(jPDatosClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCodigo)
                            .addComponent(jLMateria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPDatosClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFMateria)
                            .addComponent(jTFAula)))
                    .addGroup(jPDatosClaseLayout.createSequentialGroup()
                        .addComponent(jLAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCedula)))
                .addContainerGap())
        );
        jPDatosClaseLayout.setVerticalGroup(
            jPDatosClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatosClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jTFAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatosClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMateria)
                    .addComponent(jTFMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPDatosClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAula)
                    .addComponent(jTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPDatosAdminEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosAdminEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del profesor"));

        jLCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCorreo.setText("Correo electrónico");

        jTFCorreo.setEditable(false);
        jTFCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jTFCorreo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFCorreo.setPreferredSize(new java.awt.Dimension(64, 22));

        jLNombres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNombres.setText("Nombres");

        jTFNombres.setEditable(false);
        jTFNombres.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombres.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFNombres.setPreferredSize(new java.awt.Dimension(64, 22));

        jLApellidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLApellidos.setText("Apellidos");

        jTFApellidos.setEditable(false);
        jTFApellidos.setBackground(new java.awt.Color(255, 255, 255));
        jTFApellidos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFApellidos.setPreferredSize(new java.awt.Dimension(64, 22));

        javax.swing.GroupLayout jPDatosAdminEliminarLayout = new javax.swing.GroupLayout(jPDatosAdminEliminar);
        jPDatosAdminEliminar.setLayout(jPDatosAdminEliminarLayout);
        jPDatosAdminEliminarLayout.setHorizontalGroup(
            jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosAdminEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosAdminEliminarLayout.createSequentialGroup()
                        .addComponent(jLNombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(jPDatosAdminEliminarLayout.createSequentialGroup()
                        .addComponent(jLApellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPDatosAdminEliminarLayout.createSequentialGroup()
                        .addComponent(jLCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPDatosAdminEliminarLayout.setVerticalGroup(
            jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosAdminEliminarLayout.createSequentialGroup()
                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosAdminEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCorreo)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPContenidoLayout = new javax.swing.GroupLayout(jPContenido);
        jPContenido.setLayout(jPContenidoLayout);
        jPContenidoLayout.setHorizontalGroup(
            jPContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPDatosClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDatosAdminEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPContenidoLayout.setVerticalGroup(
            jPContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPDatosClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPDatosAdminEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPContenido);
        jPContenido.setBounds(0, 30, 280, 260);

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
        jButtonMinimizar1.setBounds(220, 0, 30, 30);

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
        jButtonSalirIcon1.setBounds(250, 0, 30, 30);

        JBAceptar.setBackground(new java.awt.Color(255, 255, 254));
        JBAceptar.setForeground(new java.awt.Color(250, 183, 22));
        JBAceptar.setText("aceptar");
        JBAceptar.setBorder(null);
        JBAceptar.setBorderPainted(false);
        JBAceptar.setDefaultCapable(false);
        JBAceptar.setFocusPainted(false);
        JBAceptar.setHideActionText(true);
        JBAceptar.setPreferredSize(new java.awt.Dimension(89, 32));
        JBAceptar.setRequestFocusEnabled(false);
        JBAceptar.setRolloverEnabled(false);
        JBAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBAceptarMouseExited(evt);
            }
        });
        JBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAceptarActionPerformed(evt);
            }
        });
        jPFondo.add(JBAceptar);
        JBAceptar.setBounds(40, 300, 89, 32);

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
        JBCancela1.setBounds(150, 300, 89, 32);

        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 280, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

    private void JBAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBAceptarMouseEntered
        this.JBAceptar.setText("ACEPTAR");
    }//GEN-LAST:event_JBAceptarMouseEntered

    private void JBAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBAceptarMouseExited
        this.JBAceptar.setText("aceptar");
    }//GEN-LAST:event_JBAceptarMouseExited

    private void JBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAceptarActionPerformed
        String parametroBusqueda = this.jTFCedula.getText();
        if (parametroBusqueda.isEmpty() || jTFMateria.getText().isEmpty() || jTFAula.getText().isEmpty()) {
            titulo = "ADVERTENCIA";
            mensaje = "Todos los campos deben estar llenos";
            emitirMensaje(mensaje, titulo);
        } else {
            if (val.validadorDeCedula(parametroBusqueda)) {
                this.SQL = "Select count(*) from Profesores where Cedula_profesor like '%" + parametroBusqueda + "%'";
                if (con.busquedaCod(tabla, SQL, "count(*)") < 1) {
                    getToolkit().beep();
                    titulo = "ADVERTENCIA";
                    mensaje = "El profesor al que hace referencia no existe";
                    emitirMensaje(mensaje, titulo);
                } else {
                    ArrayList<String> atributosInsetar = new ArrayList<>();
                    atributosInsetar.add(jTFAula.getText());
                    atributosInsetar.add(jTFMateria.getText());
                    atributosInsetar.add(jTFCedula.getText());
                    String parametro = con.prepararAtributos(atributosInsetar);
                    if (con.insertar_Tablas("Clases", parametro)) {
                        titulo = "Ingresado";
                        mensaje = "Los datos fueron ingresados correctamente";
                        dispose();
                        borrarCampos();
                        jTFCedula.setText("");
                    } else {
                        titulo = "ERROR: Ingresado";
                        mensaje = "Los datos NO fueron ingresados debido a un error";
                    }
                    emitirMensaje(mensaje, titulo);
                }
            } else {
                titulo = "ERROR DE FORMATO";
                mensaje = "La cédula ingresada no es válida en el territorio Ecuatoriano";
                emitirMensaje(mensaje, titulo);
            }
        }
    }//GEN-LAST:event_JBAceptarActionPerformed

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
        jTFCedula.setText("");
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCedulaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCedulaKeyTyped

    private void jTFCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCedulaKeyReleased
        String parametroBusqueda = this.jTFCedula.getText();
        if (parametroBusqueda.length() == 10) {
            this.SQL = "SELECT Nombres, Apellidos, Correo FROM Personas WHERE Rol = 'Profesor' AND Cedula LIKE '%" + parametroBusqueda + "%';";
            con.despliegueFields(SQL, tabla, jTFNombres, jTFApellidos, jTFCorreo, null,
                    null, null, null, null, "insertar");
        } else {
            jTFNombres.setText("");
            jTFApellidos.setText("");
            jTFCorreo.setText("");
        }
    }//GEN-LAST:event_jTFCedulaKeyReleased

    public void borrarCampos() {
        this.jTFAula.setText("");
        this.jTFMateria.setText("");
    }

    private void emitirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAceptar;
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLAula;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLMateria;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPContenido;
    private javax.swing.JPanel jPDatosAdminEliminar;
    private javax.swing.JPanel jPDatosClase;
    private javax.swing.JPanel jPFondo;
    public static javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFAula;
    private javax.swing.JTextField jTFCedula;
    public static javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFMateria;
    public static javax.swing.JTextField jTFNombres;
    // End of variables declaration//GEN-END:variables
}
