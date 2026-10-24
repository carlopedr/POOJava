/*
Crea una clase con los siguientes métodos para arrays de una dimensión y de números enteros:
1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y
máximo) se indica como parámetro.
2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
5. estaEnArrayInt: Dice si un número está o no dentro de un array.
6. posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se
encuentra.
7. volteaArrayInt: Le da la vuelta a un array.
8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array. */

package Code;

public class Metodo2 {
    public static void main(String[] args) {
        int[] a;
        a=generaArrayInt(10,1,100);
        System.out.println("Array generado...");
        muestraArrayInt(a);
        System.out.println("El mínimo es: "+minimoArrayInt(a));
        
    }
    
    public static int[] generaArrayInt(int n,int min,int max){
        int[] num=new int[n];
        for (int i=0;i<num.length;i++){
            num[i]=(int)(Math.random()*max+min);
        }
        return num;
    }
    
    public static void muestraArrayInt(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    
    public static int minimoArrayInt(int[] a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
        
    }

}
