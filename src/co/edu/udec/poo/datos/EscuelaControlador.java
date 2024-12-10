package co.edu.udec.poo.datos;

import co.edu.udec.poo.datos.Escuela;
import co.edu.udec.poo.repositorios.RepositorioEscuela;

public class EscuelaControlador {
    private RepositorioEscuela repositorio;

    public EscuelaControlador() {
        this.repositorio = new RepositorioEscuela();
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
        Escuela escuela = repositorio.buscarEscuela(nombre);
    
        return escuela;
    }
}