package aesley.java_basico.atividades_guanabara.atv_07;

import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor: ");

        int numero = scan.nextInt(); //entrada
        int resto = numero % 2; // calcula resto
        int elevado = (int) Math.pow(numero,3); //calcula elevado ao cubo
        double quadrado = (int) Math.sqrt(numero); //calcula a raiz quadrada
        double cubico = Math.cbrt(numero); //calcula a raiz cubica
        double absoluto = Math.abs(numero); //mostra o valor absoluto

        System.out.println("Resto da divisão por 2 é: " + resto);
        System.out.println("Elevado ao cubo é: " + elevado);
        System.out.println("Raiz quadrada é: " + quadrado);
        System.out.println("Raiz cúbica é: " + cubico);
        System.out.println("Valor absoluto é: " + absoluto);
    }
}
