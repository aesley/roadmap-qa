package aesley.java_basico.atividades_guanabara.atv_13;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicio = 0;
        int fim = 0;
        int passo = 0;

        while (true) {
            System.out.print("Digite o início: ");
            inicio = scanner.nextInt();

            System.out.print("Digite o fim: ");
            fim = scanner.nextInt();

            System.out.print("Digite o passo: ");
            passo = scanner.nextInt();

            if (passo == 0) {
                System.out.println("O passo não pode ser zero.");
            } else if ((inicio <= fim && passo < 0) || (inicio >= fim && passo > 0)) {
                System.out.println("A contagem não é possível com os valores fornecidos.");
            } else {
                break; // Sai do loop se as variáveis estiverem corretas
            }
        }

        System.out.print("Contagem: ");

        if (inicio <= fim) {
            for (int i = inicio; i <= fim; i += passo) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = inicio; i >= fim; i += passo) {
                System.out.print(i + " ");
            }
        }
    }
}
