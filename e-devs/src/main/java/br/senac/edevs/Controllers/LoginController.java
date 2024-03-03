package br.senac.edevs.Controllers;

import br.senac.edevs.Service.Login.LoginService;
import br.senac.edevs.model.repositories.UsuarioRepository;
import br.senac.edevs.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String login(Model model) {
        // Adicione quaisquer atributos que você precise passar para a página TelaLogin
        model.addAttribute("title", "Página de Login");
        return "TelaLogin";
    }

    @PostMapping("/login")
    public String loginSubmit(Usuario usuario, Model model)
    {
        Boolean resultado = loginService.login(usuario.getEmail(), usuario.getPassword());

        if(resultado)
        {
            return "Card";
        }
        return null;
    }
}
