package poo.her1;

public class AutoElectrico extends Auto {
    private double capacidadBaterias;

    public AutoElectrico(String marca, String color, int numPlazas, int numPuertas, double capacidadBaterias) {
        super(marca, color, numPlazas, numPuertas);
        this.capacidadBaterias = capacidadBaterias;
    }

    @Override
    public void pintar(String colorNuevo){
        String colorOriginal=super.getColor();
        super.setColor(colorNuevo+" Metalizado");
    }

    @Override
    public String toString() {
        return "AutoElectrico [capacidadBaterias=" + capacidadBaterias + ", toString()=" + super.toString() + "]";
    }

    

    

    

}
