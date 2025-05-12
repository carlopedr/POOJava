package poo.Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Colecc1 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        //Las colecciones solamente contenen objetos. No pueden contener datos primitivos
        //NO ES valido: List<int> lista = new ArrayList<>();
        //Es valido usar la clase envolvente: List<Integer> lista = new ArrayList<>();
        //Agregar objetos

        lista.add("Perro");
        lista.add("Gato");
        lista.add("Loro");
        lista.add("Gallina");
        lista.add("Hamster");
        lista.add("Cerdo");
        
        //Recorrerla usando for-each
        System.out.println("-------------------");
        for(String s:lista){
            System.out.println(s);
        }

        lista.add(3,"Elefante");
        System.out.println("-------------------");
        for(String s:lista){
            System.out.println(s);
        }

        lista.set(2, "Canario");
        System.out.println("-------------------");
        for(String s:lista){
            System.out.println(s);
        }

        lista.remove(1);
        System.out.println("-------------------");
        for(String s:lista){
            System.out.println(s);
        }
        lista.add(4,"Canario");
        System.out.println("-------------------");
        for(String s:lista){
            System.out.println(s);
        }
        //Eliminar los canarios
        for(int i = 0;i<lista.size();i++){
            if(lista.get(i).equals("Canario")){
                lista.remove(i);
            }
        }
        System.out.println("-------------------");
        for(String s:lista){
            System.out.println(s);
        }
        lista.add(2,"Elefante");
        lista.add(2,"Elefante");
        System.out.println("-------------------");
        for(String s:lista){
            System.out.println(s);
        }
        //Eliminar los elefantes
        for(int i = 0;i<lista.size();i++){
            if(lista.get(i).equals("Elefante")){
                lista.remove(i);
            }
        }
        System.out.println("-------------------");
        for(String s:lista){
            System.out.println(s);
        }
        lista.add(2,"Elefante");
        lista.add(2,"Elefante");
        System.out.println("-------------------");
        for(String s:lista){
            System.out.println(s);
        }
        Iterator iter = lista.iterator();
        while(iter.hasNext()){
            String animal=(String)iter.next();
            if(animal.equals("Elefante")){
                iter.remove();
            }

        }
        System.out.println("-------------------");
        for(String s:lista){
            System.out.println(s);
        }
        





        
    }

}
