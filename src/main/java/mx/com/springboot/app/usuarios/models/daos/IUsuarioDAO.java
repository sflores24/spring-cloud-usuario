package mx.com.springboot.app.usuarios.models.daos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mx.com.springboot.app.usuarios.models.entities.Usuario;

@RepositoryRestResource(path = "usuarios")
public interface IUsuarioDAO extends PagingAndSortingRepository<Usuario, Long> {
	public Usuario findByUsernameAndEnabled(String username, Boolean enabled);
}
