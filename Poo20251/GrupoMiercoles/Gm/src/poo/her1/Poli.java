package poo.her1;

public class Poli {

    public static void main(String[] args) {

        Vehiculo v1=new Motocicleta("Ducatti", "Rojo", false);
        System.out.println(v1.toString());
        v1.pintar("Marron");
        System.out.println(v1.toString());
 
        Vehiculo [] vs = new Vehiculo[4];
        vs[0]=new AutoElectrico("BYD", "Pink", 4, 4, 500);
        vs[1]=new Carruaje("ACME", "Blue", 6, 2, 30);
        vs[2]=new Motocicleta("AKT", "Red", false);
        vs[3]=new AutoGasolina("BMW", "Orange", 5, 3, 1500);
        
        //for each

        for(int i=0;i<vs.length;i++){
            Vehiculo v=vs[i];
            v.pintar("Yellow");
            System.out.println(v.toString());


        }

        for(Vehiculo v:vs){
            v.pintar("Dorado");
            System.out.println(v.toString());

        }


    }

}
