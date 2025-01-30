


import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Objeto clase Scnner
        String nombre;// Tipo identificador
        System.out.print("Dime tu nombre :");
        nombre=input.nextLine();
        System.out.println("Hola "+nombre);
        System.out.print("Dime tu edad: ");
        int edad=input.nextInt();
        System.out.println("Tienes "+edad+" años!!");
        //float peso=0, talla=0;
        System.out.print("Ingrese su peso: ");
        float peso=input.nextFloat();
        System.out.print("Tu peso es :" + peso);
        input.close();
        
    }
}
