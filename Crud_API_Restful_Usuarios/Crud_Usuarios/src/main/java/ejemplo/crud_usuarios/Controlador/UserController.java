package ejemplo.crud_usuarios.Controlador;

import ejemplo.crud_usuarios.Modelo.Usuario;
import ejemplo.crud_usuarios.Repositorios.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CacheConfig(cacheNames = "usuarios")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<Iterable<Usuario>> getAll() {
        Iterable<Usuario> usuarios = userRepository.findAll();
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/{id}")
    @Cacheable
    public ResponseEntity<Usuario> getById(@PathVariable Integer id) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Usuario usuario = userRepository.findById(id).get();
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    public ResponseEntity<Usuario> insert(@RequestBody Usuario usuario) {
        if (usuario.comprobarDNI() == true){
            usuario = userRepository.save(usuario);
            return ResponseEntity.ok(usuario);
        }
        return ResponseEntity.badRequest().body(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> delete(@PathVariable Integer id) {
        Usuario usuario = userRepository.findById(id).get();
        userRepository.delete(usuario);
        return ResponseEntity.ok(usuario);
    }

}
