package poo.absint;

public class Test {
    public static void main(String[] args) {
        Animal miPerro = new Perro("Bobby");
        miPerro.emitirSonido();
        miPerro.dormir();

        Pajaro miPajaro = new Pajaro("Tweety");
        miPajaro.emitirSonido();
        miPajaro.volar();
        miPajaro.dormir();
    }

}
