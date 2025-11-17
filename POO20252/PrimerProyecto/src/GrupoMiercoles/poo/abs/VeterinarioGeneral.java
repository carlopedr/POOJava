package GrupoMiercoles.poo.abs;

public class VeterinarioGeneral extends PersonalVeterinario {

    public VeterinarioGeneral(String nombre, String id, String especialidad) {
        super(nombre, id, especialidad);
    }
    
    public VeterinarioGeneral(String nombre, String id) {
        super(nombre, id, "");
    }

    @Override
    public void atenderMascota(Mascota m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void registrarObservaciones(String obs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
