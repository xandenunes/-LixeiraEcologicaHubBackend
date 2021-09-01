package com.example.demo.services;

import java.util.ArrayList;

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
	
	
}
