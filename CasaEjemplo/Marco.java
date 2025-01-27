package CasaEjemplo;

import org.springframework.stereotype.Component;

@Component
public class Marco {
    private String material;
    private float tamano;

    public Marco() {
        this.material = "";
        this.tamano = 0;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Marco{" +
                "material='" + material + '\'' +
                ", tamano=" + tamano +
                '}';
    }
}
