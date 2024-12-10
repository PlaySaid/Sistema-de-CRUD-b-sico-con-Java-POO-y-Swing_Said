package co.edu.udec.poo.datos;

import java.util.HashMap;

public class Escuela {
    private String nombre;
    private String direccion;
    private String numEstudiantes;
    
    public Escuela(){
        
    }

    public Escuela(String nombre, String direccion, String numEstudiantes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numEstudiantes = numEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(String numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    @Override
    public String toString(){
        return "Escuela"+"\nNombre: "+this.getNombre()+"\nDirección: "+this.getDireccion()+"\nNumero de estudiantes: "+this.getNumEstudiantes();
    }
}
