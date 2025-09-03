package GrupoMartes.Lang;

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        int[] vector = generaArrayInt(10,20);
        mostrarArray(vector);
    }
    
    public static int[] generaArrayInt(int min,int max){
        Scanner in = new Scanner(System.in);
        //Agregar el código para dimensionar el arreglo
        int n=10;
        int[] vector = new int[10];
        for(int i =0;i<vector.length;i++){
            vector[i]=(int)(Math.random()*max+min);
        }
        return vector;
    }
    
    public static void mostrarArray(int[] vector){
        for(int i =0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }
    
    public static int minimoArrayInt(int [] vector){
        int min=0;
        
        return min;
    }
}
