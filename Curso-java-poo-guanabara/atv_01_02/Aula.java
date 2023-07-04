package atv_01_02;

import java.time.LocalTime;

public class Aula {
    String conteudo;
    float duracao;
    int data;
    int hora;
    boolean semaula;
    void comecarAula(){
        if (duracao <= 0){
            System.out.println("Aula 2 não iniciada");
        } else {
            System.out.println("Aula 2 iniciou");
        }
    }
    void fimAula(){
        if (duracao <=20.38){
            System.out.println("Aula não acabou");
        } else {
            System.out.println("Aula acabou");
        }
    }
    void aulaData(){
        if (data < 0 || data > 31){
            System.out.println("Dia invalido");
        } else {
            System.out.println("Dia valido");
        }
    }
    void aulaCancelada(){
        this.semaula = false;
        System.out.println("Aula cancelada");
    }
    void aulaNormal(){
        this.semaula = true;
        System.out.println("Aula normal");
    }
    void aulaConteudo(){
        if (conteudo.isEmpty()){
            System.out.println("Aula Não Planejada");
        } else {
            System.out.println("Aula Planejada");
        }
    }
    void retornaHora() {
        LocalTime horaAtual = LocalTime.now();
        this.hora = horaAtual.getHour();
    }
}
