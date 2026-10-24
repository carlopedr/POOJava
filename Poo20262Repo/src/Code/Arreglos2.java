

package Code;

import java.util.Scanner;


public class Arreglos2 {
    public static void main(String[] args) {
        double notas[][] = new double[5][3];
        Scanner sc = new Scanner(System.in);
        //Llenar la matriz nf: número de fila, nc=número de columna
        for(int nf=0;nf<5;nf++){
            for(int nc=0;nc<3;nc++){
                notas[nf][nc]= Math.random()*5; 
                //System.out.print("Ingrese nota["+nf+"]["+nc+"]=");
                //notas[nf][nc]=sc.nextDouble();
                
            }
        }
        
        for(int nf=0;nf<notas.length;nf++){
            for(int nc=0;nc<notas[nf].length;nc++){
                System.out.println(notas[nf][nc]);
            }
        }
        
        
    }

}
