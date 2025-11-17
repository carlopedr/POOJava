
package GrupoMartes.Exceptions;

import Ex.*;

public class TestEj1 {
    public static void main(String[] args) {
       Persona p = new Persona(24);
        try {
            System.out.println(p.tiempoJubilacion(45));
        } catch (EsMenorDeEdadException ex) {
            System.out.println(ex.getMessage());
        } catch (YaEstaJubiladoException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
