package comecando;

public class areaQuadrilatero {
	public static void calcularArea(double lado) {
		System.out.println("�rea do Quadrado: " + (lado + lado));
	}

	public static void calcularArea(double ladoA, double ladoB) {
		System.out.println("�rea do Ret�ngulo: " + (ladoA + ladoB));
	}

	public static void calcularArea(double baseMenor, double baseMaior, double altura) {
		System.out.println("�rea do Trap�zio: " + (baseMenor + baseMaior) / altura);
	}

	public static void calcularArea(float diagonal1, float diagonal2) {
		System.out.println("�rea do Losango: " + (diagonal1 * diagonal2) / 2);
	}
}
