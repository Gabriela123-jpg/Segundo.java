
import javax.swing.*;

public class Calcula {

    public static void main(String[] args) {
        double num1, num2, resp = 0;
        String conv = "";
        conv = JOptionPane.showInputDialog(null, "digite um numero");
        num1 = Double.parseDouble(conv);
        conv = JOptionPane.showInputDialog(null, "digite um numero");
        num2 = Double.parseDouble(conv);

        resp = num1 + num2;
        JOptionPane.showMessageDialog(null, "a soma és: " + resp);
        

    }

}
