package q1;

public class Funcionario {
    private String nome, funcao;
    private double salario;
    private static int numFuncionarios;

    public Funcionario() {
    }

    public Funcionario(String nome, String funcao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getNumFuncionarios() {
        return numFuncionarios;
    }

    public static void setNumFuncionarios(int numFuncionarios) {
        Funcionario.numFuncionarios = numFuncionarios;
    }

    public double aumentarSalario(float percentual){
        if (percentual != 0) {
            salario += (salario * percentual * 0.01);
            System.out.println("Você recebeu um aumento de: " + percentual + "% seu novo salario é R$ " + salario);
        } else {
            System.out.println("Você recebeu um aumento de: " + percentual + "% kkk");
        }
        return salario;
    }

    public String exibir() {
        return "Funcionario" +
                ", nome = " + nome +
                ", funcao = " + funcao +
                ", salario = R$ " + salario;
    }
}
