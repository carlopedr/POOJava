package GrupoMartes.Lang;

import java.util.Scanner;

public class Notas2 {
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
        for(int i=1;i<=cantidadNotas;i++){
            flag=false;
            while(!flag){
                System.out.print("Nota #"+i+":");
                nota=in.nextDouble();
                if((nota<0)||(nota>5)){
                    System.out.println("Error en la nota... intente nuevamente");
                }
                else{
                    flag=true;
                }
            }
            sumaNotas=sumaNotas+nota;
                       
        }
        definitiva=sumaNotas/cantidadNotas;
        System.out.println("Def: "+ definitiva);
        
    }
    
}
