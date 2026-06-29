
package asistencias;

import personas.Paciente;

public class Asistencia {
    private Paciente paciente;
    private boolean asistio;

    public Paciente getPaciente() {
        return paciente;
    }

    public boolean isAsistio() {
        return asistio;
    }

    public Asistencia(Paciente paciente, boolean asistio) {
        this.paciente = paciente;
        this.asistio = asistio;
    }

    @Override
    public String toString() {
        return  "Paciente: " + paciente + "\nasistio: " + asistio;
    }
    
}
