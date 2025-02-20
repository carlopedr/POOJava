/*
 * Una heladería desea obtener un reporte semanal de ventas. 
 * Para ello debe capturar en un sistema todas las facturas de ventas realizadas. 
 * Cada factura contiene la cantidad y el sabor de las paletas vendidas. 
 * Los sabores y los precios son: limón ($2500), nuez ($2800), lulo ($2600),
fresa ($2000) y crema ($3000). 
El sistema debe imprimir la cantidad de paletas vendidas de cada
sabor, el valor vendido y la venta total. 
Considere que una factura puede tener varias paletas de diferentes sabores.
 */

import java.util.Scanner;

public class ReporteHeladeria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean indSabor = true, indFac = true;
        int acumLimon = 0, acumNuez = 0;
        int numFac =1;

        while (indFac) {
            System.out.println("No. Fac: "+numFac);
            indSabor=true;
            while (indSabor) {
                System.out.println("Menú Sabores");
                System.out.println("1 - Limón");
                System.out.println("2 - Nuez");
                System.out.print("Seleccione un sabor: ");
                int sabor = sc.nextInt();
                sc.nextLine();
                switch (sabor) {
                    case 1:
                        System.out.print("Cantidad de paletas de limón: ");
                        int cantL = sc.nextInt();
                        sc.nextLine();
                        // Validar la cantidad ingresada
                        acumLimon += cantL;
                        break;
                    case 2:
                        System.out.print("Cantidad de paletas de nuez: ");
                        int cantN = sc.nextInt();
                        sc.nextLine();
                        // Validar la cantidad ingresada
                        acumNuez += cantN;
                        break;
                    // Incluir para los otros sabores

                    default:
                        System.out.println("Error en el sabor ingresado");
                }
                System.out.print("Desea incluir otro sabor: (S/N)");
                String rta = sc.nextLine();
                //sc.nextLine();
                // if(rta=="S")
                if (rta.toUpperCase().equals("S"))
                    indSabor = true;
                else
                    indSabor = false;

            }

            System.out.print("Desea incluir otra factura: (S/N)");
            String rta = sc.nextLine();
            // if(rta=="S")
            if (rta.toUpperCase().equals("S")){
                indFac = true;
                numFac++;
            }
                
            else
                indFac = false;
        }
        System.out.println("Sabor       CantVenta       TotVenta");
        System.out.println("Limon       "+acumLimon+"       "+(acumLimon*2500));
        System.out.println("Nuez        "+acumNuez+"       "+(acumNuez*2800));
        

    }

}
