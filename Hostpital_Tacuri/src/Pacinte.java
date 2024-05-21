import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private ExpedienteMedico expedienteMedico;
    private List<CitaMedica> citasMedicas;

    public Paciente(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
        this.citasMedicas = new ArrayList<>();
    }

    public ExpedienteMedico getExpedienteMedico() {
        return expedienteMedico;
    }

    public void setExpedienteMedico(ExpedienteMedico expedienteMedico) {
        this.expedienteMedico = expedienteMedico;
    }

    public List<CitaMedica> getCitasMedicas() {
        return citasMedicas;
    }

    public String obtenerHistorialMedico() {
        return expedienteMedico.getHistorial();
    }
}