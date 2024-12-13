package co.edu.udec.poo.datos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import co.edu.udec.poo.repositorios.RepositorioMateria;

/**
 *
 * @author saidm
 */
public class MateriaControlador {
    private RepositorioMateria repositorio;

    public MateriaControlador() {
        this.repositorio = new RepositorioMateria();
    }
    
    // metodo solo para validar si la base de datos esta vacia //
    public boolean baseDeDatosVacia() {
        return repositorio.baseDeDatosVacia();
    }

    // Metodo para guardar alumnos con validaciones y un mensaje final diciendo el total de alumnos //
    public String guardarMateria(String nombreMateria, String horario, String profesor) {
        if (nombreMateria.isBlank() || horario.isBlank() || profesor.isBlank()) {
            return "Por favor ingrese datos válidos.";
        }

        if (repositorio.existeMateria(nombreMateria)) {
            return "Ya existe esta materia.";
        }

        Materia materia = new Materia(nombreMateria, horario, profesor);
        repositorio.guardarMateria(materia);

        return "Materia guardada exitosamente\n"
                + "Ahora hay " + repositorio.totalMaterias() + " materias guardadas.";
    }
    
    // Metodo para buscar materias, con validaciones que si no hay devuelve null y si hay devuelve el objeto //
    public Materia buscarMateria(String nombre) {
        
        if(!repositorio.existeMateria(nombre)){
            return null;
        }
        
        Materia materia = repositorio.buscarMateria(nombre);
        return materia;
    }
    
    // Metodo para actualizar los datos de una materia existente en la base de datos, con validaciones //
    public String actualizarMateria(String nombreMateria, String horario, String profesor) {
        if (nombreMateria.isBlank() || horario.isBlank() || profesor.isBlank()) {
            return "Llene todos los campos para actualizar.";
        }
        if(nombreMateria == null || nombreMateria.isBlank()){
            return "Para actualizar datos, primero debe buscar por el nombre.";
        }

        Materia materiaActualizada = new Materia(nombreMateria, horario, profesor);

        repositorio.guardarMateria(materiaActualizada);

        return "Materia actualizada exitosamente.";
    }
    
    // Metodo para eliminar materias con sus validaciones //
    public String eliminarMateria(String nombreMateria, String horario, String profesor){
        
        Materia existeMateria = repositorio.buscarMateria(nombreMateria);
        
        if(!repositorio.existeMateria(nombreMateria)){
            return "Este materia no existe en la base de datos.";
        }
        if (nombreMateria.isBlank() || horario.isBlank() || profesor.isBlank()) {
            return "Llene todos los campos para eliminar.";
        }
        if(nombreMateria == null || nombreMateria.isBlank()){
            return "Para eliminar, primero debe buscar por el nombre.";
        }
        if (existeMateria.getHorario().equals(horario) && existeMateria.getProfesor().equals(profesor)){
            repositorio.eliminarMateria(nombreMateria);
            return "Materia eliminada con exito!";
        }
        else {
            return "No se pudo eliminar, los datos no coinciden.";
        }
    }
        
    // Metodo con validaciones para listar materias, donde si no hay, devuelve null y si hay, devuelve una lista array con los valores almacenados en la base de datos //
    public List<Materia> listarMaterias() {
        if(repositorio.materiaBD == null || repositorio.materiaBD.isEmpty()){
            return null;
        }
        return new ArrayList<>(repositorio.materiaBD.values());
    }
        public DefaultTableModel crearListaMaterias(){
            List<Materia> listaDeMaterias = listarMaterias();
        
            int totalMaterias = listaDeMaterias.size();
            String columnas[] = {"Nombre", "Horario", "Profesor"};
            String filas[][] = new String[totalMaterias][columnas.length];
                
            for (int i = 0; i < totalMaterias; i++) {
            
                Materia mate = listaDeMaterias.get(i);
                filas[i][0] = mate.getNombre();
                filas[i][1] = mate.getHorario();
                filas[i][2] = mate.getProfesor();
            }
            return new DefaultTableModel(filas, columnas);
        }
}
