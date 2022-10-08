import javax.swing.JOptionPane;

public class Imc {
    public static void main(String[] args){
        Float heigth, weight, imc;

        heigth = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
        weight = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));

        imc = weight /(heigth*2);

        JOptionPane.showMessageDialog(null, "O IMC é = " + imc);
    }
}