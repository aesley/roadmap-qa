package q3;

public class Livro {
    private int codId;
    private String nome, editora;


    public Livro() {
    }

    public Livro(int codId, String nome, String editora) {
        this.codId = codId;
        this.nome = nome;
        this.editora = editora;

    }

    public int getCodId() {
        return codId;
    }

    public void setCodId(int codId) {
        this.codId = codId++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

}
