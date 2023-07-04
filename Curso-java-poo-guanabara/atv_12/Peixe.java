package atv_12;

public class Peixe extends Animal{
    protected String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas e substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Não emite som");
    }

    @Override
    public String toString() {
        return "Peixe: " +
                "corEscama = " + corEscama +
                ", peso = " + peso +
                ", idade = " + idade +
                ", membros = " + membros;
    }
}
