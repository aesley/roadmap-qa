package atv_04;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return  this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void desampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("MODELO: " + this.getModelo());
        System.out.println("PONTA: " + this.getPonta());
        System.out.println("COR: " + this.cor);
        System.out.println("TAMPADA: " + this.tampada);

    }
}
