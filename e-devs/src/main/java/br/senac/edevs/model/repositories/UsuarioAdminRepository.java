package br.senac.edevs.model.repositories;

import br.senac.edevs.model.entities.UsuarioAdmin;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioAdminRepository extends CrudRepository<UsuarioAdmin, Integer> {

    UsuarioAdmin findByLoginAndPassword(String login, String password);
}
