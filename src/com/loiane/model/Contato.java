package com.loiane.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Contato Bean
 * @author Loiane Groner
 *
 */
public class Contato {
	
	private String nome;
	private String telefone;
	private String email;
	private Date aniversario;
	
	/**
	 * Construtor padrão
	 */
	public Contato() {
	}
	
	/**
	 * Construtor com todos os campos
	 * @param nome
	 * @param telefone
	 * @param email
	 * @param aniversario
	 */
	public Contato(String nome, String telefone, String email, Date aniversario) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.aniversario = aniversario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAniversario() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(aniversario);
	}
	
	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	
}
