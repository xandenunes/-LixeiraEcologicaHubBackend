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

import com.example.demo.models.Usuario;
import com.example.demo.services.UsuarioServices;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin
public class UsuarioController {
	@Autowired
	UsuarioServices UsuarioServices;
	
	@GetMapping
	public ArrayList<Usuario> findAll(){
		return UsuarioServices.findAll();
	}	
	
	@PostMapping("/criar")
	public Usuario create(@RequestBody Usuario usuario) {
		return UsuarioServices.save(usuario);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		UsuarioServices.delete(id);
	}
	
	@PutMapping("/atualizar")
	public void update(@RequestBody Usuario usuario) {
		UsuarioServices.save(usuario);
	}
	
	@GetMapping("/{id}")
	public Optional<Usuario> pesquisar(@PathVariable("id") Integer id) {
		Optional<Usuario> usuario = UsuarioServices.get(id);
		return usuario;
	}
}
