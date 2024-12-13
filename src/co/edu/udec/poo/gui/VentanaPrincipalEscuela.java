package co.edu.udec.poo.gui;

import javax.swing.JOptionPane;
import co.edu.udec.poo.datos.Escuela;
import co.edu.udec.poo.datos.EscuelaControlador;


public class VentanaPrincipalEscuela extends javax.swing.JDialog {
    
    EscuelaControlador controlador = new EscuelaControlador();

    public VentanaPrincipalEscuela(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        panelDatosEscuela = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        campoDeTextoNombre = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        campoDeTextoDireccion = new javax.swing.JTextField();
        campoDeTextoNumEstudiantes = new javax.swing.JTextField();
        labelNumEstudiantes = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        label_imagenEscuela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario para agregar escuela");
        setBackground(new java.awt.Color(255, 255, 255));
        setModal(true);

        label_titulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("FORMULARIO DE ESCUELA");
        label_titulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        panelDatosEscuela.setBackground(new java.awt.Color(244, 244, 244));
        panelDatosEscuela.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true), "Datos de la escuela", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18))); // NOI18N
        panelDatosEscuela.setToolTipText("");
        panelDatosEscuela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        labelNombre.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNombre.setText("NOMBRE:");

        campoDeTextoNombre.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        campoDeTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeTextoNombreActionPerformed(evt);
            }
        });

        labelDireccion.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        labelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDireccion.setText("DIRECCION:");
        labelDireccion.setToolTipText("");

        campoDeTextoDireccion.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        campoDeTextoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeTextoDireccionActionPerformed(evt);
            }
        });

        campoDeTextoNumEstudiantes.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        campoDeTextoNumEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeTextoNumEstudiantesActionPerformed(evt);
            }
        });

        labelNumEstudiantes.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        labelNumEstudiantes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNumEstudiantes.setText("NUM. DE ESTUDIANTES:");

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

        javax.swing.GroupLayout panelDatosEscuelaLayout = new javax.swing.GroupLayout(panelDatosEscuela);
        panelDatosEscuela.setLayout(panelDatosEscuelaLayout);
        panelDatosEscuelaLayout.setHorizontalGroup(
            panelDatosEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosEscuelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosEscuelaLayout.createSequentialGroup()
                        .addGroup(panelDatosEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNumEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(91, 91, 91)
                        .addGroup(panelDatosEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoDeTextoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDeTextoDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDeTextoNumEstudiantes, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(panelDatosEscuelaLayout.createSequentialGroup()
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
        panelDatosEscuelaLayout.setVerticalGroup(
            panelDatosEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosEscuelaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelDatosEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(campoDeTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(campoDeTextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumEstudiantes)
                    .addComponent(campoDeTextoNumEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelDatosEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosEscuelaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosEscuelaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDatosEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        label_imagenEscuela.setForeground(new java.awt.Color(51, 51, 51));
        label_imagenEscuela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_imagenEscuela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/gui/iconos/escuelaBig.png"))); // NOI18N
        label_imagenEscuela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_imagenEscuela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatosEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(panelDatosEscuela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_imagenEscuela)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        
        String nombre = campoDeTextoNombre.getText();
        Escuela escuela = controlador.buscarEscuela(nombre);
        
        
        if (controlador.baseDeDatosVacia()){
            String msj = "No existen escuelas en la base de datos.";
            JOptionPane.showMessageDialog(this, msj);
        }
        else{
            if(escuela == null){
                String msj = "Esta escuela no existe.\n"
                        + "Para agregar una nueva ingrese los datos y haga clic en guardar.";
                JOptionPane.showMessageDialog(this, msj);
                
                limpiarCampos();
            }
            else {
                campoDeTextoNombre.setText(escuela.getNombre());
                campoDeTextoDireccion.setText(escuela.getDireccion());
                campoDeTextoNumEstudiantes.setText(escuela.getNumEstudiantes());
                botonActualizar.setEnabled(true);
                botonEliminar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea cerrar esta ventana?"
                , "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(opcion == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        String nombreEscuela = campoDeTextoNombre.getText();
        String direccion = campoDeTextoDireccion.getText();
        String numEstudiantes = campoDeTextoNumEstudiantes.getText();


        String msj = controlador.guardarEscuela(nombreEscuela, direccion, numEstudiantes);

        JOptionPane.showMessageDialog(this, msj);
        
        limpiarCampos();
    }//GEN-LAST:event_botonGuardarActionPerformed

    public void limpiarCampos(){
        campoDeTextoNombre.setText("");
        campoDeTextoDireccion.setText("");
        campoDeTextoNumEstudiantes.setText("");
        botonActualizar.setEnabled(false);
        botonEliminar.setEnabled(false);
    }
    private void campoDeTextoNumEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeTextoNumEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeTextoNumEstudiantesActionPerformed

    private void campoDeTextoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeTextoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeTextoDireccionActionPerformed

    private void campoDeTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeTextoNombreActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed

        String nombreEscuela = campoDeTextoNombre.getText();
        String direccion = campoDeTextoDireccion.getText();
        String numEstudiantes = campoDeTextoNumEstudiantes.getText();

        String msj = controlador.actualizarEscuela(nombreEscuela, direccion, numEstudiantes);

        JOptionPane.showMessageDialog(this, msj);
        
        limpiarCampos();
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonEliminarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_botonEliminarStateChanged
        
    }//GEN-LAST:event_botonEliminarStateChanged

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        String nombreEscuela = campoDeTextoNombre.getText();
        String direccion = campoDeTextoDireccion.getText();
        String numEstudiantes = campoDeTextoNumEstudiantes.getText();
        
        String confirmacion = "¿Esta seguro?";
        int respuesta = JOptionPane.showConfirmDialog(this, confirmacion, 
                "¿ELIMINAR?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
            String msj = controlador.eliminarEscuela(nombreEscuela, direccion, numEstudiantes);
            
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
        }   
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoDeTextoDireccion;
    private javax.swing.JTextField campoDeTextoNombre;
    private javax.swing.JTextField campoDeTextoNumEstudiantes;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNumEstudiantes;
    private javax.swing.JLabel label_imagenEscuela;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPanel panelDatosEscuela;
    // End of variables declaration//GEN-END:variables
}
