package poo.alfombra;

public class Main {
    public static void main(String[] args) {
        AlfombraRedonda ar = new AlfombraRedonda("Blanco", 1000, 2);
        System.out.println(ar.toString());
        System.out.println("Superficie: "+ar.calcularSuperficie());
        System.out.println("Precio: "+ar.calcularPrecio());
        System.out.println("Act. Precio: "+ar.actualizarPrecio());
        System.out.println("Rebajas: "+ar.ponerEnRebajas());
    }

}
