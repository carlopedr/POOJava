package UsoStatic;

public class Prueba {
    public static void main(String[] args) {
        Persona p1=new Persona();
        p1.nombre="Pedro";
        p1.edadJubilacion=62;
        System.out.println(p1.toString());
        Persona p2=new Persona();
        p2.nombre="María";
        p2.edadJubilacion=57;
        System.out.println(p2.toString());
        System.out.println(p1.toString());
        Persona.edadJubilacion=50;
        System.out.println(p2.toString());
        System.out.println(p1.toString());
        Persona.msg("Muestre este mensaje");

    }

}
