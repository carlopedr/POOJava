package GrupoMartes.Exceptions;

import Ex.*;

public class ExcesoVelocidadException extends Exception {
    public ExcesoVelocidadException() {
        super("¡Cuidado, error! Velocidad máxima alcanzada!");
    }
}