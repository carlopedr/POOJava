package poo.her1;

public class AutoGasolina extends Auto{
    
    private int cilindraje;

    public AutoGasolina(String marca, String color, int numPlazas, int numPuertas, int cilindraje) {
        super(marca, color, numPlazas, numPuertas);
        this.cilindraje = cilindraje;
    }

    @Override
    public void pintar(String colorNuevo){
        String colorOriginal=super.getColor();
        super.setColor(colorNuevo+"-Techo: "+colorNuevo);
    }

    @Override
    public String toString() {
        return "AutoGasolina [cilindraje=" + cilindraje + ", toString()=" + super.toString() + "]";
    }

    



}
