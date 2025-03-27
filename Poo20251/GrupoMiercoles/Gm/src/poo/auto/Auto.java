package poo.auto;

public class Auto {
    //Atributos
    private String marca;
    private String color;
    private String placa;
    private int cilindraje;

    //Constructores

    //Getters y Setters

    
    //Métodos

    public void dimeSiEsMetalizado(){
        if(color.equals("Negro")){
            System.out.println("Es metalizado");
        }else{
            System.out.println("No es metalizado");
        }
    } 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    public Auto() {
    }

    public Auto(String marca, String color, String placa, int cilindraje) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.cilindraje = cilindraje;
    }

    public void actualizarCilindraje(int cilindraje){
        this.cilindraje=cilindraje;
    }
}
