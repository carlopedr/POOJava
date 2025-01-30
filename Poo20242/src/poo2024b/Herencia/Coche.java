package Herencia;

public class Coche extends Vehiculo {
    private int numPlazas;

    public Coche(String marca, String color, int numPlazas) {
        super(marca, color);
        this.numPlazas = numPlazas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    @Override
    public String toString() {
        return "Coche [numPlazas=" + numPlazas + ", getMarca()=" + getMarca() + ", getColor()=" + getColor() + "]";
    }

    public void pintar(String colorNuevo){
        super.setColor(colorNuevo+" Metalizado");
    }

    



}
