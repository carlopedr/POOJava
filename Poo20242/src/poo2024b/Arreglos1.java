

import java.util.Scanner;

public class Arreglos1 {
    public static void main(String[] args) {
        //Declaración de vectores
        Scanner sc = new Scanner(System.in);
        int [] vector1;
        vector1=new int[5];
        vector1[0]=10;
        vector1[4]=12;
        //vector1[5]=25;
        //int vector2 []=new int[6];
        //int vector3 []={34,21,56,78,99,12};

        //Capturar los datos de 10 notas del curso
        System.out.print("Cuantos alumnos son ?: ");
        int cantAlumnos = sc.nextInt();
        double [] notas=new double[cantAlumnos];
        //Ciclo para llevar el vector notas
        for(int i=0;i<notas.length;i++){
            System.out.print("Ingrese la Nota # "+(i+1)+": ");
            notas[i]=sc.nextDouble();
        }
        //Ciclo para mostrar las notas
        for(int i=0;i<notas.length;i++){
            System.out.println("Nota # "+(i+1)+": "+notas[i]);
            
        }

        sc.close();


    }

}
