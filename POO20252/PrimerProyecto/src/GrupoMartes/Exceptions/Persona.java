
package GrupoMartes.Exceptions;

import Ex.*;

public class Persona {
    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int tiempoJubilacion(int edad) throws EsMenorDeEdadException, YaEstaJubiladoException{
        if(edad<18){
            //return -1;
            EsMenorDeEdadException e = new  EsMenorDeEdadException();
            throw e;
        }else if(edad>= 65){
            YaEstaJubiladoException e = new YaEstaJubiladoException();
            throw e;
        }
        else{
            return (65-edad);
        }
    }
}
