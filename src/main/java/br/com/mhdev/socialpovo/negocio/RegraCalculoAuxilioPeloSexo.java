package br.com.mhdev.socialpovo.negocio;

import br.com.mhdev.socialpovo.model.Pessoa;
import br.com.mhdev.socialpovo.model.Sexo;
import br.com.mhdev.socialpovo.util.Util;

public class RegraCalculoAuxilioPeloSexo implements RegraCalculoAuxilio {


    private double auxilio;
    
    @Override
    public double valor() {
	return this.auxilio;
    }

    @Override
    public void calcular(Pessoa pessoa) {
	if(Util.equals(pessoa.getSexo(), Sexo.FEMININO)) 
	    auxilio += 15.00;
        else  auxilio += 12.50;
    }

}
