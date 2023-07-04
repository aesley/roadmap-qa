package atv_04;
/*
 * Objeto: Televisao
 * atributos: tela, botoes, cor, marca
 * metodos: statusTV
 */
public class Televisao {
    protected float tela;
    protected int botoes;
    protected String cor;
    protected String marca;

    public Televisao(float tela, int botoes, String cor, String marca) {
        this.tela = tela;
        this.botoes = botoes;
        this.cor = cor;
        this.marca = marca;
    }

    public float getTela() {
        return tela;
    }

    public void setTela(float tela) {
        this.tela = tela;
    }

    public int getBotoes() {
        return botoes;
    }

    public void setBotoes(int botoes) {
        this.botoes = botoes;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void statusTV(){
        System.out.println("SOBRE A TV");
        System.out.println("TELA: " + this.getTela());
        System.out.println("COR: " + this.getCor());
        System.out.println("MARCA: " + this.getMarca());
        System.out.println("BOTOES: " + this.getBotoes());
    }
}
