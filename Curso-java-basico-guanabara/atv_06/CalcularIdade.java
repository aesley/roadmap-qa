package aesley.java_basico.atividades_guanabara.atv_06;
import java.util.Scanner;
import java.time.LocalDate;

public class CalcularIdade {
    public static void main(String[] args) {
        System.out.println("Calculo de idade informando o ano nascimento e ano atual!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int aNas= scanner.nextInt();
        System.out.print("Digite o ano atual: ");
        int aAtua = scanner.nextInt();
        int idade = aAtua - aNas;
        System.out.println("Idade: " + idade + " anos");

        System.out.println("Calculo de idade sem informar o ano atual!");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int aNasc= scanner.nextInt();
        int aAutoano = LocalDate.now().getYear();
        int idade2 = aAutoano - aNasc;
        System.out.println("Idade: " + idade + " anos");

    }
}
