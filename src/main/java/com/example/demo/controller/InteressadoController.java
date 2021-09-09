package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Interessado;
import com.example.demo.services.InteressadoServices;

@RestController
@RequestMapping("/interessados")
@CrossOrigin
public class InteressadoController {

	@Autowired
	InteressadoServices services;
	
	@GetMapping
	public ArrayList<Interessado> Todos(){
		return services.findAll();
	}
}
