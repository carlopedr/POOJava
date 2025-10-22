
package GrupoMiercoles.poo.formas;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //Forma forma = new Forma("Rombo",1,2,"Azul");
        //System.out.println(forma.toString());
        
        Triangulo t1 = new Triangulo(5,3,"Triangulo1",4,6,"Rojo");
        System.out.println(t1.toString());
        System.out.println("Area :"+t1.calcularArea());
        Triangulo t2 = new Triangulo(7,6,"Triangulo2",1,2,"Verde");
        System.out.println(t2.toString());
        System.out.println("Area :"+t2.calcularArea());
        Cuadrado c1 = new Cuadrado(5,"Cuadrado1",0,0,"Azul");
        System.out.println(c1.toString());
        System.out.println("Area : "+c1.calcularArea());
        System.out.println("Perim:"+c1.calcularPerimetro());
        Cuadrado c2 = new Cuadrado(9,"Cuadrado2",6,3,"Amarillo");
        System.out.println(c2.toString());
        System.out.println("Area : "+c2.calcularArea());
        System.out.println("Perim:"+c2.calcularPerimetro());
        
        List<Forma> figuras = new ArrayList<Forma>();
        figuras.add(t1);
        figuras.add(c1);
        figuras.add(t2);
        figuras.add(c2);
        
        double sumaArea=0;
        double sumaAreaC=0;
        double cantC=0;
        for(Forma figura:figuras){
            System.out.println("Area "+figura.getNombre()+ ":"+figura.calcularArea());
            sumaArea+=figura.calcularArea();
            if(figura instanceof Cuadrado){
                sumaAreaC+=figura.calcularArea();
                cantC++;
            }
        }
        System.out.println("Suma áreas: "+sumaArea);
        if(cantC==0)
            System.out.println("No hay cuadrados");
        else
            System.out.println("Promedio area de cuadrados: "+(sumaAreaC/cantC));
        
        
        
        
    }
    
}
