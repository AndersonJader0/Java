public class Teste {
	public static void main(String[] args) {
		Conta cc = new Conta(); //Instanciada a classe contae armazenada a referência com uma variável;
		
		double valor = cc.saldo; //Utilizando o operador (.), podemos acessar as variáveis de instância e métodos do objeto.
		
		cc.depositar(100); //para atribuir um valor ao atributo do objeto, utiliza-se o operador de atribuição.
		cc.setAgencia(123);
		cc.setNumero(321);
		
		System.out.println("Saldo: " + cc.verificarSaldo());
		
		/*Chamar um método de um objeto é semelhante ao acesso de um atributo: é utilziada a notação de ponto.*/
		
		cc.depositar(100); //chama um método do objeto.
		
		System.out.println("Saldo depois do deposito: " + cc.verificarSaldo());
		
		Conta poupança = new Conta(111, 222, 1000); //Cria um objeto Conta utilizando o construtor que recebe valores iniciais para os atributos do objeto.
		poupança.retirar(50);
		
		System.out.println("Saldo da conta poupanca: " + poupança.verificarSaldo());
	}
}