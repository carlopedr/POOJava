//Operador ternario
package Code;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Cond2 {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        String mensaje;
        System.out.print("Dime tu edad: ");
        edad=sc.nextInt();
        if(edad>=18){
            mensaje="Eres mayor de edad...";
            //System.out.println("Eres mayor de edad...");
        } else {
            mensaje ="Eres menor de edad...";
            //System.out.println("Eres menor de edad...");
        }
        System.out.println(mensaje);
        
        mensaje=(edad>=18)?"Eres mayor de edad..":"Eres menor de edad..";
        System.out.println(mensaje);
        
    }
    
}
