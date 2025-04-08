package poo.MercaregalaApp;

public class CarneCongelada extends Carne{
    private Empresa distribuidora;

    public CarneCongelada(String nombre, double peso, double precioKilo, String origen, Empresa distribuidora) {
        super(nombre, peso, precioKilo, origen);
        this.distribuidora = distribuidora;
    }

    public Empresa getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(Empresa distribuidora) {
        this.distribuidora = distribuidora;
    }

    @Override
    public String toString() {
        return "CarneCongelada [distribuidora=" + distribuidora + "]";
    }

    

}
