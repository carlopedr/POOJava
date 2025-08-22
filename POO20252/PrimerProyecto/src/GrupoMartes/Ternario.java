
package GrupoMartes;

import java.util.Scanner;

public class Ternario {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = in.nextInt();
        String msg;
        if (edad >= 18) {
            msg="Eres mayor de edad.";
        } else {
            msg="Eres menor de edad.";
        }
        //String msg = (edad>=18)? "Eres mayor de edad":"Eres menor de edad";
        System.out.println(msg);
        
    }
}
