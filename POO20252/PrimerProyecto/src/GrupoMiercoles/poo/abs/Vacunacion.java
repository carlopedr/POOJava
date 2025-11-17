
package GrupoMiercoles.poo.abs;

import java.time.LocalDate;

public class Vacunacion extends ServicioVeterinario{
    private double costo;

    public Vacunacion(double costo, LocalDate fecha, Mascota mascota, PersonalVeterinario veterinario) {
        super(fecha, mascota, veterinario);
        this.costo = costo;
    }

    public Vacunacion(LocalDate fecha, Mascota mascota, PersonalVeterinario veterinario) {
        super(fecha, mascota, veterinario);
    }

    @Override
    public double calcularCosto() {
        return this.costo;
    }

    @Override
    public String generarInforme() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
