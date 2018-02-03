import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.com.mhdev.socialpovo.model.EstadoCivil;
import br.com.mhdev.socialpovo.model.GeradorDeConta;
import br.com.mhdev.socialpovo.model.Pessoa;
import br.com.mhdev.socialpovo.model.Registro;
import br.com.mhdev.socialpovo.model.Sexo;
import br.com.mhdev.socialpovo.negocio.Cadastramento;
import junit.framework.TestCase;

public class TestCadastramento  extends TestCase{

	Pessoa pessoa;
	Pessoa pessoa2;
	Cadastramento cadastramento;

	@Before
	public void setUp(){
		pessoa = new Pessoa();

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
		
		pessoa2 = new Pessoa();

		pessoa2.setId(2);
		pessoa2.setNome("Nome2");
		pessoa2.setSobreNome("sobrenome2");
		pessoa2.setSexo(Sexo.MASCULINO);
		pessoa2.setDataNascimento( LocalDate.of(1994, 12, 28));
		pessoa2.setEmpregado(true);
		pessoa2.setFilhos(false);
		pessoa2.setQntFilhos(0);
		pessoa2.setSalario(400);
		pessoa2.setEstadoCivil(EstadoCivil.CASADO);

	    cadastramento = new Cadastramento();
		
	}




	@Test
	public void testCadastramento(){
		try {
		GeradorDeConta conta = cadastramento.cadastrar(pessoa); 	
		assertNotNull(conta.getConta());
			
		} catch (Exception e) {
			// TODO Auto-generated catcDh block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testCalculoAuxilio(){
		assertEquals(78.50, cadastramento.calcularAuxilio(pessoa));
	}
		
	
}	