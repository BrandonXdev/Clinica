
package consultas;

import java.time.LocalDate;
import java.time.LocalTime;
import personas.Medico;
import personas.Paciente;
import asistencias.Asistencia;


public class Consulta {
    private Medico medico;
    private Paciente[] pacientes;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private int duracion;
    private Asistencia[] asistencias;

    public Medico getMedico() {
        return medico;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public Consulta(Medico medico, int capacidad, LocalDate fecha, LocalTime horaInicio, int duracion) {
        this.medico = medico;
        this.pacientes = new Paciente[capacidad];
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.asistencias = new Asistencia[capacidad];
    }
    
    public void agregarPaciente(Paciente paciente){
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] == null) {
                pacientes[i] = paciente;
                break;
            }
        }
    }
    
    public boolean registrarAsistencia(Paciente paciente){
        for (int i = 0; i < asistencias.length; i++) {
            if (asistencias[i] == null) {
                asistencias[i] = new Asistencia(paciente, true);
                return true;
            }
        }
        return false;
    }
    
    public int contarPacientes(){
        int contador = 0;
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] != null) {
                contador++;  
            }
        }
        return contador;
    }
    
    public boolean espaciosDisponibles(){
         for (int i = 0; i < pacientes.length; i++) {
             if (pacientes[i] == null) {
                 return true;
             }
        }
         return false;
    }
    
    public double calcularPorcentajeAsistencia() {

    int total = 0;
    int asistidos = 0;

    for (int i = 0; i < asistencias.length; i++) {
        if (asistencias[i] != null) {
            total++;

            if (asistencias[i].isAsistio()) {
                asistidos++;
            }
        }
    }

    if (total == 0) {
        return 0;
    }

    return (asistidos * 100.0) / total;
}

    @Override
    public String toString() {
        return "Medico: " + medico + "\nCapacidad: " + 
                pacientes.length + "\nFecha: " + fecha + "\nHora de inicio: " + 
                horaInicio + "\nDuración: " + duracion;
    } 
}
