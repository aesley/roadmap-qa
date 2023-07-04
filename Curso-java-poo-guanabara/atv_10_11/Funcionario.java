package atv_10_11;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrab(){
        this.trabalhando = !this.trabalhando;
    }

    @Override
    public String toString() {
        return super.toString() + ", setor" + setor + ", status trabalhando = " + trabalhando;
    }
}
