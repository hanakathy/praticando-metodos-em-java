package comecando;

import java.util.Scanner;

/* Primeiro Exerc�cio de Java
 Prof Thaigo Leite */

public class exercicio {

	public static void main(String[] args) {
		int x;
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("O que voc� quer \n1- Calculadora \n2-Dar as horas \n3- Empr�stimo");
		x = lerTeclado.nextInt();
		//usar switch case
		if (x == 1) {
			calculadora();
		} else if (x == 2) {
			mensagemHora();
		} else if (x==3) {
			calculoEmprestimo();
		}
	}

	// M�todos
	public static void calculadora() {
		int num1, num2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		num2 = scan.nextInt();

		// Chamando os m�todos da calculadora
		comecando.calculadora.soma(num1, num2);
		comecando.calculadora.subtracao(num1, num2);
		comecando.calculadora.multiplicacao(num1, num2);
		comecando.calculadora.divisao(num1, num2);
	}


	public static void mensagemHora() {
		int hora;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a hora(0-24): ");
		hora = scan.nextInt();

		comecando.calcularHora.mensagem(hora);
	}

	public static void calculoEmprestimo() {
		double valor, valorTaxado, valorFinal;
		int parcela;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do empr�stimo: ");
		valor = scan.nextDouble();
		
		valorTaxado = comecando.emprestimo.valorEmprestimo(valor);
		
		System.out.println("Digite a quantida das parcelas: ");
		parcela = scan.nextInt();
		
		valorFinal = comecando.emprestimo.valorParcelado(valorTaxado, parcela);
		
		System.out.println("O valor final em "+parcela+" parcelas: "+valorFinal);
	}

}
