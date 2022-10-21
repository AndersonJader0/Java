package Login;

public class Gerente extends Funcionario{

    public Gerente(String nome, String cpf, double salario, int senhaAdm) {
        super(nome, cpf, salario, senhaAdm);
    }
    public void cancelarOperacao(){
        System.out.println("Cancelando operação");
    }
}
