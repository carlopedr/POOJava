
package GrupoMiercoles.poo.abs;

/**
 *
 * @author HP
 */
public class VeterinarioEspecialista extends PersonalVeterinario{

    public VeterinarioEspecialista(String nombre, String id, String especialidad) {
        super(nombre, id, especialidad);
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
