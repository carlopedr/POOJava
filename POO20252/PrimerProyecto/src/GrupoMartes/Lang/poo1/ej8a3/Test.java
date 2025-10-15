package GrupoMartes.Lang.poo1.ej8a3;

public class Test {
    public static void main(String[] args) {
        Persona p = new Persona("Carlos","123456");
        System.out.println(p.toString());
        p.setNif("7890123");
        System.out.println(p.toString());
        System.out.println("Nombre: "+p.getNombre());
        Cuenta cuenta=new Cuenta(123,p);
        Persona pa = new Persona("Diana","98765");
        CuentaAhorros ca=new CuentaAhorros(456,pa);
        //Polimorfismo por herencia
        System.out.println("CA Saldo: "+ca.getSaldo());
        ca.ingresar(1000);
        System.out.println("CA Saldo: "+ca.getSaldo());
        ca.retirar(1000);
        System.out.println("CA Saldo: "+ca.getSaldo());
        
        
        
    }
    
}
