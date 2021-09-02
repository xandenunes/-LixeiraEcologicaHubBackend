package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioServices {
	
	@Autowired
	UsuarioRepository UsuarioRepository;

	public ArrayList<Usuario> findAll() {
		ArrayList<Usuario> List = new ArrayList<Usuario>();
		List = (ArrayList<Usuario>) UsuarioRepository.findAll();
		return List;
	}

	public Usuario save(Usuario usuario) {
		return UsuarioRepository.save(usuario);
	}

	public void delete(Integer id) {
		
		UsuarioRepository.deleteById(id);
	}

	public Optional<Usuario> get(Integer id) {
		Optional<Usuario> usuario = UsuarioRepository.findById(id);
		return usuario;
		
		
	}
}
