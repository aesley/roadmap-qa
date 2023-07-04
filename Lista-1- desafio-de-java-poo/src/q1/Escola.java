package q1;

public class Escola {
    public static void main(String[] args) {
        System.out.println("Teste de instanciaciaçao de funcionário");
        Funcionario[] f = new Funcionario[3];
        f[0] = new Funcionario("Aeley", "Professor", 50f);
        f[1] = new Funcionario("Aeley", "Professor", 100f);
        f[2] = new Funcionario("Aeley", "Professor", 150f);

        for (int i = 0; i < f.length; i++) {
            System.out.println("Funcionario " + i);
            System.out.println("Salario base " + f[i].getSalario());
            System.out.println(f[i].aumentarSalario(10));
            System.out.println(f[i].exibir());
            System.out.println("-------------");
        }

        System.out.println("\nTeste de instanciação de professor");

        Professor[] p = new Professor[5];

        p[0] = new Professor("Aeley", "Professor0", 100.0f, 0);
        p[1] = new Professor("Aeley", "Professor1", 100.0f, 1);
        p[2] = new Professor("Aeley", "Professor2", 100.0f, 2);
        p[3] = new Professor("Aeley", "Professor3", 100.0f, 3);
        p[4] = new Professor("Aeley", "Professor4", 100.0f, 4);
        //p.aumentarSalario(10);

        for (int i = 0; i < p.length; i++) {
            System.out.println("Com " + i + " disciplinas");
            System.out.println("Salario base: " + p[i].getSalario());
            System.out.println(p[i].aumentarSalario(10));
            System.out.println(p[i].exibir());
            System.out.println("-------------");
        }




    }
}