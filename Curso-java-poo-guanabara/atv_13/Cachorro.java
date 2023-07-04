package atv_13;

public class Cachorro extends Lobo {
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
        super.locomover();
    }

    @Override
    public void alimentar() {
        super.alimentar();
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au Au");;
    }

    @Override
    public String toString() {
        return "Sou um Cachorro decendente de: " + super.toString();
    }

    public void reagir(String frase){
        System.out.println("Teste reagir frase");
        if (frase.equals("toma comida") || frase.equals("Olá") ){
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min){
        System.out.println("Teste reagir hora");
        if (hora < 12){
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
        }
    }

    public void reagir(boolean dono){
        System.out.println("Teste reagir dono");
        if (dono = true){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
        }
    }
    public void reagir(int idade, float peso){
        System.out.println("Teste reagir idade e peso");
        if (idade < 5) {
            if (peso < 10){
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else  {
            if (peso < 10){
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
