package GrupoMiercoles.poo.Ej2;

public class Test {
    public static void main(String[] args) {
        Moto moto1 = new Moto("ABC43F","AKT",30);
        System.out.println("Vel.actual moto1:"+moto1.devolverVelocidadActual());
        Moto moto2= new Moto("BGT56R","Ducatti");
        System.out.println("Vel.actual moto2:"+moto2.devolverVelocidadActual());
        
    }
    
}
