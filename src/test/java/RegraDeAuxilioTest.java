import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.mhdev.socialpovo.model.EstadoCivil;
import br.com.mhdev.socialpovo.model.Pessoa;
import br.com.mhdev.socialpovo.model.Sexo;
import br.com.mhdev.socialpovo.negocio.RegraCalculoAuxilio;
import br.com.mhdev.socialpovo.negocio.RegraCalculoAuxilioParaEmpregado;
import br.com.mhdev.socialpovo.negocio.RegraCalculoAuxilioPeloSexo;
import br.com.mhdev.socialpovo.negocio.RegraCalculoAuxilioPorEstadoCivil;
import br.com.mhdev.socialpovo.negocio.RegraCalculoAuxilioPossuiDependente;

public class RegraDeAuxilioTest {

	Pessoa pessoa = new Pessoa();
	List<RegraCalculoAuxilio> regras  = new ArrayList<>();
	
	@Before
	public void setUp(){
		regras  = Arrays.asList(new RegraCalculoAuxilioParaEmpregado(), new RegraCalculoAuxilioPeloSexo(),
			    new RegraCalculoAuxilioPorEstadoCivil(), new RegraCalculoAuxilioPossuiDependente());
		
		pessoa.setId(1);
		pessoa.setNome("Nome");
		pessoa.setSobreNome("sobrenome");
		pessoa.setSexo(Sexo.FEMININO);
		pessoa.setDataNascimento( LocalDate.of(1994, 12, 28));
		pessoa.setEmpregado(false);
		pessoa.setFilhos(true);
		pessoa.setQntFilhos(3);
		pessoa.setSalario(0);
		pessoa.setEstadoCivil(EstadoCivil.CASADO);
	}
	
	@Test
	public void testRegras(){
		double auxilio = 0.0;
		for(RegraCalculoAuxilio regra : regras){
			regra.calcular(pessoa);
			auxilio += regra.valor();
		}
		
		System.out.println(auxilio); // resultado esperado 78,5
	}
	
	
	
	
	
}
