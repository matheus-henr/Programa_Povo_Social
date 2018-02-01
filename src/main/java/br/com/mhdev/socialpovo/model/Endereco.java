package br.com.mhdev.socialpovo.model;

public class Endereco {
	
	private int id;
	private Cidade cidade;
	private String rua;
	private int numero;
	private String complemento;
	public int getId() {
	    return this.id;
	}
	public void setId(int id) {
	    this.id = id;
	}
	public Cidade getCidade() {
	    return this.cidade;
	}
	public void setCidade(Cidade cidade) {
	    this.cidade = cidade;
	}
	public String getRua() {
	    return this.rua;
	}
	public void setRua(String rua) {
	    this.rua = rua;
	}
	public int getNumero() {
	    return this.numero;
	}
	public void setNumero(int numero) {
	    this.numero = numero;
	}
	public String getComplemento() {
	    return this.complemento;
	}
	public void setComplemento(String complemento) {
	    this.complemento = complemento;
	}
	

}
