
package GrupoMiercoles.poo.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> ing = new ArrayList<String>();
        ing.add("Harina");
        ing.add("Base de tomate");
        ing.add("Queso");
        ing.add("Jamon");
        ing.add("Piña");
        ing.add("CarnEsita");
        ArrayList<String> pasos = new ArrayList<String>();
        pasos.add("Amasar la harina");
        pasos.add("Extender la masa");
        pasos.add("Agregar la salsa");
        pasos.add("Dispersar Jamon y piña");
        pasos.add("Cubrir con queso");
        Pizza haw=new Pizza("Hawiana",ing,pasos);
        System.out.println("Tiempo:"+haw.tiempoDePreparacion());
        
    }
    
}
