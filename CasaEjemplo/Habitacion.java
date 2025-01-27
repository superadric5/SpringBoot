package CasaEjemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Habitacion {
    @Autowired
    private Mueble mueble;
    @Autowired
    private Puerta puerta;
    @Autowired
    private Ventana ventana;

    private int tamano;

    public Habitacion(Mueble mueble, Puerta puerta, Ventana ventana) {
        this.mueble = mueble;
        this.puerta = puerta;
        this.ventana = ventana;
        this.tamano = 0;
    }

    public Mueble getMueble() {
        return mueble;
    }

    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "mueble=" + mueble +
                ", puerta=" + puerta +
                ", ventana=" + ventana +
                ", tamano=" + tamano +
                '}';
    }
}
