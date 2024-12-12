package co.edu.udec.poo.datos;

import co.edu.udec.poo.repositorios.RepositorioEscuela;
import co.edu.udec.poo.datos.Escuela;
import javax.swing.JOptionPane;

public class EscuelaControlador {
    private RepositorioEscuela repositorio;

    public EscuelaControlador() {
        this.repositorio = new RepositorioEscuela();
    }
    
    public boolean baseDeDatosVacia() {
        return repositorio.baseDeDatosVacia();
    }

    public String guardarEscuela(String nombreEscuela, String direccion, String numEstudiantes) {
        if (nombreEscuela.isBlank() || direccion.isBlank() || numEstudiantes.isBlank()) {
            return "Por favor ingrese datos válidos.";
        }

        if (repositorio.existeEscuela(nombreEscuela)) {
            return "Ya existe esta escuela.";
        }

        Escuela escuela = new Escuela(nombreEscuela, direccion, numEstudiantes);
        repositorio.guardarEscuela(escuela);

        return "Escuela guardada exitosamente\n"
                + "Ahora hay " + repositorio.totalEscuelas() + " escuelas guardadas.";
    }
    public Escuela buscarEscuela(String nombre) {
        
        if(!repositorio.existeEscuela(nombre)){
            return null;
            
        }
        if(RepositorioEscuela.escuelaBD.containsKey(nombre)){
            
        }
        Escuela escuela = repositorio.buscarEscuela(nombre);
        return escuela;
    }
    
    public String actualizarEscuela(String nombreEscuela, String direccion, String numEstudiantes) {
        if (nombreEscuela.isBlank() || direccion.isBlank() || numEstudiantes.isBlank()) {
            return "Llene todos los campos para actualizar.";
        }
        if(nombreEscuela == null || nombreEscuela.isBlank()){
            return "Para actualizar datos, primero debe buscar por el nombre.";
        }

        Escuela escuelaActualizada = new Escuela(nombreEscuela, direccion, numEstudiantes);

        repositorio.guardarEscuela(escuelaActualizada);

        return "Escuela actualizada exitosamente.";
    }
    public String eliminarEscuela(String nombreEscuela, String direccion, String numEstudiantes){
        
        Escuela existeEscuela = repositorio.buscarEscuela(nombreEscuela);
        
        if(!repositorio.existeEscuela(nombreEscuela)){
            return "Esta escuela no existe en la base de datos.";
        }
        if (nombreEscuela.isBlank() || direccion.isBlank() || numEstudiantes.isBlank()) {
            return "Llene todos los campos para eliminar.";
        }
        if(nombreEscuela == null || nombreEscuela.isBlank()){
            return "Para eliminar, primero debe buscar por el nombre.";
        }
        if (existeEscuela.getDireccion().equals(direccion) && existeEscuela.getNumEstudiantes().equals(numEstudiantes)){
            repositorio.eliminarEscuela(nombreEscuela);
            return "Escuela eliminada con exito!";
        }
        else {
            return "No se pudo eliminar, los datos no coinciden.";
        }
    }
}