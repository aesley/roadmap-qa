package atv_10_11;

public class Tecnico extends Aluno{
    private boolean regProfissional;

    public boolean getRegProfissional() {
        return regProfissional;
    }

    public void setRegProfissional(boolean regProfissional) {
        this.regProfissional = regProfissional;
    }

    public void praticar(){
        if (this.getRegProfissional()){
            System.out.println("Pode trabalhar tem registro");
        } else {
            System.out.println("Não pode trabalhar sem registro");
        }
    }
}
