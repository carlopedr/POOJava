
package Code;

import java.util.Scanner;


public class Arreglos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas: ");
        int cantNotas=sc.nextInt();
        double notas[] = new double[cantNotas];
// Definir arreglos de forma directa:
        int edades[] = {16, 15};
        char vocals[] = {'a', 'e', 'i', 'o', 'u'};
        String dias[] = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
        
        for(int i=0;i<6;i++){
            System.out.println(dias[i]);
        }
        //Llenar el arreglo notas
        for (int j = 0; j < notas.length; j++) {
            System.out.print("Posicion[" + j + "]=");
            notas[j] = sc.nextDouble();
        }
        //Leyendo todos los datos de notas
        for(int k=0;k<notas.length;k++){
            System.out.println("Notas["+k+"]="+notas[k]);
        }
    }
}
