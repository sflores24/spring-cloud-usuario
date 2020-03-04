package mx.com.springboot.app.usuarios.models.daos;

import org.springframework.data.repository.PagingAndSortingRepository;

import mx.com.springboot.app.usuarios.models.entities.Usuario;

public interface IUsuarioDAO extends PagingAndSortingRepository<Usuario, Long> {
	public Usuario findByUsernameAndEnabled(String username, Boolean enabled);
}
