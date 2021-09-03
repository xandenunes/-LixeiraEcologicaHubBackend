package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Material;
import com.example.demo.services.MaterialServices;

@RestController
@RequestMapping("/tipo")
public class MaterialController {
	
	@Autowired
	MaterialServices service;
	
	@GetMapping
	public ArrayList<Material> materiais(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Material> pesquisar(@PathVariable("id") Integer id) {
		Optional<Material> material = service.get(id);
		return material;
	}
} 
