import java.util.Scanner;

public class Carro2 {
	
	String modelo;
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public static void main(String[] args) {
		
		Carro2[] carros = new Carro2[5];

		Carro2 carro = new Carro2();
		carro.setModelo("Gol");

		carros[0] = carro;
		
		String modelo = carros[0].getModelo();
		System.out.println(modelo);
		
	}
}