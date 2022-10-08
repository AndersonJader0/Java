import javax.swing.JOptionPane;

public class ArithmeticAverage {
    public static void main(String[] args) {

        Double grade, grade2, grade3, grade4;
        Double media;

        JOptionPane.showMessageDialog(null, "Esse é um programa para calcular a média entra 4 notas!");

        grade = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
        grade2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
        grade3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));
        grade4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4"));

        media = (grade + grade2 + grade3 + grade4) / 4;

        JOptionPane.showMessageDialog(null, "A média é = " + media);
    }
}