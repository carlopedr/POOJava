package poo.multiv;

public class Chalet extends Vivienda  {
    private int numParcela;
    private boolean conPiscina;
    public Chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }
    public int getNumParcela() {
        return numParcela;
    }
    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }
    public boolean isConPiscina() {
        return conPiscina;
    }
    public void setConPiscina(boolean conPiscina) {
        this.conPiscina = conPiscina;
    }
    @Override
    public String toString() {
        return "Chalet [numParcela=" + numParcela + ", conPiscina=" + conPiscina + ", toString()=" + super.toString()
                + "]";
    }

    


}
