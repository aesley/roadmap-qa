package atv_01_02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Modelo: " + this.modelo +
                "\nCor da caneta: " + this.cor +
                "\nPonta: " + this.ponta +
                "\nCarga: " + this.carga +
                "\nEstá tampada: " + this.tampada);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Impossivel riscar\n");
        } else {
            System.out.println("Dá pra rabiscar\n");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
