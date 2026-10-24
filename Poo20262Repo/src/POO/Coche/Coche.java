
package POO.Coche;


public class Coche {
    private String marca;
    private String color;
    private int km;
    private double precio;
    private double factorContaminacion;
    private int anio;
    private String matricula;
    private double impuestoMatricula;
    private String dniTitular;
    private double impuestoContaminacion;

    public Coche(String marca, String color, double precio, double factorContaminacion, int anio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.factorContaminacion = factorContaminacion;
        this.anio = anio;
        this.km=0;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKm(int km) {
        if(km>this.km)
            this.km = km;
        else
            System.out.println("km menor");
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setImpuestoMatricula(double impuestoMatricula) {
        this.impuestoMatricula = impuestoMatricula;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getKm() {
        return km;
    }

    public double getPrecio() {
        return precio;
    }

    public double getFactorContaminacion() {
        return factorContaminacion;
    }

    public int getAnio() {
        return anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getImpuestoMatricula() {
        return impuestoMatricula;
    }

    public String getDniTitular() {
        return dniTitular;
    }

      
    public void agregarKm(int km){
        this.km+=km;
    }
    
    public void calcularImpuestoContaminacion(){
        if(factorContaminacion<5){
            impuestoContaminacion=precio*0.02;
        }
        else if(factorContaminacion<10)
            impuestoContaminacion=precio*0.05;
        else
            impuestoContaminacion=precio*0.1;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", color=" + color + ", km=" + km + ", precio=" + precio + ", factorContaminacion=" + factorContaminacion + ", anio=" + anio + ", matricula=" + matricula + ", impuestoMatricula=" + impuestoMatricula + ", dniTitular=" + dniTitular + ", impuestoContaminacion=" + impuestoContaminacion + '}';
    }
    
    
    
    
    
    
    

}
