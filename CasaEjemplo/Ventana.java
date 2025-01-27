package CasaEjemplo;

import org.springframework.stereotype.Component;

@Component
public class Ventana {
    private float tamano;

    public Ventana() {
        this.tamano = 0;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Ventana{" +
                "tamano=" + tamano +
                '}';
    }
}
