package Code;

import java.util.Scanner;

public class EjSwitch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entre 1 y 3: ");
        int num=sc.nextInt();
        
        switch(num){
            case 1: System.out.println("Ha ingresado el número UNO");
            break;
            case 2: System.out.println("Ha ingresado el número DOS");
            break;
            case 3: System.out.println("Ha ingresado el número TRES");
            break;
            default: System.out.println("Ha ingresado un numero que no es 1, 2 o 3");
            
        }
        
    }
}
