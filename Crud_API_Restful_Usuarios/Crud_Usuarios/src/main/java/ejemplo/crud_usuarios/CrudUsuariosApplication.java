package ejemplo.crud_usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CrudUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudUsuariosApplication.class, args);
	}

}
