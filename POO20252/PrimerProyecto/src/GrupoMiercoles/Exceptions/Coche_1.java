package GrupoMiercoles.Exceptions;

import GrupoMartes.Exceptions.*;
import Ex.*;

public class Coche_1  {

    private String marca;
    private String modelo;
    private int velocidad;

    public Coche_1(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar(int cuanto) throws ExcesoVelocidadException {
        this.velocidad = this.velocidad + cuanto;
        if(this.velocidad>120){
            ExcesoVelocidadException e = new ExcesoVelocidadException();
            throw e;
        }
    }
}
