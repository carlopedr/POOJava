package poo.her1;

public class Test {
    public static void main(String[] args) {
        Auto a = new Auto("Honda","Blanco",5,4);

        System.out.println(a.toString());

        a.setColor("Negro");

        System.out.println(a.toString());

        Motocicleta m = new Motocicleta();
        
        Auto a1=new Auto("Toyota","Plata",7,5);
        System.out.println(a1.toString());
        a1.pintar("Dorado");
        System.out.println(a1.toString());
        a1.matricula="XYZ789";

        Vehiculo v=new Vehiculo();
        v.matricula="DEF456";


    }

}
