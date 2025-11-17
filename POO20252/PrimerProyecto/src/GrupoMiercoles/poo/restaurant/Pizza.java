package GrupoMiercoles.poo.restaurant;

import java.util.ArrayList;

public class Pizza extends Receta {

    public Pizza(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        return (2+super.getNombre().length());
    
    }

    @Override
    public boolean isVegetariano() {
        for(String ingrediente: super.getIngredientes()){
            if(ingrediente.toLowerCase().contains("carne")){
                return false;
            }
        }
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "horno";
    }
    
}
