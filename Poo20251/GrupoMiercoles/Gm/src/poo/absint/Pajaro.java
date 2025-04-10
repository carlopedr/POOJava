package poo.absint;

public class Pajaro extends Ave implements Volador {

    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    void emitirSonido() {
        System.out.println(nombre + " canta: ¡Pío pío!");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }
}

