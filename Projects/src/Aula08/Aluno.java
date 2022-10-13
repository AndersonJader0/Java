package Aula08;
public class Aluno {
    int idade;
    String nome;

    void fazAniversario(){
        idade++;
    }
    void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
