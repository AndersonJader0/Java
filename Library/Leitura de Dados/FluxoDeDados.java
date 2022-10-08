import java.util.Scanner;

public class FluxoDeDados {
	
	

		public static void main(String[] args) {
		
		//para ler uma informação inserida pelo usuário, precisamos da ajuda da classe Scanner.
		
		Scanner sc = new Scanner(System.in); //assim foi declarada uma variável do tipo Scanner com nome sc.
		
		//Scanner permite a leitura de dados que podem ser provenientes de várias origens, como um arquivo do disco ou informações digitadas pelo usuário.
		//System.in especifica que queremos ler os valores digitados pelo usuário;
		
		//-//int idade = sc.nextInt(); //ler um numero inteiro;
		//double preco = sc.nextDouble(); //ler um numero de ponto flutuante;
		
		//a classe Scanner está definida no pacote java.util
		
		//-//System.out.println("Idade digitada: " + idade);
		//-//sc.close();
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		System.out.println("A soma é = " + soma);
		
		int resto = soma % 2;
		if (resto == 0) {
			System.out.println("A soma é par");
		}else {
			System.out.println("A soma é ímpar");
		}
		
		sc.close();
    }
}