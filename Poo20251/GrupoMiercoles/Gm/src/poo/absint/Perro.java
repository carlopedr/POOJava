package poo.absint;

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    void emitirSonido() {
        System.out.println(nombre + " ladra: ¡Guau guau!");
    }
}
