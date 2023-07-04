package q2;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Teste Transporte");
        Transporte t = new Transporte();
        t = new Transporte("Nissan", "March", "40000", 100);
        System.out.println("Transporte: " + t.exibir());
        t.mover(10);
        System.out.println("andou 10km");
        System.out.println(t.exibir());
        System.out.println("--- Fim Transporte ---");

        System.out.println("Teste Automovel");
        Automovel a = new Automovel();
        a = new Automovel("Kia", "Cerato", "850", 50, "HHH-1234");
        System.out.println(a.exibir());
        a.mover(8);
        System.out.println("andou 8km");
        System.out.println(a.exibir());
        System.out.println("--- Fim Automovel ---");

        System.out.println("Teste Avião");
        Avião av = new Avião();
        av = new Avião("Boeing", "747", "150", 100, "PTM-1234");
        System.out.println(av.exibir());
        av.mover(1);
        System.out.println("andou 1km");
        System.out.println(av.exibir());
        System.out.println("--- Fim Automovel ---");

    }
}
