package atv_13;

public class Principal {
    public static void main(String[] args) {
        Cachorro cac = new Cachorro();
        Lobo l1 = new Lobo();
        Mamifero m1 = new Mamifero();

        m1.setPeso(85.3f);
        m1.setIdade(30);
        m1.setMembros(4);
        m1.setCorPelo("preto");
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
        System.out.println(m1.toString() + "\n");



        cac.reagir("Olá");
        cac.reagir("Vai apanhar");
        cac.reagir(11,45);
        cac.reagir(21, 00);
        cac.reagir(false);
        cac.reagir(2, 12.5f);
        cac.reagir(17, 4.5f);

        cac.setPeso(45f);
        cac.setIdade(7);
        cac.setMembros(4);
        cac.setCorPelo("caramelo");
        cac.locomover();
        cac.alimentar();
        cac.emitirSom();
        cac.abanarRabo();
        cac.enterrarOsso();
        System.out.println(cac.toString() + "\n");

        l1.setPeso(60f);
        l1.setIdade(7);
        l1.setMembros(4);
        l1.setCorPelo("Braco neve");
        l1.locomover();
        l1.alimentar();
        l1.emitirSom();
        System.out.println(l1.toString() + "\n");

    }
}
