import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Colections1 {
    public static void main(String[] args) {
        List<String> cadenas = new ArrayList<>();

        cadenas.add("HOLA");
        cadenas.add("BUENAS");
        cadenas.add("SALUDOS");

        for (String st : cadenas) {
            System.out.println(st);
            
        }
        System.out.println("--------------------");

        cadenas.add(2,"ADIOS");
        for (String st : cadenas) {
            System.out.println(st);
            
        }
        System.out.println("--------------------");
        cadenas.set(0,"HELLO");
        for (String st : cadenas) {
            System.out.println(st);
            
        }
        //Froma correcta de remover objetos de una colección
        Iterator<String> it = cadenas.iterator();
        while(it.hasNext()){ // recorrer un iteraror con un bucle
            String s = it.next(); // extraer elemento dentro del bucle
            if(s.startsWith("B")){
            it.remove(); // eliminar el elemento que actualmente se esta iterando
            }
        }
        System.out.println("--------------------");
        for (String st : cadenas) {
                System.out.println(st);
        }
    }

}
