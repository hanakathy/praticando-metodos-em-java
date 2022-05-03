package comecando;

import java.util.Scanner;

/* Primeiro Exercício de Java
 Prof Thaigo Leite */

public class exercicio {

	public static void main(String[] args) {
		int op;
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("O que você quer fazer: \n");
		System.out.println("1- Calculadora \n2- Dar as horas \n3- Empréstimo \n4- Calcular área de quadrilátero");
		op = lerTeclado.nextInt();

		switch (op) {
		case 1:
			calculadora();
		case 2:
			mensagemHora();
		case 3:
			calculoEmprestimo();
		case 4:
			calcularAreaQuad();
		}
	}

	// Métodos
	public static void calculadora() {
		// executa as operações básicas matemáticas
		int num1, num2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		num2 = scan.nextInt();

		// Chamando os métodos da calculadora
		comecando.calculadora.soma(num1, num2);
		comecando.calculadora.subtracao(num1, num2);
		comecando.calculadora.multiplicacao(num1, num2);
		comecando.calculadora.divisao(num1, num2);
	}

	public static void mensagemHora() {
		// dá as horas dependendo da hora do dia
		int hora;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a hora(0-24): ");
		hora = scan.nextInt();

		comecando.calcularHora.mensagem(hora);
	}

	public static void calculoEmprestimo() {
		// Calcula o valor a ser pago de um empréstimo dependendo do valor e da qutde de
		// parcelas
		// ajeitar a lógica do empréstimo
		double valor, valorTaxado, valorFinal;
		int parcela;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do empréstimo: ");
		valor = scan.nextDouble();

		valorTaxado = comecando.emprestimo.valorEmprestimo(valor);

		System.out.println("Digite a quantida das parcelas: ");
		parcela = scan.nextInt();

		valorFinal = comecando.emprestimo.valorParcelado(valorTaxado, parcela);

		System.out.println("O valor final em " + parcela + " parcelas: " + valorFinal);
	}

	public static void calcularAreaQuad() {
		// calcula area de quadriláteros
		double ladoQ, ladoRetMaior, ladoRetMenor;
		double baseMaiorT, baseMenorT, alturaT;
		float diagonalA, diagonalB;
		Scanner scan = new Scanner(System.in);

		System.out.println("++Calcular Área Quadrado++");
		System.out.println("Digite o tamanho do lado:");
		ladoQ = scan.nextDouble();
		System.out.println("");

		System.out.println("++Calcular Área Retângulo++");
		System.out.println("Digite o tamanho do lado maior:");
		ladoRetMaior = scan.nextDouble();
		System.out.println("Digite o tamanho do lado menor:");
		ladoRetMenor = scan.nextDouble();
		System.out.println("");

		System.out.println("++Calcular Área Trapézio++");
		System.out.println("Digite o tamanho da base maior:");
		baseMaiorT = scan.nextDouble();
		System.out.println("Digite o tamanho da base menor:");
		baseMenorT = scan.nextDouble();
		System.out.println("Digite a altura do trapézio:");
		alturaT = scan.nextDouble();
		System.out.println("");

		System.out.println("++Calcular Área Losango++");
		System.out.println("Digite o tamanho da diagonal maior:");
		diagonalA = scan.nextFloat();
		System.out.println("Digite o tamanho da diagonal menor:");
		diagonalB = scan.nextFloat();
		System.out.println("");

		// Chamando os métodos
		comecando.areaQuadrilatero.calcularArea(ladoQ);
		comecando.areaQuadrilatero.calcularArea(ladoRetMaior, ladoRetMenor);
		comecando.areaQuadrilatero.calcularArea(baseMenorT, baseMaiorT, alturaT);
		comecando.areaQuadrilatero.calcularArea(diagonalA, diagonalB);
	}
}
