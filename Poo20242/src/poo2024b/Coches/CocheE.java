package Coches;

public class CocheE {
    //Atributos
    private String marca;
    private String color;
    private String matricula;
    private int cilindrada;

    //Constructores
   

    //Métodos getter y setter

   

    public CocheE(String marca, String color, String matricula, int cilindrada) {
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }

    public CocheE() {
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    //Métodos
    //Visibilidad Retorno nombreMetodo(<Argumentos>)
    public void decirSiEsMetalizado(){
        if(color.equals("Negro")){
            System.out.println("Es metalizado");
        }
        else{
            System.out.println("No es metalizado");
        }

    }

    public int decirCilindrada(){
        return cilindrada;
    }

    public void cambiarColor(String color){
        this.color=color;
    }

}
