/*
Crea una clase llamada Triangulo que herede de la clase Forma, 
y con los atributos base y altura.
Define en ella el método calcularArea().
*/
package GrupoMiercoles.poo.formas;

public class Triangulo extends Forma {
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String nombre, double posicionX, double posicionY, String color) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}'+super.toString();
    }
    
    
    
    
}
