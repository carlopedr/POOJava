package poo.MercaregalaApp;

public class CarneCongeladaEntera extends CarneCongelada{
    private boolean bandeja;

    public CarneCongeladaEntera(String nombre, double peso, double precioKilo, String origen, Empresa distribuidora,
            boolean bandeja) {
        super(nombre, peso, precioKilo, origen, distribuidora);
        this.bandeja = bandeja;
    }

    public boolean isBandeja() {
        return bandeja;
    }

    public void setBandeja(boolean bandeja) {
        this.bandeja = bandeja;
    }

    @Override
    public String toString() {
        return "CarneCongeladaEntera [bandeja=" + bandeja + "]";
    }

   

    

}
