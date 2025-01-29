package ejemplo.crud_usuarios.Modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "dni", nullable = false, length = 15)
    private String dni;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Lob
    @Column(name = "tipo", nullable = false)
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

}