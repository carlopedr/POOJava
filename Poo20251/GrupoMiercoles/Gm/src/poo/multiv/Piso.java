package poo.multiv;

public class Piso extends Vivienda {

    private int planta;
    private int puerta;
   
    public Piso(String calle, int superficieEnMetros, int planta, int puerta) {
        super(calle, superficieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }
   
    public int getPlanta() {
        return planta;
    }
    public void setPlanta(int planta) {
        this.planta = planta;
    }
    public int getPuerta() {
        return puerta;
    }
    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }
    @Override
    public String toString() {
        return "Piso [planta=" + planta + ", puerta=" + puerta + ", toString()=" + super.toString() + "]";
    }

    

  
    


}
