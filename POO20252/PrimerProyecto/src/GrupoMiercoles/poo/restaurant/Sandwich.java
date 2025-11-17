package GrupoMiercoles.poo.restaurant;

import java.util.ArrayList;

public class Sandwich extends Receta{

    public Sandwich(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        int nvocals = 0;
        String name = super.getNombre();
        for (int i=0; i < name.length(); i++) {
            switch (name.toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    nvocals++;
            }
        }
        return (2+nvocals);
    }


    @Override
    public boolean isVegetariano() {
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "plancha";
    }
    
    
}
