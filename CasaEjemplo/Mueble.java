package CasaEjemplo;

import org.springframework.stereotype.Component;

@Component
public class Mueble {
    private String nombre;
    private String material;
    private String color;

    public Mueble() {
        this.nombre = "";
        this.material = "";
        this.color = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Mueble{" +
                "nombre='" + nombre + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
