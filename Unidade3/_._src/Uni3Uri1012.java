import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1012 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		double C = teclado.nextDouble();
		double tri = (A * C) / 2;
		double pi = 3.14159;
		double circulo = pi * Math.pow(C, 2);
		double trapezio = ((A + B) * C) / 2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		DecimalFormat F = new DecimalFormat("0.000");
		System.out.println("TRIANGULO: " + F.format(tri));
		System.out.println("CIRCULO: " + F.format(circulo));
		System.out.println("TRAPEZIO: " + F.format(trapezio));
		System.out.println("QUADRADO: " + F.format(quadrado));
		System.out.println("RETANGULO: " + F.format(retangulo));
		teclado.close();
	}
}