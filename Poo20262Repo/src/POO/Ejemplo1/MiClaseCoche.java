package POO.Ejemplo1;

public class MiClaseCoche {
    //Atributos
    String marca;
    String color;
    String matricula;
    int cilindrada;
    
    //Constructores
    public MiClaseCoche(String marca,String color,int cilindrada){
        this.marca=marca;
        this.color=color;
        this.cilindrada=cilindrada;
    }

    public MiClaseCoche(String marca, String color, String matricula, int cilindrada) {
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }
    
    
    
    //Métodos
    void dimeSiEsMetalizado(){
        if(color.equals("Black")){
            System.out.println("Es metalizado");
        }
        else{
            System.out.println("No es metalizado");
        }
    }
    
    void matricularCoche(String matriculaAPoner){
        matricula=matriculaAPoner;
    }

}
