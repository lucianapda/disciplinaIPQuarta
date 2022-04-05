import java.util.Scanner;

public class Escolha {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite uma opção (1, 2 ou 3): ");
        int opcao = s.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                System.out.println("Linha 2 do case 2");
                break;
            case 3:
                System.out.println("Entre na Opção 3");
            case 4:
                System.out.println("Opção 4");
                break;

            default:
                System.out.println("Opção inválida");
        }

        s.close();
    }
}
