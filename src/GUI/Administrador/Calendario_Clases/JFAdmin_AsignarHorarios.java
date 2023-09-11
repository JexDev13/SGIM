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
public class JFAdmin_AsignarHorarios extends javax.swing.JFrame {

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

    public JFAdmin_AsignarHorarios() {
        initComponents();
        setLocationRelativeTo(this);
        dis.jComboUsers(jCBFiltroUsers);
        dis.jComboUsers(jCBFiltroUsers1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPDatosClaseAsignar = new javax.swing.JPanel();
        jTFCodigo_AsignarClase = new javax.swing.JTextField();
        jTFAula_AsignarClase = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTFMateria_AsignarClase = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTFCedProf_AsignarClase = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTFProf_AsignarClase = new javax.swing.JTextField();
        jPanelDatoClase = new javax.swing.JPanel();
        jTFBuscar_AsignarClase = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jPHorario = new javax.swing.JPanel();
        jPDatosClaseAsignar1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jCBFiltroUsers = new javax.swing.JComboBox<>();
        jCBFiltroUsers1 = new javax.swing.JComboBox<>();
        jPFondo = new javax.swing.JPanel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();
        JBCancela1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 489));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(380, 489));
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
        jLabelTitulo.setText("Asignar horarios");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

        jPDatosClaseAsignar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosClaseAsignar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la clase"));

        jTFCodigo_AsignarClase.setEditable(false);
        jTFCodigo_AsignarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFAula_AsignarClase.setEditable(false);
        jTFAula_AsignarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Cod. Clase");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Aula");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Materia");

        jTFMateria_AsignarClase.setEditable(false);
        jTFMateria_AsignarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Cédula profesor");

        jTFCedProf_AsignarClase.setEditable(false);
        jTFCedProf_AsignarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Profesor");

        jTFProf_AsignarClase.setEditable(false);
        jTFProf_AsignarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPDatosClaseAsignarLayout = new javax.swing.GroupLayout(jPDatosClaseAsignar);
        jPDatosClaseAsignar.setLayout(jPDatosClaseAsignarLayout);
        jPDatosClaseAsignarLayout.setHorizontalGroup(
            jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseAsignarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFMateria_AsignarClase)
                    .addComponent(jTFCodigo_AsignarClase, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jTFAula_AsignarClase)
                    .addComponent(jTFCedProf_AsignarClase, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFProf_AsignarClase, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPDatosClaseAsignarLayout.setVerticalGroup(
            jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseAsignarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_AsignarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAula_AsignarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFMateria_AsignarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCedProf_AsignarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFProf_AsignarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(109, 109, 109))
        );

        getContentPane().add(jPDatosClaseAsignar);
        jPDatosClaseAsignar.setBounds(10, 120, 360, 190);

        jPanelDatoClase.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoClase.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la clase"));

        jTFBuscar_AsignarClase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_AsignarClase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_AsignarClaseKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_AsignarClaseKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCodigo.setText("Código de la clase:");

        javax.swing.GroupLayout jPanelDatoClaseLayout = new javax.swing.GroupLayout(jPanelDatoClase);
        jPanelDatoClase.setLayout(jPanelDatoClaseLayout);
        jPanelDatoClaseLayout.setHorizontalGroup(
            jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodigo)
                .addGap(18, 18, 18)
                .addComponent(jTFBuscar_AsignarClase, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoClaseLayout.setVerticalGroup(
            jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoClaseLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDatoClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_AsignarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoClase);
        jPanelDatoClase.setBounds(10, 40, 360, 70);

        jPHorario.setBackground(new java.awt.Color(255, 255, 255));

        jPDatosClaseAsignar1.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosClaseAsignar1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de los horarios"));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Día");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Hora");

        jCBFiltroUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoge un día....", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" }));
        jCBFiltroUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroUsersActionPerformed(evt);
            }
        });

        jCBFiltroUsers1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoge una hora....", "07:00:00", "09:00:00", "11:00:00", "13:00:00", "14:00:00", "16:00:00", "18:00:00", "20:00:00" }));
        jCBFiltroUsers1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroUsers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroUsers1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDatosClaseAsignar1Layout = new javax.swing.GroupLayout(jPDatosClaseAsignar1);
        jPDatosClaseAsignar1.setLayout(jPDatosClaseAsignar1Layout);
        jPDatosClaseAsignar1Layout.setHorizontalGroup(
            jPDatosClaseAsignar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseAsignar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosClaseAsignar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosClaseAsignar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBFiltroUsers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCBFiltroUsers1, 0, 261, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPDatosClaseAsignar1Layout.setVerticalGroup(
            jPDatosClaseAsignar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosClaseAsignar1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatosClaseAsignar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jCBFiltroUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPDatosClaseAsignar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jCBFiltroUsers1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203))
        );

        javax.swing.GroupLayout jPHorarioLayout = new javax.swing.GroupLayout(jPHorario);
        jPHorario.setLayout(jPHorarioLayout);
        jPHorarioLayout.setHorizontalGroup(
            jPHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPDatosClaseAsignar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPHorarioLayout.setVerticalGroup(
            jPHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPHorarioLayout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addComponent(jPDatosClaseAsignar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPHorario);
        jPHorario.setBounds(0, 30, 380, 400);

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
        JBIngreso1.setBounds(90, 440, 89, 32);

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
        JBCancela1.setBounds(200, 440, 89, 32);

        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 380, 530);

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

    private void jTFBuscar_AsignarClaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_AsignarClaseKeyTyped

    }//GEN-LAST:event_jTFBuscar_AsignarClaseKeyTyped

    private void jTFBuscar_AsignarClaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_AsignarClaseKeyReleased
        String parametroBusqueda = jTFBuscar_AsignarClase.getText().trim();
        if (parametroBusqueda.length() >= 1) {

            this.SQL = """
        SELECT
            C.Codigo_Clase,
            C.Aula,
            C.Materia,
            C.Cedula_Profesor,
            CONCAT(P.Nombres, ' ', P.Apellidos) AS ProfesorAsignado
        FROM Clases C JOIN Personas P ON C.Cedula_Profesor = P.Cedula WHERE C.Codigo_Clase LIKE '%""" + parametroBusqueda + "%';";

            con.despliegueFields(SQL, tabla, jTFCodigo_AsignarClase, jTFAula_AsignarClase, jTFMateria_AsignarClase, jTFCedProf_AsignarClase,
                    jTFProf_AsignarClase, null, null, null, "insertar");
        } else {
            limpiarCampos();
        }
    }//GEN-LAST:event_jTFBuscar_AsignarClaseKeyReleased

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("aceptar");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed
        String dia = jCBFiltroUsers.getSelectedItem().toString();
        String hora = jCBFiltroUsers1.getSelectedItem().toString();
        String clase = jTFBuscar_AsignarClase.getText().trim();
        this.SQL = "Select count(*) from Clases WHERE Codigo_Clase like '" + clase + "'";
        if (con.busquedaCod("Personas", SQL, "count(*)") < 1) {
            getToolkit().beep();
            titulo = "ADVERTENCIA";
            mensaje = "La clase a la que hace referencia no existe";
            emitirMensaje(mensaje, titulo);
        } else {
            if (clase.isEmpty() || dia.equals("Escoge un día....") || hora.equals("Escoge una hora....")) {
                titulo = "ADVERTENCIA";
                mensaje = "Todos los campos deben estar llenos";
                emitirMensaje(mensaje, titulo);
            } else {
                this.SQL = """
                   SELECT COUNT(*)
                   FROM Horarios
                   WHERE Codigo_Clase = '""" + clase + "'"
                        + " AND DiaSemana = '" + dia + "'"
                        + " AND Hora = '" + hora + "';";
                if (con.busquedaCod("Personas", SQL, "count(*)") >= 1) {
                    getToolkit().beep();
                    titulo = "ADVERTENCIA";
                    mensaje = "La clase que estas intentando registrar ya se encuentra ocupada en ese día y horario";
                    emitirMensaje(mensaje, titulo);
                } else {
                    this.SQL = "SELECT Cupos from variables_del_sistema;";
                    int cupos = con.busquedaCod("Variables", SQL, "cupos");
                    ArrayList<String> atributosInsetar = new ArrayList<>();
                    atributosInsetar.add(clase);
                    atributosInsetar.add(dia);
                    atributosInsetar.add(hora);
                    atributosInsetar.add(cupos + "");
                    String parametro = con.prepararAtributos(atributosInsetar);
                    if (con.insertar_Tablas("Horarios", parametro)) {
                        titulo = "Ingresado";
                        mensaje = "Los datos fueron ingresados correctamente";
                        dispose();
                        limpiarCampos();
                        jTFBuscar_AsignarClase.setText("");
                        JFAdmin_Calendario.JBCancela1.doClick();
                        JFAdmin_Calendario cal = new JFAdmin_Calendario();
                        cal.setVisible(true);
                    } else {
                        titulo = "ERROR: Ingresado";
                        mensaje = "Los datos NO fueron ingresados debido a un error";
                    }
                    emitirMensaje(mensaje, titulo);
                }
            }
        }
    }//GEN-LAST:event_JBIngreso1ActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

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
        jTFBuscar_AsignarClase.setText("");
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jCBFiltroUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroUsersActionPerformed

    private void jCBFiltroUsers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroUsers1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroUsers1ActionPerformed

    public void limpiarCampos() {
        jTFCodigo_AsignarClase.setText("");
        jTFAula_AsignarClase.setText("");
        jTFMateria_AsignarClase.setText("");
        jTFCedProf_AsignarClase.setText("");
        jTFProf_AsignarClase.setText("");
    }

    private void emitirMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONCANCELAR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JComboBox<String> jCBFiltroUsers;
    private javax.swing.JComboBox<String> jCBFiltroUsers1;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosClaseAsignar;
    private javax.swing.JPanel jPDatosClaseAsignar1;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPHorario;
    private javax.swing.JPanel jPanelDatoClase;
    public static javax.swing.JTextField jTFAula_AsignarClase;
    public static javax.swing.JTextField jTFBuscar_AsignarClase;
    public static javax.swing.JTextField jTFCedProf_AsignarClase;
    public static javax.swing.JTextField jTFCodigo_AsignarClase;
    public static javax.swing.JTextField jTFMateria_AsignarClase;
    public static javax.swing.JTextField jTFProf_AsignarClase;
    // End of variables declaration//GEN-END:variables
}
