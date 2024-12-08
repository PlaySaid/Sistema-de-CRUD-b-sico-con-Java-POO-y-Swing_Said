package co.edu.udec.poo.datos;

public class Materia {
    private String nombre;
    private String horario;
    private String profesor;

    public Materia(String nombre, String horario, String profesor) {
        this.nombre = nombre;
        this.horario = horario;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Materia" + "\nNombre: " + this.getNombre() +
               "\nHorario: " + this.getHorario() +
               "\nProfesor: " + this.getProfesor();
    }
}
