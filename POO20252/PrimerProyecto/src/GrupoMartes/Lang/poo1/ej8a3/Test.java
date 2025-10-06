package GrupoMartes.Lang.poo1.ej8a3;

public class Test {
    public static void main(String[] args) {
        Persona p = new Persona("Carlos","123456");
        System.out.println(p.toString());
        p.setNif("7890123");
        System.out.println(p.toString());
        System.out.println("Nombre: "+p.getNombre());
    }
    
}
