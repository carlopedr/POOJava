package poo.Colecciones;


import java.util.ArrayList;
import java.util.List;

public class SeparaListas {
    public static void main(String[] args) {
        List<Integer> todosLosNumeros = new ArrayList<>();

        for(int i=1;i<10;i++){
            int num=(int)(Math.random()*101);
            todosLosNumeros.add(num);

        }

        for(Integer i:todosLosNumeros){
            System.out.println(i);
        }

        List<Integer> solopares = new ArrayList<>();
        List<Integer> soloimpares = new ArrayList<>();
        for(Integer i : todosLosNumeros){
            int cociente = i%2;
            if (cociente==0) {
                solopares.add(i);
            }
            if (cociente>0) {
                soloimpares.add(i);
            }
        }
        System.out.println("................................................");
        for (Integer i : soloimpares) {
            System.out.println(i);
        }
        System.out.println("................................................");
        for (Integer i : solopares) {
            System.out.println(i);
        }
        System.out.println("................................................");
        if (solopares.size()<soloimpares.size()) {
            System.out.println("hay mas impares ");      
         }
         else{
            System.out.println("hay mas pares");
         }

        

    }

}
