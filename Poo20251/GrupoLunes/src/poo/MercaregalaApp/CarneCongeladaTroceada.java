package poo.MercaregalaApp;

public class CarneCongeladaTroceada extends CarneCongelada{
    private double piezas;

    public CarneCongeladaTroceada(String nombre, double peso, double precioKilo, String origen, Empresa distribuidora,
            double piezas) {
        super(nombre, peso, precioKilo, origen, distribuidora);
        this.piezas = piezas;
    }

    public double getPiezas() {
        return piezas;
    }

    public void setPiezas(double piezas) {
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return "CarneCongeladaTroceada [piezas=" + piezas + "]";
    }

    

}
