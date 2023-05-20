package br.univille.projetofabsoft2023.service;

import java.util.List;
import br.univille.projetofabsoft2023.entity.User.Cliente;

public interface ClienteService {

    List<Cliente> getAll();

    void save(Cliente cliente);

    void delete(long id);

}
