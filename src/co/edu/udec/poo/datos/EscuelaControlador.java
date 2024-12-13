package co.edu.udec.poo.datos;

import co.edu.udec.poo.repositorios.RepositorioEscuela;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EscuelaControlador {
    private RepositorioEscuela repositorio;

    public EscuelaControlador() {
        this.repositorio = new RepositorioEscuela();
    }
    
    // metodo solo para validar si la base de datos esta vacia //
    public boolean baseDeDatosVacia() {
        return repositorio.baseDeDatosVacia();
    }

    // Metodo para guardar escuelas con validaciones y un mensaje final diciendo el total de alumnos //
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
    
    // Metodo para buscar escuelas, con validaciones que si no hay devuelve null y si hay devuelve el objeto //
    public Escuela buscarEscuela(String nombre) {
        
        if(!repositorio.existeEscuela(nombre)){
            return null;
            
        }
        if(RepositorioEscuela.escuelaBD.containsKey(nombre)){
            
        }
        Escuela escuela = repositorio.buscarEscuela(nombre);
        return escuela;
    }
    
    // Metodo para actualizar los datos de una escuela existente en la base de datos, con validaciones //
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
    
    // Metodo para eliminar escuelas con sus validaciones //
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
        
    // Metodo con validaciones para listar escuelas, donde si no hay, devuelve null y si hay, devuelve una lista array con los valores almacenados en la base de datos //
    public List<Escuela> listarEscuelas() {
        if(repositorio.escuelaBD == null || repositorio.escuelaBD.isEmpty()){
            return null;
        }
        return new ArrayList<>(repositorio.escuelaBD.values());
    }
        
    // Metodo para crear la estructura de la lista de escuelas //
    public DefaultTableModel crearListaEscuelas(){
            List<Escuela> listaDeEscuelas = listarEscuelas();
        
            int totalEscuelas = listaDeEscuelas.size();
            String columnas[] = {"Nombre", "Dirección", "Num. de estudiantes"};
            String filas[][] = new String[totalEscuelas][columnas.length];
                
            for (int i = 0; i < totalEscuelas; i++) {
            
                Escuela esc = listaDeEscuelas.get(i);
                filas[i][0] = esc.getNombre();
                filas[i][1] = esc.getDireccion();
                filas[i][2] = String.valueOf(esc.getNumEstudiantes());
            }
            return new DefaultTableModel(filas, columnas);
        }
}