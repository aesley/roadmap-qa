package atv_10_11;

public class Principal {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Funcionario f1 = new Funcionario();
        Bolsista b1 = new Bolsista();

        v1.setNome("Aesley");
        v1.setSexo("Mas");
        v1.setIdade(35);
        v1.fazerAniv();

        a1.setNome("Nayana");
        a1.setSexo("Fem");
        a1.setIdade(35);
        a1.setMatr(121212);
        a1.setCurso("Psicologia");
        a1.pagarMensalidade();

        p1.setNome("Dayana");
        p1.setSexo("Fem");
        p1.setIdade(35);
        p1.setEspecialidade("Protetora do tempo");
        p1.setSalario(9500f);

        f1.setNome("Maria");
        f1.setIdade(40);
        f1.setSexo("Fem");
        f1.setTrabalhando(false);
        f1.setSetor("Serviços Gerais");

        b1.setNome("Roberta");
        b1.setSexo("Fem");
        b1.setIdade(35);
        b1.setMatr(121666);
        b1.setCurso("Psicologia");
        b1.setBolsa(500);
        b1.renovarBolsa();
        b1.pagarMensalidade();

        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(p1.toString());
        System.out.println(f1.toString());
        System.out.println(b1.toString());





    }
}
