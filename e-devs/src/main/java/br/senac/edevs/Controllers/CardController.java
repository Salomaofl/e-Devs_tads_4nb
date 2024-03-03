package br.senac.edevs.Controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardController {
    @Autowired
    HttpSession httpSession;

    @GetMapping("/card")
    public String card(Model model)
    {
        model.addAttribute("role", httpSession.getAttribute("role"));
        return "Card";
    }
}
