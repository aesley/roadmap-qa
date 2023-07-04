package q2;

public class Transporte {
    protected String marca, modelo, quilometragem;
    protected double capacidadeTanque;

    public Transporte() {
    }

    public Transporte(String marca, String modelo, String quilometragem, double capacidadeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.setQuilometragem(quilometragem);
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(String quilometragem) {
        if (quilometragem != null) {
            this.quilometragem = quilometragem;
        } else {
            this.quilometragem = "0";
        }
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void mover(double distPercorrida) {
        double Dquilometrgem = Double.parseDouble(quilometragem);
        double novaQuilometragem = Dquilometrgem  + distPercorrida;
        this.quilometragem = String.valueOf(novaQuilometragem);
    }

    public void abastecer(double lts) {
        this.capacidadeTanque += lts;
    }

    public String exibir() {
        return  "Marca = " + marca +
                ", Modelo = " + modelo +
                ", Quilometragem = " + quilometragem + " Km" +
                ", Capacidade do Tanque = " + capacidadeTanque + " Lts";
    }

}
