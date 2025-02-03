package ejemplo.crud_usuarios.Repositorios;

import ejemplo.crud_usuarios.Modelo.Ejemplar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EjemplarRepository extends CrudRepository<Ejemplar, Integer> {

}
