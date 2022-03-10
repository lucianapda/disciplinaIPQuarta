import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1009 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		Double salarioFixo = teclado.nextDouble();
		Double vendas = teclado.nextDouble();
		Double total = salarioFixo + (vendas * 0.15);
		DecimalFormat F = new DecimalFormat("0.00");
		System.out.println("TOTAL = R$ " + F.format(total));
		teclado.close();
	}
}