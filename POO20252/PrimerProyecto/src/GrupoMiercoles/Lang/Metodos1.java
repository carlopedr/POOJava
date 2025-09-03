package GrupoMiercoles.Lang;

import java.util.Scanner;

public class Metodos1 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int a = 0, b = 0, c = 0, suma = 0;
        do {
            System.out.print("Dime un numero: ");
            a = entrada.nextInt();
            if (a < 0) {
                System.out.println("no puede ser negativo");
            }
        } while (a < 0);
        suma = suma + a;
        do {
            System.out.println("Dime un número");
            b = entrada.nextInt();
            if (b < 0) {
                System.out.println("no puede ser negativo");
            }
        } while (b < 0);
        suma = suma + b;
        do {
            System.out.println("Dime un número");
            c = entrada.nextInt();
            if (c < 0) {
                System.out.println("no puede ser negativo");
            }
        } while (c < 0);
        suma = suma + c;
        System.out.println("la suma de los tres es " + suma);

    }
}
