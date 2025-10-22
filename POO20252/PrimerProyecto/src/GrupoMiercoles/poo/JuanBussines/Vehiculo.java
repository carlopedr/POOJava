
package GrupoMiercoles.poo.JuanBussines;

public class Vehiculo {
    private double precioCompra;
    private String marca;
    private double precioVenta;

    public Vehiculo(double precioCompra, String marca) {
        this.precioCompra = precioCompra;
        this.marca = marca;
        this.precioVenta = precioVenta();
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "precioCompra=" + precioCompra + ", marca=" + marca + ", precioVenta=" + precioVenta + '}';
    }
    
    public double precioVenta(){
        return this.precioCompra*1.6;
    }
    
    
    
}
