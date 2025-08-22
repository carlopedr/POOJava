package poo.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("escribe un numero entero...");
        String [] a={"a"};
        try {
            String in=entrada.nextLine();
            numero=Integer.parseInt(in);
            //numero = entrada.nextInt();
            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es " + cuadrado);
            //a[1]=in;
            //int d=numero/0;
            
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Ha ocurrido un error aritmético");
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error, el numero tiene formato erroneo");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Se presentó otro tipo de error!!");
        }finally {
            System.out.println("Salida siempre por aqui");
        }


    }

}
