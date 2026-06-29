
package personas;

import java.time.LocalDate;


public class Medico extends Persona{
    
    private String especialidad;
    private int aniosExperiencia;

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public Medico(String nombreCompleto, String identificacion, LocalDate fechaNacimiento,
            String telefono, String especialidad, int aniosExperiencia){
        super(nombreCompleto, identificacion, fechaNacimiento, telefono);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }  

    @Override
    public String toString() {
        return   "Especialidad: " + especialidad + 
                "\nAños de experiencia: " + aniosExperiencia;
    }
    
    
}
