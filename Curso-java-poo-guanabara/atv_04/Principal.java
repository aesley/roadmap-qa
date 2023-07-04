package atv_04;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\n---\n");
        Caneta c1 = new Caneta("Aesley", "Dourada", 0.3f);
        //c1.setModelo("BIC"); //metodo public para modelo
        //c1.modelo = "COMPACTOR"; //variavel private não permite acesso direto ao atributo
        // c1.setPonta(0.9f); //metodo public para ponta
        //c1.ponta = 0.7f; //variavel private não permite acesso ao atributo
        // alternativa ao metodo status
        c1.status(); //metodo public retorna status
        //System.out.println("CANETA: " + c1.getModelo());
        //System.out.println("PONTA: " + c1.getPonta());

        System.out.println("\n---\n");
        Caneta c2 = new Caneta("Compactor", "Prata", 0.9f);
        c2.status();

        System.out.println("\n---\n");
        Televisao t1 = new Televisao(55f, 10, "Preta", "Samsung");
        t1.setMarca("LG"); //Troca de atributo marca.
        t1.statusTV();

    }
}
