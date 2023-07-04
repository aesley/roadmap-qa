package atv_10_11;

public class Bolsista extends Aluno{
    private int bolsa;

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return super.toString() + ", bolsa = " + bolsa;
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno(a): " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        if (this.getMatr() != 0 ){
            System.out.println("Esta matriculado e paga mensalidade");
        } else {
            System.out.println("Não está matriculado, não precisa pagar");
        }
        System.out.println(this.getNome() + " é bolsista! Pagamento com desconto!");
    }
}
