package co.edu.udec.poo.repositorios;

import co.edu.udec.poo.gui.VentanaPrincipalEscuela;
import co.edu.udec.poo.datos.Escuela;
import java.util.HashMap;

public class RepositorioEscuela {
    
    public static HashMap<String, Escuela> escuelaBD = new HashMap<>();

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
}
