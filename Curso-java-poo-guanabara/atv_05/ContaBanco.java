package atv_05;
/*
 * tipos de conta cc e cp
 * se abrir conta cc ganha 50 reais e abrir conta cp 150
 * se fechar conta sacar dinheiro se dever tem que quitar debito
 * se tentar sacar 1. status tem que ser true e 2. tem que ter conta e 3. tem que ter saldo
 * mensalidade cc R$12 cp R$20
 * sempre que for abrir conta 1. status sera falso 2. saldo zerado
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono(a): " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta()  {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
            System.out.println("Conta corrente aberta, bem vindo sr(a): " + this.getDono());
        } else if (t == "CP") {
            this.setSaldo(150);
            System.out.println("Conta poupança aberta, bem vindo sr(a): " + this.getDono());
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println(this.getDono() + " sua conta tem saldo de R$: " + this.getSaldo() + ", não pode ser encerrada");
        } else if (this.getSaldo() < 0) {
            System.out.println(this.getDono() + " sua conta tem saldo de R$: " + this.getSaldo() + ", você está em debito");
        } else {
            this.setStatus(false);
            System.out.println(this.getDono() + " sua conta tem saldo de R$: " + this.getSaldo() + ", você pode encerrar");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito de R$" + v + " realizado na conta do(a): " + this.getDono());
        } else {
            System.out.println("impossivel depositar sem conta");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de R$:" + v + " realizado na conta do(a): " + this.getDono());
            } else {
                System.out.println("Sr(a): " + this.getDono() + " é impossivel sacar o valor solicitado, seu saldo é: " + this.getSaldo());
            }
        }
    }

    public void pagarMensalidade() {
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
            System.out.println("A mensalidade é: " + v);
        } else if (this.getTipo() == "CP") {
            v = 20;
            System.out.println("A mensalidade é: " + v);
        }
        if (this.getStatus()) {
            if (this.getSaldo() > v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Mensalidade de: " + v + " sacada da conta do " + this.getDono());
            } else {
                System.out.println("Impossível pagar mensalidade, conta fechada");
            }
        }
    }

}
