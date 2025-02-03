package ejemplo.crud_usuarios.Repositorios;

import ejemplo.crud_usuarios.Modelo.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends CrudRepository<Libro, String> {
}
