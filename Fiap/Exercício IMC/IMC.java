import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Qual a altura em metros?: ");
		double altura = leitura.nextDouble();
		
		System.out.print("Qual o peso em kg?: ");
		double peso = leitura.nextDouble();
		
		double calculo = peso / (altura * altura);
		
		System.out.println("O seu IMC é = " + calculo);
		
		if (calculo < 18.5) {
			System.out.println("Classificação: magreza");
		}else if (calculo >= 18.5 && calculo <= 25) {
			System.out.println("Classificação: normalidade");
		}else {
			System.out.println("Classificação: obesidade");
		}
	}	
} 