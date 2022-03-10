import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1015 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Entrada
		double x1 = teclado.nextDouble();
		double y1 = teclado.nextDouble();
		double x2 = teclado.nextDouble();
		double y2 = teclado.nextDouble();

		// Processo
		double x = x2 - x1;
		double y = y2 - y1;
		double distancia = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));

		// Saida
		DecimalFormat F = new DecimalFormat("0.0000");
		System.out.println(F.format(distancia));
		teclado.close();
	}
}