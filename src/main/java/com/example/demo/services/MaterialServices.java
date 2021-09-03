package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Material;
import com.example.demo.repository.MaterialRepository;

@Service
public class MaterialServices {

	@Autowired
	MaterialRepository repository;
	
	public ArrayList<Material> findAll() {
		return (ArrayList<Material>) repository.findAll();
	}

	public Optional<Material> get(Integer id) {
		Optional<Material> material = repository.findById(id);
		return material;
	}

	
}
