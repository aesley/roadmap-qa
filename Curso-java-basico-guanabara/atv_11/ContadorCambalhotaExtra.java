package aesley.java_basico.atividades_guanabara.atv_11;

public class ContadorCambalhotaExtra {
    public static void main(String[] args) {
        int cc = 0;
        while (cc<=10) {
            cc++;
            if (cc ==2 || cc == 3 || cc == 4){
                continue;
            }
            if (cc == 7) {
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
}
