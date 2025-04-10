package poo.alfombra;

public abstract class Alfombra {
    private String color;
    private int precioMetro;
    public Alfombra(String color, int precioMetro) {
        this.color = color;
        this.precioMetro = precioMetro;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPrecioMetro() {
        return precioMetro;
    }
    public void setPrecioMetro(int precioMetro) {
        this.precioMetro = precioMetro;
    }
    @Override
    public String toString() {
        return "Alfombra [color=" + color + ", precioMetro=" + precioMetro + "]";
    }

    public abstract double calcularSuperficie();
    public abstract double calcularPrecio();
}