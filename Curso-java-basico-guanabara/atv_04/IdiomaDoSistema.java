package aesley.java_basico.atividades_guanabara.atv_04;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        String idioma = System.getProperty("user.language");
        System.out.println("Meu idioma nativo: " + idioma);

    }
}
