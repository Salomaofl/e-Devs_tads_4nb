package br.senac.edevs.Service.Usuario;


import br.senac.edevs.model.Usuario;
import br.senac.edevs.model.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UsusarioImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsusarioImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> ProcurarTodosUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario ProcurarUsuario(String email) {

        return usuarioRepository.findByEmail(email);
    }



}
