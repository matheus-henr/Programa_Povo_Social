package br.com.mhdev.socialpovo.negocio;

import br.com.mhdev.socialpovo.model.Pessoa;

public class RegraCalculoAuxilioParaEmpregado   implements RegraCalculoAuxilio{

    private double auxilio;

    @Override
    public double valor() {
	return this.auxilio;
    }

    @Override
    public void calcular(Pessoa pessoa) {
	if(!pessoa.isEmpregado()) 
	    auxilio += 7.50;
    }

}
