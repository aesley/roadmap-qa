package aesley.java_basico.atividades_guanabara.atv_07;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);

        int numero = 5;
        int valor = 5 + numero++;
        System.out.println("O valor da variavel valor: " + valor);
        System.out.println("O valor da variavel numero pos incrementada: " + numero);

        int x = 4;
        x *= 2;
        System.out.println("O valor da variavel x pos duplicada: " + x);

        int y = -10;
        float k = 9.5f;
        int resy = (int)Math.abs(y);
        float resk = (float)Math.floor(k);
        float resk2 = (float)Math.ceil(k);
        System.out.println("O valor absoluto de y: " + resy);
        System.out.println("O valor arrendado para baixo de k: " + resk);
        System.out.println("O valor arrendado para cima de k: " + resk2);

        float v = 8.4f;
        int ar = (int)Math.round(v);
        System.out.println(ar);

        double ale = Math.random();
        System.out.println(ale);
        int n = (int)(5 + ale * (10-5));
        System.out.println(n);
    }
}
