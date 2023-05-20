package br.univille.projetofabsoft2023.service;

import java.util.List;
import br.univille.projetofabsoft2023.entity.User.Gerente;

public interface GerenteService {

    List<Gerente> getAll();

    void save(Gerente gerente);

    void delete(Long Id);
}
