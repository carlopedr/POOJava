
abstract class Vehiculo {
    String marca;
    public Vehiculo(String marca) {
        this.marca = marca;
    }
    public abstract void acelerar();
    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }
}

class Coche extends Vehiculo {
    int velocidadActual = 0;
    public Coche(String marca) {
        super(marca);
    }
    @Override
    public void acelerar() {
        velocidadActual += 10;
        System.out.println("Coche acelerando. Velocidad actual: " + velocidadActual);
    }
}

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Coche("Toyota");
        miVehiculo.mostrarMarca();
        miVehiculo.acelerar();
    }
}
