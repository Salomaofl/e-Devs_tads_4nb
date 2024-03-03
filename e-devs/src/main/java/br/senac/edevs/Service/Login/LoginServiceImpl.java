package br.senac.edevs.Service.Login;

import br.senac.edevs.model.repositories.UsuarioRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    HttpSession httpSession;

    private final UsuarioRepository usuarioRepository;

    public LoginServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public Boolean login(String email, String password)
    {
//        List<String> UsuarioAutenticado;

        Integer role = usuarioRepository.findByEmail(email).getRole();
        if(email != null)
        {
            httpSession.setAttribute("email", email);
            httpSession.setAttribute("role", role);
            return true;
        }
        else {
            return false;
        }
    }
}
