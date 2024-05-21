import java.util.Date;

public class CitaMedica {
    private Date fecha;
    private Time hora;
    private String motivo;
    private EstadoCita estado;
    private Paciente paciente;
    private Doctor doctor;

    public CitaMedica(Date fecha, Time hora, String motivo, Paciente paciente, Doctor doctor) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = EstadoCita.PROGRAMADA;
        this.paciente = paciente;
        this.doctor = doctor;
    }

    // Getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void actualizarEstado(EstadoCita nuevoEstado) {
        this.estado = nuevoEstado;
    }
}