package br.senac.edevs.Controllers;

import br.senac.edevs.Service.Usuario.UsuarioService;
import br.senac.edevs.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ListaUsuarioController {

    @Autowired UsuarioService usuarioService;
    @GetMapping("/listaUsuario")
    public String listar(Model model ) {

        List<Usuario> usuarios = usuarioService.ProcurarTodosUsuario();
        model.addAttribute("usuarios", usuarios);

        return "ListarUsuario";
    }
}
