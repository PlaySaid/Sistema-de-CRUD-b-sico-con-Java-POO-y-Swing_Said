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
    
    public boolean baseDeDatosVacia() {
        return repositorio.baseDeDatosVacia();
    }

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
    public Materia buscarMateria(String nombre) {
        
        if(!repositorio.existeMateria(nombre)){
            return null;
            
        }
        if(RepositorioMateria.materiaBD.containsKey(nombre)){
            
        }
        Materia materia = repositorio.buscarMateria(nombre);
        return materia;
    }
    
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
