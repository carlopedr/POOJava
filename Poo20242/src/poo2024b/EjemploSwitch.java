

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú Áreas");
        System.out.println("1. Retángulo");
        System.out.println("2. Triángulo");
        System.out.println("3. Círculo");
        System.out.println("4. Trapecio");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        op=sc.nextInt();
        /*if(op==1){
            System.out.println("Opción área rectángulo");
        }
        else if(op==2){
            System.out.println("Opción área triángulo");
        }*/
        switch(op){
            case 1:
                System.out.println("Opción área rectángulo");
                int lado1,lado2;
                System.out.print("Ingrese en valor de un lado: ");
                lado1=sc.nextInt();
                System.out.print("Ingrese en valor del otro lado: ");
                lado2=sc.nextInt();
                int area=lado1*lado2;
                System.out.println("El área del rectángulo es: "+area);
                break;
            case 2:
                System.out.println("Opción área triángulo");
                
                break;
            case 3:
                System.out.println("Opción área círculo");
                //area=Math.PI
                break;
            case 4:
                System.out.println("Opción área trapecio");
                
                break;
            case 5:
                System.out.println("Salida...");
                break;
            default:
                System.out.println("Opción equivocada!");
        }
        sc.close();
        
    }
    
}
