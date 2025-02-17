import java.util.Scanner;
public class Sw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Menú Áreas ");
        System.out.println("1. Cículo");
        System.out.println("2. Triángulo");
        System.out.println("3. Trapecio");
        System.out.println("4. Salir");
        System.out.print("Ingrese la opción deseada: ");
        opcion=sc.nextInt();
        switch(opcion){
            case 1:
                double radio;
                System.out.print("Valor del radio: ");
                radio=sc.nextDouble();
                double area=Math.PI*Math.pow(radio, 2);
                System.out.println("Area círculo: "+area);
                break;
            case 2:
                System.out.println("Calcula el área de un triángulo");
                break;
            case 3:
                System.out.println("Calcula el área de un trapecio");
                break;
            case 4:
                System.out.println("Gracias por usar este programa!!!");
                break;
            default:
                System.out.println("Error en la opción");
                
        }





    }

}
