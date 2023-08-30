package GUI.Administrador.Calendario_Clases;

import static GUI.Administrador.Calendario_Clases.JFAdmin_AsignarEstudiante.jTFBuscar_AsignarHorario;
import static GUI.Administrador.Calendario_Clases.JFAdmin_AsignarEstudiante.jTFBuscar_Estudiante;
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
    String tabla = "Horarios";

    public JFAdmin_EliminarEstudiante() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPFondo = new javax.swing.JPanel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();
        JBCancela1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPDatosClaseAsignar = new javax.swing.JPanel();
        jTFCodigo_Clase = new javax.swing.JTextField();
        jTFAula = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTFMateria = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTFCedProf = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTFNombreProf = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTFCodigo_Horario = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTFHorario = new javax.swing.JTextField();
        jCBElimTodo = new javax.swing.JCheckBox();
        jPanelDatoClase = new javax.swing.JPanel();
        jTFBuscar_AsignarHorario = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jPDatosEst = new javax.swing.JPanel();
        jTFBuscar_Estudiante = new javax.swing.JTextField();
        jLCodigo1 = new javax.swing.JLabel();
        jPDatosEstudiElim = new javax.swing.JPanel();
        jTFCedulaEst = new javax.swing.JTextField();
        jTFNombresEst = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(379, 639));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(379, 639));
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
        jLabelTitulo.setText("Eliminar estudiante");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);

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
        jPFondo.add(jButtonMinimizar);
        jButtonMinimizar.setBounds(320, 0, 30, 30);

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
        jPFondo.add(jButtonSalirIcon);
        jButtonSalirIcon.setBounds(350, 0, 30, 30);

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
        JBIngreso1.setBounds(70, 590, 89, 32);

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
        JBCancela1.setBounds(170, 590, 89, 32);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPDatosClaseAsignar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosClaseAsignar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la clase"));

        jTFCodigo_Clase.setEditable(false);
        jTFCodigo_Clase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFAula.setEditable(false);
        jTFAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Cod. Clase");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Aula");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Materia");

        jTFMateria.setEditable(false);
        jTFMateria.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Cédula profesor");

        jTFCedProf.setEditable(false);
        jTFCedProf.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Profesor");

        jTFNombreProf.setEditable(false);
        jTFNombreProf.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Cod. Horario");

        jTFCodigo_Horario.setEditable(false);
        jTFCodigo_Horario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Horario");

        jTFHorario.setEditable(false);
        jTFHorario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jCBElimTodo.setBackground(new java.awt.Color(255, 255, 255));
        jCBElimTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCBElimTodo.setText("¿Eliminar toda la lista de estudiantes de esta clase?");
        jCBElimTodo.setContentAreaFilled(false);
        jCBElimTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBElimTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDatosClaseAsignarLayout = new javax.swing.GroupLayout(jPDatosClaseAsignar);
        jPDatosClaseAsignar.setLayout(jPDatosClaseAsignarLayout);
        jPDatosClaseAsignarLayout.setHorizontalGroup(
            jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseAsignarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosClaseAsignarLayout.createSequentialGroup()
                        .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(jTFCodigo_Horario)
                            .addComponent(jTFMateria)
                            .addComponent(jTFCodigo_Clase)
                            .addComponent(jTFAula)
                            .addComponent(jTFCedProf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFNombreProf, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPDatosClaseAsignarLayout.createSequentialGroup()
                        .addComponent(jCBElimTodo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPDatosClaseAsignarLayout.setVerticalGroup(
            jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseAsignarLayout.createSequentialGroup()
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(9, 9, 9)
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_Clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCedProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombreProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBElimTodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDatoClase.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoClase.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la clase"));

        jTFBuscar_AsignarHorario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_AsignarHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_AsignarHorarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_AsignarHorarioKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código del horario:");

        javax.swing.GroupLayout jPanelDatoClaseLayout = new javax.swing.GroupLayout(jPanelDatoClase);
        jPanelDatoClase.setLayout(jPanelDatoClaseLayout);
        jPanelDatoClaseLayout.setHorizontalGroup(
            jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFBuscar_AsignarHorario)
                .addContainerGap())
        );
        jPanelDatoClaseLayout.setVerticalGroup(
            jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_AsignarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPDatosEst.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEst.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del estudiante"));

        jTFBuscar_Estudiante.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_Estudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_EstudianteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_EstudianteKeyTyped(evt);
            }
        });

        jLCodigo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo1.setText("Cédula del estudiante:");

        javax.swing.GroupLayout jPDatosEstLayout = new javax.swing.GroupLayout(jPDatosEst);
        jPDatosEst.setLayout(jPDatosEstLayout);
        jPDatosEstLayout.setHorizontalGroup(
            jPDatosEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodigo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFBuscar_Estudiante)
                .addContainerGap())
        );
        jPDatosEstLayout.setVerticalGroup(
            jPDatosEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPDatosEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_Estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPDatosEstudiElim.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEstudiElim.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del estudiante"));

        jTFCedulaEst.setEditable(false);
        jTFCedulaEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFNombresEst.setEditable(false);
        jTFNombresEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Ced. Estudiante");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Estudiante");

        javax.swing.GroupLayout jPDatosEstudiElimLayout = new javax.swing.GroupLayout(jPDatosEstudiElim);
        jPDatosEstudiElim.setLayout(jPDatosEstudiElimLayout);
        jPDatosEstudiElimLayout.setHorizontalGroup(
            jPDatosEstudiElimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudiElimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudiElimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudiElimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCedulaEst)
                    .addComponent(jTFNombresEst))
                .addContainerGap())
        );
        jPDatosEstudiElimLayout.setVerticalGroup(
            jPDatosEstudiElimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudiElimLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatosEstudiElimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCedulaEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudiElimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombresEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(202, 202, 202))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPDatosClaseAsignar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDatoClase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDatosEstudiElim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDatosEst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelDatoClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPDatosClaseAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPDatosEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPDatosEstudiElim, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPFondo.add(jPanel1);
        jPanel1.setBounds(0, 30, 380, 540);

        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 380, 640);

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

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("aceptar");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed
        String cedulaEst = jTFBuscar_Estudiante.getText();
        String codClase = jTFCodigo_Clase.getText();
        String codHorario = jTFBuscar_AsignarHorario.getText();
        if (codHorario.isEmpty() || cedulaEst.isEmpty() && !jCBElimTodo.isSelected()) {
            titulo = "ADVERTENCIA";
            mensaje = "Todos los campos deben estar llenos";
            emitirMensaje(mensaje, titulo);
        } else {
            this.SQL = "Select count(*) from Horarios where Codigo_horario like '%" + codHorario + "%'";
            if (con.busquedaCod("Personas", SQL, "count(*)") < 1) {
                titulo = "ADVERTENCIA";
                mensaje = "El horario al que hace referencia no existe";
                emitirMensaje(mensaje, titulo);
            } else {
                if (!val.validadorDeCedula(cedulaEst) && !jCBElimTodo.isSelected()) {
                    titulo = "ERROR DE FORMATO";
                    mensaje = "La cédula ingresada no es válida en el territorio Ecuatoriano";
                    emitirMensaje(mensaje, titulo);
                } else {
                    this.SQL = "Select count(*) from Estudiantes where Cedula_Estudiante like '%" + cedulaEst + "%'";
                    if (con.busquedaCod("Personas", SQL, "count(*)") < 1 && !jCBElimTodo.isSelected()) {
                        titulo = "ADVERTENCIA";
                        mensaje = "El estudiante al que hace referencia no existe";
                        emitirMensaje(mensaje, titulo);
                    } else {
                        this.SQL = "SELECT COUNT(*) FROM Asignacion_cupos WHERE Codigo_clase = '" + codClase + "' AND Cedula_estudiante = '" + cedulaEst + "' AND Codigo_Horario = '" + codHorario + "';";
                        if (con.busquedaCod("Personas", SQL, "count(*)") < 1 && !jCBElimTodo.isSelected()) {
                            titulo = "ADVERTENCIA";
                            mensaje = "El estudiante al que hace referencia no esta registrado en esa clase";
                            emitirMensaje(mensaje, titulo);
                        } else {
                            if (this.jCBElimTodo.isSelected()) {
                                int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar toda la lista de la clase?" + "\n     -Esta accion no podrá ser revertida", "Eliminar lista de estudiantes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ICONCANCELAR);
                                if (seleccion == 0) {
                                    this.SQL = "DELETE FROM Asignacion_cupos WHERE Codigo_Horario = '" + codHorario + "';";
                                    if (con.actualizarEliminarTablas(SQL) == true) {
                                        titulo = "RESULTADO";
                                        mensaje = "Lista de estudiantes borrada exitosamente";
                                        dispose();
                                        jTFBuscar_AsignarHorario.setText("");
                                        jTFBuscar_Estudiante.setText("");
                                        JFAdmin_AsistenciaClase.JBCancela1.doClick();
                                        JFAdmin_AsistenciaClase clas = new JFAdmin_AsistenciaClase();
                                        clas.setVisible(true);
                                    } else {
                                        titulo = "ERROR: Borrado";
                                        mensaje = "Los estudiantes NO fueron borrados debido a un error";
                                    }
                                    emitirMensaje(mensaje, titulo);
                                }
                            } else {
                                int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar al estudiante de la clase?" + "\n     -Esta accion podrá ser revertida", "Eliminar estudiante de la clase", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ICONCANCELAR);
                                if (seleccion == 0) {
                                    this.SQL = "DELETE FROM Asignacion_cupos WHERE Codigo_Horario = '" + codHorario + "' AND Codigo_clase = '" + codClase + "'AND Cedula_estudiante = '" + cedulaEst + "';";
                                    if (con.actualizarEliminarTablas(SQL) == true) {
                                        titulo = "RESULTADO";
                                        mensaje = "Elemento inactivado exitosamente";
                                        dispose();
                                        jTFBuscar_AsignarHorario.setText("");
                                        jTFBuscar_Estudiante.setText("");
                                        JFAdmin_AsistenciaClase.JBCancela1.doClick();
                                        JFAdmin_AsistenciaClase clas = new JFAdmin_AsistenciaClase();
                                        clas.setVisible(true);
                                    } else {
                                        titulo = "ERROR: Ingresado";
                                        mensaje = "El estudiante NO fue borrado debido a un error";
                                    }
                                    emitirMensaje(mensaje, titulo);
                                }
                            }
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
        String mensaje = "Si cancela los datos ingresados no serán guardados";
        emitirMensaje(mensaje, tituo);
        limpiarCampos();
        jTFBuscar_AsignarHorario.setText("");
        jTFBuscar_Estudiante.setText("");
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jTFBuscar_AsignarHorarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_AsignarHorarioKeyReleased
        String parametroBusqueda = jTFBuscar_AsignarHorario.getText();
        if (parametroBusqueda.length() >= 1) {
            this.SQL = """
            SELECT
            	H.Codigo_horario,
                C.Codigo_Clase,
                C.Aula,
                C.Materia,
                C.Cedula_Profesor,
                CONCAT(P.Nombres, ' ', P.Apellidos) AS ProfesorAsignado,
                CONCAT(H.DiaSemana, ' ', H.Hora) AS Horario
            FROM Clases C JOIN Personas P 
            ON C.Cedula_Profesor = P.Cedula JOIN Horarios H 
            ON C.Codigo_Clase = H.Codigo_Clase WHERE H.Codigo_Horario LIKE '%""" + parametroBusqueda + "%';";
            con.despliegueFields(SQL, tabla, jTFCodigo_Clase, jTFAula, jTFMateria, jTFCedProf,
                    jTFNombreProf, jTFCodigo_Horario, jTFHorario, null, "insertar");
        } else {
            limpiarCampos();
        }
    }//GEN-LAST:event_jTFBuscar_AsignarHorarioKeyReleased

    private void jTFBuscar_AsignarHorarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_AsignarHorarioKeyTyped

    }//GEN-LAST:event_jTFBuscar_AsignarHorarioKeyTyped

    private void jTFBuscar_EstudianteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EstudianteKeyReleased
        String parametroBusqueda = jTFBuscar_Estudiante.getText();
        if (parametroBusqueda.length() == 10) {
            this.SQL = """
            SELECT CONCAT(Nombres, ' ', Apellidos) AS Nombres, Cedula
            FROM Personas
            WHERE Rol = 'Estudiante' AND Cedula LIKE '%""" + parametroBusqueda + "%';";
            con.despliegueFields(SQL, "Personas", jTFCedulaEst, jTFNombresEst, null, null,
                    null, null, null, null, "insertar");
        } else {
            jTFCedulaEst.setText("");
            jTFNombresEst.setText("");
        }
    }//GEN-LAST:event_jTFBuscar_EstudianteKeyReleased

    private void jTFBuscar_EstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EstudianteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBuscar_EstudianteKeyTyped

    private void jCBElimTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBElimTodoActionPerformed
        if (this.jCBElimTodo.isSelected()) {
            jTFBuscar_Estudiante.setEditable(false);
            jTFBuscar_Estudiante.setText("");
            jTFCedulaEst.setText("");
            jTFNombresEst.setText("");
        } else {
            jTFBuscar_Estudiante.setEditable(true);
            jTFBuscar_Estudiante.setText("");
        }
    }//GEN-LAST:event_jCBElimTodoActionPerformed

    public void limpiarCampos() {
        jTFAula.setText("");
        jTFCedProf.setText("");
        jTFCodigo_Clase.setText("");
        jTFCodigo_Horario.setText("");
        jTFHorario.setText("");
        jTFMateria.setText("");
        jTFNombreProf.setText("");
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
    private javax.swing.JCheckBox jCBElimTodo;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCodigo1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosClaseAsignar;
    private javax.swing.JPanel jPDatosEst;
    private javax.swing.JPanel jPDatosEstudiElim;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDatoClase;
    public static javax.swing.JTextField jTFAula;
    public static javax.swing.JTextField jTFBuscar_AsignarHorario;
    public static javax.swing.JTextField jTFBuscar_Estudiante;
    public static javax.swing.JTextField jTFCedProf;
    public static javax.swing.JTextField jTFCedulaEst;
    public static javax.swing.JTextField jTFCodigo_Clase;
    public static javax.swing.JTextField jTFCodigo_Horario;
    public static javax.swing.JTextField jTFHorario;
    public static javax.swing.JTextField jTFMateria;
    public static javax.swing.JTextField jTFNombreProf;
    public static javax.swing.JTextField jTFNombresEst;
    // End of variables declaration//GEN-END:variables
}
