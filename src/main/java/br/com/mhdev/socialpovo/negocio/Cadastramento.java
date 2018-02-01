package br.com.mhdev.socialpovo.negocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.mhdev.socialpovo.model.Pessoa;

public class Cadastramento {

    
    private List<RegraCalculoAuxilio> regrasDeCalculo = new ArrayList<>();
    private Requisitos requisitos = new Requisitos();
    
    public String cadastrar(Pessoa pessoa) throws Exception {
	boolean aprovado = requisitos.verificarRequisitos(pessoa);
	if (aprovado) {
	    double auxilio = calcularAuxilio(pessoa);
	    Registro registro = new Registro(pessoa, auxilio);
	    GeradorDeConta conta = new GeradorDeConta(registro);
	   return conta.toString();
	}
	throw new Exception(pessoa.getNome() + " não se enguadra nos requisitos do programa social!!!!!");
    }

    private double calcularAuxilio(Pessoa pessoa) {
	double auxilio = 0.00;
	for (RegraCalculoAuxilio regra : getRegrasDeCalculo()) {
	    regra.calcular(pessoa);
	    auxilio += regra.valor();
	}
	return auxilio;
    }

    

    public List<RegraCalculoAuxilio> getRegrasDeCalculo() {
	if (regrasDeCalculo.isEmpty()) {
	    regrasDeCalculo = Arrays.asList(new RegraCalculoAuxilioParaEmpregado(), new RegraCalculoAuxilioPeloSexo(),
		    new RegraCalculoAuxilioPorEstadoCivil(), new RegraCalculoAuxilioPossuiDependente());
	}
	return regrasDeCalculo;
    }

    public void setRegrasDeCalculo(List<RegraCalculoAuxilio> regrasDeCalculo) {
	this.regrasDeCalculo = regrasDeCalculo;
    }

}
