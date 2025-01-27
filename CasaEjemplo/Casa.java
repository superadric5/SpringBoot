package CasaEjemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Casa {
    @Autowired
    private Habitacion habitacion;
    private String direccion;

    public Casa(Habitacion habitacion) {
        this.habitacion = habitacion;
        this.direccion = "";
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "habitacion=" + habitacion +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
