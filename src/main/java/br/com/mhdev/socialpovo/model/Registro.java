package br.com.mhdev.socialpovo.model;

public class Registro {
	private int id;
	private Pessoa pessoa;
	private double auxilio;

	
	public Registro(Pessoa pessoa, double auxilio){
		this.pessoa = pessoa;
		this.auxilio = auxilio;
	}
	
	public double getAuxilio() {
		return auxilio;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}
}
