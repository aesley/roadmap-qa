package atv_12;

public class Canguru extends Mamifero{
    public void usarBolsa(){
        System.out.println("Possui uma bolsa para os filhotes");
    }

    @Override
    public float getPeso() {
        return super.getPeso();
    }

    @Override
    public void setPeso(float peso) {
        super.setPeso(peso);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public int getMembros() {
        return super.getMembros();
    }

    @Override
    public void setMembros(int membros) {
        super.setMembros(membros);
    }

    @Override
    public String getCorPelo() {
        return super.getCorPelo();
    }

    @Override
    public void setCorPelo(String corPelo) {
        super.setCorPelo(corPelo);
    }

    @Override
    public void locomover() {
        System.out.println("Pulando");
    }

    @Override
    public void alimentar() {
        super.alimentar();
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
    }

    @Override
    public String toString() {
        return "Canguro do tipo: " + super.toString();
    }
}
