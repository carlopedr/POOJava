package GrupoMartes.Lang;

import java.util.Scanner;

public class Notas3 {
    public static void main(String[] args) {
        int cantidadNotas=0;
        double nota=0,definitiva=0;
        double sumaNotas=0;
        boolean flag=false;
        Scanner in = new Scanner(System.in);
        //Para capturar la cantidad de notas que sea un valor entre 2 y 5
        while (!flag) {
            System.out.print("Ingrese la cantidad de notas: ");
            cantidadNotas = in.nextInt();
            if ((cantidadNotas < 2) || (cantidadNotas > 5)) {
                System.out.println("Error en la cantidad de notas...");
            }
            else{
                flag=true;
            }
        }
        //Capturar las notas
        double[] notas = new double[5];
        for(int i=0;i<cantidadNotas;i++){
            flag=false;
            while(!flag){
                System.out.print("Nota #"+(i+1)+":");
                nota=in.nextDouble();
                if((nota<0)||(nota>5)){
                    System.out.println("Error en la nota... intente nuevamente");
                }
                else{
                    flag=true;
                }
            }
            notas[i]=nota;
        }
        //Ver las notas del arreglo
        System.out.println("Listado de notas ingresadas");
        for(int k=0;k<notas.length;k++){
            System.out.println("Nota #"+(k+1)+notas[k]);
        }
        definitiva=sumaNotas/cantidadNotas;
        System.out.println("Def: "+ definitiva);
        
    }
    
}
