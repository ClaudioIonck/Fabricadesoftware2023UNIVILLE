package br.univille.projetofabsoft2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoft2023.entity.User.Cliente;
import br.univille.projetofabsoft2023.repository.ClienteRepository;
import br.univille.projetofabsoft2023.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Cliente client) {
        repository.save(client);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

}
