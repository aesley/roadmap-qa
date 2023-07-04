package aesley.java_basico.atividades_guanabara.atv_09;

import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        float n1 = tec.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        float n2 = tec.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua media foi: " + m);
        if (m >= 9){
            System.out.println("Parabens!");
        }
    }
}
