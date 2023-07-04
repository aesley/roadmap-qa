package aesley.java_basico.atividades_guanabara.atv_15;

public class Contador {
    public static String contar(int i, int f) {
        String s = "";
        for (int c = i; c<= f; c++){
            s += c + " ";
        }
        return s;
    }
}
