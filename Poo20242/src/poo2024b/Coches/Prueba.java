package Coches;

public class Prueba {
    public static void main(String[] args) {
        //Clase variable = new constructor;
        Coche miCoche = new Coche();
        miCoche.marca="MB";
        miCoche.color="Black";
        miCoche.cilindrada=2500;
        miCoche.matricula="XYZ890";

        System.out.println("Marca: "+miCoche.marca);
        miCoche.color="Negro";
        miCoche.decirSiEsMetalizado();
        System.out.println("Cilindrada: "+miCoche.decirCilindrada());
        System.out.println("Color Inicial: "+miCoche.color);
        miCoche.cambiarColor("Red");
        System.out.println("Color Actualizado: "+miCoche.color);

        //Coche c2=new Coche("MB","Plata","ASD456",2000);
        

    }

}
