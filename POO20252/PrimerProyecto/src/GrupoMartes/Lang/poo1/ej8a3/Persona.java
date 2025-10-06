/* Define una clase Persona con los siguientes datos
• Atributos privados :
- Nombre : String
- NIF : String
• Y los siguientes métodos:
- Constructor parametrizado
- Métodos de acceso para los atributos*/
package GrupoMartes.Lang.poo1.ej8a3;

public class Persona {
    private String nombre;
    private String nif;

    public Persona(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nif=" + nif + '}';
    }

    
    
    
    
}
