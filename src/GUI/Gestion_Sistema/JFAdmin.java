package GUI.Gestion_Sistema;

import GUI.Administrador.Calendario_Clases.JPAdminCal;
import GUI.Administrador.Estudiantes.JPAdminEst;
import GUI.Administrador.Inventario.JPAdminInv;
import GUI.Administrador.Pagos.JPAdminPagos;
import GUI.Administrador.Profesores.JPAdminProf;
import Negocio.Conexion;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin extends javax.swing.JFrame {

    //Declarar aquí los paneles  y clases
    JPHome home = new JPHome(); //home=0
    JPAdminProf prof = new JPAdminProf(); //profesores = 1
    JPAdminEst est = new JPAdminEst();//estudiantes = 2
    JPAdminInv inv = new JPAdminInv();//Inventario = 3
    JPAdminPagos pagos = new JPAdminPagos();//Pagos = 4
    JPAdminCal cal = new JPAdminCal();//Calendario = 5
    JPAdminGest gest = new JPAdminGest();//Gestión del sistema = 6
    Conexion con = new Conexion();
    JFLogin log = new JFLogin();
    int x;
    int y;

    public JFAdmin() {
        initComponents();
        setLocationRelativeTo(this);
        setPanel(0, home);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jBHome = new javax.swing.JButton();
        jBProfesores = new javax.swing.JButton();
        jBEstudiantes = new javax.swing.JButton();
        jBInventario = new javax.swing.JButton();
        jBPagos = new javax.swing.JButton();
        jBCalendario = new javax.swing.JButton();
        jBGest_Sis = new javax.swing.JButton();
        jBLogOut = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jLabelTituloPanel = new javax.swing.JLabel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jPanelGeneral = new javax.swing.JPanel();
        jLabelFondoPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
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

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("SGE-Mousai");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 180));

        jBHome.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jBHome.setText("home");
        jBHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBHome.setContentAreaFilled(false);
        jBHome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHomeActionPerformed(evt);
            }
        });
        getContentPane().add(jBHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 260, 60));

        jBProfesores.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jBProfesores.setText("profesores");
        jBProfesores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBProfesores.setContentAreaFilled(false);
        jBProfesores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProfesoresActionPerformed(evt);
            }
        });
        getContentPane().add(jBProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 60));

        jBEstudiantes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jBEstudiantes.setText("estudiantes");
        jBEstudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBEstudiantes.setContentAreaFilled(false);
        jBEstudiantes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEstudiantesActionPerformed(evt);
            }
        });
        getContentPane().add(jBEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 60));

        jBInventario.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jBInventario.setText("inventario");
        jBInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBInventario.setContentAreaFilled(false);
        jBInventario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(jBInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 60));

        jBPagos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jBPagos.setText("pagos");
        jBPagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBPagos.setContentAreaFilled(false);
        jBPagos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPagosActionPerformed(evt);
            }
        });
        getContentPane().add(jBPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 260, 60));

        jBCalendario.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jBCalendario.setText("calendario");
        jBCalendario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBCalendario.setContentAreaFilled(false);
        jBCalendario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalendarioActionPerformed(evt);
            }
        });
        getContentPane().add(jBCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 260, 60));

        jBGest_Sis.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jBGest_Sis.setText("gestión del sistema");
        jBGest_Sis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBGest_Sis.setContentAreaFilled(false);
        jBGest_Sis.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBGest_Sis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGest_SisActionPerformed(evt);
            }
        });
        getContentPane().add(jBGest_Sis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 260, 60));

        jBLogOut.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jBLogOut.setText("log out");
        jBLogOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBLogOut.setContentAreaFilled(false);
        jBLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jBLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 260, 60));

        jLabelFondo.setMaximumSize(new java.awt.Dimension(260, 670));
        jLabelFondo.setMinimumSize(new java.awt.Dimension(260, 670));
        jLabelFondo.setPreferredSize(new java.awt.Dimension(260, 670));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelTituloPanel.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTituloPanel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloPanel.setText("   HOME");
        getContentPane().add(jLabelTituloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 490, 30));

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
        getContentPane().add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 30, 30));

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
        getContentPane().add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 30, 30));

        jPanelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGeneral.setMaximumSize(new java.awt.Dimension(970, 630));
        jPanelGeneral.setMinimumSize(new java.awt.Dimension(970, 630));
        jPanelGeneral.setPreferredSize(new java.awt.Dimension(970, 630));
        getContentPane().add(jPanelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabelFondoPanel.setBackground(new java.awt.Color(250, 183, 22));
        jLabelFondoPanel.setOpaque(true);
        getContentPane().add(jLabelFondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 970, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(JFLogin.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jBGest_SisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGest_SisActionPerformed
        //Gestión del sistema = 6
        setPanel(6, gest);
    }//GEN-LAST:event_jBGest_SisActionPerformed

    private void jBHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHomeActionPerformed
        //Home=0
        setPanel(0, home);
    }//GEN-LAST:event_jBHomeActionPerformed

    private void jBProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProfesoresActionPerformed
        //Profesores = 1
        setPanel(1, prof);
    }//GEN-LAST:event_jBProfesoresActionPerformed

    private void jBEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEstudiantesActionPerformed
        //Estudiantes = 2
        setPanel(2, est);
    }//GEN-LAST:event_jBEstudiantesActionPerformed

    private void jBInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInventarioActionPerformed
        //Inventario = 3
        setPanel(3, inv);
    }//GEN-LAST:event_jBInventarioActionPerformed

    private void jBPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPagosActionPerformed
        //Pagos = 4
        setPanel(4, pagos);
    }//GEN-LAST:event_jBPagosActionPerformed

    private void jBCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalendarioActionPerformed
        //Calendario = 5
        setPanel(5, cal);
    }//GEN-LAST:event_jBCalendarioActionPerformed

    private void jBLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogOutActionPerformed
        con.logOut();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBLogOutActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);
    }//GEN-LAST:event_formMouseDragged

    public void setPanel(int menu, JPanel panel) {
        panel.setSize(970, 630);
        panel.setLocation(0, 0);
        this.jPanelGeneral.removeAll();
        this.jPanelGeneral.add(panel, BorderLayout.CENTER);
        this.jPanelGeneral.revalidate();
        this.jPanelGeneral.repaint();
        String titulo = null;
        switch (menu) {
            case 0:
                //Home
                titulo = "\t HOME";
                break;
            case 1:
                //Profesores
                titulo = "\t PROFESORES";
                break;
            case 2:
                //Estudiantes
                titulo = "\t ESTUDIANTES";
                break;
            case 3:
                //Inventario
                titulo = "\t INVENTARIO";
                break;
            case 4:
                //Pagos
                titulo = "\t PAGOS";
                break;
            case 5:
                //Calendario
                titulo = "\t CALENDARIO";
                break;
            case 6:
                //Gestión del sistema
                titulo = "\t GESTIÓN DEL SISTEMA";
                break;
        }
        this.jLabelTituloPanel.setText(titulo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalendario;
    private javax.swing.JButton jBEstudiantes;
    private javax.swing.JButton jBGest_Sis;
    private javax.swing.JButton jBHome;
    private javax.swing.JButton jBInventario;
    private javax.swing.JButton jBLogOut;
    private javax.swing.JButton jBPagos;
    private javax.swing.JButton jBProfesores;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondoPanel;
    private javax.swing.JLabel jLabelTituloPanel;
    private javax.swing.JPanel jPanelGeneral;
    // End of variables declaration//GEN-END:variables
}
