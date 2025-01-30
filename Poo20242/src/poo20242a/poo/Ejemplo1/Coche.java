package poo.Ejemplo1;

public class Coche {
    //Atributos
    public String marca;
    public String color;
    public String matricula;
    public int cilindrada;
    
    //Constructores
    public Coche(String marca,String color,String matricula,int cilindrada){
        this.marca=marca;
        this.color=color;
        this.matricula=matricula;
        this.cilindrada=cilindrada;
    }

    public Coche(){

    }
    
    //Métodos

    //Visibilidad Retorno nombreMétodo (argumentos)

    public void decirSiEsMetalizado(){
        if(color.equals("Negro")){
            System.out.println("Color metalizado");}
        else{
            System.out.println("Color NO metalizado");

        }
    }

    public void matricularCoche(String matricula){
        this.matricula=matricula;
    }
    
    public String decirMarca(){
        return this.marca;

    }

}
