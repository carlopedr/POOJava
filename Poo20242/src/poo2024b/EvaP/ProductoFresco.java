package EvaP;

public class ProductoFresco extends Producto implements IMuestraDatos {
    private int fechaEnvasado;
    private String pais;
    
    public ProductoFresco(int fechaCaducidad, int lote, int fechaEnvasado, String pais) {
        super(fechaCaducidad, lote);
        this.fechaEnvasado = fechaEnvasado;
        this.pais = pais;
    }

    public ProductoFresco() {
    }

    public int getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(int fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "ProductoFresco [fechaEnvasado=" + fechaEnvasado + ", pais=" + pais + "]"+" "+super.toString();
    }
    @Override
    public boolean verificarFechaCaducidad(int fechaActual){
        System.out.println("Metodo desarrollado en ProductoFresco");
        return true;
    }

    @Override
    public void muestraPais() {
        System.out.println("Pais de Productos frescos");
    }

    @Override
    public void muestraFechaCaducidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'muestraFechaCaducidad'");
    };

}
