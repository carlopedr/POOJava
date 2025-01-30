package poo.Ejemplo1;

//import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);

        Coche coche1=new Coche();
        coche1.marca="BMW";
        coche1.color="Black";
        coche1.matricula="XWE345";
        coche1.cilindrada=2000;

        System.out.println("Marca: "+coche1.decirMarca());
        coche1.color="Negro";
        coche1.decirSiEsMetalizado();
        System.out.println("Matricula actual: "+coche1.matricula);
        coche1.matricularCoche("ABC123");
        System.out.println("Matricula actualizada: "+coche1.matricula);

        Coche c2 = new Coche("AUDI","Blanco","DFG567",1800);
        System.out.println("Marca: "+c2.marca);
        c2.matricularCoche("SDF567");


        
    }

}
