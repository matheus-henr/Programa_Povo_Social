package br.com.mhdev.socialpovo.negocio;

import br.com.mhdev.socialpovo.model.Pessoa;

public class RegraCalculoAuxilioPossuiDependente   implements RegraCalculoAuxilio{

    private double auxilio;

    @Override
    public double valor() {
	return this.auxilio;
    }

    @Override
    public void calcular(Pessoa pessoa) {
	if(pessoa.isFilhos()) 
	    auxilio += calcularAbonoFilhos(pessoa.getQntFilhos());
    }

    private double calcularAbonoFilhos(int qntFilhos) {
	double abono = 0.00;
	for (int i = 0; i < qntFilhos; i++) {
		abono += 10.00;
	}
	return abono;
     }
    
}
