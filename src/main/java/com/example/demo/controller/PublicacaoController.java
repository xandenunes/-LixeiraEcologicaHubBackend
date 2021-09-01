package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Publicacao;
import com.example.demo.services.PublicacaoServices;

@RestController
@RequestMapping("/publicacoes")
public class PublicacaoController {
	
	@Autowired
	PublicacaoServices services;
	
	@GetMapping
	public ArrayList<Publicacao> findAll(){
		return services.findAll();
	}
}
