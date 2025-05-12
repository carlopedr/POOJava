/*Separar listas. Hacer un ejercicio que genere aleatorimente 9 números enteros entre 1 y 100 y los guarde en un 
arrayList (llamado todosLosNumeros)
Crear luego dos arrayList nuevos (llamados soloPares y soloImpares).
Colocar en el arrayList soloPares los números de todosLosNumeros que sean pares, y en el arrayList
soloImpares los números de todosLosNumeros que sean impares
Informar finalmente de cual de los dos arraylist (soloPares o soloImpares) tiene mas elementos
Hacer finalmente el mismo ejercicio pero en vez de usar ArrayList, usar TreeSet */

package poo.Colecciones;

import java.util.ArrayList;
import java.util.List;

public class EjemploColecciones {
    public static void main(String[] args) {
        List<Integer> todosLosNumeros=new ArrayList<>();

        for(int i=1;i<10;i++){
            todosLosNumeros.add((int) (Math.random()*100));
        }
        mostrarNumeros(todosLosNumeros);
        List<Integer> soloPares=new ArrayList<>();
        List<Integer> soloImpares=new ArrayList<>();
        for(Integer i: todosLosNumeros){
            if(i%2==0){
                soloPares.add(i);
            }
            else{   
                soloImpares.add(i);
            }
        }
        System.out.println("Pares");
        mostrarNumeros(soloPares);
        System.out.println("Impares");
        mostrarNumeros(soloImpares);

        System.out.println("Arreglo con más elementos:");
        if (soloPares.size() > soloImpares.size()) {
            System.out.println("El arreglo de pares tiene mas elementos.");
        } else if (soloImpares.size() > soloPares.size()) {
            System.out.println("El arreglo de impares tiene mas elementos.");
        } else {
            System.out.println("arreglos con la misma cantidad de elementos.");
        }
    }

    public static void mostrarNumeros(List<Integer> todosLosNumeros){
        for(Integer i:todosLosNumeros){
            System.out.println(i);

        }

    }

}
