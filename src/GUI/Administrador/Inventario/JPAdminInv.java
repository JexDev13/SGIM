package GUI.Administrador.Inventario;

import Negocio.Diseño;

/*
 * @authors G2 SoftwareSolutions
 */
public class JPAdminInv extends javax.swing.JPanel {
    Diseño gui = new Diseño();
    JFAdmin_ActualizarInst actInst = new JFAdmin_ActualizarInst();
    JFAdmin_ActualizarLib actLib = new JFAdmin_ActualizarLib();
    JFAdmin_ConsultarInst conInst = new JFAdmin_ConsultarInst();
    JFAdmin_ConsultarLib conLib = new JFAdmin_ConsultarLib();
    JFAdmin_EliminarInst elimInst = new JFAdmin_EliminarInst();
    JFAdmin_EliminarLib elimLib = new JFAdmin_EliminarLib();
    JFAdmin_InsertarInst insInst = new JFAdmin_InsertarInst();
    JFAdmin_InsertarLib insLib = new JFAdmin_InsertarLib();

    public JPAdminInv() {
        initComponents();
        gui.jComboUsers(this.jCBFiltroInst);
        gui.jtableHead(jTInst);
        gui.jComboUsers(this.jCBFiltroLib);
        gui.jtableHead(jTLib);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLFiltro = new javax.swing.JLabel();
        jTFBusqueda = new javax.swing.JTextField();
        jCBFiltroInst = new javax.swing.JComboBox<>();
        jLLupa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTInst = new javax.swing.JTable();
        jLTitTabla = new javax.swing.JLabel();
        jButtonNuevoInst = new javax.swing.JButton();
        jButtonActualizarInst = new javax.swing.JButton();
        jButtonEliminarInst = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTLib = new javax.swing.JTable();
        jLTitTabla1 = new javax.swing.JLabel();
        jButtonConsultarInst = new javax.swing.JButton();
        jButtonNuevoLib = new javax.swing.JButton();
        jButtonActualizarLib = new javax.swing.JButton();
        jButtonEliminarLib = new javax.swing.JButton();
        jTFBusqueda1 = new javax.swing.JTextField();
        jLLupa1 = new javax.swing.JLabel();
        jLFiltro1 = new javax.swing.JLabel();
        jCBFiltroLib = new javax.swing.JComboBox<>();
        jButtonConsultarLib = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        jLFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        jTFBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        jTFBusqueda.setText("Colocar código instrumento");
        jTFBusqueda.setBorder(null);
        jTFBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFBusquedaFocusLost(evt);
            }
        });
        jTFBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFBusquedaMousePressed(evt);
            }
        });
        jTFBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBusquedaActionPerformed(evt);
            }
        });
        jTFBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBusquedaKeyReleased(evt);
            }
        });

        jCBFiltroInst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar...", "Nombre Instrumento", "Categoría Instrumento", "Fabricante Instrumento", "Estado de Alquiler Instrumento", "Condición Instrumento" }));
        jCBFiltroInst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroInstActionPerformed(evt);
            }
        });

        jLLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTInst.setAutoCreateRowSorter(true);
        jTInst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTInst.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTInst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Fabricante", "Categoría", "Estado Alquiler", "Condición"
            }
        ));
        jTInst.setGridColor(new java.awt.Color(250, 183, 22));
        jTInst.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTInst.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTInst.getTableHeader().setResizingAllowed(false);
        jTInst.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTInst);

        jLTitTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla.setText("Inventario Instrumentos");

        jButtonNuevoInst.setBackground(new java.awt.Color(250, 183, 22));
        jButtonNuevoInst.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoInst.setText("Nuevo Inst.");
        jButtonNuevoInst.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevoInst.setBorderPainted(false);
        jButtonNuevoInst.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevoInst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoInstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoInstMouseExited(evt);
            }
        });
        jButtonNuevoInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoInstActionPerformed(evt);
            }
        });

        jButtonActualizarInst.setBackground(new java.awt.Color(250, 183, 22));
        jButtonActualizarInst.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarInst.setText("Actualizar Inst.");
        jButtonActualizarInst.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizarInst.setBorderPainted(false);
        jButtonActualizarInst.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonActualizarInst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarInstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarInstMouseExited(evt);
            }
        });
        jButtonActualizarInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarInstActionPerformed(evt);
            }
        });

        jButtonEliminarInst.setBackground(new java.awt.Color(250, 183, 22));
        jButtonEliminarInst.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarInst.setText("Eliminar Inst.");
        jButtonEliminarInst.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminarInst.setBorderPainted(false);
        jButtonEliminarInst.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarInst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarInstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarInstMouseExited(evt);
            }
        });
        jButtonEliminarInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarInstActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));

        jTLib.setAutoCreateRowSorter(true);
        jTLib.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jTLib.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTLib.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Autor", "Categoría", "Estado Alquiler", "Condición"
            }
        ));
        jTLib.setGridColor(new java.awt.Color(250, 183, 22));
        jTLib.setSelectionBackground(new java.awt.Color(255, 242, 196));
        jTLib.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTLib.getTableHeader().setResizingAllowed(false);
        jTLib.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTLib);

        jLTitTabla1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLTitTabla1.setForeground(new java.awt.Color(250, 183, 22));
        jLTitTabla1.setText("Inventario Libros");

        jButtonConsultarInst.setBackground(new java.awt.Color(250, 183, 22));
        jButtonConsultarInst.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarInst.setText("Consultar Inst.");
        jButtonConsultarInst.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonConsultarInst.setBorderPainted(false);
        jButtonConsultarInst.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonConsultarInst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConsultarInstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultarInstMouseExited(evt);
            }
        });
        jButtonConsultarInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarInstActionPerformed(evt);
            }
        });

        jButtonNuevoLib.setBackground(new java.awt.Color(250, 183, 22));
        jButtonNuevoLib.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoLib.setText("Nuevo Libro");
        jButtonNuevoLib.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevoLib.setBorderPainted(false);
        jButtonNuevoLib.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevoLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoLibMouseExited(evt);
            }
        });
        jButtonNuevoLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoLibActionPerformed(evt);
            }
        });

        jButtonActualizarLib.setBackground(new java.awt.Color(250, 183, 22));
        jButtonActualizarLib.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarLib.setText("Actualizar Libro");
        jButtonActualizarLib.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizarLib.setBorderPainted(false);
        jButtonActualizarLib.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonActualizarLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarLibMouseExited(evt);
            }
        });
        jButtonActualizarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarLibActionPerformed(evt);
            }
        });

        jButtonEliminarLib.setBackground(new java.awt.Color(250, 183, 22));
        jButtonEliminarLib.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarLib.setText("Eliminar Libro");
        jButtonEliminarLib.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminarLib.setBorderPainted(false);
        jButtonEliminarLib.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarLibMouseExited(evt);
            }
        });
        jButtonEliminarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarLibActionPerformed(evt);
            }
        });

        jTFBusqueda1.setForeground(new java.awt.Color(102, 102, 102));
        jTFBusqueda1.setText("Colocar código libro");
        jTFBusqueda1.setBorder(null);
        jTFBusqueda1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFBusqueda1FocusLost(evt);
            }
        });
        jTFBusqueda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFBusqueda1MousePressed(evt);
            }
        });
        jTFBusqueda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBusqueda1ActionPerformed(evt);
            }
        });
        jTFBusqueda1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBusqueda1KeyReleased(evt);
            }
        });

        jLLupa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N

        jLFiltro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        jCBFiltroLib.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar...", "Nombre Libro", "Categoría Libro", "Autor Libro", "Estado de Alquiler Libro", "Condición Libro" }));
        jCBFiltroLib.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 183, 22)));
        jCBFiltroLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroLibActionPerformed(evt);
            }
        });

        jButtonConsultarLib.setBackground(new java.awt.Color(250, 183, 22));
        jButtonConsultarLib.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarLib.setText("Consultar Libro");
        jButtonConsultarLib.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonConsultarLib.setBorderPainted(false);
        jButtonConsultarLib.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonConsultarLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConsultarLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultarLibMouseExited(evt);
            }
        });
        jButtonConsultarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarLibActionPerformed(evt);
            }
        });

        jSeparator.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator.setForeground(new java.awt.Color(250, 183, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonNuevoInst, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEliminarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLTitTabla)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonConsultarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLLupa)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLFiltro)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCBFiltroInst, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLTitTabla1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(490, 490, 490)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonConsultarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLLupa1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTFBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLFiltro1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCBFiltroLib, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonNuevoLib, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonEliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNuevoInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonActualizarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBFiltroInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLLupa)
                                .addComponent(jTFBusqueda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLFiltro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultarInst, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNuevoLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBFiltroLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLFiltro1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLLupa1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBusquedaFocusLost
        if(jTFBusqueda.getText().isEmpty()){this.jTFBusqueda.setText("Buscar nombre");}
    }//GEN-LAST:event_jTFBusquedaFocusLost

    private void jTFBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBusquedaMousePressed
        if(jTFBusqueda.getText().equalsIgnoreCase("Buscar nombre")){jTFBusqueda.setText("");}
    }//GEN-LAST:event_jTFBusquedaMousePressed

    private void jTFBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBusquedaActionPerformed

    private void jTFBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaKeyReleased

    }//GEN-LAST:event_jTFBusquedaKeyReleased

    private void jCBFiltroInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroInstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroInstActionPerformed

    private void jButtonNuevoInstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoInstMouseEntered
        this.jButtonNuevoInst.setText("NUEVO");
    }//GEN-LAST:event_jButtonNuevoInstMouseEntered

    private void jButtonNuevoInstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoInstMouseExited
        this.jButtonNuevoInst.setText("nuevo");
    }//GEN-LAST:event_jButtonNuevoInstMouseExited

    private void jButtonNuevoInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoInstActionPerformed
        insInst.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoInstActionPerformed

    private void jButtonActualizarInstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarInstMouseEntered
        this.jButtonActualizarInst.setText("ACTUALIZAR");
    }//GEN-LAST:event_jButtonActualizarInstMouseEntered

    private void jButtonActualizarInstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarInstMouseExited
        this.jButtonActualizarInst.setText("actualizar");
    }//GEN-LAST:event_jButtonActualizarInstMouseExited

    private void jButtonActualizarInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarInstActionPerformed
        actInst.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarInstActionPerformed

    private void jButtonEliminarInstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarInstMouseEntered
        this.jButtonEliminarInst.setText("ELIMINAR");
    }//GEN-LAST:event_jButtonEliminarInstMouseEntered

    private void jButtonEliminarInstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarInstMouseExited
        this.jButtonEliminarInst.setText("eliminar");
    }//GEN-LAST:event_jButtonEliminarInstMouseExited

    private void jButtonEliminarInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarInstActionPerformed
        elimInst.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarInstActionPerformed

    private void jButtonConsultarInstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarInstMouseEntered
        this.jButtonConsultarInst.setText("CONSULTAR");
    }//GEN-LAST:event_jButtonConsultarInstMouseEntered

    private void jButtonConsultarInstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarInstMouseExited
        this.jButtonConsultarInst.setText("consultar");
    }//GEN-LAST:event_jButtonConsultarInstMouseExited

    private void jButtonConsultarInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarInstActionPerformed
        conInst.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarInstActionPerformed

    private void jButtonNuevoLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoLibMouseEntered
        this.jButtonNuevoLib.setText("NUEVO");
    }//GEN-LAST:event_jButtonNuevoLibMouseEntered

    private void jButtonNuevoLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoLibMouseExited
        this.jButtonNuevoLib.setText("nuevo");
    }//GEN-LAST:event_jButtonNuevoLibMouseExited

    private void jButtonNuevoLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoLibActionPerformed
        insLib.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoLibActionPerformed

    private void jButtonActualizarLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarLibMouseEntered
        this.jButtonActualizarLib.setText("ACTUALIZAR");
    }//GEN-LAST:event_jButtonActualizarLibMouseEntered

    private void jButtonActualizarLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarLibMouseExited
        this.jButtonActualizarLib.setText("actualizar");
    }//GEN-LAST:event_jButtonActualizarLibMouseExited

    private void jButtonActualizarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarLibActionPerformed
        actLib.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarLibActionPerformed

    private void jButtonEliminarLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarLibMouseEntered
        this.jButtonEliminarLib.setText("ELIMINAR");
    }//GEN-LAST:event_jButtonEliminarLibMouseEntered

    private void jButtonEliminarLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarLibMouseExited
        this.jButtonEliminarLib.setText("eliminar");
    }//GEN-LAST:event_jButtonEliminarLibMouseExited

    private void jButtonEliminarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarLibActionPerformed
        elimLib.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarLibActionPerformed

    private void jTFBusqueda1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBusqueda1FocusLost
        if(jTFBusqueda1.getText().isEmpty()){this.jTFBusqueda.setText("Buscar código");}
    }//GEN-LAST:event_jTFBusqueda1FocusLost

    private void jTFBusqueda1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBusqueda1MousePressed
        if(jTFBusqueda1.getText().equalsIgnoreCase("Buscar código")){jTFBusqueda.setText("");}
    }//GEN-LAST:event_jTFBusqueda1MousePressed

    private void jTFBusqueda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBusqueda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBusqueda1ActionPerformed

    private void jTFBusqueda1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusqueda1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBusqueda1KeyReleased

    private void jCBFiltroLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroLibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroLibActionPerformed

    private void jButtonConsultarLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarLibMouseEntered
        this.jButtonConsultarLib.setText("CONSULTAR");
    }//GEN-LAST:event_jButtonConsultarLibMouseEntered

    private void jButtonConsultarLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarLibMouseExited
        this.jButtonConsultarLib.setText("consultar");
    }//GEN-LAST:event_jButtonConsultarLibMouseExited

    private void jButtonConsultarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarLibActionPerformed
        conLib.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarLibActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarInst;
    private javax.swing.JButton jButtonActualizarLib;
    private javax.swing.JButton jButtonConsultarInst;
    private javax.swing.JButton jButtonConsultarLib;
    private javax.swing.JButton jButtonEliminarInst;
    private javax.swing.JButton jButtonEliminarLib;
    private javax.swing.JButton jButtonNuevoInst;
    private javax.swing.JButton jButtonNuevoLib;
    private javax.swing.JComboBox<String> jCBFiltroInst;
    private javax.swing.JComboBox<String> jCBFiltroLib;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JLabel jLFiltro1;
    private javax.swing.JLabel jLLupa;
    private javax.swing.JLabel jLLupa1;
    private javax.swing.JLabel jLTitTabla;
    private javax.swing.JLabel jLTitTabla1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextField jTFBusqueda;
    private javax.swing.JTextField jTFBusqueda1;
    private javax.swing.JTable jTInst;
    private javax.swing.JTable jTLib;
    // End of variables declaration//GEN-END:variables
}
