package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="interessados_publicacao_log")
public class Interessado {
	@Id
	@Column
	private Integer idmaterial_publicado;
	@Column
	private Integer id_usuario_interessado;
	
	@Column 
	private Integer id_usuario_contemplado;

	public Interessado() {
		
	}

	public Integer getIdmaterial_publicado() {
		return idmaterial_publicado;
	}

	public void setIdmaterial_publicado(Integer idmaterial_publicado) {
		this.idmaterial_publicado = idmaterial_publicado;
	}

	public Integer getId_usuario_interessado() {
		return id_usuario_interessado;
	}

	public void setId_usuario_interessado(Integer id_usuario_interessado) {
		this.id_usuario_interessado = id_usuario_interessado;
	}

	public Integer getId_usuario_contemplado() {
		return id_usuario_contemplado;
	}

	public void setId_usuario_contemplado(Integer id_usuario_contemplado) {
		this.id_usuario_contemplado = id_usuario_contemplado;
	}


}
