import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;

public class mainWindow extends JFrame {
    private JList<String> jListOne;
    private JList<String> jListTwo;
    private JButton btnSingleRight;
    private JButton btnDoubleLeft;
    private JButton btnSingleLeft;
    private JButton btnDoubleRight;
    private JPanel jPanel1;


    String[] str = {"Volkswagen", "Mercedes", "Skoda", "Citroen", "Volvo", "BMW", "Audi", "Hyundai", "Kia"};

    public mainWindow() {

        super("Dwie Listy App");
        this.setContentPane(this.jPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);

        DefaultListModel jlistOneModel = new DefaultListModel();
        DefaultListModel jlistTwoModel = new DefaultListModel();

        for (String s : str) {
            jlistOneModel.addElement(s);
        }
        jListOne.setModel(jlistOneModel);


        btnSingleRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jListOne.getSelectedIndex() == -1) {
                    JOptionPane.showMessageDialog(rootPane, "Nie wykryto zaznaczenia.", "Uwaga!", 1);
                } else {
                    String str2 = (String) jListOne.getSelectedValue();
                    int index = jListOne.getSelectedIndex();
                    jlistTwoModel.addElement(str2);
                    jListTwo.setModel(jlistTwoModel);

                    if (jlistOneModel.getSize() != 0) {
                        jlistOneModel.removeElementAt(index);
                    }
                    jListOne.setModel(jlistOneModel);
                }
            }
        });


        btnSingleLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jListTwo.getSelectedIndex() == -1) {
                    JOptionPane.showMessageDialog(rootPane, "Brak zaznaczenia!", "Uwaga!", 1);
                } else {
                    String value = jListTwo.getSelectedValue();
                    int index = jListTwo.getSelectedIndex();
                    jlistOneModel.addElement(value);
                    jListOne.setModel(jlistOneModel);

                    //remove from list2
                    jlistTwoModel.remove(index);
                    jListTwo.setModel(jlistTwoModel);
                }
            }
        });


        btnDoubleRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jlistOneModel.size() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Pierwsza lista jest pusta!", "Uwaga!", 1);
                } else {
                    String[] values = new String[100];
                    for (int i = 0; i < jlistOneModel.size(); i++) {
                        values[i] = jlistOneModel.getElementAt(i).toString();
                    }
                    for (int i = 0; i < jlistOneModel.size(); i++) {
                        jlistTwoModel.add(i, values[i]);
                    }
                    jListTwo.setModel(jlistTwoModel);


                    //usunięcie z listone
                    jlistOneModel.removeAllElements();
                }
            }
        });


        btnDoubleLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jlistTwoModel.size() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Druga lista jest pusta!", "Uwaga!", 1);
                } else {
                    String[] values = new String[100];
                    for (int i = 0; i < jlistTwoModel.size(); i++) {
                        values[i] = jlistTwoModel.getElementAt(i).toString();
                    }
                    for (int i = 0; i < jlistTwoModel.size(); i++) {
                        jlistOneModel.add(i, values[i]);
                    }
                    jListOne.setModel(jlistOneModel);

                    //usunięcie z listone
                    jlistTwoModel.removeAllElements();
                }
            }
        });
    }

        public static void main (String[] args){

            mainWindow mainWindow = new mainWindow();
            mainWindow.setVisible(true);
    }

}

