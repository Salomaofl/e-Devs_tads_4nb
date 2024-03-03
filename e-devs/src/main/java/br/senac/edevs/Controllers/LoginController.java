package br.senac.edevs.Controllers;

import br.senac.edevs.Service.Login.LoginService;
import br.senac.edevs.model.Usuario;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String login(Model model) {
        // Adicione quaisquer atributos que você precise passar para a página TelaLogin
        model.addAttribute("title", "Página de Login");
        return "TelaLogin";
    }

    @PostMapping("/login")
    public String loginSubmit(Usuario usuario, RedirectAttributes redirectAttributes, HttpSession httpSession)
    {
        loginService.login(usuario.getEmail(), usuario.getPassword());

        Object role = httpSession.getAttribute("role");
        if ( role != null)
        {
            redirectAttributes.addFlashAttribute("role", role);
        }
        else {
            System.err.println("Role is null");
        }

        return "redirect:card";
    }
}
