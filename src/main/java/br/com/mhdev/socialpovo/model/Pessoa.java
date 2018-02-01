package br.com.mhdev.socialpovo.model;

import java.time.LocalDate;



public class Pessoa {

    private Integer id;
    private String nome;
    private String sobreNome;
    private Sexo sexo;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private boolean filhos;
    private boolean empregado;
    private int qntFilhos;
    private double salario;
    private EstadoCivil estadoCivil;

    public Pessoa() {
    }

    

    public Pessoa(Integer id, String nome, String sobreNome, Sexo sexo, LocalDate dataNascimento, Endereco endereco,
	    boolean filhos, boolean empregado, int qntFilhos, double salario, EstadoCivil estadoCivil) {
	super();
	this.id = id;
	this.nome = nome;
	this.sobreNome = sobreNome;
	this.sexo = sexo;
	this.dataNascimento = dataNascimento;
	this.endereco = endereco;
	this.filhos = filhos;
	this.empregado = empregado;
	this.qntFilhos = qntFilhos;
	this.salario = salario;
	this.estadoCivil = estadoCivil;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Pessoa other = (Pessoa) obj;
	if (this.id == null) {
	    if (other.id != null)
		return false;
	} else if (!this.id.equals(other.id))
	    return false;
	return true;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getSobreNome() {
	return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
	this.sobreNome = sobreNome;
    }

    public Sexo getSexo() {
	return sexo;
    }

    public void setSexo(Sexo sexo) {
	this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
	return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
	if ((LocalDate.now().getYear() - dataNascimento.getYear()) >= 18) {
	    this.dataNascimento = dataNascimento;
	}else{
	    throw new IllegalAccessError("Acesso ao programa apenas maiores de 18 anos");    
	}
    }

    public Endereco getEndereco() {
	return endereco;
    }

    public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }



    public boolean isFilhos() {
        return this.filhos;
    }



    public void setFilhos(boolean filhos) {
        this.filhos = filhos;
    }



    public boolean isEmpregado() {
        return this.empregado;
    }



    public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }



    public int getQntFilhos() {
        return this.qntFilhos;
    }



    public void setQntFilhos(int qntFilhos) {
        this.qntFilhos = qntFilhos;
    }



    public double getSalario() {
        return this.salario;
    }



    public void setSalario(double salario) {
        this.salario = salario;
    }



    public EstadoCivil getEstadoCivil() {
        return this.estadoCivil;
    }



    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

}
