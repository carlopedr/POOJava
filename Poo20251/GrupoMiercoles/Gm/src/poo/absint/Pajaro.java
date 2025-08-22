package poo.absint;

public class Pajaro extends Ave implements Volador {

    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " canta: ¡Pío pío!");
    }

    @Override
    public void volar() {
        System.out.println(getNombre() + " está volando.");
    }
}

