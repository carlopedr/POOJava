/*
 Crea una clase llamada Cuadrado que herede de la clase Forma, y con el atributo lado. Define en
ella el método calcularArea() y calcularPerimetro().
 */
package GrupoMiercoles.poo.formas;

public class Cuadrado extends Forma {
    private double lado;

    public Cuadrado(double lado, String nombre, double posicionX, double posicionY, String color) {
        super(nombre, posicionX, posicionY, color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double calcularArea(){
        return (lado*lado);
    }
    public double calcularPerimetro(){
        return (lado*4);
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}' + super.toString();
    }
    
    
    
}
