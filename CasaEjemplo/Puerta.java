package CasaEjemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Puerta {
    private String material;
    private String color;
    @Autowired
    private Marco marco;
    @Autowired
    private Picaporte picaporte;

    public Puerta(Marco marco, Picaporte picaporte) {
        this.material = "";
        this.color = "";
        this.marco = marco;
        this.picaporte = picaporte;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Marco getMarco() {
        return marco;
    }

    public void setMarco(Marco marco) {
        this.marco = marco;
    }

    public Picaporte getPicaporte() {
        return picaporte;
    }

    public void setPicaporte(Picaporte picaporte) {
        this.picaporte = picaporte;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", marco=" + marco +
                ", picaporte=" + picaporte +
                '}';
    }
}
