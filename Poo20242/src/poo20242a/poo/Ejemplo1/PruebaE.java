package poo.Ejemplo1;

public class PruebaE {
    public static void main(String[] args) {
        CocheEncapsulado ce = new CocheEncapsulado();
        //ce.marca="BYD";
        ce.setMarca("BYD");
        System.out.println("Marca: "+ce.getMarca());
    }




}
