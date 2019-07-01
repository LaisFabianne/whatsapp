package edu.br.whatsapp.modelo;

public class Usuario {
	private String nome;
	private String foto;
	private String recado;
	private String numero;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Usuario(String nome, String numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getRecado() {
		return recado;
	}
	public void setRecado(String recado) {
		this.recado = recado;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
