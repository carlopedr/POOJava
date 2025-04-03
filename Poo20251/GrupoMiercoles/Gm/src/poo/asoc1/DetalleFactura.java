package poo.asoc1;

public class DetalleFactura {
    private Producto producto;
    private int cantidad;

    public DetalleFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    public void mostrarDetalle() {
        System.out.println("Producto: " + producto.getPrecio()     + 
                           " | Cantidad: " + cantidad + 
                           " | Precio unitario: " + producto.getPrecio() + 
                           " | Subtotal: " + calcularSubtotal());
    }


}
