package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Interessado;
import com.example.demo.services.InteressadoServices;

@RestController
@CrossOrigin
@RequestMapping("/interessados")
public class InteressadoController {

	@Autowired
	InteressadoServices services;
	
	@GetMapping
	public ArrayList<Interessado> Todos(){
		return services.findAll();
	}
	@PostMapping("/criar")
	public Interessado create(@RequestBody Interessado interessado) {
		return services.save(interessado);
	}
	
	@GetMapping("/{publicacao}")
	public ArrayList<Interessado> get(@PathVariable Integer publicacao){ 
		return services.get(publicacao);
	}
	@DeleteMapping("/delete/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		services.delete(id);
	}
}
