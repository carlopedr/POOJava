//Menú areas

import java.util.Scanner;

public class Sw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Menú Areas");
        System.out.println("1 - Círculo");
        System.out.println("2 - Triángulo");
        System.out.println("9 - Salir");
        System.out.print("Ingrese la opción: ");
        opcion=sc.nextInt();
        switch (opcion){
            case 1: 
                System.out.print("Valor del radio: ");
                int radio=sc.nextInt();
                double area=Math.PI*Math.pow(radio, 2);
                System.out.println("Area= "+area);
                break;
            case 2:
                System.out.println("Area Triángulo...");
                break;
            case 9: 
                System.out.println("Gracias por usar este programa!!");
                break;
            default:
                System.out.println("Opción equivocada!");
        }
        
    }

}
