/*
Clase Mascota
Atributos:
•	nombre (String)
•	especie (String)
•	edad (int)
•	propietario (String)
•	historialMedico (List)
Constructor requerido:
Inicializa todos los atributos excepto el historial, que debe comenzar como una lista vacía.
*/
package animalLife;

import java.util.ArrayList;

public class Animal {
    private String nombre;
    private String especie;
    private int edad;
    private String propietario;
    private ArrayList<String> historialMedico;

    public Animal(String nombre, String especie, int edad, String propietario) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.propietario = propietario;
        this.historialMedico=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public ArrayList<String> getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(ArrayList<String> historialMedico) {
        this.historialMedico = historialMedico;
    }
    

    
    
    
}
