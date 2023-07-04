package aesley.java_basico.atividades_guanabara.atv_08;

import java.time.LocalDate;
import java.util.Scanner;

public class AptoVoto {
    public static void main(String[] args) {
        System.out.println("Calculo de idade Para saber se está apto a Votar");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int aNasc = scanner2.nextInt();
        int aAutoano = LocalDate.now().getYear();
        int idade2 = aAutoano - aNasc;
        String sit = ((idade2 >= 16 && idade2 < 18) || (idade2 > 70)) ? "Opcional" : "Voto Obrigatório";
        System.out.print("Sua idade é: " + idade2 + ", a sua situação é: " + sit);
        scanner2.close();
    }
}
