package atv_10_11;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberAum(float aum){
        this.salario += aum;
    }

    @Override
    public String toString() {
        return super.toString() + ", especialidade = " + especialidade + ", salario R$ = " + salario;
    }
}
