package Code;

import java.util.Scanner;


/**
 *
 * @author carlo
 */
public class Cond1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor para a: ");
        a=sc.nextInt();
        System.out.print("Valor para b: ");
        b=sc.nextInt();
        if(a>b){
            System.out.println("a es mayor que b");
        }
        else if(a==b) {
            System.out.println("a es igual a b");
        }
        else {
            System.out.println("a es menor que b");
        }
        System.out.println("Salida");
    }
    
}
