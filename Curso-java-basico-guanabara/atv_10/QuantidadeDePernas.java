package aesley.java_basico.atividades_guanabara.atv_10;

import java.util.Scanner;

public class QuantidadeDePernas {
    public static void main(String[] args) {
        System.out.println("Me diga quantas pernas o bicho tem, que eu informo o que ele é!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pernas: ");
        int pernas = scanner.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println("Ele é do tipo: " + tipo);
    }
}
