package poo.absint;

public class Gato extends Animal {
    private String raza;

    public Gato(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println(super.getNombre() + "hace: miau.. miau");
    }

    

}
