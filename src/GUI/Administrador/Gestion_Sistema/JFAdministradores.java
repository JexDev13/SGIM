package GUI.Administrador.Gestion_Sistema;

/*
 * @authors G2 SoftwareSolutions
 */
public class JFAdministradores extends javax.swing.JFrame {

    public JFAdministradores() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabGeneral = new javax.swing.JTabbedPane();
        jPAdmins = new javax.swing.JPanel();
        jPBotones = new javax.swing.JPanel();
        JBCancela1 = new javax.swing.JButton();
        JBIngreso1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPNuevo = new javax.swing.JPanel();
        jPActualizar = new javax.swing.JPanel();
        jPEliminar = new javax.swing.JPanel();
        jPAudit = new javax.swing.JPanel();
        jPVariables = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabGeneral.setBackground(new java.awt.Color(255, 255, 254));
        jTabGeneral.setForeground(new java.awt.Color(250, 183, 22));
        jTabGeneral.setOpaque(true);

        jPAdmins.setBackground(new java.awt.Color(255, 255, 255));

        jPBotones.setBackground(new java.awt.Color(250, 183, 22));
        jPBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPBotones.add(JBCancela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

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
        jPBotones.add(JBIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(250, 183, 22));

        jPNuevo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPNuevoLayout = new javax.swing.GroupLayout(jPNuevo);
        jPNuevo.setLayout(jPNuevoLayout);
        jPNuevoLayout.setHorizontalGroup(
            jPNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        jPNuevoLayout.setVerticalGroup(
            jPNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Nuevo", jPNuevo);

        jPActualizar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPActualizarLayout = new javax.swing.GroupLayout(jPActualizar);
        jPActualizar.setLayout(jPActualizarLayout);
        jPActualizarLayout.setHorizontalGroup(
            jPActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPActualizarLayout.setVerticalGroup(
            jPActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Actualizar", jPActualizar);

        jPEliminar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPEliminarLayout = new javax.swing.GroupLayout(jPEliminar);
        jPEliminar.setLayout(jPEliminarLayout);
        jPEliminarLayout.setHorizontalGroup(
            jPEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        jPEliminarLayout.setVerticalGroup(
            jPEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar", jPEliminar);

        javax.swing.GroupLayout jPAdminsLayout = new javax.swing.GroupLayout(jPAdmins);
        jPAdmins.setLayout(jPAdminsLayout);
        jPAdminsLayout.setHorizontalGroup(
            jPAdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAdminsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addComponent(jPBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPAdminsLayout.setVerticalGroup(
            jPAdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAdminsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        );

        jTabGeneral.addTab("Administradores", jPAdmins);

        jPAudit.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPAuditLayout = new javax.swing.GroupLayout(jPAudit);
        jPAudit.setLayout(jPAuditLayout);
        jPAuditLayout.setHorizontalGroup(
            jPAuditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPAuditLayout.setVerticalGroup(
            jPAuditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jTabGeneral.addTab("Auditoria", jPAudit);

        jPVariables.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPVariablesLayout = new javax.swing.GroupLayout(jPVariables);
        jPVariables.setLayout(jPVariablesLayout);
        jPVariablesLayout.setHorizontalGroup(
            jPVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPVariablesLayout.setVerticalGroup(
            jPVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jTabGeneral.addTab("Variables del sistema", jPVariables);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancela1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseEntered
        this.JBCancela1.setText("CANCELAR");
    }//GEN-LAST:event_JBCancela1MouseEntered

    private void JBCancela1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCancela1MouseExited
        this.JBCancela1.setText("cancelar");
    }//GEN-LAST:event_JBCancela1MouseExited

    private void JBCancela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancela1ActionPerformed
        dispose();
    }//GEN-LAST:event_JBCancela1ActionPerformed

    private void JBIngreso1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseEntered
        this.JBIngreso1.setText("ACEPTAR");
    }//GEN-LAST:event_JBIngreso1MouseEntered

    private void JBIngreso1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngreso1MouseExited
        this.JBIngreso1.setText("aceptar");
    }//GEN-LAST:event_JBIngreso1MouseExited

    private void JBIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngreso1ActionPerformed

    }//GEN-LAST:event_JBIngreso1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancela1;
    private javax.swing.JButton JBIngreso1;
    private javax.swing.JPanel jPActualizar;
    private javax.swing.JPanel jPAdmins;
    private javax.swing.JPanel jPAudit;
    private javax.swing.JPanel jPBotones;
    private javax.swing.JPanel jPEliminar;
    private javax.swing.JPanel jPNuevo;
    private javax.swing.JPanel jPVariables;
    private javax.swing.JTabbedPane jTabGeneral;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
