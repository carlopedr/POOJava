package GrupoMartes.Lang;

import java.util.Scanner;

public class Metodo1 {
    public static void main(String[] args) {
        String msg="Donde vives?";
        leerCadena("Como te llamas?");
        leerCadena(msg);
        int suma=sumar(2,3);
        System.out.println("Suma: "+suma);
        
    }
    
    public static void leerCadena(String mensaje){
        Scanner in = new Scanner(System.in);
        System.out.println(mensaje);
        String cadena = in.nextLine();
        System.out.println("Escribió: "+cadena);
        
    }
    
    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
    
    public static int sumar(int a, int b, int c, int d) {
        int resultado = a + b + c + d;
        return resultado;
    }
    
    
    
}
