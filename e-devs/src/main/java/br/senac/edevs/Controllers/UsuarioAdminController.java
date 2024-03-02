package br.senac.edevs.Controllers;

import br.senac.edevs.model.repositories.UsuarioAdminRepository;
import br.senac.edevs.model.entities.UsuarioAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioAdminController {

    @Autowired
    private UsuarioAdminRepository usuarioAdminRepository;

    @GetMapping("/login")
    public String login(Model model) {
        // Adicione quaisquer atributos que você precise passar para a página TelaLogin
        model.addAttribute("title", "Página de Login");
        return "TelaLogin";
    }

    @PostMapping("/login")
    public String loginSubmit(UsuarioAdmin usuarioAdmin, Model model) {
        // Faz a verificacao no banco
        UsuarioAdmin user = usuarioAdminRepository.findByLoginAndPassword(usuarioAdmin.getLogin(), usuarioAdmin.getPassword());

        if (user != null) {
            model.addAttribute(model);
                return "ListarUsuario";

        } else {
            model.addAttribute("error", "Credenciais inválidas");
            return "TelaLogin";
        }
    }
}



//    @Autowired
//    private UsuarioAdminRepository usuarioAdminRepository;
//    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
//    public @ResponseBody UsuarioAdmin salvarUsuario(UsuarioAdmin usuarioAdmin) {
//        usuarioAdminRepository.save(usuarioAdmin);
//        return usuarioAdmin;
//    }
//
//    @GetMapping
//    public Iterable<UsuarioAdmin> obterUsuarios() {
//        return usuarioAdminRepository.findAll();
//    }
//
//    @GetMapping(path = "/{id}")
//    public Optional<UsuarioAdmin> obterUsuarioPorId(@PathVariable int id) {
//        return usuarioAdminRepository.findById(id);
//    }

