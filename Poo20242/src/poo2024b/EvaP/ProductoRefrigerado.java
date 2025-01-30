package EvaP;

public class ProductoRefrigerado extends Producto implements IMuestraDatos {
    private int codigoOrgSuper;
    private int fechaEnvasado;
    private double temperaturaMantenimiento;
    public ProductoRefrigerado(int fechaCaducidad, int lote, int codigoOrgSuper, int fechaEnvasado,
            double temperaturaMantenimiento) {
        super(fechaCaducidad, lote);
        this.codigoOrgSuper = codigoOrgSuper;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }
    public ProductoRefrigerado() {
    }
    public int getCodigoOrgSuper() {
        return codigoOrgSuper;
    }
    public void setCodigoOrgSuper(int codigoOrgSuper) {
        this.codigoOrgSuper = codigoOrgSuper;
    }
    public int getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(int fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }
    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }
    @Override
    public String toString() {
        return "ProductoRefrigerado [codigoOrgSuper=" + codigoOrgSuper + ", fechaEnvasado=" + fechaEnvasado
                + ", temperaturaMantenimiento=" + temperaturaMantenimiento + ", getFechaCaducidad()="
                + getFechaCaducidad() + ", getLote()=" + getLote() + ", getCodigoOrgSuper()=" + getCodigoOrgSuper()
                + ", getFechaEnvasado()=" + getFechaEnvasado() + ", getTemperaturaMantenimiento()="
                + getTemperaturaMantenimiento() + "]";
    }
    @Override
    public boolean verificarFechaCaducidad(int fechaActual) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificarFechaCaducidad'");
    }
    @Override
    public void muestraPais() {
        System.out.println("Pais de Productos refrigerados");
    }
    @Override
    public void muestraFechaCaducidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'muestraFechaCaducidad'");
    }
    


}
