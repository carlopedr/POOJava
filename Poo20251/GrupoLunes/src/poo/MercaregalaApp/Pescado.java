package poo.MercaregalaApp;

public class Pescado extends Producto {
    private String tipo;

    public Pescado(String nombre, double peso, double precioKilo, String tipo) {
        super(nombre, peso, precioKilo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pescado [tipo=" + tipo + ", toString()=" + super.toString() + "]";
    }

    


}
