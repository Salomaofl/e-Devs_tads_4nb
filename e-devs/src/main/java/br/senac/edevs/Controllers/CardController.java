package br.senac.edevs.Controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardController
{
    @GetMapping("/card")
    public String card(HttpSession session, Model model)
    {
        // Check if 'role' is set in the session. If not, retrieve it from the model or handle the case where it's missing.
        Object role = session.getAttribute("role");
        if (role == null) {
            // Handle case or set a default role value
            return "login";
        }
        model.addAttribute("role", role); // Ensure 'role' is always added to the model for the view

        return "Card";
    }
}
