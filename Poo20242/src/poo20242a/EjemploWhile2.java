

import java.util.Scanner;

public class EjemploWhile2 {
    public static void main(String[] args) {
        int opcion=0;
        Scanner in = new Scanner(System.in);
        while (opcion!=5) {
            System.out.println("Menú Areas");
            System.out.println("1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Trapecio");
            System.out.println("5. Salir");
            System.out.print("Escriba la opción deseada: ");
            opcion = in.nextInt();
        }
        in.close();    
    }
}
