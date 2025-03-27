/*Implementar una clase Moto para que la guardamos la velocidad. 
Tendremos dos métodos uno para acelerar (aumentamos su velocidad en una cantidad 
variable) y otro para frenar (disminuimos la velocidad en una cantidad variable). 
Generar una clase con un main y crear una moto, y acelerarla y
frenarla para probar la clase.
Hay que controlar que la moto no puede tener una velocidad negativa ni tener una
velocidad superior a 150
*/

package poo.moto1;

public class Moto {
    private int velocidad;

    public Moto(int velocidad) {
        if(velocidad>=0 && velocidad<=150)
            this.velocidad = velocidad;
        else
            System.out.println("Velocidad no valida!!");
    }

    public Moto() {
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if(velocidad>=0 && velocidad<=150)
            this.velocidad = velocidad;
        else
            System.out.println("Velocidad no valida!!");
    }

    public void acelerar(int aceleracion){
        this.velocidad+=aceleracion;
    }

    

}
