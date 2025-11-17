
package GrupoMiercoles.poo.abs;

import java.time.LocalDate;

public class ConsultaGeneral extends ServicioVeterinario{
    
    private double costo;

    public ConsultaGeneral(LocalDate fecha, Mascota mascota, PersonalVeterinario veterinario) {
        super(fecha, mascota, veterinario);
        costo=50000;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }

    @Override
    public String generarInforme() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
