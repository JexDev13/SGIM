package GUI.Administrador.General;

import GUI.Administrador.Calendario_Clases.JPAdminCal;
import GUI.Administrador.Estudiantes.JPAdminEst;
import GUI.Administrador.Gestion_Sistema.JPAdminGest;
import GUI.Administrador.Inventario.JPAdminInv;
import GUI.Administrador.Pagos.JPAdminPagos;
import GUI.Administrador.Profesores.JPAdminProf;
import Negocio.Conexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdminMenu extends javax.swing.JFrame {

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

    public JFAdminMenu() {
        initComponents();
        setLocationRelativeTo(this);
        setPanel(0, home);
        setIconImage(getIconImage());
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
        jLCreditos = new javax.swing.JLabel();
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
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MousaiLogo.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 180));

        jBHome.setBackground(new java.awt.Color(255, 255, 254));
        jBHome.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        jBHome.setText("  home");
        jBHome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 183, 22)));
        jBHome.setBorderPainted(false);
        jBHome.setContentAreaFilled(false);
        jBHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBHome.setHideActionText(true);
        jBHome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBHomeMouseExited(evt);
            }
        });
        jBHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHomeActionPerformed(evt);
            }
        });
        getContentPane().add(jBHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 260, 60));

        jBProfesores.setBackground(new java.awt.Color(255, 255, 254));
        jBProfesores.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBProfesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profesores.png"))); // NOI18N
        jBProfesores.setText("  profesores");
        jBProfesores.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 183, 22)));
        jBProfesores.setBorderPainted(false);
        jBProfesores.setContentAreaFilled(false);
        jBProfesores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBProfesoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBProfesoresMouseExited(evt);
            }
        });
        jBProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProfesoresActionPerformed(evt);
            }
        });
        getContentPane().add(jBProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 60));

        jBEstudiantes.setBackground(new java.awt.Color(255, 255, 254));
        jBEstudiantes.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiantes.png"))); // NOI18N
        jBEstudiantes.setText("  estudiantes");
        jBEstudiantes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 183, 22)));
        jBEstudiantes.setBorderPainted(false);
        jBEstudiantes.setContentAreaFilled(false);
        jBEstudiantes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEstudiantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEstudiantesMouseExited(evt);
            }
        });
        jBEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEstudiantesActionPerformed(evt);
            }
        });
        getContentPane().add(jBEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 60));

        jBInventario.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario.png"))); // NOI18N
        jBInventario.setText("  inventario");
        jBInventario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 183, 22)));
        jBInventario.setBorderPainted(false);
        jBInventario.setContentAreaFilled(false);
        jBInventario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBInventarioMouseExited(evt);
            }
        });
        jBInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(jBInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 60));

        jBPagos.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagos.png"))); // NOI18N
        jBPagos.setText("  pagos");
        jBPagos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 183, 22)));
        jBPagos.setBorderPainted(false);
        jBPagos.setContentAreaFilled(false);
        jBPagos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBPagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBPagosMouseExited(evt);
            }
        });
        jBPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPagosActionPerformed(evt);
            }
        });
        getContentPane().add(jBPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 260, 60));

        jBCalendario.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clases.png"))); // NOI18N
        jBCalendario.setText("  clases");
        jBCalendario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 183, 22)));
        jBCalendario.setBorderPainted(false);
        jBCalendario.setContentAreaFilled(false);
        jBCalendario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBCalendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCalendarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCalendarioMouseExited(evt);
            }
        });
        jBCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalendarioActionPerformed(evt);
            }
        });
        getContentPane().add(jBCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 260, 60));

        jBGest_Sis.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBGest_Sis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion.png"))); // NOI18N
        jBGest_Sis.setText("gestión del sistema");
        jBGest_Sis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 183, 22)));
        jBGest_Sis.setBorderPainted(false);
        jBGest_Sis.setContentAreaFilled(false);
        jBGest_Sis.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBGest_Sis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBGest_SisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBGest_SisMouseExited(evt);
            }
        });
        jBGest_Sis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGest_SisActionPerformed(evt);
            }
        });
        getContentPane().add(jBGest_Sis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 260, 60));

        jBLogOut.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jBLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/log out.png"))); // NOI18N
        jBLogOut.setText("  log out");
        jBLogOut.setBorder(null);
        jBLogOut.setContentAreaFilled(false);
        jBLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLogOutMouseExited(evt);
            }
        });
        jBLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jBLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 260, 60));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Menu.png"))); // NOI18N
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

        jLCreditos.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLCreditos.setForeground(java.awt.Color.gray);
        jLCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCreditos.setText("©G2 SoftwareSolutions");
        jLCreditos.setToolTipText("");
        jLCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCreditosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCreditosMouseExited(evt);
            }
        });
        getContentPane().add(jLCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 660, -1, 10));

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
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void jBHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBHomeMouseEntered
        this.jBHome.setText("  HOME");
        this.jBHome.setContentAreaFilled(true);
        this.jBHome.setBackground(new Color(255, 250, 244));
    }//GEN-LAST:event_jBHomeMouseEntered

    private void jBHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBHomeMouseExited
        this.jBHome.setText("  home");
        this.jBHome.setContentAreaFilled(false);
    }//GEN-LAST:event_jBHomeMouseExited

    private void jBProfesoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProfesoresMouseEntered
        this.jBProfesores.setText("  PROFESORES");
        this.jBProfesores.setContentAreaFilled(true);
        this.jBProfesores.setBackground(new Color(255, 250, 244));
    }//GEN-LAST:event_jBProfesoresMouseEntered

    private void jBEstudiantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEstudiantesMouseEntered
        this.jBEstudiantes.setText("  ESTUDIANTES");
        this.jBEstudiantes.setContentAreaFilled(true);
        this.jBEstudiantes.setBackground(new Color(255, 250, 244));
    }//GEN-LAST:event_jBEstudiantesMouseEntered

    private void jBInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInventarioMouseEntered
        this.jBInventario.setText("  INVENTARIO");
        this.jBInventario.setContentAreaFilled(true);
        this.jBInventario.setBackground(new Color(255, 250, 244));
    }//GEN-LAST:event_jBInventarioMouseEntered

    private void jBPagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPagosMouseEntered
        this.jBPagos.setText("  PAGOS");
        this.jBPagos.setContentAreaFilled(true);
        this.jBPagos.setBackground(new Color(255, 250, 244));
    }//GEN-LAST:event_jBPagosMouseEntered

    private void jBCalendarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCalendarioMouseEntered
        this.jBCalendario.setText("  CLASES");
        this.jBCalendario.setContentAreaFilled(true);
        this.jBCalendario.setBackground(new Color(255, 250, 244));
    }//GEN-LAST:event_jBCalendarioMouseEntered

    private void jBGest_SisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGest_SisMouseEntered
        this.jBGest_Sis.setText("GESTIÓN DEL SISTEMA");
        this.jBGest_Sis.setContentAreaFilled(true);
        this.jBGest_Sis.setBackground(new Color(255, 250, 244));
    }//GEN-LAST:event_jBGest_SisMouseEntered

    private void jBLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLogOutMouseEntered
        this.jBLogOut.setText("  LOG OUT");
        this.jBLogOut.setContentAreaFilled(true);
        this.jBLogOut.setBackground(new Color(255, 250, 244));
    }//GEN-LAST:event_jBLogOutMouseEntered

    private void jBProfesoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProfesoresMouseExited
        this.jBProfesores.setText("  profesores");
        this.jBProfesores.setContentAreaFilled(false);
    }//GEN-LAST:event_jBProfesoresMouseExited

    private void jBEstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEstudiantesMouseExited
        this.jBEstudiantes.setText("  estudiantes");
        this.jBEstudiantes.setContentAreaFilled(false);
    }//GEN-LAST:event_jBEstudiantesMouseExited

    private void jBInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInventarioMouseExited
        this.jBInventario.setText("  inventario");
        this.jBInventario.setContentAreaFilled(false);
    }//GEN-LAST:event_jBInventarioMouseExited

    private void jBPagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPagosMouseExited
        this.jBPagos.setText("  pagos");
        this.jBPagos.setContentAreaFilled(false);
    }//GEN-LAST:event_jBPagosMouseExited

    private void jBCalendarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCalendarioMouseExited
        this.jBCalendario.setText("  clases");
        this.jBCalendario.setContentAreaFilled(false);
    }//GEN-LAST:event_jBCalendarioMouseExited

    private void jBGest_SisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGest_SisMouseExited
        this.jBGest_Sis.setText("gestión del sistema");
        this.jBGest_Sis.setContentAreaFilled(false);
    }//GEN-LAST:event_jBGest_SisMouseExited

    private void jBLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLogOutMouseExited
        this.jBLogOut.setText("  log out");
        this.jBLogOut.setContentAreaFilled(false);
    }//GEN-LAST:event_jBLogOutMouseExited

    private void jLCreditosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCreditosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCreditosMouseEntered

    private void jLCreditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCreditosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCreditosMouseExited

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

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono_app.png"));
        return retValue;
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
    private javax.swing.JLabel jLCreditos;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondoPanel;
    private javax.swing.JLabel jLabelTituloPanel;
    private javax.swing.JPanel jPanelGeneral;
    // End of variables declaration//GEN-END:variables
}
