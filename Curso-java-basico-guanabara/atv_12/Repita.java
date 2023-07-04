package aesley.java_basico.atividades_guanabara.atv_12;

import java.util.Scanner;

public class Repita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, contador = 0, pares = 0, impares = 0, nm100 = 0;
        float media;
        String input;

        do {
            System.out.print("Informe um número (valor 0 interrompe programa): ");
            input = scanner.nextLine();

            if (!input.equals("0")) {
                try {
                    int numero = Integer.parseInt(input);
                    soma += numero;
                    contador++;
                    if (numero % 2 == 0) {
                        pares++;
                    } else {
                        impares++;
                    }
                    if (numero > 100) {
                        nm100++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Número inválido. Por favor, digite um número inteiro.");
                }
            }
        } while (!input.equals("0"));

        media = contador > 0 ? (float) soma / contador : 0;

        System.out.println("-------------- Relatório --------------");
        System.out.println("O Valor do somatório: " + soma);
        System.out.println("A quantidade de números digitados: " + contador);
        System.out.println("A quantidade de números pares: " + pares);
        System.out.println("A quantidade de números ímpares: " + impares);
        System.out.println("A quantidade de números acima de 100: " + nm100);
        System.out.println("A média dos valores digitados: " + media);
        System.out.println("----------------------------------------");
    }
}
