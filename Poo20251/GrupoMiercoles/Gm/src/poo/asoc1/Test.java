package poo.asoc1;

public class Test {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("Laptop", 2500.00);
        Producto producto2 = new Producto("Mouse", 25.50);
        Producto producto3 = new Producto("Teclado", 75.00);

        // Crear detalles de la factura
        DetalleFactura detalle1 = new DetalleFactura(producto1, 1);
        DetalleFactura detalle2 = new DetalleFactura(producto2, 2);
        DetalleFactura detalle3 = new DetalleFactura(producto3, 1);

        // Crear factura con espacio para 5 detalles
        Factura factura = new Factura("F-003", "Carlos", 5);

        // Agregar detalles a la factura
        factura.agregarDetalle(detalle1);
        factura.agregarDetalle(detalle2);
        factura.agregarDetalle(detalle3);

        // Mostrar la factura completa
        factura.mostrarFactura();
    }


}
