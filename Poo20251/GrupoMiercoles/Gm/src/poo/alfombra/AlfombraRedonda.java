package poo.alfombra;

public class AlfombraRedonda extends Alfombra implements IAlfombra {
    private int radio;

    public AlfombraRedonda(String color, int precioMetro, int radio) {
        super(color, precioMetro);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "AlfombraRedonda [radio=" + radio + ", toString()=" + super.toString() + "]";
    }

    @Override
    public double calcularSuperficie() {
        return (Math.PI*Math.pow(radio,2));
        
    }
    //calcula el precio de la alfombra (que será la superficie*precioMetro)
    @Override
    public double calcularPrecio() {
        return (calcularSuperficie()*super.getPrecioMetro());
        
    }

    @Override
    public double actualizarPrecio() {
       return (this.getPrecioMetro()+2);
    }

    @Override
    public double ponerEnRebajas() {
        return (this.getPrecioMetro()/2);
        
    }

    

}
