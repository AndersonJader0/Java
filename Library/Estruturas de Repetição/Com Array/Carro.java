import javax.swing.JOptionPane;

public class Carro {
	
		String modelo;
		String modelo2;
		
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getModelo() {
			return modelo;
		}
		
		public void setModelo2(String modelo2){
			this.modelo2 = modelo2;
		}
		public String getModelo2() {
			return modelo2;
		}
		
		public static void main(String[] args) {
			
			
			Carro[] carros = new Carro[5];

			Carro carro = new Carro();

			carros[0] = carro;
			
			String resposta = JOptionPane.showInputDialog("Qual o modelo do carro?");
			carro.setModelo(resposta);
			
			String modelo = carros[0].getModelo();
			
			carros[1] = carro;
			
			String resposta2 = JOptionPane.showInputDialog("Qual o modelo do carro?");
			carro.setModelo2(resposta2);
			
			String modelo2 = carros[1].getModelo2();
			
			String calc = "Modelo do carro 1: " + modelo
					+"\nModelo do carro 2: " + modelo2;
			
			JOptionPane.showMessageDialog(null, calc);
		}
}