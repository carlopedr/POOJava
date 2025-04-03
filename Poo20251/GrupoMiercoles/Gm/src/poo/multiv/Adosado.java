package poo.multiv;

public class Adosado extends Vivienda {
    private int numPlantas;

    public Adosado(String calle, int superficieEnMetros, int numPlantas) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }

    @Override
    public String toString() {
        return "Adosado [numPlantas=" + numPlantas + ", toString()=" + super.toString() + "]";
    }

    



}
