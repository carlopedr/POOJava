

package POO.Coche;


public class PlazaGarage {
    private Coche coche;
    private double coste;

    public PlazaGarage(Coche coche, double coste) {
        this.coche = coche;
        this.coste = coste;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "PlazaGarage{" + "coche=" + coche + ", coste=" + coste + '}';
    }
    
    

}
