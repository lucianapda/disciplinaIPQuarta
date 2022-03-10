import java.util.Scanner;

public class Exe2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        int numero = teclado.nextInt();

        System.out.print("Digite o valor da hora do funcionário: ");
        int valorHora = teclado.nextInt();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = teclado.nextInt();

        int salario = valorHora * horasTrabalhadas;

        System.out.println("Número do funcionário " + numero +
                " recebe o salário de R$ " + salario);

        teclado.close();

    }
}
