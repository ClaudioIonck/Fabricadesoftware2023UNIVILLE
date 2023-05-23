package br.univille.projetofabsoft2023.controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoft2023.entity.User.Cliente;
import br.univille.projetofabsoft2023.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ModelAndView index() {

        var listaCliente = clienteService.getAll();

        return new ModelAndView("user/cliente/index", "listaClientes", listaCliente);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {

        var cliente = new Cliente();

        return new ModelAndView("user/cliente/form", "cliente", cliente);

    }

    @PostMapping(params = "form")
    public ModelAndView save(Cliente cliente) {

        clienteService.save(cliente);

        return new ModelAndView("redirect:/cliente/");
    }

    @GetMapping("/remover/{id}")
    public ModelAndView remover(@PathVariable("id") long id) {

        clienteService.delete(id);

        return new ModelAndView("redirect:/cliente/");
    }
}
