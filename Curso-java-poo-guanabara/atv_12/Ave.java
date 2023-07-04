package atv_12;

public class Ave extends Animal{
    protected String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("Faz ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Come insetos e animais pequenos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emite som de ave");
    }

    @Override
    public String toString() {
        return "Ave" +
                ", corPena = " + corPena +
                ", peso = " + peso +
                ", idade = " + idade +
                ", membros = " + membros;
    }
}
