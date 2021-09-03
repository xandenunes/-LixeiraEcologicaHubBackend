package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity(name="material_publicado")
public class Publicacao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idmaterial_publicado;
	@Column
	private String titulo;
	@Column
	private String imgURL;
	@Column	
	private String descricao;
	@Column
	private String telefone;
	@Column
	private Integer status;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="tipo_material")
	@JsonIgnoreProperties({"publicacoes", "idtipo_material"})
	private Material material;

	@Column
	@CreationTimestamp
	private Date data;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idusuario")
	@JsonIgnoreProperties({"publicacoes", "senha"})
	private Usuario usuario;
	
	public Publicacao() {
		
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
	public Integer getIdmaterial_publicado() {
		return idmaterial_publicado;
	}
	public void setIdmaterial_publicado(Integer idmaterial_publicado) {
		this.idmaterial_publicado = idmaterial_publicado;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}

}
