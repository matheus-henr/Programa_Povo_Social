package br.com.mhdev.socialpovo.negocio;

import br.com.mhdev.socialpovo.model.Pessoa;

public interface RegraCalculoAuxilio {
    
    double valor();
    
    void calcular(Pessoa pessoa);

}
