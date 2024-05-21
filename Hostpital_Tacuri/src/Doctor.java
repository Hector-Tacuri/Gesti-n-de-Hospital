import java.util.ArrayList;
import java.util.List;

public class Doctor extends Persona implements GestionCitas {
    private final Especialidad especialidad;
    private List<Paciente> pacientes;
    private List<CitaMedica> citasMedicas;

    public Doctor(String nombre, String identificacion, String direccion, Especialidad especialidad) {
        super(nombre, identificacion, direccion);
        this.especialidad = especialidad;
        this.pacientes = new ArrayList<>();
        this.citasMedicas = new ArrayList<>();
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public List<CitaMedica> getCitasMedicas() {
        return citasMedicas;
    }

    @Override
    public void programarCita(Date fecha, Time hora, String motivo) {
        // Implementar lógica para programar cita
    }

    @Override
    public void cancelarCita(CitaMedica cita) {
        // Implementar lógica para cancelar cita
    }

    @Override
    public void realizarCita(CitaMedica cita) {
        // Implementar lógica para realizar cita
    }

    public void asignarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }
}