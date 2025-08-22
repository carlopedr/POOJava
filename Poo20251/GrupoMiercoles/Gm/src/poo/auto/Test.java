package poo.auto;

public class Test {
    public static void main(String[] args) {
        Auto a1= new Auto();

        //a1.marca="Mazda";
        a1.setMarca("Mazda");
        a1.setColor("Rojo");
        a1.setPlaca("XYZ234");
        a1.setCilindraje(1500);

        System.out.println("Placa: "+a1.getPlaca());

        a1.dimeSiEsMetalizado();

        a1.setColor("Negro");
        a1.dimeSiEsMetalizado();
        System.out.println("Cil1:"+a1.getCilindraje());
        a1.actualizarCilindraje(2000);
        System.out.println("Cil2:"+a1.getCilindraje());

        Auto a2 =new Auto("BMW","Negro","GRF567",2500);
        System.out.println("Marca a2:"+a2.getMarca());

    }

}
