import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import br.com.mhdev.socialpovo.model.EstadoCivil;
import br.com.mhdev.socialpovo.model.Pessoa;
import br.com.mhdev.socialpovo.model.Sexo;
import br.com.mhdev.socialpovo.negocio.Requisitos;

public class TestRequisitos {

	Pessoa pessoa;
	Requisitos requisitos;
	Pessoa pessoa2;
	
	@Before
	public void setUp(){
		pessoa = new Pessoa();
		requisitos = new Requisitos();

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
	}

    @Test
	public void testRequsitos(){
     assertEquals(true, requisitos.verificarRequisitos(pessoa));
	}
}
