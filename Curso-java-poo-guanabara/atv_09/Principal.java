package atv_09;

public class Principal {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Aesley", 35, "Mas" );
        p[1] = new Pessoa("Nayana", 35, "Fem" );

        l[0] = new Livro("bola na rede", "Pelé", 10, p[0]);
        l[1] = new Livro("rh boas novas", "RL", 10, p[1]);
        l[2] = new Livro("Como dormir em pé", "TRABALHEIRO", 10, p[0]);

        l[0].abrir();
        l[0].folhear(5);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}
