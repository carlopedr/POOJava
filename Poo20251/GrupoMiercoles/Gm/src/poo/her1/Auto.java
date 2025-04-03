package poo.her1;

public class Auto extends Vehiculo {
    private int numPlazas;
    private int numPuertas;
    
    public Auto(String marca, String color, int numPlazas, int numPuertas) {
        super(marca, color);
        this.numPlazas = numPlazas;
        this.numPuertas = numPuertas;
        matricula="ABC123";
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Auto [numPlazas=" + numPlazas + ", numPuertas=" + numPuertas + ", toString()=" + super.toString() + "]";
    }

    @Override
    public void pintar(String colorNuevo){
        String colorOriginal=super.getColor();
        super.setColor(colorOriginal+"-"+colorNuevo);
    }

    

    



}
