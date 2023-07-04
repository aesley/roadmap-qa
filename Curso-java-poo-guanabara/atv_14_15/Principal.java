package atv_14_15;

public class Principal {
    public static void main(String[] args) {
        Video[] v = new Video[3];

        v[0] = new Video("Lagoa azul 1");
        v[1] = new Video("Lagoa azul 2");
        v[2] = new Video("Lagoa azul 3");

        for (int i = 0; i < v.length; i++) {
            System.out.println( (i + 1 )+ "º " + v[i].toString());
        }
        System.out.println("-------");

        Gafanhoto[] g = new Gafanhoto[3];

        g[0] = new Gafanhoto("Aesley", "M", 35, "aesley@gmail.com");
        g[1] = new Gafanhoto("Maria", "F", 60, "maria@gmail.com");
        g[2] = new Gafanhoto("Joao", "M", 59, "joao@gmail.com");

        for (int i = 0; i < g.length; i++) {
            System.out.println( (i + 1 )+ "º " + g[i].toString());
        }

        System.out.println("-------");

        Visualizacao[] ver = new Visualizacao[5];

        ver[0] = new Visualizacao(g[0], v[0]);
        ver[0].avaliar();
        ver[1] = new Visualizacao(g[0], v[1]);
        ver[1].avaliar(8);
        ver[2] = new Visualizacao(g[0], v[2]);
        ver[3] = new Visualizacao(g[1], v[1]);
        ver[3].avaliar(70f);
        ver[4] = new Visualizacao(g[2], v[2]);

        for (int i = 0; i < ver.length; i++) {
            System.out.println( (i + 1 )+ "º " + ver[i].toString());
        }
    }
}
