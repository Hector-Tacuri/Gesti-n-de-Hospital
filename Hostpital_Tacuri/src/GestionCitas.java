public interface GestionCitas {
    void programarCita(Date fecha, Time hora, String motivo);
    void cancelarCita(CitaMedica cita);
    void realizarCita(CitaMedica cita);
}