package Classes;

import javax.swing.*;

public class editWindow extends JFrame {

    private JComboBox comboBox1;
    private JTextField textField1;
    private JPanel editpanel1;
    private JButton OKButton;

    editWindow(){
        super("Edit window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(editpanel1);
        this.setSize(430,250);
    }

    public static void run(){
        editWindow tr = new editWindow();
        tr.setVisible(true);
    }

}
