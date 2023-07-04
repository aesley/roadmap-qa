package aesley.java_basico.atividades_guanabara.atv_14;

import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args) {
        String meses[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago",
                "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        // Verificar se o ano é bissexto
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            dias[1] = 29; // Ajustar o número de dias de fevereiro para 29
        }

        for (int c = 0; c < meses.length; c++) {
            System.out.println("O mês de " + meses[c] + " tem " + dias[c] + " dias ao todo!");
        }
    }
}
