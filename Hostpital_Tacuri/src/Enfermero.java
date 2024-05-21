import java.util.ArrayList;
import java.util.List;

public class Enfermero extends Persona {
    private List<Doctor> doctores;
    private List<Paciente> pacientes;

    public Enfermero(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
        this.doctores = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    public List<Doctor> getDoctores() {
        return doctores;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void asistirDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public void asistirPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }
}