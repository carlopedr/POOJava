package poo.Ejemplo1;

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
        this.km = 0;
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
        if (km > this.km) {
            this.km = km;
        } else
            System.out.println("No se puede actualizar km");

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

    public int getAnio() {
        return anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public void anadirKm(int km) {
        
        if (km > 0) {
            this.km += km;
        } else {
            System.out.println("Error: km negativo");
        }
    }

    @Override
    public String toString() {
        return "CocheV2 [marca=" + marca + ", color=" + color + ", km=" + km + ", precio=" + precio
                + ", factorContaminacion=" + factorContaminacion + ", anio=" + anio + ", matricula=" + matricula
                + ", impuestoMatriculacion=" + impuestoMatriculacion + ", dniTitular=" + dniTitular + ", getMarca()="
                + getMarca() + ", getColor()=" + getColor() + ", getKm()=" + getKm() + ", getPrecio()=" + getPrecio()
                + ", getFactorContaminacion()=" + getFactorContaminacion() + ", getAnio()=" + getAnio()
                + ", getMatricula()=" + getMatricula() + ", getImpuestoMatriculacion()=" + getImpuestoMatriculacion()
                + ", getDniTitular()=" + getDniTitular() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

   
    

}
