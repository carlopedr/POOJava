//Gestión de temperaturas

import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temps []=new double[30];

        /*System.out.print("Ingrese la temperatura del  dia 1: ");
        temps[0]=sc.nextDouble();
        System.out.print("Ingrese la temperatura del  dia 2: ");
        temps[1]=sc.nextDouble();
        System.out.print("Ingrese la temperatura del  dia 3: ");
        temps[2]=sc.nextDouble();*/

        //LLenar el arreglo

        for(int i=0;i<temps.length;i++){
            //System.out.print("Ingrese la temperatura del  dia "+(i+1)+": ");
            //temps[i]=sc.nextDouble();
            temps[i]=(Math.random()*(41-20))+20;
            System.out.println(i+"-"+temps[i]);
        }

        int cont40=0;
        double acumTemp=0;

        //Recorrer el arreglo

        for(int k=0;k<temps.length;k++){
            if(temps[k]>40){
                cont40++;
            }
            acumTemp=acumTemp+temps[k];
        }

        //Cuantas tempraturas hay que son mayores y menores que el promedio??
        //Valores de las temperaturas máximas y mínimas
        //Calcular la desviación estandar
        
        System.out.println("Cant temperaturas mayores a 40 :"+cont40);
        System.out.println("Promedio: "+(acumTemp/temps.length));



        
    }


}
