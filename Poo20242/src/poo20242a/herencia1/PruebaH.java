package herencia1;

public class PruebaH {
    public static void main(String[] args) {
        Coche c1=new Coche("VW","Verde",5);
        System.out.println(c1.toString());
        c1.setMarca("KIA");
        System.out.println(c1.toString());
        
    }

}
