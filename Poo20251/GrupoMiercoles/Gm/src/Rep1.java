//Estructuras repetitivas
//Tablas de multiplicar

import java.util.Scanner;

public class Rep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de la tabla a generar: ");
        int vr=sc.nextInt();
        System.out.print("Número de terminos: ");
        int nt=sc.nextInt();
        //Usando for
        System.out.println("Tabla de multiplo del "+vr);
        for(int i=1;i<=nt;i++){
            System.out.println(vr+"*"+i+"="+(vr*i));
        }

        //Usando while
        int i=1;
        while(i<=nt){
            int j=0;
            System.out.println("w: "+vr+"*"+i+"="+(vr*i));
            i++;
        }

        int j=0;



        
        
    }

}
