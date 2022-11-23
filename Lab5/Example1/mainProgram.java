import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Classes.*;

public class mainProgram extends JFrame{
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JPanel filePanel;
    private JPanel aboutPanel;
    private JList listToDo;
    private JList listInProgress;
    private JList listDone;
    private JButton addNewTaskButton;
    private JTextField textField1;
    private JButton backButton;
    private JButton closeButton;

    public mainProgram(){

        super("Kanban");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setSize(600,400);

        //<<<About page button listeners>>>\\

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(0);
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        addNewTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editWindow.run();
            }
        });




    }








    public static void main(String[] args) {
        mainProgram tr = new mainProgram();
        tr.setVisible(true);
    }











}