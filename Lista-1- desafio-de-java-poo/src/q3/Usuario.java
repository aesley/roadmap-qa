package q3;

public class Usuario {
    private int codigo;
    private String nome, cpf;

    public Usuario() {
    }

    public Usuario(int codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double calcularMulta(int diasAtraso) {
        double multa = 0.0;
        if (this instanceof Monitor) { // validação: verifica se o usuário é um monitor
            if (diasAtraso > 30) {
                multa = (diasAtraso - 30) * 1.0;
            }
        } else {
            if (diasAtraso > 15) {
                multa = (diasAtraso - 15) * 1.0;
            }
        }
        return multa;
    }
}
