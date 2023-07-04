package q2;

public class Avião extends Transporte{
    private String codigo;

    public Avião() {
    }

    public Avião(String marca, String modelo, String quilometragem, double capacidadeTanque, String codigo) {
        super(marca, modelo, quilometragem, capacidadeTanque);
        this.codigo = codigo;
    }

    @Override
    public void mover(double distPercorrida) {
        super.mover(distPercorrida);
        double reduzirLts = distPercorrida * 10;
        this.capacidadeTanque -= reduzirLts;
    }

    @Override
    public String exibir() {
        return "Avião, " + super.exibir() + ", Codigo " + codigo;
    }
}
