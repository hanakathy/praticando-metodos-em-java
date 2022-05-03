package comecando;

public class areaQuadrilatero {
	public static void calcularArea(double lado) {
		System.out.println("Área do Quadrado: " + (lado + lado));
	}

	public static void calcularArea(double ladoA, double ladoB) {
		System.out.println("Área do Retângulo: " + (ladoA + ladoB));
	}

	public static void calcularArea(double baseMenor, double baseMaior, double altura) {
		System.out.println("Área do Trapézio: " + (baseMenor + baseMaior) / altura);
	}

	public static void calcularArea(float diagonal1, float diagonal2) {
		System.out.println("Área do Losango: " + (diagonal1 * diagonal2) / 2);
	}
}
