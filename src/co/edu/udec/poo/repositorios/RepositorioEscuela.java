package co.edu.udec.poo.repositorios;

import co.edu.udec.poo.datos.Escuela;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepositorioEscuela {
    
    public static HashMap<String, Escuela> escuelaBD = new HashMap<>();
    
    public boolean baseDeDatosVacia(){
        return escuelaBD.isEmpty();
    }

    public boolean existeEscuela(String nombre) {
        return escuelaBD.containsKey(nombre);
    }

    public void guardarEscuela(Escuela escuela) {
        escuelaBD.put(escuela.getNombre(), escuela);
    }
    

    public int totalEscuelas() {
        return escuelaBD.size();
    }

    public Escuela buscarEscuela(String nombre) {
        if(existeEscuela(nombre)){
            return escuelaBD.get(nombre); 
        }
        else{
            return null;

        }
    }
    public void eliminarEscuela(String nombreEscuela) {
        escuelaBD.remove(nombreEscuela);
    }
    public List<Escuela> listarEscuelas() {
        return new ArrayList<>(escuelaBD.values());
    }
}
