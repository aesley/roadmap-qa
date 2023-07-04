package atv_07_08;

import java.util.Random;

public class Luta {
    private Lutador desafiado;  // instância da classe lutador, sendo um tipo abstrato de dados;
    private Lutador desafiante; // instância da classe lutador, sendo um tipo abstrato de dados;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
                this.aprovada = true;
                this.desafiado = l1;
                this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("~~ DESAFIADO :>) ~~");
            this.desafiado.apresentar();

            System.out.println("~~ DESAFIANTE ;) ~~");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println(" ---- RESULTADO DA LUTA ---- ");
            switch (vencedor){
                case 0: // Empate
                    System.out.println("Empate!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1: // Desafiado vence
                    System.out.println("Vitória do: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiante vence
                    System.out.println("Vitória do: " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println(" ---- FIM RESULTADO ---- ");
        } else {
            System.out.println("A luta não foi aprovada, não pode acontecer!");
        }
    }
}
