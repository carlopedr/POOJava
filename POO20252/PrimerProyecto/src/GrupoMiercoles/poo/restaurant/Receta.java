
package GrupoMiercoles.poo.restaurant;

import java.util.ArrayList;

public abstract class Receta implements IFastFood{

    private String nombre;
    private ArrayList<String> ingredientes;// = new ArrayList<String>();
    private ArrayList<String> pasosPreparacion;// = new ArrayList<String>();

    public Receta(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.pasosPreparacion = pasosPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getPasosPreparacion() {
        return pasosPreparacion;
    }

    public void setPasosPreparacion(ArrayList<String> pasosPreparacion) {
        this.pasosPreparacion = pasosPreparacion;
    }

    

}
