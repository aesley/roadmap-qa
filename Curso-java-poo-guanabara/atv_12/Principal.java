package atv_12;

public class Principal {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        Canguru c1 = new Canguru();
        Cachorro cac = new Cachorro();
        Lobo l1 = new Lobo();

        m1.setPeso(85.3f);
        m1.setIdade(30);
        m1.setMembros(4);
        m1.setCorPelo("preto");
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
        System.out.println(m1.toString() + "\n");

        r1.setPeso(15f);
        r1.setIdade(5);
        r1.setMembros(4);
        r1.setCorEscama("Coloridas tom verde");
        r1.locomover();
        r1.alimentar();
        r1.emitirSom();
        System.out.println(r1.toString() + "\n");

        p1.setPeso(8.3f);
        p1.setIdade(3);
        p1.setMembros(2);
        p1.setCorEscama("Coloridas cor da pela");
        p1.locomover();
        p1.alimentar();
        p1.emitirSom();
        p1.soltarBolha();
        System.out.println(p1.toString() + "\n");

        a1.setPeso(0.3f);
        a1.setIdade(2);
        a1.setMembros(2);
        a1.setCorPena("Azul e branco");
        a1.locomover();
        a1.alimentar();
        a1.emitirSom();
        a1.fazerNinho();
        System.out.println(a1.toString() + "\n");

        c1.setPeso(55f);
        c1.setIdade(10);
        c1.setMembros(4);
        c1.setCorPelo("Cinza");
        c1.locomover();
        c1.alimentar();
        c1.emitirSom();
        c1.usarBolsa();
        System.out.println(c1.toString() + "\n");


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
