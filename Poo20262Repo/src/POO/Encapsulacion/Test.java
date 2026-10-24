package POO.Encapsulacion;

public class Test {
    public static void main(String[] args) {
        Persona p = new Persona("Carlos",50);
        //p.age=40;
        //p.name="Pepe";
        System.out.println("Nombre: "+p.getName());
        System.out.println("Edad: "+p.getAge());
        p.setName("Pepe");
        p.setAge(40);
        System.out.println("Nombre: "+p.getName());
        System.out.println("Edad: "+p.getAge());
        //p.upperCaseName();
        System.out.println("Nombre: "+p.getName());
        p.setName("maria");
        System.out.println("Nombre: "+p.getName());
    }

}
