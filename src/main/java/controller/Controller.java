package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/asagi")
    public String afficherUnProduit() {
        return "asagi  ";
    }

    @GetMapping(value = "/asagi2")
    public String afficherUnProduit() {
        return "asagi2  ";
    }
}
