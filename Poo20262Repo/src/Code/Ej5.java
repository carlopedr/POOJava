/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Code;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean accesoVIP = false;
        System.out.println("Ingrese la cantidad de vuelo hechos: ");
        int cantidadDeVuelos = sc.nextInt();
        System.out.println("Posee una membresia activa?: ");
        String membresía = sc.next();
        String categoría;
        
        if (cantidadDeVuelos > 50 && membresía.equalsIgnoreCase("si")) {
            categoría = "Oro";
        } else if (cantidadDeVuelos >= 20 && cantidadDeVuelos <= 50 && membresía.equalsIgnoreCase("si")) {
            categoría = "Plata";
        } else {
            categoría = "Basica";
        }
        System.out.println("Su categoría es: " + categoría);
        if (categoría.equalsIgnoreCase("Oro") && (cantidadDeVuelos > 70)) { //profe acá no entiendo por qué tenía que poner tantos parentesis
            accesoVIP = true;
            System.out.println("Tiene acceso VIP: " + (accesoVIP ? "si" : "no"));
            System.out.println("Su categoría es: " + categoría);
        }
        else {
            System.out.println("Su categoría es: " + categoría);
        }

    }

}
