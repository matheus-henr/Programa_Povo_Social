package br.com.mhdev.socialpovo.negocio;

public class CalculadoraAbono {

	public static double calcularAbonoFilhos(int qntFilhos) {
		double abono = 0.00;
		for (int i = 0; i < qntFilhos; i++) {
			abono += 10.00;
		}
		return abono;
	}
}
