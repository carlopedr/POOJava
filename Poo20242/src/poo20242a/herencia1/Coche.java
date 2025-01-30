package herencia1;

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

    public void cambiarMarca(String marca){
        setMarca(marca);
    }
    
    public void cambiarColor(String color){
        setColor(color+" metalizado");
    }

    @Override
    public String toString() {
        return "Coche [numPlazas=" + numPlazas + ", getMarca()=" + getMarca() + ", getColor()=" + getColor() + "]";
    }

    

    

    



}
