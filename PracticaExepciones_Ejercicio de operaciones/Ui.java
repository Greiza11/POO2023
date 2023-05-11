import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.FlowView;

import org.w3c.dom.Text;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

public class Ui {
    JFrame view = new JFrame();

    Expression expression = new Expression();

    public static void main(String[] args) throws Exception {
        new Ui().run();
    }

    private void run() {

        view.setTitle("Calculo de expresiones");
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(500, 500);

        view.setLayout(new GridBagLayout());
        view.setLocationRelativeTo(null); // <-- center on monitor screen
        view.add(components());
        view.setVisible(true);
    }

    private Component components() {

        JPanel panel = new JPanel();
        panel.setSize(300, 300);
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        JLabel lblExpression = new JLabel();
        JTextField txtExpression = new JTextField();
        JLabel lblResult = new JLabel();
        JButton btnCalculate = new JButton();

        lblExpression.setText("Digite una expresion a calcular");
        txtExpression.setMinimumSize(new Dimension(100, 100));
        btnCalculate.setText("CALCULAR");

        btnCalculate.addActionListener(e -> {
            this.expression.clearList();
            Double result = calculate(txtExpression.getText());
            lblResult.setText(String.valueOf(result));
        });

        panel.add(lblExpression);
        panel.add(txtExpression);
        panel.add(btnCalculate);
        panel.add(lblResult);
        panel.setVisible(true);
        return panel;
    }

    private double calculate(String expresion) {
        try {
            int i = 0;
            while (i < expresion.length()) {
                this.expression.reconocer(String.valueOf(expresion.charAt(i)));
                i++;
            }
            return this.expression.evaluar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
            return 0.0;
        }
    }

}
