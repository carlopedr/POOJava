package poo.her1;

public class Carruaje extends Auto {
    private int velocidadMaxima;

    public Carruaje(String marca, String color, int numPlazas, int numPuertas, int velocidadMaxima) {
        super(marca, color, numPlazas, numPuertas);
        this.velocidadMaxima=velocidadMaxima;
        
    }

    @Override
    public void pintar(String colorNuevo){
        String colorOriginal=super.getColor();
        super.setColor(colorOriginal+"-Puertas: "+colorNuevo);
    }

    @Override
    public String toString() {
        return "Carruaje [velocidadMaxima=" + velocidadMaxima + ", toString()=" + super.toString() + "]";
    }

    

}
