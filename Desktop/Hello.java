import javax.swing.*;
import java.awt.event.*;

public class Hello{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        panel.setLayout(null);

        JLabel operatorLabel = new JLabel("Choose an operator: +, -, *, or /");
        operatorLabel.setBounds(10, 20, 250, 25);
        panel.add(operatorLabel);

        JTextField operatorText = new JTextField(1);
        operatorText.setBounds(200, 20, 50, 25);
        panel.add(operatorText);

        JLabel num1Label = new JLabel("Enter first number:");
        num1Label.setBounds(10, 50, 150, 25);
        panel.add(num1Label);

        JTextField num1Text = new JTextField(10);
        num1Text.setBounds(200, 50, 50, 25);
        panel.add(num1Text);

        JLabel num2Label = new JLabel("Enter second number:");
        num2Label.setBounds(10, 80, 150, 25);
        panel.add(num2Label);

        JTextField num2Text = new JTextField(10);
        num2Text.setBounds(200, 80, 50, 25);
        panel.add(num2Text);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(100, 120, 100, 25);
        panel.add(calculateButton);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10, 150, 250, 25);
        panel.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char operator = operatorText.getText().charAt(0);
                Double number1 = Double.parseDouble(num1Text.getText());
                Double number2 = Double.parseDouble(num2Text.getText());
                Double result;

                switch (operator) {
                    case '+':
                        result = number1 + number2;
                        resultLabel.setText(number1 + " + " + number2 + " = " + result);
                        break;
                    case '-':
                        result = number1 - number2;
                        resultLabel.setText(number1 + " - " + number2 + " = " + result);
                        break;
                    case '*':
                        result = number1 * number2;
                        resultLabel.setText(number1 + " * " + number2 + " = " + result);
                        break;
                    case '/':
                        if (number2 == 0) {
                            resultLabel.setText("Cannot divide by zero");
                        } else {
                            result = number1 / number2;
                            resultLabel.setText(number1 + " / " + number2 + " = " + result);
                        }
                        break;
                    default:
                        resultLabel.setText("Invalid operator!");
                        break;
                }
            }
        });

        frame.setVisible(true);
    }
}
