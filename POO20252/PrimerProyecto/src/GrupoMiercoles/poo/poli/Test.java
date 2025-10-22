
package GrupoMiercoles.poo.poli;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        
        Dog dog = new Dog();
        dog.makeSound();
        
        Cat cat = new Cat();
        cat.makeSound();
        
        Pincher lulu = new Pincher();
        lulu.makeSound();
        lulu.makeSound("Verde");
        
        
        ArrayList<Animal> vete = new ArrayList();
        vete.add(animal);
        vete.add(dog);
        vete.add(cat);
        vete.add(lulu);
        
        for(Animal a:vete){
            a.makeSound();
        }
    }
    
}
