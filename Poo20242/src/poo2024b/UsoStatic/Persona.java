package UsoStatic;

public class Persona {
    String nombre;
    static int edadJubilacion;
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edadJubilacion=" + edadJubilacion + "]";
    }

    public static void msg(String mensaje){
        System.out.println(mensaje);
    }

    

}
