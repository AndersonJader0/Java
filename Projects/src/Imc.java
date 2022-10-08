import javax.swing.JOptionPane;

public class Imc {
    public static void main(String[] args) {

        String Name, Sex;
        int age;
        double height, weight, imc;

        JOptionPane.showMessageDialog(null, "Esse é um programinha para calcular o IMC - (Índice de Massa Corporal).");

        Name = JOptionPane.showInputDialog("Digite o nome");
        Sex = JOptionPane.showInputDialog("Digite o sexo");
        age = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura em metros"));
        weight = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso em kg"));

        imc = weight/(height*2);

        if (imc <= 18.5) {

            JOptionPane.showMessageDialog(null, "Dados"
                    + "\nNome: " + Name
                    + "\nSexo: " + Sex
                    + "\nIdade: " + age
                    + "\nIMC: " + imc
                    + "\nClassificação: Magreza"
            );
        }else if (imc >= 25) {

            JOptionPane.showMessageDialog(null, "Dados"
                    + "\nNome: " + Name
                    + "\nSexo: " + Sex
                    + "\nIdade: " + age
                    + "\nIMC: " + imc
                    + "\nClassificação: Obesidade"
            );
        }else {
            JOptionPane.showMessageDialog(null, "Dados"
                    + "\nNome: " + Name
                    + "\nSexo: " + Sex
                    + "\nIdade: " + age
                    + "\nIMC: " + imc
                    + "\nClassificação: Normal"
            );
        }
    }
}