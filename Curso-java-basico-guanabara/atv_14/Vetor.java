package aesley.java_basico.atividades_guanabara.atv_14;

public class Vetor {
    public static void main(String[] args) {
        int n[] = {0, 1, 2, 4, 7};
        System.out.println("Tamanho do meu vetor é: " + n.length);
        for (int c = 0; c <= n.length; c++){
            System.out.println("Na posição: "+ c + " temos o valor -> " + n[c]);
        }
    }
}
