package poo.her1;

public class Auto extends Vehiculo {
    private int numPasajeros;

    public Auto(String marca, String color, int numPasajeros) {
        super(marca, color);
        this.numPasajeros = numPasajeros;
    }

    public Auto() {
    }

    public Auto(int numPasajeros) {
        this.numPasajeros=numPasajeros;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public String toString() {
        return "Auto [numPasajeros=" + numPasajeros + ", toString()=" + super.toString() + "]";
    }
    @Override
    public void pintar (String color){
        String colorOriginal=super.getColor();
        super.setColor(colorOriginal+"-"+color);
    }
    

   

    

}
