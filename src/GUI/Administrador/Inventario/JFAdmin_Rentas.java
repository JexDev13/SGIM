package GUI.Administrador.Inventario;

import Negocio.Conexion;
import Negocio.Diseño;
import Negocio.Validaciones;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_Rentas extends javax.swing.JFrame {

    private int x;
    private int y;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();
    Conexion con = new Conexion();
    Validaciones val = new Validaciones();
    ButtonGroup buttonGroup = new ButtonGroup();
    private JFAdmin_Prestamo pres = new JFAdmin_Prestamo();
    private JFAdmin_Devolucion dev = new JFAdmin_Devolucion();
    ButtonGroup buttonGroup1 = new ButtonGroup();

    private String selectTabla = "Rentas";
    private String SQL;
    String titulo = null;
    String mensaje = null;

    public JFAdmin_Rentas() {
        initComponents();
        buttonGroup1.add(jRInstrumentos);
        buttonGroup1.add(jRLibros);
        buttonGroup1.add(jRTodos);
        setLocationRelativeTo(this);
        dis.jtableHead(jTClases);
        this.SQL = """
                   SELECT
                       PL.Codigo_libro as codigo,
                   	L.Nombre AS Elemento,
                       P1.Cedula,
                   	CONCAT(P1.Nombres, ' ', P1.Apellidos) AS Cliente,
                       PL.Fecha
                   FROM prestamos_libros PL INNER JOIN Personas P1 
                   ON PL.Cedula_Estudiante = P1.Cedula INNER JOIN Libros L 
                   ON PL.Codigo_libro = L.Codigo
                   UNION
                   SELECT
                   	PI.Codigo_Instrumento as codigo,
                       I.Nombre AS Elemento,
                       P2.Cedula,
                       CONCAT(P2.Nombres, ' ', P2.Apellidos) AS Cliente,
                       PI.Fecha
                   FROM prestamos_instrumentos PI INNER JOIN Personas P2 
                   ON PI.Cedula_Estudiante = P2.Cedula JOIN Instrumentos I 
                   ON PI.Codigo_instrumento = I.Codigo;""";
        con.busqueda_y_despliegue(this.jTClases, this.selectTabla,this.SQL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jLTitTabla = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonDevolucion = new javax.swing.JButton();
        jButtonPrestamo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClases = new javax.swing.JTable();
        jRTodos = new javax.swing.JRadioButton();
        jRInstrumentos = new javax.swing.JRadioButton();
        jRLibros = new javax.swing.JRadioButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        JBCancela1 = new javax.swing.JButton();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jButtonMinimizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(840, 595));
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

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

        jLTitTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla.setText("Prestamos");
        jPFondo.add(jLTitTabla);
        jLTitTabla.setBounds(20, 90, 320, 26);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(250, 183, 22));
        jPFondo.add(jSeparator1);
        jSeparator1.setBounds(690, 60, 0, 3);

        jButtonDevolucion.setBackground(new java.awt.Color(250, 183, 22));
        jButtonDevolucion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDevolucion.setText("Devolución");
        jButtonDevolucion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonDevolucion.setBorderPainted(false);
        jButtonDevolucion.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonDevolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonDevolucionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonDevolucionMouseExited(evt);
            }
        });
        jButtonDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolucionActionPerformed(evt);
            }
        });
        jPFondo.add(jButtonDevolucion);
        jButtonDevolucion.setBounds(160, 40, 130, 40);

        jButtonPrestamo.setBackground(new java.awt.Color(250, 183, 22));
        jButtonPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPrestamo.setText("Préstamo");
        jButtonPrestamo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonPrestamo.setBorderPainted(false);
        jButtonPrestamo.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonPrestamoMouseExited(evt);
            }
        });
        jButtonPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrestamoActionPerformed(evt);
            }
        });
        jPFondo.add(jButtonPrestamo);
        jButtonPrestamo.setBounds(20, 40, 130, 40);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTClases.setAutoCreateRowSorter(true);
        jTClases.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTClases.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código clase", "Aula", "Materia", "Cédula profesor", "Profesor", "Cupos disponibles", "Horario"
            }
        ));
        jTClases.setGridColor(new java.awt.Color(250, 183, 22));
        jTClases.setRowSelectionAllowed(false);
        jTClases.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTClases.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTClases.getTableHeader().setResizingAllowed(false);
        jTClases.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTClases);

        jPFondo.add(jScrollPane1);
        jScrollPane1.setBounds(20, 122, 800, 380);

        jRTodos.setBackground(new java.awt.Color(255, 255, 255));
        jRTodos.setText("Ver todos");
        jRTodos.setContentAreaFilled(false);
        jRTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRTodosActionPerformed(evt);
            }
        });
        jPFondo.add(jRTodos);
        jRTodos.setBounds(300, 50, 100, 21);

        jRInstrumentos.setBackground(new java.awt.Color(255, 255, 255));
        jRInstrumentos.setText("Ver instrumentos");
        jRInstrumentos.setContentAreaFilled(false);
        jRInstrumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRInstrumentosActionPerformed(evt);
            }
        });
        jPFondo.add(jRInstrumentos);
        jRInstrumentos.setBounds(510, 50, 140, 21);

        jRLibros.setBackground(new java.awt.Color(255, 255, 255));
        jRLibros.setText("Ver libros");
        jRLibros.setContentAreaFilled(false);
        jRLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRLibrosActionPerformed(evt);
            }
        });
        jPFondo.add(jRLibros);
        jRLibros.setBounds(400, 50, 110, 21);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Rentas");
        jPFondo.add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 270, 30);

        jLabelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setOpaque(true);
        jPFondo.add(jLabelFondo);
        jLabelFondo.setBounds(0, 30, 840, 490);

        JBCancela1.setBackground(new java.awt.Color(255, 255, 254));
        JBCancela1.setForeground(new java.awt.Color(250, 183, 22));
        JBCancela1.setText("cerrar");
        JBCancela1.setBorder(null);
        JBCancela1.setBorderPainted(false);
        JBCancela1.setFocusPainted(false);
        JBCancela1.setPreferredSize(new java.awt.Dimension(89, 40));
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
        JBCancela1.setBounds(20, 540, 150, 40);

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
        jPFondo.setBounds(0, 0, 840, 600);

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

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

    private void JBCancela1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseEntered
        this.JBCancela1.setText("CERRAR");
    }//GEN-LAST:event_JBCancela1MouseEntered

    private void JBCancela1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseExited
        this.JBCancela1.setText("cerrar");
    }//GEN-LAST:event_JBCancela1MouseExited

    private void JBCancela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancela1ActionPerformed
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jButtonDevolucionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDevolucionMouseEntered
        this.jButtonDevolucion.setText("DEVOLUCIÓN");
    }//GEN-LAST:event_jButtonDevolucionMouseEntered

    private void jButtonDevolucionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDevolucionMouseExited
        this.jButtonDevolucion.setText("devolución");
    }//GEN-LAST:event_jButtonDevolucionMouseExited

    private void jButtonDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolucionActionPerformed
        dev.setVisible(true);
    }//GEN-LAST:event_jButtonDevolucionActionPerformed

    private void jButtonPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPrestamoMouseEntered
        this.jButtonPrestamo.setText("PRÉSTAMO");
    }//GEN-LAST:event_jButtonPrestamoMouseEntered

    private void jButtonPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPrestamoMouseExited
        this.jButtonPrestamo.setText("préstamo");
    }//GEN-LAST:event_jButtonPrestamoMouseExited

    private void jButtonPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrestamoActionPerformed
        pres.setVisible(true);
    }//GEN-LAST:event_jButtonPrestamoActionPerformed

    private void jRTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRTodosActionPerformed
        this.SQL = """
                   SELECT
                       PL.Codigo_libro as codigo,
                   	L.Nombre AS Elemento,
                       P1.Cedula,
                   	CONCAT(P1.Nombres, ' ', P1.Apellidos) AS Cliente,
                       PL.Fecha
                   FROM prestamos_libros PL INNER JOIN Personas P1 
                   ON PL.Cedula_Estudiante = P1.Cedula INNER JOIN Libros L 
                   ON PL.Codigo_libro = L.Codigo
                   UNION
                   SELECT
                   	PI.Codigo_Instrumento as codigo,
                       I.Nombre AS Elemento,
                       P2.Cedula,
                       CONCAT(P2.Nombres, ' ', P2.Apellidos) AS Cliente,
                       PI.Fecha
                   FROM prestamos_instrumentos PI INNER JOIN Personas P2 
                   ON PI.Cedula_Estudiante = P2.Cedula JOIN Instrumentos I 
                   ON PI.Codigo_instrumento = I.Codigo;""";
        con.busqueda_y_despliegue(this.jTClases, this.selectTabla,this.SQL);
    }//GEN-LAST:event_jRTodosActionPerformed

    private void jRLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRLibrosActionPerformed
        this.SQL = """
                   SELECT
                       PL.Codigo_libro as codigo,
                   	L.Nombre AS Elemento,
                       P1.Cedula,
                   	CONCAT(P1.Nombres, ' ', P1.Apellidos) AS Cliente,
                       PL.Fecha
                   FROM prestamos_libros PL INNER JOIN Personas P1 
                   ON PL.Cedula_Estudiante = P1.Cedula INNER JOIN Libros L 
                   ON PL.Codigo_libro = L.Codigo
                   ;""";
        con.busqueda_y_despliegue(this.jTClases, this.selectTabla,this.SQL);
    }//GEN-LAST:event_jRLibrosActionPerformed

    private void jRInstrumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRInstrumentosActionPerformed
        this.SQL = """
                   SELECT
                   	PI.Codigo_Instrumento as codigo,
                       I.Nombre AS Elemento,
                       P2.Cedula,
                       CONCAT(P2.Nombres, ' ', P2.Apellidos) AS Cliente,
                       PI.Fecha
                   FROM prestamos_instrumentos PI INNER JOIN Personas P2 
                   ON PI.Cedula_Estudiante = P2.Cedula JOIN Instrumentos I 
                   ON PI.Codigo_instrumento = I.Codigo;""";
        con.busqueda_y_despliegue(this.jTClases, this.selectTabla,this.SQL);
    }//GEN-LAST:event_jRInstrumentosActionPerformed

    private void emitirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton JBCancela1;
    private javax.swing.JButton jButtonDevolucion;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonPrestamo;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JRadioButton jRInstrumentos;
    private javax.swing.JRadioButton jRLibros;
    private javax.swing.JRadioButton jRTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTClases;
    // End of variables declaration//GEN-END:variables
}
