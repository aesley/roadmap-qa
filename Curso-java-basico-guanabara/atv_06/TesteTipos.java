package aesley.java_basico.atividades_guanabara.atv_06;

public class TesteTipos {
    public static void main(String[] args) {
        int idade1 = 30;
        String valor = Integer.toString(idade1);
        System.out.println("Convertendo int em string: " + valor);

        String valor1 = "35";
        int idade2 = Integer.parseInt(valor1);
        System.out.println("Convertendo string em int: " + idade2);

        String valor2 = "30.5";
        float idade3 = Float.parseFloat(valor2);
        System.out.println("Convertendo string em float: " + valor2);
    }
}
