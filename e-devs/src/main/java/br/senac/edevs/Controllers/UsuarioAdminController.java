package br.senac.edevs.Controllers;

import br.senac.edevs.model.repositories.UsuarioAdminRepository;
import br.senac.edevs.model.entities.UsuarioAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioAdminController {

    @Autowired
    private UsuarioAdminRepository usuarioAdminRepository;
    @PostMapping
    public UsuarioAdmin novoUsuarioAdmin (@RequestParam String login, String password){
        UsuarioAdmin usuario = new UsuarioAdmin(login, password);
        usuarioAdminRepository.save(usuario);
        return usuario;

    }
}
