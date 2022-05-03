package comecando;

public class calcularHora {
	public static void mensagem(int hora) {
		if (hora >= 4 && hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde!");
		} else if (hora > 8 && hora < 4) {
			System.out.println("Boa noite!");
		}
	}
}
