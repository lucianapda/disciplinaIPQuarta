import java.util.Scanner;

public class Unid6Exe5 {

    public Unid6Exe5() {
        Scanner teclado = new Scanner(System.in);

        String perguntas[] = { "Gosta de música sertaneja?",
                "Gosta de futebol?", "Gosta de seriados?",
                "Gosta de redes sociais?","Gosta da Oktoberfest?" };

        String[] vMoca = lerRespostas(perguntas, teclado);
        String vRapaz[] = lerRespostas(perguntas, teclado);

        int afinidade = calcularAfinidade(vRapaz, vMoca);
        
        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 /*&& afinidade <= 14*/) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if(afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro");
        } else if (afinidade <= -1 && afinidade >= -9) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }

        teclado.close();
    }

    public String[] lerRespostas(String[] perguntas, Scanner s) {
        String[] vRespostas = new String[5];

        //Vetor Moça        
        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i]);
            vRespostas[i] = s.next();
        }

        return vRespostas;
    }

    public int calcularAfinidade(String[] vRapaz, String[] vMoca) {
        int afinidade = 0;

        for (int i = 0; i < vRapaz.length; i++) {
            //Se Rapaz e Moça tiveram a MESMA Resposta
            if (vRapaz[i].trim().equalsIgnoreCase(vMoca[i].trim())) {
                afinidade += 3;
                
                //Um é indiferente:
            } else if (vRapaz[i].trim().equalsIgnoreCase("Ind") ||
                    vMoca[i].trim().equalsIgnoreCase("Ind")) {
                afinidade += 1;
            } else {
                afinidade -= 2;
            }
        }

        return afinidade;
    }

    public static void main(String[] args) {
        new Unid6Exe5();
    }
}