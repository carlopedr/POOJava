
package POO.Ejemplo1;

public class Inicio {
    public static void main(String[] args) {
        //MiClaseCoche cocheDemo1 = new MiClaseCoche();
        MiClaseCoche cocheDemo1 = new MiClaseCoche("BMW","Black",2500);
        //cocheDemo1.marca="BMW";
        //cocheDemo1.color="Black";
        //cocheDemo1.matricula="ABC123";
        System.out.println("Marca: "+cocheDemo1.marca);
        System.out.println("Color: "+cocheDemo1.color);
        System.out.println("Cilindrada: "+cocheDemo1.cilindrada);
        //cocheDemo1.cilindrada=2500;
        
        cocheDemo1.dimeSiEsMetalizado();
        
        cocheDemo1.color="Red";
        cocheDemo1.dimeSiEsMetalizado();
        System.out.println("Maticula en este momento: "+cocheDemo1.matricula);
        cocheDemo1.matricularCoche("ZYX789");
        System.out.println("La nueva matricula es: "+cocheDemo1.matricula);
        
        MiClaseCoche coche2=new MiClaseCoche("MB","Red","WQE456",3000);
        coche2.color="White";
        
    }

}
