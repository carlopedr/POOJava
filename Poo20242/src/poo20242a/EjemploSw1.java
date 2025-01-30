


import java.util.Scanner;

public class EjemploSw1 {
    public static void main(String[] args) {
        int opcion;
        Scanner in = new Scanner(System.in);
        System.out.println("Menú Areas");
        System.out.println("1. Rectángulo");
        System.out.println("2. Triángulo");
        System.out.println("3. Círculo");
        System.out.println("4. Trapecio");
        System.out.println("5. Salir");
        System.out.print("Escriba la opción deseada: ");
        opcion=in.nextInt();
        /*if(opcion==1){
            //Area rectángulo
        }
        else if (opcion==2){
            //Area triángulo
        }*/
        switch(opcion){
            case 1:
                int base,alt;
                System.out.println("Cálculo del área del rectángulo:");
                System.out.print("Ingrese en valor de la base :");
                base=in.nextInt();
                System.out.print("Ingrese en valor de la altura :");
                alt=in.nextInt();
                int area=base*alt;
                System.out.println("El area del rectángulo es: "+area);
                break;
            case 2: 
                System.out.println("Cálculo del área del triángulo:");
                break;
            case 3:
                System.out.println("Cálculo del área del círculo:");
                break;
            case 4: 
                System.out.println("Cálculo del área del trapecio:");
                break;
            case 5:
                System.out.println("Salida");
                break;
            default:
                System.out.println("Opción equivocada");
        }
        System.out.println("Finaliza el switch...");    
        in.close();
    }
    
}
