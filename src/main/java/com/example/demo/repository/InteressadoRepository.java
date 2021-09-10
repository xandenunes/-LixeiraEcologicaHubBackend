package com.example.demo.repository;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Interessado;


public interface InteressadoRepository extends JpaRepository<Interessado, Integer> {

	@Query("SELECT c FROM interessados_publicacao_log c WHERE c.idmaterial_publicado = ?1")
	ArrayList<Interessado> get(Integer publicacao);


}
