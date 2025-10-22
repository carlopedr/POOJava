package GrupoMiercoles.poo.JuanBussines;

public class Coche extends Vehiculo{ 
    
    private int puertas;

    public Coche(int puertas, double precioCompra, String marca) {
        super(precioCompra, marca);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return super.toString()+" Coche{" + "puertas=" + puertas + '}';
    }
    
    
    
    
}
