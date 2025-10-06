
package GrupoMartes.Lang.poo1;

public class TestEnc {
    public static void main(String[] args) {
        PersonEnc pe=new PersonEnc(12345,"Carlos", 55, "carlos@usco.edu.co");
        pe.sayHello();
        pe.setAge(23);
        pe.sayHello();
        pe.setEmail("carlos@gmail.com");
        pe.sayHello();
        System.out.println("Email: "+pe.getEmail());
        
        
    }
    
}
