package Coches;

public class Coche {
    //Atributos
    public String marca;
    public String color;
    public String matricula;
    public int cilindrada;

    //Constructores
    public Coche(String marca, String color, String matricula, int cilindrada){
        this.marca=marca;
        this.color=color;
        this.matricula=matricula;
        this.cilindrada=cilindrada;
    }
    
    public Coche(){
        
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
