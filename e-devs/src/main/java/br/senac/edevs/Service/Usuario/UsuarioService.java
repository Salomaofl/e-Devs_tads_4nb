package br.senac.edevs.Service.Usuario;

import br.senac.edevs.model.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> ProcurarTodosUsuario();
    Usuario ProcurarUsuario(String email);
}
