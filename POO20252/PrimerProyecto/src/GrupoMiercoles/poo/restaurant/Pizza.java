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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String tipoPreparacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
