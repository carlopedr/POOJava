/*Notas cualitativas:
Se pide una calificación entre 0 y 5 y el programa debe devolver:
Mensaje de error: si la nota no esta en el rango requerido
Insuficiente: si la nota es mayor que cero y menor que 3
Suficiente: la nota esta entre 3 y 4
Superior: si nota es mayor que 4
 */


import java.util.Scanner;

public class EjemploIf2 {
    public static void main(String[] args) {
        float nota;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su calificación: ");
        nota = sc.nextFloat();
        if (nota < 0) {
            System.out.println("Error no procesa notas negativas");
        } //else if((nota>0)&&(nota<3)){
        else if (nota < 3) {
            System.out.println("Nota insuficiente");
        } else if (nota <= 4) {
            System.out.println("Nota suficiente");
        } else if (nota <= 5) {
            System.out.println("Nota Superior");
        } //else if (nota>5)
        else {
            System.out.println("Error nota mayor a 5");
        }
        sc.close();

    }

}
