package br.senac.edevs.Controllers;

import br.senac.edevs.model.repositories.UsuarioAdminRepository;
import br.senac.edevs.model.entities.UsuarioAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioAdminController {

    @Autowired
    private UsuarioAdminRepository usuarioAdminRepository;
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody UsuarioAdmin salvarUsuario(UsuarioAdmin usuarioAdmin) {
        usuarioAdminRepository.save(usuarioAdmin);
        return usuarioAdmin;
    }

    @GetMapping
    public Iterable<UsuarioAdmin> obterUsuarios() {
        return usuarioAdminRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioAdmin> obterUsuarioPorId(@PathVariable int id) {
        return usuarioAdminRepository.findById(id);
    }
}
