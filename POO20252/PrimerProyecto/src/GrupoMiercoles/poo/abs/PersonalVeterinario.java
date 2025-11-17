
package GrupoMiercoles.poo.abs;

public abstract class PersonalVeterinario implements IAtendible{
    private String nombre;
    private String id;
    private String especialidad;

    public PersonalVeterinario(String nombre, String id, String especialidad) {
        this.nombre = nombre;
        this.id = id;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    


}
