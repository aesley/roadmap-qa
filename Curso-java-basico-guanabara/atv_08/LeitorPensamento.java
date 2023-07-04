package aesley.java_basico.atividades_guanabara.atv_08;
import java.util.Random;
import java.util.Scanner;

public class LeitorPensamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao;

        do {
            System.out.println("DESEJA JOGAR UM JOGO DE ADIVINHAR?");
            System.out.println("1. INICIAR");
            System.out.println("2. SAIR");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    jogar(scanner, random);
                    break;
                case 2:
                    System.out.println("MEDROSO, SAINDO...");
                    break;
                default:
                    System.out.println("DIGITE 1 OU 2!!!");
            }

            System.out.println();
        } while (opcao != 2);
    }

    public static void jogar(Scanner scanner, Random random) {
        boolean continuar;

        do {
            System.out.println("VOU PENSAR EM UM NUMERO ENTRE 1 E 5. TENTE ADIVINHAR!");

            int num = random.nextInt(5) + 1;
            int palpite;

            do {
                System.out.print("DIGITE O SEU PALPITE: ");
                palpite = scanner.nextInt();

                if (palpite < num) {
                    System.out.println("O NÚMERO ERA MAIOR QUE ESSE!");
                } else if (palpite > num) {
                    System.out.println("O NÚMERO ERA MENOR QUE ESSE!");
                } else {
                    System.out.println("ACERTOU MIZERAVI!!! ");
                }
            } while (palpite != num);

            System.out.print("DESEJA CONTINUAR? (1 - Sim, 2 - Não): ");
            int resposta = scanner.nextInt();
            continuar = resposta == 1;
            System.out.println();
        } while (continuar);
    }
}
