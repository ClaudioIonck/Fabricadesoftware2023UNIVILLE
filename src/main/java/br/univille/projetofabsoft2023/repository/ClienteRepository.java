package br.univille.projetofabsoft2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetofabsoft2023.entity.User.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
