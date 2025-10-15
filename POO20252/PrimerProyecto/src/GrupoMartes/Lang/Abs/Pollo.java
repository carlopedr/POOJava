
package GrupoMartes.Lang.Abs;

public class Pollo extends Ave implements IntAnimal{
    public void makeSound(){
        System.out.println("Pio...");
    }

    @Override
    public void move() {
        System.out.println("Camina en dos patas...");
    }

    @Override
    public void sendMail(String msg) {
        System.out.println("Enviando un email...");
    }

    @Override
    public int peso() {
        return 10;
    
    }

    @Override
    public void sendMsg(String medio) {
        System.out.println("Envaindo un mensaje por "+medio);
    
    }
    
}
