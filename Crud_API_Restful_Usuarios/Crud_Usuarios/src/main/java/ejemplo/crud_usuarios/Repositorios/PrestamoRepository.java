package ejemplo.crud_usuarios.Repositorios;

import ejemplo.crud_usuarios.Modelo.Prestamo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends CrudRepository<Prestamo, Integer> {

}
