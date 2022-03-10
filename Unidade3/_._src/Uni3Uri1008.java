import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1008 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		int horas = teclado.nextInt();
		double valor = teclado.nextDouble();
		double salario = horas * valor;
		DecimalFormat F = new DecimalFormat("0.00");
		System.out.println("NUMBER = " + numero);
		System.out.println("SALARY = U$ " + F.format(salario));
		teclado.close();
	}
}