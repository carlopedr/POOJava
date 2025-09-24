
package GrupoMartes.Lang.poo1;

public class Moto {
    int velocidad;

    public Moto(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void acelerar(int aceleracion){
        if((velocidad+aceleracion)>150){
            velocidad = 150;
        }
        else{
            velocidad+=aceleracion;
        }
        
    }
     public void frenar(int frenado){
        if((velocidad-frenado)<0){
            velocidad = 0;
        }
        else{
            velocidad-=frenado;
        }
        
    }
     
     public void showVelocidad(){
         System.out.println("Velocidad actual: "+velocidad);
     }
}
