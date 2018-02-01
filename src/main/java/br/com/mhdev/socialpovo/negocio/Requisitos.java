package br.com.mhdev.socialpovo.negocio;

import br.com.mhdev.socialpovo.model.EstadoCivil;
import br.com.mhdev.socialpovo.model.Pessoa;
import br.com.mhdev.socialpovo.model.Sexo;
import br.com.mhdev.socialpovo.util.Util;

public class Requisitos {

	private final static double SALARIO_MINIMO = 950.00;
    private final static double SALARIO_MININO_MULHER = 800;
	
	public boolean verificarRequisitos(Pessoa pessoa) {
		if (pessoa.isFilhos() || !pessoa.isEmpregado()) {

		    if (Util.equals(pessoa.getEstadoCivil(), EstadoCivil.VIUVO)
			    || Util.equals(pessoa.getEstadoCivil(), pessoa.getEstadoCivil())) {
			return pessoa.getSalario() < SALARIO_MINIMO;
		    } 

		    else if (pessoa.isFilhos() && Util.equals(pessoa.getSexo(), Sexo.FEMININO)) {
			return pessoa.getSalario() < SALARIO_MININO_MULHER;
		    }

		    else if (Util.equals(pessoa.getEstadoCivil(), EstadoCivil.CASADO)
			    && pessoa.getSalario() < SALARIO_MINIMO) {
			return true;
		    } else
			return false;

		}
		return false;
	    }
}
