package co.edu.udec.poo.gui;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuGeneral = new javax.swing.JMenu();
        subMenuEscuela = new javax.swing.JMenu();
        subMenuItemAñadir = new javax.swing.JMenuItem();
        Separador = new javax.swing.JPopupMenu.Separator();
        subMenuItemVerLista = new javax.swing.JMenuItem();
        subMenuAlumno = new javax.swing.JMenu();
        subMenuItemAñadir3 = new javax.swing.JMenuItem();
        Separador3 = new javax.swing.JPopupMenu.Separator();
        subMenuItemVerLista3 = new javax.swing.JMenuItem();
        subMenuMateria = new javax.swing.JMenu();
        subMenuItemAñadir4 = new javax.swing.JMenuItem();
        Separador4 = new javax.swing.JPopupMenu.Separator();
        subMenuItemVerLista4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".+* GESTION ESCOLAR *+.");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/unicartagenalogo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Unispace", 1, 48)); // NOI18N
        jLabel2.setText("SAID ALEJANDRO MARTELO DIAZ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/flechita.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setText("Haga click aqui para abrir el menú");

        barraMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menuGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/menu.png"))); // NOI18N
        menuGeneral.setText("Menu");
        menuGeneral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        subMenuEscuela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/escuela.png"))); // NOI18N
        subMenuEscuela.setText("Escuela");
        subMenuEscuela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        subMenuItemAñadir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuItemAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/añadir.png"))); // NOI18N
        subMenuItemAñadir.setText("Añadir...");
        subMenuItemAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuItemAñadirActionPerformed(evt);
            }
        });
        subMenuEscuela.add(subMenuItemAñadir);
        subMenuEscuela.add(Separador);

        subMenuItemVerLista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuItemVerLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/lista.png"))); // NOI18N
        subMenuItemVerLista.setText("Ver lista...");
        subMenuItemVerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuItemVerListaActionPerformed(evt);
            }
        });
        subMenuEscuela.add(subMenuItemVerLista);

        menuGeneral.add(subMenuEscuela);

        subMenuAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/estudiante.png"))); // NOI18N
        subMenuAlumno.setText("Alumno");
        subMenuAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        subMenuItemAñadir3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuItemAñadir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/añadir.png"))); // NOI18N
        subMenuItemAñadir3.setText("Añadir...");
        subMenuItemAñadir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuItemAñadir3ActionPerformed(evt);
            }
        });
        subMenuAlumno.add(subMenuItemAñadir3);
        subMenuAlumno.add(Separador3);

        subMenuItemVerLista3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuItemVerLista3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/lista.png"))); // NOI18N
        subMenuItemVerLista3.setText("Ver lista...");
        subMenuItemVerLista3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuItemVerLista3ActionPerformed(evt);
            }
        });
        subMenuAlumno.add(subMenuItemVerLista3);

        menuGeneral.add(subMenuAlumno);

        subMenuMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/libro.png"))); // NOI18N
        subMenuMateria.setText("Materia");
        subMenuMateria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        subMenuItemAñadir4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuItemAñadir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/añadir.png"))); // NOI18N
        subMenuItemAñadir4.setText("Añadir...");
        subMenuItemAñadir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuItemAñadir4ActionPerformed(evt);
            }
        });
        subMenuMateria.add(subMenuItemAñadir4);
        subMenuMateria.add(Separador4);

        subMenuItemVerLista4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subMenuItemVerLista4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/lista.png"))); // NOI18N
        subMenuItemVerLista4.setText("Ver lista...");
        subMenuItemVerLista4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuItemVerLista4ActionPerformed(evt);
            }
        });
        subMenuMateria.add(subMenuItemVerLista4);

        menuGeneral.add(subMenuMateria);

        barraMenu.add(menuGeneral);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2))
                .addGap(368, 368, 368))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel4)))
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addContainerGap(434, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuItemAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuItemAñadirActionPerformed
        VentanaPrincipalEscuela VentanaPrincipalEscuela = new VentanaPrincipalEscuela(this, true);
        VentanaPrincipalEscuela.setLocationRelativeTo(this);
        VentanaPrincipalEscuela.setVisible(true);
    }//GEN-LAST:event_subMenuItemAñadirActionPerformed

    private void subMenuItemAñadir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuItemAñadir3ActionPerformed
        VentanaPrincipalAlumno VentanaPrincipalAlumno = new VentanaPrincipalAlumno(this, true);
        VentanaPrincipalAlumno.setLocationRelativeTo(this);
        VentanaPrincipalAlumno.setVisible(true);
    }//GEN-LAST:event_subMenuItemAñadir3ActionPerformed

    private void subMenuItemAñadir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuItemAñadir4ActionPerformed
        VentanaPrincipalMateria VentanaPrincipalMateria = new VentanaPrincipalMateria(this, true);
        VentanaPrincipalMateria.setLocationRelativeTo(this);
        VentanaPrincipalMateria.setVisible(true);
    }//GEN-LAST:event_subMenuItemAñadir4ActionPerformed

    private void subMenuItemVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuItemVerListaActionPerformed
        VentanaListaEscuelas VentanaListaEscuelas = new VentanaListaEscuelas(this, true);
        VentanaListaEscuelas.setLocationRelativeTo(this);
        VentanaListaEscuelas.setVisible(true);
    }//GEN-LAST:event_subMenuItemVerListaActionPerformed

    private void subMenuItemVerLista3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuItemVerLista3ActionPerformed
        VentanaListaAlumnos VentanaListaAlumnos = new VentanaListaAlumnos(this, true);
        VentanaListaAlumnos.setLocationRelativeTo(this);
        VentanaListaAlumnos.setVisible(true);
    }//GEN-LAST:event_subMenuItemVerLista3ActionPerformed

    private void subMenuItemVerLista4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuItemVerLista4ActionPerformed
        VentanaListaMaterias VentanaListaMaterias = new VentanaListaMaterias(this, true);
        VentanaListaMaterias.setLocationRelativeTo(this);
        VentanaListaMaterias.setVisible(true);
    }//GEN-LAST:event_subMenuItemVerLista4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator Separador;
    private javax.swing.JPopupMenu.Separator Separador3;
    private javax.swing.JPopupMenu.Separator Separador4;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu menuGeneral;
    private javax.swing.JMenu subMenuAlumno;
    private javax.swing.JMenu subMenuEscuela;
    private javax.swing.JMenuItem subMenuItemAñadir;
    private javax.swing.JMenuItem subMenuItemAñadir3;
    private javax.swing.JMenuItem subMenuItemAñadir4;
    private javax.swing.JMenuItem subMenuItemVerLista;
    private javax.swing.JMenuItem subMenuItemVerLista3;
    private javax.swing.JMenuItem subMenuItemVerLista4;
    private javax.swing.JMenu subMenuMateria;
    // End of variables declaration//GEN-END:variables
}
