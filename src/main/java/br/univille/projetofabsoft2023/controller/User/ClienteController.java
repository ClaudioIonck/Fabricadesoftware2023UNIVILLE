package br.univille.projetofabsoft2023.controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoft2023.service.ClienteService;

@Controller
@RequestMapping("/cliente")
@PreAuthorize("hasAuthority('APPROLE_admin')")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ModelAndView index() {

        var listaCliente = clienteService.getAll();

        return new ModelAndView("user/cliente/index", "listaClientes", listaCliente);
    }

}
