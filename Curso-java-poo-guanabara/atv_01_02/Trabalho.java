package atv_01_02;

public class Trabalho {
    int horarioEntrada;
    int horarioSaida;
    String funcao = "";


    /*
     * horario de entrada 7
     * entre 7 e <=12 atrasado
     * entre 12 e <=13 meio periodo trabalhado
     * + de 13 não é computado
     */
    void veioTrabalhar(){
        if (horarioEntrada < 7 && horarioEntrada >=5) {
            System.out.println("Veio mais cedo");
        } else if (horarioEntrada == 7 ){
            System.out.println("Chegou no horario certo");
        } else if (horarioEntrada > 7  && horarioEntrada <=12) {
            System.out.println("Atrasado para trabalho");
        } else if (horarioEntrada > 12 && horarioEntrada <= 13){
            System.out.println("So trabalho meio periodo");
        } else {
            System.out.println("Esta vindo de besta não é aceito após as 13");
        }
    }
    /*
     * horario de saida 18
     * entre 12 e > 18 saiu mais cedo
     * entre 8 e > 12 vai precisar de atestado
     * fora disso não veio dar ai aos amigos
     */
    void saiuDoTrabalho(){
        if (horarioSaida == 18){
            System.out.println("Saiu no horario certo");
        } else if (horarioSaida < 18 && horarioSaida >= 12 ) {
            System.out.println("Saiu mais cedo do trabalho");
        } else if (horarioSaida < 12 && horarioSaida >= 8) {
            System.out.println("Vai precisar de atestado pra justificar a saida");
        } else if (horarioSaida >18 && horarioSaida <= 20){
            System.out.println("Ficou até mais tarde");
        } else {
            System.out.println("Esqueceu de bater o ponto");
        }
    }
    /*
     * retorna a funcao do trabalhador: vendedor, caixa, entragador
     * .equals verifica se o campo está digitado igual a string
     * se não for igual vc nao é funcionário daqui
     */
    void funcaoTrabalho(){
        if (funcao.equals("vendedor")){
            System.out.println("Vendedor");
        } else if (funcao.equals("caixa")) {
            System.out.println("Caixa");
        } else if (funcao.equals("entregador")) {
            System.out.println("Entregador");
        } else {
            System.out.println("Voce não é funcionario aqui!");
        }
    }
    void extraTrabalho(){ //hora extra de 2 horas antes ou depois do trabalho
        if ((horarioEntrada < 7 && horarioEntrada >=5) || (horarioSaida > 18 && horarioSaida <= 20)){
            System.out.println("hora extra");
        } else {
            System.out.println("Deve tá na amante fingindo extra");
        }
    }
}
