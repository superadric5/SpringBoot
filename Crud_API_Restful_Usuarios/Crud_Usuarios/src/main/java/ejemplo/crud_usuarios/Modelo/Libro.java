package ejemplo.crud_usuarios.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @Column(name = "isbn")
    @Pattern(regexp = "^[0-9]{13}$", message = "error en isbn")
    private String isbn;

    @Column(name = "titulo",nullable = false, length = 200)
    @Pattern(regexp = "^[\\p{L}0-9 ]{1,200}$", message = "error en el titulo")
    private String titulo;

    @Column(name = "autor", nullable = false, length = 100)
    @Pattern(regexp = "^[\\p{L}0-9 ]{1,100}$", message = "error en el autor")
    private String autor;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}