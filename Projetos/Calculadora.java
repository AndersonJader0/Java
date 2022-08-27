package Projetos;
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {

        Float answer, number1, number2, result;

        JOptionPane.showMessageDialog(null, "This is a simple calculator! Your base is with float! And the next you will see the options of calculations");
        answer = Float.parseFloat(JOptionPane.showInputDialog("What calculation would you like to?" //O JOptionPane trabalha apenas com variáveis do tipo String por isso a utilização do parse.
        + "\n1 - Addition"
        + "\n2 - Subtraction"
        + "\n3 - Multiplication"
        + "\n4 - Division"
        ));

        if (answer == 1) {
            number1 = Float.parseFloat(JOptionPane.showInputDialog("What the first number?"));
            number2 = Float.parseFloat(JOptionPane.showInputDialog("What the second number?"));

            result = number1 + number2;

            JOptionPane.showMessageDialog(null, "The Addition resul = " + result);
        }

        else if (answer == 2) {
            number1 = Float.parseFloat(JOptionPane.showInputDialog("What the Minuend?"));
            number2 = Float.parseFloat(JOptionPane.showInputDialog("What the subtrahend?"));

            result = number1 - number2;

            JOptionPane.showMessageDialog(null, "The Subtraction result = " + result);
        }

        else if (answer == 3) {
            number1 = Float.parseFloat(JOptionPane.showInputDialog("What the first number?"));
            number2 = Float.parseFloat(JOptionPane.showInputDialog("What the second number?"));

            result = number1 * number2;

            JOptionPane.showMessageDialog(null, "The Multiplication result = " + result);
        }

        else if (answer == 4) {
            number1 = Float.parseFloat(JOptionPane.showInputDialog("What the dividend?"));
            number2 = Float.parseFloat(JOptionPane.showInputDialog("What the divisor?"));

            result = number1 / number2;

            JOptionPane.showMessageDialog(null, "The Divison result = " + result);
        }
    }
}