/*
Crea una clase con los siguientes métodos para arrays de una dimensión y de números 
enteros:
1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo 
(mínimo y máximo) se indica como ,parámetro.
2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
5. estaEnArrayInt: Dice si un número está o no dentro de un array.
6. posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se
encuentra.
7. volteaArrayInt: Le da la vuelta a un array.
8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
*/
package GrupoMiercoles.Lang;

public class Practica1 {
    public static void main(String[] args) {
        
        int[] vector=generaArrayInt(10,20,50);
        muestraArray(vector);
            
    }
    public static int[] generaArrayInt(int n,int min, int max){
        int [] vector = new int[n];
        for(int i=0;i<vector.length;i++){
            vector[i]=(int)((Math.random()*(max-min))+min);
        }
        return vector;
    }
    public static void muestraArray(int [] vector){
        for(int k=0;k<vector.length;k++){
            System.out.println(vector[k]);
        }
    }
    
}
