import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("escribe un numero entero...");
        try {
            String in=entrada.nextLine();
            numero=Integer.parseInt(in);
            //numero = entrada.nextInt();
            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es" + cuadrado);
        } catch (InputMismatchException ex) {
            System.out.println("Error, no se introdujo un numero");
        } catch (NumberFormatException ex) {
            System.out.println("Error, el numero tiene formato erroneo");
        } finally {
            System.out.println("Salida siempre por aqui");
        }
    }

}
