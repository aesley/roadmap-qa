package q3;

public class Biblioteca {
    public static void main(String[] args) {

        Livro[] livros = new Livro[2];
        livros[0] = new Livro(1, "Syllabus foundation level", "ISTQB");
        livros[1] = new Livro(2, "Use a cabeça Java", "Alta Books");

        Usuario usuarioNormal = new Usuario(1, "Aesley", "111.333.555-77");
        Monitor usuarioMonitor = new Monitor(2, "Mick Hill", "222.444.666-88", 500.0);

        int diasAtraso = 40;

        double multaUsuarioNormal = usuarioNormal.calcularMulta(diasAtraso);
        double multaUsuarioMonitor = usuarioMonitor.calcularMulta(diasAtraso);

        System.out.println("Multa do: " + usuarioNormal.getNome() +  " em R$ " + multaUsuarioNormal);
        System.out.println("Multa do: " + usuarioMonitor.getNome() +  " em R$ " + multaUsuarioMonitor);
        System.out.println("A biblioteca possui " + livros.length + " livros.");
    }
}
