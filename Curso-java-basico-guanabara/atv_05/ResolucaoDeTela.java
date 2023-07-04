package aesley.java_basico.atividades_guanabara.atv_05;

import java.awt.*;

public class ResolucaoDeTela {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension resolucao = toolkit.getScreenSize();

        int largura = resolucao.width;
        int altura = resolucao.height;

        System.out.println("A resolução da sua tela é " + largura + "x" + altura + " pixels.");
    }
}
