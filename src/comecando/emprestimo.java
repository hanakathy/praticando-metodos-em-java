package comecando;

public class emprestimo {
	//tá errado o cálculo
	public static double valorEmprestimo(double valor) {
		//usar get para valor das taxas
		if (valor <= 500.00) { // se valor abaixo de 500, 2%
			return valor * 0.02;
		} else if (valor > 500.00 && valor < 1000.00) {
			return valor * 0.03;
		} else {
			return valor * 0.04;
		}
	}

	public static double valorParcelado(double valorTaxado, int parcelas) {
		if (parcelas < 3) {
			return valorTaxado * 0.010;
		} else if (parcelas >= 3 && parcelas < 6) {
			return valorTaxado * 0.05;
		} else {
			return valorTaxado * 0.10;
		}
	}
}
