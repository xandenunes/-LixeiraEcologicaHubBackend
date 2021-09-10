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

	public Interessado save(Interessado interessado) {
		return repository.save(interessado);
	}

	public ArrayList<Interessado> get(Integer publicacao) {
		ArrayList<Interessado> arrayRetorno = new ArrayList<Interessado>();
		arrayRetorno = (ArrayList<Interessado>) repository.get(publicacao);
		return arrayRetorno;
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}




	
	
	
}
