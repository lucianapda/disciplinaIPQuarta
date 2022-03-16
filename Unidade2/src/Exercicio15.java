import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args) throws Exception {
        
        int nota100, nota50;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um valor com duas casas decimais: R$");
        double valor = teclado.nextDouble();

        int valorInteiro = (int) (valor * 100);

        int cedulas = valorInteiro / 100;
        int moedas = valorInteiro % 100;

        //Cédulas:
        nota100 = cedulas / 100;
        cedulas = cedulas % 100;

        nota50 = cedulas / 50;
        cedulas = cedulas % 50;

        int nota20 = cedulas / 20;
        cedulas %= 20;

        int nota10 = cedulas / 10;
        cedulas %= 10;

        int nota5 = cedulas / 5;
        cedulas %= 5;

        int nota2 = cedulas / 2;
        int moeda1 = cedulas % 2;

        //Moedas:
        int moeda50 = moedas / 50;
        moedas = moedas % 50;

        int moeda25 = moedas / 25;
        moedas = moedas % 25;

        int moeda10 = moedas / 10;
        moedas = moedas % 10;

        int moeda5 = moedas / 5;
        int moeda01 = moedas % 5;


        System.out.println(nota100 + " notas de R$100,00\n" +
            nota50 + " notas de R$50,00 \n" + nota20 + " notas de R$20,00\n" +
            nota10 + " notas de R$10,00\n" + nota5 + " notas de R$5,00\n"+
            nota2 + " notas de R$2,00\n" + moeda1 + " moedas de R$1,00\n"+
            moeda50 + " moedas de R$0,50\n" + moeda25 + " moedas de R$0,25\n"+
            moeda10 + " moedas de R$0,10\n" + moeda5 + " moedas de R$0,05\n"+
            moeda01 + " moedas de R$0,01");
            teclado.close();
    }
}
