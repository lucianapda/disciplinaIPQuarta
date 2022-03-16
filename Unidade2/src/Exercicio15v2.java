import java.util.Scanner;

public class Exercicio15v2 {
    public static void main(String[] args) {
        double valor;
        int cedulas, moedas;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um valor com duas casas decimais: R$");
        valor = teclado.nextDouble();

        cedulas = ((int) (valor * 100)) / 100;
        moedas = ((int) (valor * 100))  % 100;

        //Cédulas:
        System.out.println((cedulas / 100) + " notas de R$100,00");
        cedulas = cedulas % 100;

        System.out.println((cedulas / 50) + " notas de R$50,00");
        cedulas = cedulas % 50;

        System.out.println((cedulas / 20) + " notas de R$20,00");
        cedulas %= 20;

        System.out.println((cedulas / 10) + " notas de R$10,00");
        cedulas %= 10;

        System.out.println((cedulas / 5) + " notas de R$5,00");
        cedulas %= 5;

        System.out.println((cedulas / 2) + " notas de R$2,00");
        System.out.println((cedulas % 2) + " moedas de R$1,00");

        //Moedas:
        System.out.println((moedas / 50) + " moedas de R$0,50");
        moedas = moedas % 50;

        System.out.println((moedas / 25) + " moedas de R$0,25");
        moedas = moedas % 25;

        System.out.println((moedas / 10) + " moedas de R$0,10");
        moedas = moedas % 10;

        System.out.println((moedas / 5) + " moedas de R$0,05");
        System.out.println((moedas % 5) + " moedas de R$0,01");


        teclado.close();

    }
}
