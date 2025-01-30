package Herencia;

public class Prueba {
    public static void main(String[] args) {
        Coche c = new Coche("KIA","Rojo",5);

        System.out.println(c.toString());

        c.pintar("Azul");

        System.out.println(c.toString());


    }

}
