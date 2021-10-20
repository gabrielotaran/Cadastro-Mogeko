package br.com.carlosgabriel.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carlosgabriel.model.Personagem;
import br.com.carlosgabriel.repository.PersonagemRepository;

@Service
public class PersonagemService {
	@Autowired
	private PersonagemRepository personagemRepository;
	
	public Personagem insert (Personagem personagem) {
		return personagemRepository.save(personagem);
	}
	public Personagem update(Personagem objPersonagem) {
		return personagemRepository.save(objPersonagem);
	}
	 public List<Personagem> findAll() {
	        List<Personagem> personagens = new ArrayList<>();
	        personagemRepository.findAll().forEach(personagens::add);
	        return personagens;
	 }
	 public Optional<Personagem> findOne(Integer id) {
	        return personagemRepository.findById(id);
	 }
	 public void remove(Integer id) {
	        personagemRepository.deleteById(id);
	 }
}

