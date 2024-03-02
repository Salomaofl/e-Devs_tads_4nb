package br.senac.edevs.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListaUsuarioController {
    @GetMapping("/listaUsuario")
    public String listar(Model model) {
        return "ListarUsuario";
    }
}