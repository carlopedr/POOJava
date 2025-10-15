
package GrupoMartes.Lang.Abs;

public class Perro extends Canino{
    @Override
    public void makeSound(){
        System.out.println("Guau...");
    }

    @Override
    public void move() {
        System.out.println("Camina en 4 patas...");
    }
}
