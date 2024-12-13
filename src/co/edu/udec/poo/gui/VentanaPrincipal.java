package co.edu.udec.poo.gui;

import co.edu.udec.poo.repositorios.RepositorioEscuela;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        menuAyuda = new javax.swing.JMenu();
        menuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".+* GESTION ESCOLAR *+.");

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
        subMenuMateria.add(subMenuItemVerLista4);

        menuGeneral.add(subMenuMateria);

        barraMenu.add(menuGeneral);

        menuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/ayuda.png"))); // NOI18N
        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuItemAcercaDe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/acerca de.png"))); // NOI18N
        menuItemAcercaDe.setText("Acerca de...");
        menuAyuda.add(menuItemAcercaDe);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1527, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
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
        // TODO add your handling code here:
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator Separador;
    private javax.swing.JPopupMenu.Separator Separador3;
    private javax.swing.JPopupMenu.Separator Separador4;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuGeneral;
    private javax.swing.JMenuItem menuItemAcercaDe;
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
