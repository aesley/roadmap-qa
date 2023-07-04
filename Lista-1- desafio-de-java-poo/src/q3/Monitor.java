package q3;

public class Monitor extends Usuario {
    private double bolsaEstudo;

    public Monitor(){

    }

    public Monitor(int codigo, String nome, String cpf, double bolsaEstudo) {
        super(codigo, nome, cpf);
        this.bolsaEstudo = bolsaEstudo;
    }

    public double getBolsaEstudo() {
        return bolsaEstudo;
    }

    public void setBolsaEstudo(double bolsaEstudo) {
        this.bolsaEstudo = bolsaEstudo;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        double multa = 0.0;
        if (diasAtraso > 30) {
            multa = (diasAtraso - 30) * 1.0;
        }
        return multa;
    }
}