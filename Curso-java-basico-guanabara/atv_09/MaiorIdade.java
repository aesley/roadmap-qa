package aesley.java_basico.atividades_guanabara.atv_09;

import java.time.LocalDate;
import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        System.out.println("Calculo para saber se é maior ou menor de idade!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int aNasc = scanner.nextInt();
        int aAutoano = LocalDate.now().getYear();
        int idade = aAutoano - aNasc;
        if (idade >=18){
            System.out.println("É de Maior: " + idade + " anos");
        } else {
            System.out.println("É de Menor: " + idade + " anos");
        }
    }
}
