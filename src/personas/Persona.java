
package personas;

import java.time.LocalDate;
import java.time.Period;


public abstract class  Persona {
    private String identificacion;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private String numeroTelefono;
    
    public String getIdentificacion(){
        return identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    
    public int getEdad(){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears(); 
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Persona(String identificacion, String nombreCompleto, LocalDate fechaNacimiento, String numeroTelefono) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Identificación: " + identificacion + "\n Nombre: " + nombreCompleto + "\n Edad" + fechaNacimiento + ", numeroTelefono=" + numeroTelefono + '}';
    }
    
    
   
    
}
