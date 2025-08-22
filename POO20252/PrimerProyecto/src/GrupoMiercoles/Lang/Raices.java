package GrupoMiercoles.Lang;

import java.util.Scanner;

public class Raices {
    public static void main(String[] args) {
        double a,b,c;
        double x1,x2;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el valor de a: ");
        a=in.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b=in.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        c=in.nextDouble();
        x1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        x2=(-b-Math.pow(((b*b)-(4*a*c)), 0.5))/(2*a);
        System.out.println("x1="+x1);
        System.out.println("x2="+x2);
        
        
        
        
        
        
    }
}
