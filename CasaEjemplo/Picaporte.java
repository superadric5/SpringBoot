package CasaEjemplo;

import org.springframework.stereotype.Component;

@Component
public class Picaporte {
    private String material;
    private String forma;

    public Picaporte() {
        this.material = "";
        this.forma = "";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Picaporte{" +
                "material='" + material + '\'' +
                ", forma='" + forma + '\'' +
                '}';
    }
}
