package atv_07_08;

public class Principal {
    public static void main(String[] args) {
        Lutador L[] = new Lutador [5];

        L[0] = new Lutador("MICK", "Brasil", 30, 160.5f, 99f, 20, 40, 60);
        L[1] = new Lutador("Aesley", "Brasil", 35, 160.5f, 89f, 20, 40, 60);
        L[2] = new Lutador("Neto", "Brasil", 29, 160.5f, 95f, 20, 40, 60);
        L[3] = new Lutador("Edu", "Brasil", 56, 160.5f, 93f, 20, 40, 60);
        L[4] = new Lutador("Yuri", "Brasil", 32, 160.5f, 79f, 20, 40, 60);

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(L[0], L[2]);
        UFC01.lutar();
        L[0].status();
        L[2].status();
    }

}

