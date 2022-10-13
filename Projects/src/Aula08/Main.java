package Aula08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = keyboard.next();

        System.out.println("Digite a idade: ");
        int idade = keyboard.nextInt();

        Aluno aluno = new Aluno(idade, nome);

        aluno.fazAniversario();
        aluno.imprimir();
    }
}