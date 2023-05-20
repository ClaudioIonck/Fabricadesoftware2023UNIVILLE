package br.univille.projetofabsoft2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoft2023.entity.User.Gerente;
import br.univille.projetofabsoft2023.repository.GerenteRepository;
import br.univille.projetofabsoft2023.service.GerenteService;

@Service
public class GerenteServiceImpl implements GerenteService {

    @Autowired
    private GerenteRepository repository;

    @Override
    public List<Gerente> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Gerente gerente) {
        repository.save(gerente);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
