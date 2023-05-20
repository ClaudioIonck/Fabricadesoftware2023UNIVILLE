package br.univille.projetofabsoft2023.controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoft2023.service.GerenteService;

@Controller
@RequestMapping("/gerente")
public class GerenteController {

    @Autowired
    private GerenteService gerenteService;

    @GetMapping
    public ModelAndView index() {
        var listaGerente = gerenteService.getAll();

        return new ModelAndView("User/Gerente/index", "listaGerente", listaGerente);
    }
}
