import javax.swing.JOptionPane;

public class WeightedAverage {
    public static void main(String[] args) {
        Double nota1, nota2, nota3, nota4;
        Double weightedAverage;

        JOptionPane.showMessageDialog(null, "Esse é um programa de Média Ponderada! onde a nota 1 e 2 tem peso 2 e a nota 3 e 4 tem peso 3!");

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a primeira nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a segunda nota"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a terceira nota"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quarta nota"));

        weightedAverage = (nota1*2 + nota2*2 +nota3*3 +nota4*3) /10;

        JOptionPane.showMessageDialog(null, "A média é = " + weightedAverage);
    }
}