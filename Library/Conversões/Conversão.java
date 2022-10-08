public class Conversão {
	
	public static void main(String[] args) {
		
		int x = 10;
		double d = x;
		long l = x;
		float f = x;
		int idade = 24;

		//Pode haver a perda informações como de int para short;
		
		//é possível fazer a conversão por meio de cast;
		
		//Exemplo:
		
		int y = (int) l;
		int p = (int) d; //vira apenas a parte inteira do double.
		
		
		System.out.println(p);
		
		//operadores lógicos
		
		// boolean precisaVotar = idade > 18 && idade < 70; //AND
		// boolean teste = x < 10 || x > 50; //OR
		// !(idade > 18); //NOT
	}
}