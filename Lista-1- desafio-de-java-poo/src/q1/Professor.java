package q1;

public class Professor extends Funcionario{
    private int numMinDisc;

    public Professor() {
    }

    public Professor(String nome, String funcao, double salario, int numMinDisc) {
        super(nome, funcao, salario);
        this.setNumMinDisc(numMinDisc);
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    @Override
    public double aumentarSalario(float percentual) {
        if (getNumMinDisc() <= 2){
            setNumMinDisc(2);
            double aumDisc = getNumMinDisc() * 100; // aumento ṕor numero de disciplinas
            System.out.println("Aumento ṕor numero de disciplinas = " + aumDisc);
            double novoSalario = super.aumentarSalario(percentual); //salario com o aumento percentual
            this.setSalario(aumDisc + novoSalario); // novo salario a receber por paramentro
            return getSalario(); // retornando o novo salario
        } else {
            double aumDisc = ((getNumMinDisc() * 100)); // aumento ṕor numero de disciplinas
            System.out.println("Aumento ṕor numero de disciplinas = " + aumDisc);
            double novoSalario = super.aumentarSalario(percentual); //salario com o aumento percentual
            this.setSalario(aumDisc + novoSalario); // novo salario a receber por paramentro
            return getSalario(); // retornando o novo salario
        }
    }

    @Override
    public String exibir() {
        return "Professores" +
                ", Nome = " + getNome() +
                ", Função = " + getFuncao() +
                ", Salario = R$ " + getSalario() +
                ", Número de Disciplinas = " + getNumMinDisc();
    }


    public int getNumMinDisc() {
        return numMinDisc;
    }

    public void setNumMinDisc(int numMinDisc) {
        if (numMinDisc <= 2){
            this.numMinDisc = 2;
        } else {
            this.numMinDisc = numMinDisc;
        }
    }
}
