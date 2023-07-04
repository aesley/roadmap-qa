package aesley.java_basico.atividades_guanabara.atv_14;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v : vet) {
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 3);
        System.out.println("Encontrei o valor na posição: " + p);
    }
}
