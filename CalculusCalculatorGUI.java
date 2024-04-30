import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculusCalculatorGUI extends JFrame implements ActionListener {
    private final JTextField inputField; // Input field for expressions
    private final ExpressionEvaluator evaluator; // Utilizes a JavaScript engine to evaluate basic expressions

    public CalculusCalculatorGUI() {
        super("Calculus Calculator");
        evaluator = new ExpressionEvaluator(); // Initialize the expression evaluator
        inputField = new JTextField(); // Initialize the text field
        inputField.setEditable(false);
        setupUI(); // Call to set up the user interface
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        setVisible(true);
    }

    private void setupUI() {
        setLayout(new GridLayout(5, 5));  // Adjust grid layout as necessary

        // Button labels for the calculator
        String[] buttonLabels = {
                "1", "2", "3", "+", "4", "5", "6", "-",
                "7", "8", "9", "*", "C", "0", "=", "/",
                "x", "^", "Derivative", "Integral"
        };

        // Create and add buttons to the grid
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            add(button);
        }

        add(inputField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        try {
            switch (command) {
                case "C":
                    inputField.setText("");
                    break;
                case "=":
                    String result = evaluator.evaluate(inputField.getText());
                    inputField.setText(result);
                    break;
                case "Derivative":
                    result = CalculusFunctions.calculateDerivative(inputField.getText());
                    inputField.setText(result);
                    break;
                case "Integral":
                    result = CalculusFunctions.calculateIntegral(inputField.getText());
                    inputField.setText(result);
                    break;
                default:
                    inputField.setText(inputField.getText() + command);
                    break;
            }
        } catch (Exception ex) {
            inputField.setText("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new CalculusCalculatorGUI();
    }
}
