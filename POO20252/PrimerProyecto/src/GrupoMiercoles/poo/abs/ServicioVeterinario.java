package GrupoMiercoles.poo.abs;

import java.time.LocalDate;

public abstract class ServicioVeterinario {
    private LocalDate fecha;
    private Mascota mascota;
    private PersonalVeterinario	veterinario;

    public ServicioVeterinario(LocalDate fecha, Mascota mascota, PersonalVeterinario veterinario) {
        this.fecha = fecha;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public PersonalVeterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(PersonalVeterinario veterinario) {
        this.veterinario = veterinario;
    }
    
    public abstract double calcularCosto();
    public abstract String generarInforme();


}
