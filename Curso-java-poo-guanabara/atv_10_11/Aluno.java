package atv_10_11;

public class Aluno extends Pessoa{
    private int matr;
    private String curso;

    @Override
    public String toString() {
        return super.toString() + " matricula = " + matr + ", curso = " + curso;
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatr(){
        System.out.println("Matricula será cancelada!");
    }

    public void pagarMensalidade(){
        if (this.getMatr() != 0){
            System.out.println("Esta matriculado e paga mensalidade");
        } else {
            System.out.println("Não está matriculado, não precisa pagar");
        }
    }

}
