
package POO.Coche;


public class Test {
    public static void main(String[] args) {
        Coche c=new Coche("BMW","Black",60000,0.2,2024);
        Persona p=new Persona("Pepe","12345");
        c.setTitular(p);
        System.out.println(c.toString());
        
        c.setKm(1000);
        System.out.println(c.toString());
        c.setKm(900);
        System.out.println(c.toString());
        
        c.agregarKm(450);
        System.out.println(c.toString());
        
        c.calcularImpuestoContaminacion();
        System.out.println(c.toString());
        
        Coche c1=new Coche("Toyota","Blue",55000,0.4,2023);
        Persona p1=new Persona("Titi","98765");
        c1.setTitular(p1);
        System.out.println(c.toString());
        c.hacerTransferenciaCoche(c1);
        System.out.println(c.toString());
    }

}
