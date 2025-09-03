/*
Crear un proyecto que tenga un menú con el siguiente contenido:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Resto de la división
6. Terminar
Introduzca su opción:
Se pide por teclado la opción deseada, y genera un método con el código de la acción de cada opción.
Los métodos operan con dos números solicitados al usuario y devuelven el resultado de la opción
requerida.
Cuando la opción sea 6, termina el proceso, si no, tras cada acción se vuelve a mostrar el menú pidiendo
otra acción.
Si la opción es incorrecta, muestras el mensaje, opción incorrecta y se pide otro número
*/
package GrupoMartes.Lang;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        //Programar y controlar el menu
        Scanner in = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Sumar");
        System.out.print("Ingrese la opción: ");
        int opcion =in.nextInt();
        switch(opcion){
            case 1: 
                int a=leerNumero("Ingrese el primer número: ");
                int b=leerNumero("Ingrese el otro número: ");
                int resultado=sumar(a,b);
                System.out.println("suma= "+resultado);
        }
    }
    public static int leerNumero(String mensaje){
        Scanner in = new Scanner(System.in);
        System.out.print(mensaje);
        int resultado=in.nextInt();
        return resultado;
    }
    public static int sumar(int a, int b){
        int resultado=a+b;
        return resultado;
    }
}
