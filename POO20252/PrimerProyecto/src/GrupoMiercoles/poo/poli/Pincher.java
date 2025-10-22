
package GrupoMiercoles.poo.poli;

public class Pincher extends Dog {
    @Override
    public void makeSound(){
        System.out.println("GrrrGuau...");
    }
    
    public void makeSound(String color){
        System.out.println("GrrrGuau..."+color);
    }
    
}
