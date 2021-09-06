package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Publicacao;
import com.example.demo.services.PublicacaoServices;

@RestController
@RequestMapping("/publicacoes")
@CrossOrigin
public class PublicacaoController {
	
	@Autowired
	PublicacaoServices services;
	
	@GetMapping
	public ArrayList<Publicacao> findAll(){
		return services.findAll();
	}	
	
	@PostMapping("/criar")
	public Publicacao create(@RequestBody Publicacao publicacao) {
		return services.save(publicacao);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		services.delete(id);
	}
	
	@PutMapping("/atualizar")
	public void update(@RequestBody Publicacao publicacao) {
		services.save(publicacao);
	}
	
	@GetMapping("/{id}")
	public Optional<Publicacao> pesquisar(@PathVariable("id") Integer id) {
		Optional<Publicacao> publicacao = services.get(id);
		return publicacao;
	}
}
