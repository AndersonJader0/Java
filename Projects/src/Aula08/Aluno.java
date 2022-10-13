package Aula08;
public class Aluno {
    private int idade;
    String nome;

    Aluno(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }

    void fazAniversario(){
        idade++;
    }
    void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
