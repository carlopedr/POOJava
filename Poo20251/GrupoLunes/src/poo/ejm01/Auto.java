package poo.ejm01;

public class Auto {
    //Atributos
    String placa;
    String color;
    String marca;
    int modelo;
    int cilindraje;
    boolean estado;

    //Constructores
    
    //Métodos
    void dimeSiEsMetalizado(){
        if(color.equals("Negro"))
            System.out.println("Es metalizado!");
        else
            System.out.println("No es metalizado!");
    }

    public Auto(String placa, String color, String marca, int modelo, int cilindraje) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    public Auto(String placa, String color, String marca, int modelo, int cilindraje, boolean estado) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.estado = estado;
    }

    public Auto() {
    }

    void pintarAuto (String color){
        this.color=color;
    }

}
