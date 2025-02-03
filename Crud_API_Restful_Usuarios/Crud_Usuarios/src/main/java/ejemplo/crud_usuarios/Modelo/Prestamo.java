package ejemplo.crud_usuarios.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "prestamo")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "ejemplar_id", nullable = false)
    private Ejemplar ejemplar;

    @Column(name = "fecha_devolucion")
    private LocalDate fecha_devolucion;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fecha_inicio;



    public Prestamo() {
    }

    public Prestamo(Usuario usuario, Ejemplar ejemplar) {
        this.usuario = usuario;
        this.ejemplar = ejemplar;
        this.fecha_inicio = LocalDate.now();
        this.fecha_devolucion = LocalDate.now().plusDays(15);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fechaInicio) {
        this.fecha_inicio = fechaInicio;
    }

    public LocalDate getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(LocalDate fechaDevolucion) {
        this.fecha_devolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", ejemplar=" + ejemplar +
                ", fecha_devolucion=" + fecha_devolucion +
                ", fecha_inicio=" + fecha_inicio +
                '}';
    }
}