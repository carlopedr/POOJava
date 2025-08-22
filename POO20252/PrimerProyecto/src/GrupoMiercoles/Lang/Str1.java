
package GrupoMiercoles.Lang;

import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
        //String resultadoRec = in.nextLine();
        //if (resultadoRec.equals("apto")) {
        //    System.out.println("Escribió apto");
        //}
        System.out.print("Edad ? ");
        int edad =in.nextInt();
        String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(mensaje);
        
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
        
    }
    
}
