package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Publicacao;
import com.example.demo.repository.PublicacaoRepository;

@Service
public class PublicacaoServices {

	@Autowired
	PublicacaoRepository repository;

	public ArrayList<Publicacao> findAll() {
		ArrayList<Publicacao> List = new ArrayList<Publicacao>();
		List = (ArrayList<Publicacao>) repository.findAll();
		return List;
	}

	public Publicacao save(Publicacao publicacao) {
		return repository.save(publicacao);
	}

	public void delete(Integer id) {
		
		repository.deleteById(id);
	}

	public Optional<Publicacao> get(Integer id) {
		Optional<Publicacao> publicacao = repository.findById(id);
		return publicacao;
		
		
	}


	
}
