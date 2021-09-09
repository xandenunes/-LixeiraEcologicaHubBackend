package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Interessado;
import com.example.demo.repository.InteressadoRepository;

@Service
public class InteressadoServices {

	@Autowired
	InteressadoRepository repository;

	public ArrayList<Interessado> findAll() {
		ArrayList<Interessado> List = new ArrayList<Interessado>();
		List = (ArrayList<Interessado>) repository.findAll();
		return List;
	}
	
	
	
}
