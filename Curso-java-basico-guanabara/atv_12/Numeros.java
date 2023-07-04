package aesley.java_basico.atividades_guanabara.atv_12;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int n, s = 0;
        String res;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Quer continuar? [S / N]");
            res = teclado.next();
        } while (res.equals("S"));
        System.out.println("A soma de todos os valores é: " + s);
    }
}
