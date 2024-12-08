package co.edu.udec.poo.datos;

public class Alumno {
    private String nombre;
    private int edad;
    private String grado;

    public Alumno(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Alumno" + "\nNombre: " + this.getNombre() + "\nEdad: " + this.getEdad() + "\nGrado: " + this.getGrado();
    }
}
