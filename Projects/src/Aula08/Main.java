package Aula08;

public class Main {
    public static void main(String[] args){
        Aluno aluno = new Aluno();
        aluno.nome = "Anderson";
        aluno.idade = 18;

        aluno.fazAniversario();
        aluno.imprimir();
    }
}
