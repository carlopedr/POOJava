package poo.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Excep2 {
    public static void main(String[] args) {
        try {
            cuadrado();
        } catch (InputMismatchException ex) {
            System.out.println("Error, no se introdujo un numero");
        } catch (NumberFormatException ex) {
            System.out.println("Error, el numero tiene formato erroneo");
        } catch (Exception ex) {
            System.out.println("Error general, no especifico");
        }
    }

    public static void cuadrado() throws NumberFormatException {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("escribe un numero entero...");
        String n = entrada.nextLine();
        numero = Integer.parseInt(n);
        int cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es" + cuadrado);
    }

}
