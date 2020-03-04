package mx.com.springboot.app.usuarios.models.daos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import mx.com.springboot.app.usuarios.models.entities.Usuario;

@RepositoryRestResource(path = "usuarios")
public interface IUsuarioDAO extends PagingAndSortingRepository<Usuario, Long> {
	
	//This annotation it's when we use @RepositoryRestResource
	@RestResource(path = "findUsername")
	public Usuario findByUsernameAndEnabled(@Param("usuario") String username, @Param("enabled") Boolean enabled);
	//El @Param de query sirve para que se llame así el parametro en el servicio
}
