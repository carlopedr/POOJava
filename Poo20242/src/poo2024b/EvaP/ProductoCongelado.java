package EvaP;

public class ProductoCongelado extends Producto implements IMuestraDatos{
    private int fechaEnvasado;
    private String pais;
    private double temperaturaMantenimiento;
    public ProductoCongelado(int fechaCaducidad, int lote, int fechaEnvasado, String pais,
            double temperaturaMantenimiento) {
        super(fechaCaducidad, lote);
        this.fechaEnvasado = fechaEnvasado;
        this.pais = pais;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }
    public ProductoCongelado() {
       
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
    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }
    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }
    @Override
    public String toString() {
        return "ProductoCongelado [fechaEnvasado=" + fechaEnvasado + ", pais=" + pais + ", temperaturaMantenimiento="
                + temperaturaMantenimiento + ", getFechaCaducidad()=" + getFechaCaducidad() + ", getLote()=" + getLote()
                + ", getFechaEnvasado()=" + getFechaEnvasado() + ", getPais()=" + getPais()
                + ", getTemperaturaMantenimiento()=" + getTemperaturaMantenimiento() + "]";
    }
    @Override
    public boolean verificarFechaCaducidad(int fechaActual) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificarFechaCaducidad'");
    }
    @Override
    public void muestraPais() {
        System.out.println("Pais de Productos congelados");
    }
    @Override
    public void muestraFechaCaducidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'muestraFechaCaducidad'");
    }



}
