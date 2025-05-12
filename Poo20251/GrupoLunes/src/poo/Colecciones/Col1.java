package poo.Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Col1 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("HOLA");
        lista.add("BUENAS");
        lista.add("QUE MAS");
        lista.add("HELLO");
        lista.add("HELLO");
        lista.add("HELLO");
        lista.add("ENTONCES PUES");
        System.out.println("-------------------");
        for (String saludo : lista) {
            System.out.println(saludo);
            
        }
        
        lista.add(6,"SALUDOS");
        System.out.println("-------------------");
        for (String saludo : lista) {
            System.out.println(saludo);
            
        }

        lista.remove(2);
        System.out.println("-------------------");
        for (String saludo : lista) {
            System.out.println(saludo);
            
        }
//Borrado con for
        
        /*System.out.println("-------------------");
        for(int i =0;i<lista.size();i++) {
            if(lista.get(i).equals("HELLO")){
                lista.remove(i);
            }
            
            
        }*/
//Borrado con iterator
        Iterator <String> it = lista.iterator();
        while(it.hasNext()){
            String saludo=it.next();
            if(saludo.equals("HELLO")){
                it.remove();
            }
        }
        
        System.out.println("-------------------");
        for (String saludo : lista) {
            System.out.println(saludo);
            
        }
       


        
    }

}
