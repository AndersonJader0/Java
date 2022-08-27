import javax.swing.JOptionPane;

public class IMCj {
    public static void main(String[] args){
        Float altura, peso, imc;

        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));

        imc = peso/(altura*2);

        JOptionPane.showMessageDialog(null, "O IMC é = " + imc);
    }
}