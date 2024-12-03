import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class threads2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2, 5, 5));

        JLabel labelNum1 = new JLabel("Num1:");
        JTextField textNum1 = new JTextField();

        JLabel labelNum2 = new JLabel("Num2:");
        JTextField textNum2 = new JTextField();

        JLabel labelResult = new JLabel("Result:");
        JTextField textResult = new JTextField();
        textResult.setEditable(false);

        JButton divideButton = new JButton("Divide");

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textNum1.getText());
                    int num2 = Integer.parseInt(textNum2.getText());
                    int result = num1 / num2;
                    textResult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                   textResult.setText(String.valueOf(ex));
                } catch (ArithmeticException ex) {
                   textResult.setText(String.valueOf(ex));
                }
            }
        });

        frame.add(labelNum1);
        frame.add(textNum1);
        frame.add(labelNum2);
        frame.add(textNum2);
        frame.add(labelResult);
        frame.add(textResult);
        frame.add(new JLabel()); 
        frame.add(divideButton);

        frame.setVisible(true);
    }
}
