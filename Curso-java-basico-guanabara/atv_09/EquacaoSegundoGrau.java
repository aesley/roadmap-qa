package aesley.java_basico.atividades_guanabara.atv_09;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o valor de A = ");
        Double a = tec.nextDouble();
        System.out.print("Digite o valor de B = ");
        Double b = tec.nextDouble();
        System.out.print("Digite o valor de C = ");
        Double c = tec.nextDouble();
        Double d = ((Math.pow((Double)Math.abs(b), 2)) - (4 * a * c));
        System.out.println("O valor do Delta = " + d);
        Double raiz = (Double) Math.sqrt(d);
        if (d < 0) {
            System.out.println("Não exitem raizes reais");
        } else {
            Double x1 = (-b + raiz)/(2 * a);
            Double x2 = (-b - raiz)/(2 * a);
            System.out.println("Exitem raizes reais...");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
