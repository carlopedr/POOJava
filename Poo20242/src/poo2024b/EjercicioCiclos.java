/*Realizar un programa que pida al usuario un número, que debe 
estar entre 0 y 10. Si el usuario indica un número erróneo, 
vuelve a pedir el número. Cuando se indica un número válido, 
se muestra la tabla de multiplicar de dicho número.
  */


import java.util.Scanner;

public class EjercicioCiclos {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean correcto = true;
        while (correcto == true) {
            System.out.print("Ingrese un número entre 1 y 10: ");
            int num = sc.nextInt();
            if ((num > 0) && (num <= 10)) {
                correcto=false;
                System.out.println("Tabla del " + num);
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + "*" + i + "=" + (num * i));
                }
            } else {
                System.out.println("Número no valido. Intente nuevamente!");
            }
        }
        sc.close();
        
    }
    
}
