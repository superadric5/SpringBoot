package ejemplo.crud_usuarios.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "ejemplar")
public class Ejemplar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "isbn", nullable = false)
    @NotNull(message = "No se puede introducir un libro nulo")
    @JsonBackReference
    private Libro isbn;

    @ColumnDefault("'Disponible'")
    @Column(name = "estado", length = 50)
    @Pattern(regexp = "^(disponible|prestado|dañado)$", message = "El estado debe ser 'disponible', 'prestado' o 'dañado'.")
    private String estado;

    public Ejemplar() {
    }

    public Ejemplar(Libro isbn, String estado) {
        this.isbn = isbn;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Libro getIsbn() {
        return isbn;
    }

    public void setIsbn(Libro isbn) {
        this.isbn = isbn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "id=" + id +
                ", isbn=" + isbn +
                ", estado='" + estado + '\'' +
                '}';
    }
}