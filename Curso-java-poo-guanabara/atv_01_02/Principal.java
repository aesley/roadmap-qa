package atv_01_02;

public class Principal {
    public static void main(String[] args) {

        System.out.println("\n ----- ex1:caneta ----- \n");

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;

        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println(" ----- ex2:caneta ----- \n");

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "preta";

        c2.destampar();
        c2.status();
        c2.rabiscar();

        System.out.println(" ----- ex1:aula ----- \n");

        Aula a1 = new Aula();
        a1.conteudo = "Instanciando classes";
        a1.data = 30;
        a1.duracao = 19.3f;

        a1.aulaNormal();
        a1.aulaConteudo();
        a1.aulaData();
        a1.comecarAula();
        a1.fimAula();
        a1.retornaHora();
        System.out.println("Hora atual: " + a1.hora + "\n");

        System.out.println(" ----- ex2: aula ----- \n");

        Aula a2 = new Aula();
        a2.conteudo = "";
        a2.data = 32;
        a2.duracao = 35;

        a2.aulaCancelada();
        a2.aulaConteudo();
        a2.aulaData();
        a2.comecarAula();
        a2.fimAula();
        a2.retornaHora();
        System.out.println("Hora atual: " + a2.hora + "\n");

        System.out.println(" ----- ex1:trabalho ----- \n");

        Trabalho t1 = new Trabalho();
        t1.horarioEntrada = 6;
        t1.horarioSaida = 18;
        t1.funcao = "caixa";

        t1.funcaoTrabalho();
        t1.veioTrabalhar();
        t1.saiuDoTrabalho();
        t1.extraTrabalho();

        System.out.println("\n ----- ex2:trabalho ----- \n");

        Trabalho t2 = new Trabalho();
        t2.horarioEntrada = 11;
        t2.horarioSaida = 20;
        t2.funcao = "entregador";

        t2.funcaoTrabalho();
        t2.veioTrabalhar();
        t2.saiuDoTrabalho();
        t2.extraTrabalho();

    }
}