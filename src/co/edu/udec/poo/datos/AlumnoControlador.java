package co.edu.udec.poo.datos;

import co.edu.udec.poo.repositorios.RepositorioAlumno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saidm
 */
public class AlumnoControlador {
    private RepositorioAlumno repositorio;

    public AlumnoControlador() {
        this.repositorio = new RepositorioAlumno();
    }
    
    public boolean baseDeDatosVacia() {
        return repositorio.baseDeDatosVacia();
    }

    public String guardarAlumno(String nombreAlumno, String edad, String grado) {
        if (nombreAlumno.isBlank() || edad.isBlank() || grado.isBlank()) {
            return "Por favor ingrese datos válidos.";
        }

        if (repositorio.existeAlumno(nombreAlumno)) {
            return "Ya existe este alumno.";
        }

        Alumno alumno = new Alumno(nombreAlumno, edad, grado);
        repositorio.guardarAlumno(alumno);

        return "Alumno guardado exitosamente\n"
                + "Ahora hay " + repositorio.totalAlumnos() + " alumnos guardados.";
    }
    public Alumno buscarAlumno(String nombre) {
        
        if(!repositorio.existeAlumno(nombre)){
            return null;
            
        }
        if(RepositorioAlumno.alumnoBD.containsKey(nombre)){
            
        }
        Alumno alumno = repositorio.buscarAlumno(nombre);
        return alumno;
    }
    
    public String actualizarAlumno(String nombreAlumno, String edad, String grado) {
        if (nombreAlumno.isBlank() || edad.isBlank() || grado.isBlank()) {
            return "Llene todos los campos para actualizar.";
        }
        if(nombreAlumno == null || nombreAlumno.isBlank()){
            return "Para actualizar datos, primero debe buscar por el nombre.";
        }

        Alumno alumnoActualizado = new Alumno(nombreAlumno, edad, grado);

        repositorio.guardarAlumno(alumnoActualizado);

        return "Alumno actualizado exitosamente.";
    }
    public String eliminarAlumno(String nombreAlumno, String edad, String grado){
        
        Alumno existeAlumno = repositorio.buscarAlumno(nombreAlumno);
        
        if(!repositorio.existeAlumno(nombreAlumno)){
            return "Este alumno no existe en la base de datos.";
        }
        if (nombreAlumno.isBlank() || edad.isBlank() || grado.isBlank()) {
            return "Llene todos los campos para eliminar.";
        }
        if(nombreAlumno == null || nombreAlumno.isBlank()){
            return "Para eliminar, primero debe buscar por el nombre.";
        }
        if (existeAlumno.getEdad().equals(edad) && existeAlumno.getGrado().equals(grado)){
            repositorio.eliminarAlumno(nombreAlumno);
            return "Alumno eliminado con exito!";
        }
        else {
            return "No se pudo eliminar, los datos no coinciden.";
        }
    }
        public List<Alumno> listarAlumnos() {
        if(repositorio.alumnoBD == null || repositorio.alumnoBD.isEmpty()){
            return null;
        }
        return new ArrayList<>(repositorio.alumnoBD.values());
    }
        public DefaultTableModel crearListaAlumnos(){
            List<Alumno> listaDeAlumnos = listarAlumnos();
        
            int totalAlumnos = listaDeAlumnos.size();
            String columnas[] = {"Nombre", "Edad", "Grado"};
            String filas[][] = new String[totalAlumnos][columnas.length];
                
            for (int i = 0; i < totalAlumnos; i++) {
            
                Alumno alu = listaDeAlumnos.get(i);
                filas[i][0] = alu.getNombre();
                filas[i][1] = String.valueOf(alu.getEdad());
                filas[i][2] = alu.getGrado();
            }
            return new DefaultTableModel(filas, columnas);
        }
}
