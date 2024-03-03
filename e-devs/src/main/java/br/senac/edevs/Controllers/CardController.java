package br.senac.edevs.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardController
{
    @GetMapping("/card")
    public String card()
    {
        return "Card";
    }
}
