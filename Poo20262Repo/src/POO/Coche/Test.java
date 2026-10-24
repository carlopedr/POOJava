
package POO.Coche;


public class Test {
    public static void main(String[] args) {
        Coche c=new Coche("BMW","Black",60000,0.2,2024);
        System.out.println(c.toString());
        
        c.setKm(1000);
        System.out.println(c.toString());
        c.setKm(900);
        System.out.println(c.toString());
        
        c.agregarKm(450);
        System.out.println(c.toString());
        
        c.calcularImpuestoContaminacion();
        System.out.println(c.toString());
    }

}
