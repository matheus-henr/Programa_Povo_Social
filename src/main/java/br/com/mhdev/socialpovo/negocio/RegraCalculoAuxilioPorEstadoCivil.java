package br.com.mhdev.socialpovo.negocio;

import br.com.mhdev.socialpovo.model.EstadoCivil;
import br.com.mhdev.socialpovo.model.Pessoa;
import br.com.mhdev.socialpovo.util.Util;

public class RegraCalculoAuxilioPorEstadoCivil implements RegraCalculoAuxilio {

    private double auxilio;
    
    @Override
    public double valor() {
	return this.auxilio;
    }

    @Override
    public void calcular(Pessoa pessoa) {
	if(Util.equals(pessoa.getEstadoCivil(), EstadoCivil.SOLTEIRO) ||
		Util.equals(pessoa.getEstadoCivil(), EstadoCivil.VIUVO)) auxilio += 17.00;
	else auxilio += 26.00;
    }

}
