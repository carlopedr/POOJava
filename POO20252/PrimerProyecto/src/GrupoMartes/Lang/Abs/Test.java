
package GrupoMartes.Lang.Abs;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Animal> animales=new ArrayList<>();
        //animales.add(new Animal());
        //animales.add(new Canino());
        animales.add(new Ave());
        animales.add(new Perro());
        animales.add(new Lobo());
        animales.add(new Pollo());
        animales.add(new Gallo());
        for(Animal a: animales){
            a.makeSound();
        }
        
    }
    
}
