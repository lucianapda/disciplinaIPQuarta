import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1010 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codPeca1 = teclado.nextInt();
		int qtdPeca1 = teclado.nextInt();
		double valorPeca1 = teclado.nextDouble();

		int codPeca2 = teclado.nextInt();
		int qtdPeca2 = teclado.nextInt();
		double valorPeca2 = teclado.nextDouble();

		double total = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);
		DecimalFormat F = new DecimalFormat("0.00");
		System.out.println("VALOR A PAGAR: R$ " + F.format(total));
		teclado.close();
	}
}