package aesley.java_basico.atividades_guanabara.atv_08;

public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
        //caso queiramos comparar com o nome3 precisamos usar outra técnica
        String res2;
        res2 = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res2);


    }
}
