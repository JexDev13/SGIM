package GUI.Administrador.Gestion_Sistema;

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
public class JFAdmin_InsertarAdmin extends javax.swing.JFrame {

    private int x;
    private int y;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();
    Conexion con = new Conexion();
    Validaciones val = new Validaciones();

    public JFAdmin_InsertarAdmin() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPEncabezado = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jPContenido = new javax.swing.JPanel();
        jPDatos = new javax.swing.JPanel();
        jLCedula = new javax.swing.JLabel();
        jTFCedula = new javax.swing.JTextField();
        jLNombres = new javax.swing.JLabel();
        jTFNombres = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        jTApellidos = new javax.swing.JTextField();
        jLCorreo = new javax.swing.JLabel();
        jTFCorreo = new javax.swing.JTextField();
        jChBProfesor = new javax.swing.JCheckBox();
        jPie = new javax.swing.JPanel();
        JBCancelar = new javax.swing.JButton();
        JBIngreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(309, 339));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(309, 339));
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

        jPEncabezado.setBackground(new java.awt.Color(250, 183, 22));
        jPEncabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Insertar administrador");
        jPEncabezado.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 30));

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
        jPEncabezado.add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 30, 30));

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
        jPEncabezado.add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 30));

        getContentPane().add(jPEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 30));

        jPContenido.setBackground(new java.awt.Color(255, 255, 255));
        jPContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPDatos.setBackground(new java.awt.Color(255, 255, 255));
        jPDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a ingresar"));
        jPDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCedula.setText("N°Cédula:");
        jPDatos.add(jLCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPDatos.add(jTFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 200, -1));

        jLNombres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNombres.setText("Nombres:");
        jPDatos.add(jLNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPDatos.add(jTFNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 200, -1));

        jLApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLApellido.setText("Apellidos:");
        jPDatos.add(jLApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPDatos.add(jTApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 200, -1));

        jLCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCorreo.setText("Coreeo electrónico:");
        jPDatos.add(jLCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, -1));
        jPDatos.add(jTFCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 150, -1));

        jChBProfesor.setBackground(new java.awt.Color(255, 255, 255));
        jChBProfesor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jChBProfesor.setText("¿Es profesor?");
        jChBProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBProfesorActionPerformed(evt);
            }
        });
        jPDatos.add(jChBProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jPContenido.add(jPDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 230));

        getContentPane().add(jPContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 310, 250));

        jPie.setBackground(new java.awt.Color(250, 183, 22));
        jPie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBCancelar.setBackground(new java.awt.Color(255, 255, 254));
        JBCancelar.setForeground(new java.awt.Color(250, 183, 22));
        JBCancelar.setText("cancelar");
        JBCancelar.setBorder(null);
        JBCancelar.setBorderPainted(false);
        JBCancelar.setFocusPainted(false);
        JBCancelar.setPreferredSize(new java.awt.Dimension(89, 32));
        JBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCancelarMouseExited(evt);
            }
        });
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        jPie.add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        JBIngreso.setBackground(new java.awt.Color(255, 255, 254));
        JBIngreso.setForeground(new java.awt.Color(250, 183, 22));
        JBIngreso.setText("aceptar");
        JBIngreso.setBorder(null);
        JBIngreso.setBorderPainted(false);
        JBIngreso.setDefaultCapable(false);
        JBIngreso.setFocusPainted(false);
        JBIngreso.setHideActionText(true);
        JBIngreso.setPreferredSize(new java.awt.Dimension(89, 32));
        JBIngreso.setRequestFocusEnabled(false);
        JBIngreso.setRolloverEnabled(false);
        JBIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBIngresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBIngresoMouseExited(evt);
            }
        });
        JBIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngresoActionPerformed(evt);
            }
        });
        jPie.add(JBIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        getContentPane().add(jPie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 310, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void borrarCampos() {
        this.jTFCedula.setText("");
        this.jTFNombres.setText("");
        this.jTApellidos.setText("");
        this.jTFCorreo.setText("");
    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void JBIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngresoMouseEntered
        this.JBIngreso.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngresoMouseEntered

    private void JBIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngresoMouseExited
        this.JBIngreso.setText("aceptar");
    }//GEN-LAST:event_JBIngresoMouseExited

    private void JBIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngresoActionPerformed
        String titulo;
        String mensaje;
        if (val.validadorDeCedula(this.jTFCedula.getText())) {
            if (con.cedulaDuplicada(this.jTFCedula.getText())) {
                titulo = "Error de duplicidad";
                mensaje = "La cedula que estas intentando registrar ya esta dentro del sistema";
            } else {
                if (val.emailValidator(this.jTFCorreo.getText())) {
                    ArrayList<String> atributosInsetar = new ArrayList<>();
                    atributosInsetar.add(jTFCedula.getText());
                    atributosInsetar.add(jTFNombres.getText());
                    atributosInsetar.add(jTApellidos.getText());
                    atributosInsetar.add(jTFCorreo.getText());
                    String parametro = con.prepararAtributos(atributosInsetar);
                    if (con.insertar_Tablas("Admins", parametro)) {
                        titulo = "Ingresado";
                        mensaje = "Los datos fueron ingresados correctamente";
                        dispose();
                    } else {
                        titulo = "ERROR: Ingresado";
                        mensaje = "Los datos NO fueron ingresados debido a un error";
                    }
                } else {
                    titulo = "ERROR DE FORMATO";
                    mensaje = "El correo ingresado no es válido.";
                }
            }
        } else {
            titulo = "ERROR DE FORMATO";
            mensaje = "La cédula ingresada no es válida en el territorio Ecuatoriano";
        }
        emitirMensaje(mensaje, titulo);
    }//GEN-LAST:event_JBIngresoActionPerformed

    private void JBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancelarMouseEntered
        this.JBCancelar.setText("CANCELAR");
    }//GEN-LAST:event_JBCancelarMouseEntered

    private void JBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancelarMouseExited
        this.JBCancelar.setText("cancelar");
    }//GEN-LAST:event_JBCancelarMouseExited

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        String tituo = "¿Cancelar ingreso?";
        String mensaje = "Si cancela los datos ingresados no serán guardados";
        emitirMensaje(mensaje, tituo);
        dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void jChBProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChBProfesorActionPerformed

    private void emitirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBIngreso;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jChBProfesor;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPContenido;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JPanel jPEncabezado;
    private javax.swing.JPanel jPie;
    private javax.swing.JTextField jTApellidos;
    private javax.swing.JTextField jTFCedula;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFNombres;
    // End of variables declaration//GEN-END:variables
}
