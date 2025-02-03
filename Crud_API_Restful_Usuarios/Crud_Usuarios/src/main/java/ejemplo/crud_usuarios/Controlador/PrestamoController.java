package ejemplo.crud_usuarios.Controlador;

import ejemplo.crud_usuarios.Modelo.Prestamo;
import ejemplo.crud_usuarios.Repositorios.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prestamos")
@CacheConfig(cacheNames = "prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @GetMapping
    public ResponseEntity<Iterable<Prestamo>> getAllPrestamos() {
        Iterable<Prestamo> prestamos = prestamoRepository.findAll();
        return ResponseEntity.ok(prestamos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> getPrestamoById(@PathVariable("id") Integer id) {
        Prestamo prestamo = prestamoRepository.findById(id).get();
        return ResponseEntity.ok(prestamo);
    }

    @PostMapping
    public ResponseEntity<Prestamo> insert(@RequestBody Prestamo prestamo) {
        Prestamo prestamoNuevo = prestamoRepository.save(prestamo);
        return ResponseEntity.ok(prestamoNuevo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Prestamo> delete(@PathVariable Integer id) {
        Prestamo prestamo = prestamoRepository.findById(id).get();
        prestamoRepository.delete(prestamo);
        return ResponseEntity.ok(prestamo);
    }
}
