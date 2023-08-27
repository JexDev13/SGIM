package GUI.Administrador.Inventario;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdmin_Consultar extends javax.swing.JFrame {

    private int x;
    private int y;

    public JFAdmin_Consultar() {
        initComponents();
        setLocationRelativeTo(this);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPDatoConsultadoInstrumento = new javax.swing.JPanel();
        jTFCodigo_Inst = new javax.swing.JTextField();
        jTFDato_Inst = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButtonMinimizar1 = new javax.swing.JButton();
        jButtonSalirIcon1 = new javax.swing.JButton();
        jLabelFondo1 = new javax.swing.JLabel();
        jPFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 240));
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

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Consultar Dato");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 240, 30);

        jPDatoConsultadoInstrumento.setBackground(new java.awt.Color(255, 255, 255));
        jPDatoConsultadoInstrumento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dato Consultado"));

        jTFCodigo_Inst.setEditable(false);
        jTFCodigo_Inst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_Inst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFDato_Inst.setEditable(false);
        jTFDato_Inst.setBackground(new java.awt.Color(255, 255, 255));
        jTFDato_Inst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFDato_Inst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDato_InstActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Código:");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel21.setText("Dato Elegido:");

        javax.swing.GroupLayout jPDatoConsultadoInstrumentoLayout = new javax.swing.GroupLayout(jPDatoConsultadoInstrumento);
        jPDatoConsultadoInstrumento.setLayout(jPDatoConsultadoInstrumentoLayout);
        jPDatoConsultadoInstrumentoLayout.setHorizontalGroup(
            jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatoConsultadoInstrumentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCodigo_Inst, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jTFDato_Inst))
                .addContainerGap())
        );
        jPDatoConsultadoInstrumentoLayout.setVerticalGroup(
            jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatoConsultadoInstrumentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_Inst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(35, 35, 35)
                .addGroup(jPDatoConsultadoInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDato_Inst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(173, 173, 173))
        );

        getContentPane().add(jPDatoConsultadoInstrumento);
        jPDatoConsultadoInstrumento.setBounds(10, 50, 360, 140);

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
        getContentPane().add(jButtonMinimizar1);
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
        getContentPane().add(jButtonSalirIcon1);
        jButtonSalirIcon1.setBounds(350, 0, 30, 30);

        jLabelFondo1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo1.setOpaque(true);
        getContentPane().add(jLabelFondo1);
        jLabelFondo1.setBounds(0, 30, 380, 180);

        jPFondo.setBackground(new java.awt.Color(250, 183, 22));
        jPFondo.setLayout(null);
        getContentPane().add(jPFondo);
        jPFondo.setBounds(0, 0, 380, 240);

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

    private void jTFDato_InstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDato_InstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDato_InstActionPerformed

    private void jButtonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizar1ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizar1ActionPerformed

    private void jButtonSalirIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIcon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIcon1ActionPerformed

    public void limpiarCampos() {
        this.jTFDato_Inst.setText("");
        this.jTFCodigo_Inst.setText("");
    }
    
    public void setTFCodigo(String codigo) {
        this.jTFCodigo_Inst.setText(codigo);
    }
    
    public void setTFNomDato(String dato) {
        this.jLabel21.setText(dato);
    }
    
    public void setTFDato(String dato) {
        this.jTFDato_Inst.setText(dato);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMinimizar1;
    private javax.swing.JButton jButtonSalirIcon1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabelFondo1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatoConsultadoInstrumento;
    private javax.swing.JPanel jPFondo;
    public static javax.swing.JTextField jTFCodigo_Inst;
    public static javax.swing.JTextField jTFDato_Inst;
    // End of variables declaration//GEN-END:variables
}
