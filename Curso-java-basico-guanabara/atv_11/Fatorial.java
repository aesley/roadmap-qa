package aesley.java_basico.atividades_guanabara.atv_11;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Descubra o fatorial de um número!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = scanner.nextInt();
        int fatorial = 1;
        int contador = num;
        String sequencia = "";

        while (contador >= 1) {
            fatorial *= contador;
            sequencia += contador + (contador != 1 ? " * " : "");
            contador--;
        }

        System.out.println("O fatorial de " + num + " é: " + sequencia + " = " + fatorial);
    }
}
