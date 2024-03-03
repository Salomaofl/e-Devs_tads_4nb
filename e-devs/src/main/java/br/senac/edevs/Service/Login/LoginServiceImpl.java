package br.senac.edevs.Service.Login;

import br.senac.edevs.model.Usuario;
import br.senac.edevs.model.repositories.UsuarioRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private HttpSession httpSession;

    private final UsuarioRepository usuarioRepository;

    public LoginServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public String login(String email, String password) {
        Usuario usuario = usuarioRepository.findByEmail(email);

        if (usuario != null && usuario.getPassword().equals(password)) {
            httpSession.setAttribute("email", email);
            httpSession.setAttribute("role", usuario.getRole());
            return "redirect:/Card"; // Redirect upon successful login
        } else {
            // Clear session attributes if login fails
            httpSession.removeAttribute("email");
            httpSession.removeAttribute("role");
            return "redirect:/TelaLogin"; // Redirect to login page if login fails
        }
    }
}
