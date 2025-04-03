package poo.her1;

public class Electrico extends Auto {
    private double capacidadBaterias;

    public Electrico(String marca, String color, int numPlazas, int numPuertas, double capacidadBaterias) {
        super(marca, color, numPlazas, numPuertas);
        this.capacidadBaterias = capacidadBaterias;
    }

    

}
