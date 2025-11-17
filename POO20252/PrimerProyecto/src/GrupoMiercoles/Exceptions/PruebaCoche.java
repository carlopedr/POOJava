package GrupoMiercoles.Exceptions;

import Ex.*;


public class PruebaCoche {
    public static void main(String[] args) {
        Coche c = new Coche("OPEL", "INSIGNIA");
        //c.acelerar(0);
        try {
            c.acelerar(180);
        } catch (ExcesoVelocidadException ex) {
            //System.getLogger(PruebaCoche.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            System.out.println(ex.getMessage());
        }
    }
}
