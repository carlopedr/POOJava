

import java.util.Scanner;

public class ScannerEjemplo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hola, como te llamas: ");
        String nombre;
        nombre=input.nextLine();
        System.out.println("Me alegra conocerte "+nombre);
        System.out.print("Ahora, cuentame cuantos años tienes: ");
        int edad=input.nextInt();
        System.out.println("Me alegro, con "+edad+" años somos compatibles!!");
        System.out.print("Disculpame, cuanto pesas exactamente ?");
        float peso = input.nextFloat();
        System.out.println("Con tu peso de "+peso+" kilos, estas en forma!!!");
        //int talla=0;
    }
}
