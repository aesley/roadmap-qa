package aesley.java_basico.atividades_guanabara.atv_10;

import java.util.Scanner;

public class TipoDeTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ld1, ld2, ld3;
        System.out.print("Digite o primeiro lado: ");
        ld1 = scanner.nextDouble();
        System.out.print("Digite o segundo lado: ");
        ld2 = scanner.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        ld3 = scanner.nextDouble();

        boolean eq = (ld1 == ld2) && (ld2 == ld3);
        boolean es = (ld1 != ld2) && (ld2 != ld3) && (ld1 != ld3);
        boolean tri = (ld1 < ld2 + ld3) && (ld2 < ld1 + ld3) && (ld3 < ld1 + ld2);

        if (tri) {
            System.out.println("Esses lados formam um triângulo");
            if (eq) {
                System.out.println("O triângulo é Equilátero");
            } else if (es) {
                System.out.println("O triângulo é Escaleno");
            } else {
                System.out.println("O triângulo é Isósceles");
            }
        } else {
            System.out.println("Esses lados não formam um triângulo");
        }
    }
}
