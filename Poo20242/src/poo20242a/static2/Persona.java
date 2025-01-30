package static2;

public class Persona {
    String nombre;
    static int edadJubilación;

    public static void msg(){
        System.out.println("Mensaje de un método static");
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edadJubilación=" + edadJubilación + "]";
    }

    

}
