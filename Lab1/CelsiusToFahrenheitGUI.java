import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusToFahrenheitGUI extends JFrame{

    private JPanel mainPanel;
    private JTextField tempTextField;
    private JButton convertButton;
    private JLabel celsiusLabel;
    private JLabel fahrenheitLabel;

    public CelsiusToFahrenheitGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int fahrenheitValue = (int)((Double.parseDouble(tempTextField.getText()))
                            * 1.8 + 32);
                    fahrenheitLabel.setText(fahrenheitValue + " Fahrenheit");
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new CelsiusToFahrenheitGUI("Konwerter Celsius/Fahrenheit");
        frame.setVisible(true);
    }
}


