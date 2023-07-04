package atv_06;

public class Principal {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        c1.maisVolume();
        c1.play();
        //c1.ligarMudo();
        c1.abrirMenu();
        c1.fecharMenu();
    }
}
