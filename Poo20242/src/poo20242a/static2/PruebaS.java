package static2;

public class PruebaS {
    public static void main(String[] args) {
        Persona p1=new Persona();
        p1.nombre="Pedro";
        p1.edadJubilación=62;
        System.out.println(p1.toString());
        Persona p2=new Persona();
        p2.nombre="María";
        //p2.edadJubilación=57;
        System.out.println(p2.toString());
        System.out.println(p1.toString());
        Persona.msg();
        
    }

}
