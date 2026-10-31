package POO.Coche;


public class TestGarage {
    public static void main(String[] args) {
        Garage g = new Garage();
        g.construyePlazas(10);
        Coche c=new Coche("BMW","Black",60000,0.2,2024);
        Persona p=new Persona("Pepe","12345");
        c.setTitular(p);
        g.alquilarPlaza(c, 5);
        
        g.asignarImporte(100, 5);
        g.listarCoches();
        
        
        
    }

}
