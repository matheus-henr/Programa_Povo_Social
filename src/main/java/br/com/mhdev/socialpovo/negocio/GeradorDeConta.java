package br.com.mhdev.socialpovo.negocio;

import java.time.LocalDate;
import 	java.util.Random;

public class GeradorDeConta {
	
	private Registro registro;
	private String conta;
	
	public GeradorDeConta(Registro registro) {
		this.registro = registro;
		gerar();
		
	}
	
	public void gerar(){
		StringBuffer sb = new StringBuffer();
		sb.append(44);
		sb.append(random());
		sb.append(9);
		sb.append(random());
		sb.append(random());
		sb.append("-");
		sb.append(LocalDate.now().getDayOfMonth());
		sb.append(random());
		sb.append(LocalDate.now().getDayOfYear());
		
		this.conta = sb.toString();
	}
	
	private int random(){
		Random gerador = new Random();
		return 1 + gerador.nextInt(8); 
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
	sb.append("Beneficiário: " + registro.getPessoa().getNome() +" " + registro.getPessoa().getSobreNome());
	sb.append("\n");
	sb.append("valor do auxilio:" + registro.getAuxilio());
	sb.append("\n");
	sb.append("numero da conta:" + conta);
	return sb.toString();
	}
	

}
