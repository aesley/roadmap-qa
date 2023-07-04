package atv_12;

public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("Enterrando Osso");
    }
    public void abanarRabo(){
        System.out.println("Abanar o rabo");
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
        System.out.println("Corre de 4 patas");
    }

    @Override
    public void alimentar() {
        super.alimentar();
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au");
    }

    @Override
    public String toString() {
        return "Cachorro do tipo: " + super.toString();
    }

}
