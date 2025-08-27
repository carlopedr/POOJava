//Taller en clase 26-08
package GrupoMartes.Lang;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Notas4 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n=in.nextInt();
         String [] nombreDeCadaAlumno = new String [n];
         double [] notasDeCadaAlumno = new double[n];
         in.nextLine();
         //Para llenar los arreglos
         for(int i=0;i<3;i++){
             System.out.println("Alumno # "+(i+1));
             System.out.print("Nombre: ");
             nombreDeCadaAlumno[i]=in.nextLine();
             System.out.print("Nota: ");
             notasDeCadaAlumno[i]=in.nextDouble();
             in.nextLine();
         }
         System.out.println("Nombre     Nota");
         for(int i=0;i<3;i++){
             System.out.println(nombreDeCadaAlumno[i]+"     "+notasDeCadaAlumno[i]);
                                  
         }
         
    }
    
}
