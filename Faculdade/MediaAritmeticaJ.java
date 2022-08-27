import javax.swing.JOptionPane;

    public class MediaAritmeticaJ {
     public static void main(String[] args) {

        Double nota1, nota2, nota3, nota4;
        Double media;

        JOptionPane.showMessageDialog(null, "Esse é um programa para calcular a média entra 4 notas!");

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4"));

        media = (nota1+nota2+nota3+nota4) / 4;

        JOptionPane.showMessageDialog(null, "A média é = " + media);
     }
}