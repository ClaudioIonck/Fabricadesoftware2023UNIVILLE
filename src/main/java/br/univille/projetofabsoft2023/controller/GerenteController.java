package br.univille.projetofabsoft2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoft2023.entity.Gerente;
import br.univille.projetofabsoft2023.service.GerenteService;

@Controller
@RequestMapping("/gerente")
public class GerenteController {

    @Autowired
    private GerenteService gerenteService;

    @GetMapping
    public ModelAndView index() {
        var listaGerente = gerenteService.getAll();
        return new ModelAndView("gerente/index", "listaGerent", listaGerente);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var gerente = new Gerente();
        return new ModelAndView("gerente/form", "gerente", gerente);
    }

    @PostMapping(params = "form")
    public ModelAndView save(Gerente gerente) {

        gerenteService.save(gerente);
        return new ModelAndView("redirect:/gerente");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Gerente gerente) {
        return new ModelAndView("gerente/form", "gerente", gerente);

    }
}
