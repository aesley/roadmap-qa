package atv_07_08;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.getPeso() < 52.2){
            this.categoria = "Invalido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public String toString() {
        return "Lutador{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", categoria='" + categoria + '\'' +
                ", idade=" + idade +
                ", vitorias=" + vitorias +
                ", derrotas=" + derrotas +
                ", empates=" + empates +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }

    public void apresentar(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("CHEGOU A HORA!");
        System.out.println("APRESENTAMOS O LUTADOR: " + this.getNome());
        System.out.println("DIRETAMENTE DO(A): " + this.getNacionalidade());
        System.out.println(this.getIdade() + " Anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitorias() + " lutas");
        System.out.println("Perdeu: " + this.getDerrotas() + " lutas");
        System.out.println("Empatou : " + this.getEmpates() + " lutas");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println(this.getCategoria());
        System.out.println(this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " V");
        System.out.println(this.getDerrotas() + " D");
        System.out.println(this.getEmpates() + " E");
    }

    public void ganharLuta(){
        this.setVitorias((this.getVitorias()) + 1);
    }
    public void perderLuta(){
        this.setDerrotas((this.getDerrotas() + 1));
    }
    public void empatarLuta(){
        this.setEmpates((this.getEmpates() + 1));

    }

}
