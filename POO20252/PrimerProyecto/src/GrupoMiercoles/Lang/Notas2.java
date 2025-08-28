/*
Pedir por teclado las notas de n estudiantes y guardarlas en un array de notas. 
Las notas serán números decimales. Tras leer las notas en un bucle inicial, 
procesar en otro bucle la información y mostrar por pantalla:
1. la nota más alta
2. la nota más baja
3. la nota media de todas las notas
4. el número de aprobados
5. el número de suspensos
Se ha de comprobar que las notas introducidas están entre 0.0 y 5.0
 */
package GrupoMiercoles.Lang;

import java.util.Scanner;

public class Notas2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        int cantNotas=0;
        while(!flag){
            System.out.print("Cuantas notas va a procesar: ");
            cantNotas = in.nextInt();
            if(cantNotas <= 0){
                System.out.println("Error en cantidad de notas. Intente nuevamente!!!");
            }
            else{
                flag=true;
            }
        }
        double [] notas = new double[cantNotas];
        for (int k=0;k<notas.length;k++){ //Validar que la nota sea un valor entre 0 y 5 
            System.out.println("Nota # "+(k+1));
            System.out.print("Valor: ");
            notas[k]=in.nextDouble();
        }
        int j=0;
        while(j<notas.length){
            System.out.print("Nota # "+(j+1)+":");
            System.out.println(notas[j]);
            j++;
        }
        
    }
    
}
