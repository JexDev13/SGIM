package GUI.Administrador.Gestion_Sistema;

import GUI.Administrador.Calendario_Clases.*;
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
public class JFAdmin_Auditoria extends javax.swing.JFrame {

    private int x;
    private int y;
    Diseño dis = new Diseño();
    ImageIcon ICONCANCELAR = dis.getICONERROR();
    Conexion con = new Conexion();
    Validaciones val = new Validaciones();
    ButtonGroup buttonGroup = new ButtonGroup();

    private String selectTabla = "Auditoria";
    private String SQL;
    String titulo = null;
    String mensaje = null;

    public JFAdmin_Auditoria() {
        initComponents();
        setLocationRelativeTo(this);
        dis.jtableHead(jTClases);
        this.SQL = """
                   select * from auditoria;""";
        con.busqueda_y_despliegue(jTClases, this.selectTabla, this.SQL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jLTitTabla = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClases = new javax.swing.JTable();
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
        jLTitTabla.setText("Auditoria del sistema");
        jPFondo.add(jLTitTabla);
        jLTitTabla.setBounds(20, 50, 380, 26);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(250, 183, 22));
        jPFondo.add(jSeparator1);
        jSeparator1.setBounds(690, 60, 0, 3);

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
        jScrollPane1.setBounds(20, 80, 800, 420);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Auditoria del sistema");
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

    private void emitirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton JBCancela1;
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTClases;
    // End of variables declaration//GEN-END:variables
}
