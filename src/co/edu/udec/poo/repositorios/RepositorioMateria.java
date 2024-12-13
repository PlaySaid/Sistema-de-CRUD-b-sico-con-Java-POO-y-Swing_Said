package co.edu.udec.poo.repositorios;

import java.util.ArrayList;
import java.util.HashMap;
import co.edu.udec.poo.datos.Materia;

public class RepositorioMateria {
    public static HashMap<String, Materia> materiaBD = new HashMap<>();

    public boolean baseDeDatosVacia() {
        return materiaBD.isEmpty();
    }

    public boolean existeMateria(String nombre) {
        return materiaBD.containsKey(nombre);
    }

    public void guardarMateria(Materia materia) {
        materiaBD.put(materia.getNombre(), materia);
    }

    public int totalMaterias() {
        return materiaBD.size();
    }

    public Materia buscarMateria(String nombre) {
        return materiaBD.get(nombre);
    }

    public void eliminarMateria(String nombre) {
        materiaBD.remove(nombre);
    }

    public ArrayList<Materia> listarMaterias() {
        return new ArrayList<>(materiaBD.values());
    }
}
