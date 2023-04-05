import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {
    private JTextField field1, field2;
    private JLabel resultLabel;

    public App() {
        setTitle("App");
        setLayout(new GridLayout(2, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Number 1:"));
        field1 = new JTextField();
        add(field1);

        add(new JLabel("Number 2:"));
        field2 = new JTextField();
        add(field2);

        add(new JLabel("Result:"));
        resultLabel = new JLabel("");
        add(resultLabel);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        pack();

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());

            double result = num1 + num2;

            resultLabel.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new App();
    };
};