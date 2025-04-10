package poo.her1;

public class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String color, boolean tieneSidecar) {
        super(marca, color);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void pintar(String colorNuevo){
        String colorOriginal=super.getColor();
        super.setColor(colorNuevo+"- Rayas blancas");
    }

    @Override
    public String toString() {
        return "Motocicleta [tieneSidecar=" + tieneSidecar + ", toString()=" + super.toString() + "]";
    }

    

}
