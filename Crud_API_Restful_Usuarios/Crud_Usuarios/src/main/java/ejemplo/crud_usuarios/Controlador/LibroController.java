package ejemplo.crud_usuarios.Controlador;

import ejemplo.crud_usuarios.Modelo.Libro;
import ejemplo.crud_usuarios.Repositorios.LibroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libros")
@CacheConfig(cacheNames = "libros")
public class LibroController {

    @Autowired
    private LibroRepository libroRepository;

    @GetMapping
    public ResponseEntity<Iterable<Libro>> getLibros() {
        Iterable<Libro> libros = libroRepository.findAll();
        return ResponseEntity.ok(libros);
    }

    @GetMapping("/{isbn}")
    @Cacheable
    public ResponseEntity<Libro> getLibroById(@PathVariable String isbn) {
        Libro libro = libroRepository.findById(isbn).get();
        return ResponseEntity.ok(libro);
    }

    @PostMapping
    public ResponseEntity<Libro> insert(@Valid @RequestBody Libro libro) {
        libro = libroRepository.save(libro);
        return ResponseEntity.ok(libro);
    }

    @DeleteMapping("/{isbn}")
    public ResponseEntity<Libro> delete(@PathVariable String isbn) {
        Libro libro = libroRepository.findById(isbn).get();
        libroRepository.delete(libro);
        return ResponseEntity.ok(libro);
    }
}
