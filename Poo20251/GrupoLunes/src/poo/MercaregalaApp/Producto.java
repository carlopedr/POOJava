package poo.MercaregalaApp;

public class Producto implements IAlmacen{
    private String nombre;
    private double peso;
    private double precioKilo;
    public Producto(String nombre, double peso, double precioKilo) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
    }
    public Producto() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrecioKilo() {
        return precioKilo;
    }
    public void setPrecioKilo(double precioKilo) {
        this.precioKilo = precioKilo;
    }
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", peso=" + peso + ", precioKilo=" + precioKilo + "]";
    }
    @Override
    public double calcularPrecio() {
        return peso*precioKilo;
       

    }

    

}
