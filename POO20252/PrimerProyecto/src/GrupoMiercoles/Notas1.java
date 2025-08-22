/*
Realiza un programa que calcula la nota de un trimestre de la 
asignatura Programación. El programa pedirá las dos notas que ha sacado 
el alumno en los dos primeros exámenes. Si la media de los dos 
exámenes da un número mayor o igual a 3, el alumno está aprobado y se 
mostrará la media. En caso de que la media sea un número menor que 3, 
el alumno habrá tenido que hacer el examen de recuperación que se 
califica como 'apto' o 'no apto', por tanto se debe preguntar al usuario
¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el 
resultado de la recuperación es apto, la nota será un 3; en caso contrario, 
se mantiene la nota media anterior.
*/
package GrupoMiercoles;

import java.util.Scanner;

public class Notas1 {
    public static void main(String[] args) {
        double nota1, nota2;
        double notaTrimestre;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese Nota 1: ");
        nota1 = in.nextDouble();
        System.out.print("Ingrese Nota 2: ");
        nota2 = in.nextDouble();
        notaTrimestre = ((nota1 + nota2) / 2);
        in.nextLine();
        if (notaTrimestre >= 3) {
            System.out.println("Aprobado");
            System.out.println("Nota Trimestre: " + notaTrimestre);
        }
        else{
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String resultadoRec = in.nextLine();
            if(resultadoRec.equals("apto")){
                System.out.println("Aprobado");
                System.out.println("Nota Trimestre: 3");
            }
            else if(resultadoRec.equals("no apto")){
                System.out.println("Reprobado");
                System.out.println("Nota Trimestre: "+notaTrimestre);
            }
            else{
                System.out.println("Escribió mal!!!");
            }
        }
    }
}
