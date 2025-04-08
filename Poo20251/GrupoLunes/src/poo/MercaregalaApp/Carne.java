package poo.MercaregalaApp;

public class Carne extends Producto {
    private String origen;

    public Carne(String nombre, double peso, double precioKilo, String origen) {
        super(nombre, peso, precioKilo);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Carne [origen=" + origen + ", toString()=" + super.toString() + "]";
    }

    

    

}
