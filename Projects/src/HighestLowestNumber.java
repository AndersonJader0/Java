import java.util.Arrays;
import javax.swing.JOptionPane;

public class HighestLowestNumber {

    public static void main(String[] args) {
        int box [] = new int[15];
        for (int i = 0; i < box.length; i++) {
            int position = i+1;
            box [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + position + "º valor: "));
        }
        Arrays.sort(box);
        JOptionPane.showMessageDialog(null, "O maior valor digitado: " + box[14] + "\nO menor valor digitado: " + box[0]);
    }
}