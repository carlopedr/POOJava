package poo.absint;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void emitirSonido(); // Método abstracto

    public void dormir() { // Método concreto
        System.out.println(nombre + " está durmiendo.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + "]";
    }

    
}

