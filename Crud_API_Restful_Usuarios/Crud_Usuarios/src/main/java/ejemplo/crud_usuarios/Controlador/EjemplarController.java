package ejemplo.crud_usuarios.Controlador;

import ejemplo.crud_usuarios.Modelo.Ejemplar;
import ejemplo.crud_usuarios.Repositorios.EjemplarRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ejemplares")
@CacheConfig(cacheNames = "ejemplares")
public class EjemplarController {

    @Autowired
    private EjemplarRepository repository;

    @GetMapping
    public ResponseEntity<Iterable<Ejemplar>> getAll() {
        Iterable<Ejemplar> ejemplares = repository.findAll();
        return ResponseEntity.ok(ejemplares);
    }

    @GetMapping("/{id}")
    @Cacheable
    public ResponseEntity<Ejemplar> getById(@PathVariable Integer id) {
        Ejemplar ejemplares = repository.findById(id).get();
        return ResponseEntity.ok(ejemplares);
    }

    @PostMapping()
    public ResponseEntity<Ejemplar> insert(@Valid @RequestBody Ejemplar ejemplar) {
        ejemplar = repository.save(ejemplar);
        return ResponseEntity.ok(ejemplar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Ejemplar> delete(@PathVariable Integer id) {
        Ejemplar ejemplar = repository.findById(id).get();
        repository.delete(ejemplar);
        return ResponseEntity.ok(ejemplar);
    }

}
