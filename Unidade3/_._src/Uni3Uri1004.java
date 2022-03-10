import java.util.Scanner;

public class Uni3Uri1004 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int valor1 = teclado.nextInt();
		int valor2 = teclado.nextInt();
		int PROD = valor1 * valor2;

		System.out.println("PROD = " + PROD);
		teclado.close();
	}
}
