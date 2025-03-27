package poo.ejm01;

public class AutoPrivate {
    //Atributos
    private String placa;
    private String color;
    private String marca;
    private int modelo;
    private int cilindraje;
    private boolean estado;

    //Constructores
    
    //Métodos
    void dimeSiEsMetalizado(){
        if(color.equals("Negro"))
            System.out.println("Es metalizado!");
        else
            System.out.println("No es metalizado!");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    AutoPrivate(String placa, String color, String marca, int modelo, int cilindraje) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    AutoPrivate(String placa, String color, String marca, int modelo, int cilindraje, boolean estado) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.estado = estado;
    }

    public AutoPrivate() {
    }

    void pintarAuto (String color){
        this.color=color;
    }

}
