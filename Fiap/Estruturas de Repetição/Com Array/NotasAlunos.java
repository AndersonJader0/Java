import java.util.ArrayList;

import java.util.Scanner;

public class NotasAlunos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float notas[] = new float[10];
		for (int i = 0; i < 10; i++) {
		  System.out.println("Digite a nota do aluno");
		  notas[i] = sc.nextFloat();
		}
		sc.close();
		
		//calculator media
		float totalNotas = 0;
		for (int i = 0; i < notas.length; i++) {
			totalNotas = totalNotas + notas[i];
		}
		float mediaNotas = totalNotas/notas.length;
		System.out.println("A média dos alunos é = " + mediaNotas);
	}
}
