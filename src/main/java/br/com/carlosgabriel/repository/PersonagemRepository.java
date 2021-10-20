package br.com.carlosgabriel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.carlosgabriel.model.Personagem;

@Repository
public interface PersonagemRepository extends CrudRepository<Personagem, Integer> {

}
