package ejemplo.crud_usuarios.Modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "dni", nullable = false, length = 15)
    private String dni;

    @Column(name = "nombre", nullable = false, length = 100)
    @Pattern(regexp = "^[\\p{L}0-9 ]{1,100}$", message = "error en el nombre")
    private String nombre;

    @Column(name = "email", nullable = false, length = 100)
    @Pattern(regexp = "^[A-Za-z0-9]{1,50}@gmail\\.com$", message = "El correo debe ser un email válido de Gmail (ejemplo: usuario@gmail.com).")

    private String email;

    @Column(name = "password", nullable = false)
    @Pattern(regexp = "^[A-Za-z0-9]{4,12}$", message = "La contraseña debe ser alfanumérica y tener entre 4 y 12 caracteres.")

    private String password;

    @Lob
    @Column(name = "tipo", nullable = false)
    @Pattern(regexp = "^(normal|administrador)$", message = "El tipo debe ser 'normal' o 'administrador'.")
    private String tipo;

    @Column(name = "penalizacion_hasta")
    private LocalDate penalizacion_hasta;

    public Usuario() {
    }

    public Usuario(String dni, String nombre, String email, String tipo, String password, LocalDate penalizacion_hasta) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.tipo = tipo;
        this.password = password;
        this.penalizacion_hasta = penalizacion_hasta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getPenalizacion_hasta() {
        return penalizacion_hasta;
    }

    public void setPenalizacion_hasta(LocalDate penalizacionHasta) {
        this.penalizacion_hasta = penalizacionHasta;
    }

    public boolean comprobarDNI() {
        String dni = this.getDni();

        if (dni.matches("^[0-9]{8}[A-Za-z]$")){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", tipo='" + tipo + '\'' +
                ", penalizacion_hasta=" + penalizacion_hasta +
                '}';
    }
}