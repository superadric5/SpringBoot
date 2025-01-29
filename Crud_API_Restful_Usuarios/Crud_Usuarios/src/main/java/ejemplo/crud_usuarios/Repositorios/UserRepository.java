package ejemplo.crud_usuarios.Repositorios;

import ejemplo.crud_usuarios.Modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Usuario, Integer> {
}
