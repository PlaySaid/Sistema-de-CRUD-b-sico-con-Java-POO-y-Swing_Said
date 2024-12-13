/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.edu.udec.poo.gui;

import javax.swing.JOptionPane;
import co.edu.udec.poo.datos.Materia;
import co.edu.udec.poo.datos.MateriaControlador;

public class VentanaPrincipalMateria extends javax.swing.JDialog {

    MateriaControlador controlador = new MateriaControlador();
    
    public VentanaPrincipalMateria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        label_imagenMateria = new javax.swing.JLabel();
        panelDatosMateria = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        campoDeTextoNombre = new javax.swing.JTextField();
        labelHorario = new javax.swing.JLabel();
        campoDeTextoHorario = new javax.swing.JTextField();
        campoDeTextoProfesor = new javax.swing.JTextField();
        labelProfesor = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_titulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("FORMULARIO DE MATERIA");
        label_titulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        label_imagenMateria.setForeground(new java.awt.Color(51, 51, 51));
        label_imagenMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_imagenMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/libroBig.png"))); // NOI18N
        label_imagenMateria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));

        panelDatosMateria.setBackground(new java.awt.Color(244, 244, 244));
        panelDatosMateria.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true), "Datos de la materia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18))); // NOI18N
        panelDatosMateria.setToolTipText("");
        panelDatosMateria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        labelNombre.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNombre.setText("NOMBRE:");

        campoDeTextoNombre.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        campoDeTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeTextoNombreActionPerformed(evt);
            }
        });

        labelHorario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        labelHorario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelHorario.setText("HORARIO:");
        labelHorario.setToolTipText("");

        campoDeTextoHorario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        campoDeTextoHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeTextoHorarioActionPerformed(evt);
            }
        });

        campoDeTextoProfesor.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        campoDeTextoProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeTextoProfesorActionPerformed(evt);
            }
        });

        labelProfesor.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        labelProfesor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelProfesor.setText("PROFESOR:");

        botonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/save.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setHideActionText(true);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/Buscar.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/Eliminar.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setEnabled(false);
        botonEliminar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                botonEliminarStateChanged(evt);
            }
        });
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/Actualizar.png"))); // NOI18N
        botonActualizar.setText("Actualizar");
        botonActualizar.setEnabled(false);
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosMateriaLayout = new javax.swing.GroupLayout(panelDatosMateria);
        panelDatosMateria.setLayout(panelDatosMateriaLayout);
        panelDatosMateriaLayout.setHorizontalGroup(
            panelDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosMateriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosMateriaLayout.createSequentialGroup()
                        .addGroup(panelDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(91, 91, 91)
                        .addGroup(panelDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoDeTextoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDeTextoHorario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDeTextoProfesor, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(panelDatosMateriaLayout.createSequentialGroup()
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(botonEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(botonActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelDatosMateriaLayout.setVerticalGroup(
            panelDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosMateriaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(campoDeTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHorario)
                    .addComponent(campoDeTextoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProfesor)
                    .addComponent(campoDeTextoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosMateriaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosMateriaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_imagenMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatosMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label_titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_imagenMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelDatosMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDeTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeTextoNombreActionPerformed

    private void campoDeTextoHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeTextoHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeTextoHorarioActionPerformed

    private void campoDeTextoProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeTextoProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeTextoProfesorActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        String nombreMateria = campoDeTextoNombre.getText();
        String horario = campoDeTextoHorario.getText();
        String profesor = campoDeTextoProfesor.getText();

        String msj = controlador.guardarMateria(nombreMateria, horario, profesor);

        JOptionPane.showMessageDialog(this, msj);

        limpiarCampos();
    }//GEN-LAST:event_botonGuardarActionPerformed

    public void limpiarCampos(){
        campoDeTextoNombre.setText("");
        campoDeTextoHorario.setText("");
        campoDeTextoProfesor.setText("");
        botonActualizar.setEnabled(false);
        botonEliminar.setEnabled(false);
    }
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea cerrar esta ventana?"
            , "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(opcion == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        String nombre = campoDeTextoNombre.getText();
        Materia materia = controlador.buscarMateria(nombre);

        if (controlador.baseDeDatosVacia()){
            String msj = "No existen materias en la base de datos.";
            JOptionPane.showMessageDialog(this, msj);
        }
        else{
            if(materia == null){
                String msj = "Esta materia no existe.\n"
                + "Para agregar una nueva ingrese los datos y haga clic en guardar.";
                JOptionPane.showMessageDialog(this, msj);

                limpiarCampos();
            }
            else {
                campoDeTextoNombre.setText(materia.getNombre());
                campoDeTextoHorario.setText(materia.getHorario());
                campoDeTextoProfesor.setText(materia.getProfesor());
                botonActualizar.setEnabled(true);
                botonEliminar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonEliminarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_botonEliminarStateChanged

    }//GEN-LAST:event_botonEliminarStateChanged

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        String nombreMateria = campoDeTextoNombre.getText();
        String horario = campoDeTextoHorario.getText();
        String profesor = campoDeTextoProfesor.getText();

        String confirmacion = "¿Esta seguro?";
        int respuesta = JOptionPane.showConfirmDialog(this, confirmacion,
            "¿ELIMINAR?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
            String msj = controlador.eliminarMateria(nombreMateria, horario, profesor);

            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed

        String nombreMateria = campoDeTextoNombre.getText();
        String horario = campoDeTextoHorario.getText();
        String profesor = campoDeTextoProfesor.getText();

        String msj = controlador.actualizarMateria(nombreMateria, horario, profesor);

        JOptionPane.showMessageDialog(this, msj);

        limpiarCampos();
    }//GEN-LAST:event_botonActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaPrincipalMateria dialog = new VentanaPrincipalMateria(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoDeTextoHorario;
    private javax.swing.JTextField campoDeTextoNombre;
    private javax.swing.JTextField campoDeTextoProfesor;
    private javax.swing.JLabel labelHorario;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelProfesor;
    private javax.swing.JLabel label_imagenMateria;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPanel panelDatosMateria;
    // End of variables declaration//GEN-END:variables
}
