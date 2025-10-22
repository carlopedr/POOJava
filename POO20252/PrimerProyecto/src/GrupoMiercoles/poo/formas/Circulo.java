
package GrupoMiercoles.poo.formas;

public class Circulo extends Forma implements Movimientos {
    private double radio;

    public Circulo(double radio, String nombre, double posicionX, double posicionY, String color) {
        super(nombre, posicionX, posicionY, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}' + super.toString();
    }

    

    @Override
    public double calcularArea() {
        return (Math.PI*radio*radio);
   }

    @Override
    public void mover(int x, int y) {
        super.setPosicionX(super.getPosicionX()+x);
        super.setPosicionY(super.getPosicionY()+y);
    }

    @Override
    public void desplazarX(int x) {
        super.setPosicionX(super.getPosicionX()+x);
    }
    
}
