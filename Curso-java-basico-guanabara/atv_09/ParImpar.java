package aesley.java_basico.atividades_guanabara.atv_09;

import java.time.LocalDate;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        System.out.println("Descubra se o numero é par ou impar!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println(num + " é Par!" );
        } else {
            System.out.println(num + " é Impar!");
        }
    }
}
