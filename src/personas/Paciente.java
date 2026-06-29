
package personas;

import java.time.LocalDate;



public class Paciente extends Persona{
    
    public Paciente(String nombreCompleto, String identificacion, LocalDate fechaNacimiento, String telefono){
         super(nombreCompleto, identificacion, fechaNacimiento, telefono);  
    }   
}
