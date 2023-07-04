package aesley.java_basico.atividades_guanabara.atv_14;

import java.util.Arrays;
import java.util.Scanner;

public class VetorExercicio {
    public static void main(String[] args) {

        int[] vetor;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor:");
        int tamanho = ler.nextInt();
        vetor = new int[tamanho];

        // o método deve incluir um inteiro a cada posiçao do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Insira o " + (i + 1) + "º valor: ");
            vetor[i] = ler.nextInt();
        }

        // Menu de opções
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("---------------------------");
            System.out.println("|   O que deseja fazer?   |");
            System.out.println("---------------------------");
            System.out.println("| 1 - Ordenar vetor       |");
            System.out.println("| 2 - Alterar elemento    |");
            System.out.println("| 3 - Pesquisar elemento  |");
            System.out.println("| 4 - Mostrar vetor       |");
            System.out.println("| 5 - Sair                |");
            System.out.println("---------------------------");
            System.out.println("Selecione a opção desejada:");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    // Ordenar vetor
                    Arrays.sort(vetor);
                    System.out.println("Vetor ordenado:");
                    for (int valor : vetor) {
                        System.out.print(valor + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    // Alterar elemento
                    System.out.println("Digite a posição do elemento a ser alterado: ");
                    int posicao = ler.nextInt();
                    while (posicao >= vetor.length || posicao < 0) {
                        System.out.println("Não existe a " + posicao + "ª posição no vetor.");
                        System.out.println("Digite um valor da posição 0º até a posição " + (vetor.length - 1) + "º: ");
                        posicao = ler.nextInt();
                    }
                    System.out.println("Digite o número a ser substituído: ");
                    int elemento = ler.nextInt();
                    vetor[posicao] = elemento;
                    System.out.println("Elemento alterado com sucesso!");
                    break;
                case 3:
                    // Pesquisar elemento
                    System.out.println("Digite o número que deseja pesquisar no vetor: ");
                    int numeroPesquisado = ler.nextInt();
                    int posicaoPesquisada = -1;
                    for (int i = 0; i < vetor.length; i++) {
                        if (numeroPesquisado == vetor[i]) {
                            System.out.println("O número pesquisado encontra-se na posição " + i + "º.");
                            posicaoPesquisada = i;
                            break;
                        }
                    }
                    if (posicaoPesquisada == -1) {
                        System.out.println("O número pesquisado não se encontra no vetor.");
                    }
                    break;
                case 4:
                    // Mostrar vetor
                    System.out.println("Vetor:");
                    for (int valor : vetor) {
                        System.out.print(valor + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                    // Sair do programa
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
            }
        }
    }
}
