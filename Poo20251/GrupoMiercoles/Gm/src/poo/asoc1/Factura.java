package poo.asoc1;

public class Factura {
    private String numeroFactura;
    private Cliente cliente;
    private DetalleFactura[] detalles;
    private int contadorDetalles;

    public Factura(String numeroFactura, Cliente cliente, int maxDetalles) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.detalles = new DetalleFactura[maxDetalles];
        this.contadorDetalles = 0;
    }

    public Factura(){

    }

    public Factura(int maxDetalles, String numeroFactura, Cliente cliente) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.detalles = new DetalleFactura[maxDetalles];
        this.contadorDetalles = 0;
    }

    public void agregarDetalle(DetalleFactura detalle) {
        if (contadorDetalles < detalles.length) {
            detalles[contadorDetalles] = detalle;
            contadorDetalles++;
        } else {
            System.out.println("No se pueden agregar más detalles, la factura está llena.");
        }
    }

    public void mostrarFactura() {
        System.out.println("Factura No: " + numeroFactura);
        System.out.println("Cliente: " + cliente);
        System.out.println("Detalles de la factura:");
        double total = 0;
        for (int i = 0; i < contadorDetalles; i++) {
            detalles[i].mostrarDetalle();
            total += detalles[i].calcularSubtotal();
        }
        System.out.println("Total a pagar: " + total);
    }

}

