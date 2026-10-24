/*
Pedir por teclado 10 números y 
escribir en consola el doble de cada uno de ellos*/
package Code;
import java.util.Scanner;

public class EjCiclos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int num;
        for(int i=1;i<=10;i++){
            System.out.print("Ingrese un numero: ");
            num=sc.nextInt();
            System.out.println("El doble de numero ingresado es: "+(num*2));
        }
        
    }

}
