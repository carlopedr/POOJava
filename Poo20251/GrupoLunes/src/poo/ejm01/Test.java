package poo.ejm01;

public class Test {
    public static void main(String[] args) {
        Auto auto = new Auto("ABC123","Azul","BMW",2025,1600,true);
        System.out.println("Marca:"+auto.marca);   
              
        auto.color="Blanco";
        System.out.println("Color original: "+auto.color);
        auto.dimeSiEsMetalizado();
        auto.pintarAuto("Plata");
        System.out.println("Color nuevo: "+auto.color);

        Auto a2=new Auto();
        AutoPrivate autop=new AutoPrivate("XYZ789","Azul","BMW",2025,1600,true);
        System.out.println("Placa2: "+ autop.getPlaca());

        autop.setCilindraje(2500);
        System.out.println("Cilindraje 2:" +autop.getCilindraje());


    }

}
