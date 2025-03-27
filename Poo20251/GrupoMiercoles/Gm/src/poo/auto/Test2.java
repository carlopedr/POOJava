package poo.auto;

public class Test2 {
    public static void main(String[] args) {
        Auto a1 =new Auto("Mazda","Rojo","ABC123",1500);
        System.out.println("Placa a1:"+a1.getPlaca());

        //a1.placa="XYZ789";
        a1.setPlaca("XYZ789");
        System.out.println("Placa a1 act:"+a1.getPlaca());

    }

}
