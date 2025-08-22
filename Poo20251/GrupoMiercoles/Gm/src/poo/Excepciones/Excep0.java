package poo.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep0 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("escribe un numero entero...");
        String in=entrada.nextLine();
        numero=Integer.parseInt(in);
        //numero = entrada.nextInt();
        int cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es " + cuadrado);
    }

}
