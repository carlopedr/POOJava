import java.util.Scanner;

public class ReporteHeladeria2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int limon = 2500, nuez = 2800, lulo = 2600, fresa = 2000, crema = 3000;
        int indicador = 0, facturas = 0;
        int cantidad_Limon = 0, cantidad_nuez = 0, cantidad_Lulo = 0, cantidad_Fresa = 0, cantidad_Crema = 0;
        String sabor []={"Limón","Nuez","Lulo","Fresa","Crema"};
        int cantidadHelados []=new int[5];
        int cantidad_Total_limon = 0, cantidad_Total_nuez = 0, cantidad_Total_lulo = 0, cantidad_Total_fresa = 0,
                cantidad_Total_crema = 0;
        int cantidadTotal []=new int[5];

        do {
            facturas++;
            System.out.println("__No " + facturas + " factura__");
            mostrarMenu();
            System.out.print("Seleccione un sabor: ");
            int Seleccion = entrada.nextInt();
            entrada.nextLine();

            switch (Seleccion) {
                case 1:
                    int cantidad=leercantidad(sabor[0]);
                    //entrada.nextLine();
                    cantidad_Limon = cantidad * limon;
                    cantidad_Total_limon = cantidad_Limon + cantidad_Total_limon;
                    break;
                case 2:
                    System.out.print("cuanta cantidad va a escoger: ");
                    cantidad = entrada.nextInt();
                    entrada.nextLine();
                    cantidad_nuez = cantidad * nuez;
                    cantidad_Total_nuez = cantidad_nuez + cantidad_Total_nuez;
                    break;
                case 3:
                    System.out.print("cuanta cantidad va a escoger: ");
                    cantidad = entrada.nextInt();
                    entrada.nextLine();
                    cantidad_Lulo = cantidad * lulo;
                    cantidad_Total_lulo = cantidad_Lulo + cantidad_Total_lulo;
                    break;
                case 4:
                    System.out.print("cuanta cantidad va a escoger: ");
                    cantidad = entrada.nextInt();
                    entrada.nextLine();
                    cantidad_Fresa = cantidad * fresa;
                    cantidad_Total_fresa = cantidad_Fresa + cantidad_Total_fresa;
                    break;
                case 5:
                    System.out.print("cuanta cantidad va a escoger: ");
                    cantidad = entrada.nextInt();
                    entrada.nextLine();
                    cantidad_Crema = cantidad * crema;
                    cantidad_Total_crema = cantidad_Crema + cantidad_Total_crema;
                    break;
                default:
                    System.out.println("Error 404 Seleccion incorrecta");
                    break;
            }

            System.out.print("deseas hacer otra factura? (1 si, 2 no)");
            indicador = entrada.nextInt();
        } while (indicador == 1);
        System.out.println("_________Resultados_________");
        System.out.println("El total de Limon fue: " + cantidad_Total_limon + " y se vendieron: "
                + (cantidad_Total_limon / limon));
        System.out.println(
                "El total de Nuez fue: " + cantidad_Total_nuez + " y se vendieron: " + (cantidad_Total_nuez / nuez));
        System.out.println(
                "El total de Lulo fue: " + cantidad_Total_lulo + " y se vendieron: " + (cantidad_Total_lulo / lulo));
        System.out.println("El total de Fresa fue: " + cantidad_Total_fresa + " y se vendieron: "
                + (cantidad_Total_fresa / fresa));
        System.out.println("El total de Crema fue: " + cantidad_Total_crema + " y se vendieron: "
                + (cantidad_Total_crema / crema));

        System.out.println("_________saliste del programa______");
        System.out.println("Hiciste " + facturas + " facturas");
    }

    public static void mostrarMenu() {
        System.out.println("");
        System.out.println("***Menu***");
        System.out.println("1 Limon");
        System.out.println("2 Nuez");
        System.out.println("3 Lulo");
        System.out.println("4 Fresa");
        System.out.println("5 Crema");
    }

    public static int leercantidad(String sabor){
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        
        do{
            System.out.print("cantidad de helados de "+sabor+":");
            cantidad=entrada.nextInt();
            if(cantidad<=0){
                System.out.println("Error en la cantidad ingresada");
            }
        } while(cantidad<=0);
        return cantidad;

    }

}
