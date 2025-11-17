
package GrupoMiercoles.poo.restaurant;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> ing = new ArrayList<String>();
        ing.add("Harina");
        ing.add("Base de tomate");
        ing.add("Queso");
        ing.add("Jamon");
        ing.add("Piña");
        ing.add("Pollo CarNEsita");
        ArrayList<String> pasos = new ArrayList<String>();
        pasos.add("Amasar la harina");
        pasos.add("Extender la masa");
        pasos.add("Agregar la salsa");
        pasos.add("Dispersar Jamon y piña");
        pasos.add("Cubrir con queso");
        Pizza haw=new Pizza("Hawiana",ing,pasos);
        System.out.println("TiempoP:"+haw.tiempoDePreparacion());
        System.out.println("Pizza veg: "+haw.isVegetariano());
        ArrayList<String> ingS = new ArrayList<String>();
        ingS.add("Pan");
        ingS.add("Salsas");
        ingS.add("Queso");
        ingS.add("Jamon");
        ingS.add("Tomate");
        ingS.add("Pollo");
        ArrayList<String> pasosS = new ArrayList<String>();
        pasosS.add("Cortar el pan");
        pasosS.add("Untar la salsa");
        pasosS.add("Colocar el jamon");
        pasosS.add("Poner el queso");
        pasosS.add("Colocar en la plancha");
        Sandwich sand=new Sandwich("AmerIcano",ingS,pasosS);
        System.out.println("TiempoS:"+sand.tiempoDePreparacion());
        //System.out.println("Pizza veg: "+haw.isVegetariano());
    }
    
}
