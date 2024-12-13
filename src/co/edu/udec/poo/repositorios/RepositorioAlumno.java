package co.edu.udec.poo.repositorios;

import co.edu.udec.poo.datos.Alumno;
import java.util.ArrayList;
import java.util.HashMap;

public class RepositorioAlumno {
    public static HashMap<String, Alumno> alumnoBD = new HashMap<>();

    public boolean baseDeDatosVacia() {
        return alumnoBD.isEmpty();
    }

    public boolean existeAlumno(String nombre) {
        return alumnoBD.containsKey(nombre);
    }

    public void guardarAlumno(Alumno alumno) {
        alumnoBD.put(alumno.getNombre(), alumno);
    }

    public int totalAlumnos() {
        return alumnoBD.size();
    }

    public Alumno buscarAlumno(String nombre) {
        return alumnoBD.get(nombre);
    }

    public void eliminarAlumno(String nombre) {
        alumnoBD.remove(nombre);
    }

    public ArrayList<Alumno> listarAlumnos() {
        return new ArrayList<>(alumnoBD.values());
    }
}
