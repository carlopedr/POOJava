package Coches;

public class CocheV2 {
    private String marca;
    private String color;
    private int km;
    private double precio;
    private double factorContaminacion;
    private int anio;
    private String matricula;
    private double impuestoMatriculacion;
    private String dniTitular;

    
    public CocheV2(String marca, String color, double precio, double factorContaminacion, int anio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.factorContaminacion = factorContaminacion;
        this.anio = anio;
        this.km=0;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        if (this.km < km) {
            this.km = km;
        } else
            System.out.println("Km menor al actual");

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getFactorContaminacion() {
        return factorContaminacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnio() {
        return anio;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion(double impuestoMatriculacion) {
        this.impuestoMatriculacion = impuestoMatriculacion;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

}
