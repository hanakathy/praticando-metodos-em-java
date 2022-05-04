package comecando;

public class areaQuadrilatero {
	public static double calcularArea(double lado) {
		return lado * lado;
	}

	public static double calcularArea(double ladoA, double ladoB) {
		return ladoA * ladoB;
	}

	public static double calcularArea(double baseMenor, double baseMaior, double altura) {
		return (baseMenor + baseMaior) / altura;
	}

	public static double calcularArea(float diagonal1, float diagonal2) {
		return (diagonal1 * diagonal2) / 2;
	}
}
