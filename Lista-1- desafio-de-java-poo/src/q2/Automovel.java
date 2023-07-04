package q2;

public class Automovel extends Transporte{
    private String placa;

    public Automovel() {
    }

    public Automovel(String marca, String modelo, String quilometragem, double capacidadeTanque, String placa) {
        super(marca, modelo, quilometragem, capacidadeTanque);
        this.placa = placa;
    }

    @Override
    public void mover(double distPercorrida) {
        super.mover(distPercorrida);
        double reduzirLts = distPercorrida/8;
        this.capacidadeTanque -= reduzirLts;
    }

    @Override
    public String exibir() {
        return "Automovel, " + super.exibir() + ", Placa = " + placa;
    }

}
