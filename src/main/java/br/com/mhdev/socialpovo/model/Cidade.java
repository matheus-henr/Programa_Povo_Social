package br.com.mhdev.socialpovo.model;

public class Cidade {

	private int id;
	private String nome;
	private Estado estado;
	public int getId() {
	    return this.id;
	}
	public void setId(int id) {
	    this.id = id;
	}
	public String getNome() {
	    return this.nome;
	}
	public void setNome(String nome) {
	    this.nome = nome;
	}
	public Estado getEstado() {
	    return this.estado;
	}
	public void setEstado(Estado estado) {
	    this.estado = estado;
	}
	
	
}
