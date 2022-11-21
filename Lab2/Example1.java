import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Example1 extends JFrame{
    private JPanel panel1;
    private JButton OKButton;
    private JPasswordField passwordField2;
    private JPasswordField passwordField1;

    static String password1, password2;

    public Example1(){

        super("Check password App");
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,150);


        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                password1 = Arrays.toString(passwordField1.getPassword());
                password2 = Arrays.toString(passwordField2.getPassword());

                if(password1.equals(password2)){
                    JOptionPane.showMessageDialog(rootPane, "Hasła się zgadzają", "OK!", 1);
                }else {
                    JOptionPane.showMessageDialog(rootPane, "Hasła nie zgadzają się!", "Uwaga!", 1);
                }
            }
        });
    }

    public static void main(String[] args) {
        Example1 fr = new Example1();
        fr.setVisible(true);
    }
}


