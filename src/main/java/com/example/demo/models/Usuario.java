package com.example.demo.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idusuario;
	@Column
	private String nome;
	@Column
	private Integer exp;
	@Column
	private Integer level;
	@Column
	private String email;
	@Column
	private String cep;
	@Column
	private String endereco;
	@Column
	private String telefone;

	@Column
	private Date data_nascimento;
	@Column
	private String senha;
	

	@OneToMany(fetch = FetchType.EAGER, mappedBy="usuario")
	@JsonIgnoreProperties({"usuario"})
	private List<Publicacao> publicacoes;
	

	@OneToOne(fetch = FetchType.LAZY, mappedBy="usuario")
	@JsonIgnoreProperties
	private Interessado interessado;


	public Usuario() {
		
	}
		
	public Integer getExp() {
		return exp;
	}


	public void setExp(Integer exp) {
		this.exp = exp;
	}


	public Integer getLevel() {
		return level;
	}


	public void setLevel(Integer level) {
		this.level = level;
	}	
	
	public Interessado getInteressado() {
		return interessado;
	}


	public void setInteressado(Interessado interessado) {
		this.interessado = interessado;
	}


	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<Publicacao> getPublicacoes() {
		return publicacoes;
	}
	public void setPublicacoes(List<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}
	public Integer getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

}
