import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1005 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double A = teclado.nextFloat() * 3.5;
		double B = teclado.nextFloat() * 7.5;
		double soma = (B + A) / 11;
		DecimalFormat F = new DecimalFormat("0.00000");
		System.out.println("MEDIA = " + F.format(soma));
		teclado.close();
	}
}