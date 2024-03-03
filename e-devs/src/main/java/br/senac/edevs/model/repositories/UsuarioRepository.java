package br.senac.edevs.model.repositories;

import br.senac.edevs.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

//    Usuario findByLoginAndPassword(String login, String password);
     Usuario findByEmail(String email);
     List<Usuario> findAll();
}
