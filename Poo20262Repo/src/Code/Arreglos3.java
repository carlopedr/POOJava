/*
Temperaturas. Se piden por teclado la temperatura de cada uno de los 7 días de una semana y se
almacenan en un array de 7 elementos. Posteriormente, se pide por teclado una nueva temperatura, y
se compara con las leídas anteriormente para decir si tal nueva temperatura se dio en algún día de la
semana (si tal nueva temperatura existe en el array de temperaturas de la semana).
 */

package Code;

import java.util.Scanner;


public class Arreglos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperaturas[]=new int[7];
        String dias[] = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado","domingo"};
        
        for(int i=0;i<temperaturas.length;i++){
            System.out.print("Temperatura dia "+dias[i]+": ");
            temperaturas[i]=sc.nextInt();
        }
        System.out.print("Nueva temperatura:");
        int nuevaTemperatura=sc.nextInt();
        for(int i=0;i<temperaturas.length;i++){
            if(temperaturas[i]==nuevaTemperatura){
                System.out.println("La temperatura ya se dio en el dia "+(i+1));
            }
        }
        
        
    
    }
 
            

}
