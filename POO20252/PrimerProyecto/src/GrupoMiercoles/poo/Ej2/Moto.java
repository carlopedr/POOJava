/*Implementar una clase Moto con los siguientes atributos:
velocidad, marca, id. 
Tendremos los siguientes métodos
- acelerar (aumentamos su velocidad en una cantidad variable)
- frenar (disminuimos la velocidad en una cantidad variable)
- devolverVelocidadActual
- Mostrar los atributos de la moto
Generar una clase con un main y crear una moto, 
y acelerarla, frenarla y demas métodos de la clase.
Hay que controlar que la moto no puede tener una velocidad negativa 
ni tener unavelocidad superior a 150*/
package GrupoMiercoles.poo.Ej2;

public class Moto {
    String id;
    String marca;
    int velocidad;
    
    public Moto(String id,String marca,int velocidad){
        this.id=id;
        this.marca=marca;
        this.velocidad=velocidad;
    }
     public Moto(String id,String marca){
        this.id=id;
        this.marca=marca;
        this.velocidad=0;
    }
     
    public int devolverVelocidadActual(){
        return velocidad;
    }
    
    
    
}
