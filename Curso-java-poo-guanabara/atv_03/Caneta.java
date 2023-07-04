package atv_03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    public void status(){
        System.out.println("Modelo: " + this.modelo +
                "\nCor da caneta: " + this.cor +
                "\nPonta: " + this.ponta +
                "\nCarga: " + this.carga +
                "\nEstá tampada: " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Impossivel riscar\n");
        } else {
            System.out.println("Dá pra rabiscar\n");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
