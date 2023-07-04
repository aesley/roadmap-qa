package aesley.java_basico.atividades_guanabara.atv_10;

import java.time.LocalDate;
import java.util.Scanner;

public class VotaNaoVota {
    public static void main(String[] args) {
        System.out.println("Calculo para saber se vota ou não vota!?");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int aNasc = scanner.nextInt();
        int aAutoano = LocalDate.now().getYear();
        int id = aAutoano - aNasc;
        if (id < 16) {
            System.out.println("Não vota, " + id + " anos");
        } else {
            if (((id >= 16) && (id < 18)) || (id > 70)) {
                System.out.println("Opcicional, " + id + " anos");
            } else {
                System.out.println("Obrigatório, " + id + "anos");
            }
        }
    }
}