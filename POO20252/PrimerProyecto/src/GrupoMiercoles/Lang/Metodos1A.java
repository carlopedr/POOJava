
package GrupoMiercoles.Lang;

import java.util.Scanner;


public class Metodos1A {

    public static void main(String[] args) {
        int a;
        a=pedir();
        int b=pedir();
        int sumaayb=sumar(a,b);
        System.out.println("La suma de los dos primeros es: "+sumaayb);
        int c=pedir();
        int suma=a+b+c;
        System.out.println("La suma de los números es: "+suma);
    }
public static int sumar(int x,int y){
        int suma=x+y;
        return suma;
    }
    public static int pedir() {
        Scanner entrada = new Scanner(System.in);
        int x = 0;
        do {
            System.out.print("Dime un número: ");
            x = entrada.nextInt();
            if (x < 0) {
                System.out.println("No puede ser negativo");
            }
        } while (x < 0);
        return x;
    }
    
    

}
