package poo.absint;

public class Loro extends Ave {
    private boolean volador;

    public Loro(String nombre, boolean volador) {
        super(nombre);
        this.volador = volador;
    }

    @Override
    public void emitirSonido() {
        System.out.println(super.getNombre()+" hace: loradas");
    }

    @Override
    public void volar() {
        System.out.println("LOS LOROS VUELAN DISTANCIAS CORTAS");
    }

    

}
