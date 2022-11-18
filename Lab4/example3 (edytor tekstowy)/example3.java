import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class example3 extends JFrame{
    private JButton boldButton;
    private JButton italicButton;
    private JButton zmniejszButton;
    private JButton powiekszButton;
    private JComboBox comboBox1;
    private JEditorPane editorPane1;
    private JPanel mainPanel;
    private JTextPane textPane1;
    private JTextArea textArea1;


    public example3(){

    super("Edytor tekstowy App");
    this.setContentPane(mainPanel);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(450,300);

    final String[] colors = {"Czarny", "Czerwony", "Zielony", "Niebieski", "Żółty", "Szary", "Fioletowy"};

    for(int i=0; i<colors.length; i++){
        comboBox1.addItem(colors[i]);
    }



    SimpleAttributeSet initialset = new SimpleAttributeSet();
    comboBox1.setSelectedIndex(0);
    StyleConstants.setForeground(initialset, Color.black);
    initialset.addAttributes(textPane1.getCharacterAttributes());



        boldButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(StyleConstants.isBold(initialset)) {
                    SimpleAttributeSet set = new SimpleAttributeSet(initialset);
                    StyleConstants.setBold(set, false);
                    textPane1.setCharacterAttributes(set, true);
                    initialset.addAttributes(set);
                }else {
                    SimpleAttributeSet set = new SimpleAttributeSet(initialset);
                    StyleConstants.setBold(set, true);
                    textPane1.setCharacterAttributes(set, true);
                    initialset.addAttributes(set);
                }
            }
        });


        italicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(StyleConstants.isItalic(initialset)){
                    SimpleAttributeSet set = new SimpleAttributeSet(initialset);
                    StyleConstants.setItalic(set, false);
                    textPane1.setCharacterAttributes(set, true);
                    initialset.addAttributes(set);
                }else {
                    SimpleAttributeSet set = new SimpleAttributeSet(initialset);
                    StyleConstants.setItalic(set, true);
                    textPane1.setCharacterAttributes(set, true);
                    initialset.addAttributes(set);
                }
            }
        });



        zmniejszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int fontSize = StyleConstants.getFontSize(initialset);
                SimpleAttributeSet set = new SimpleAttributeSet(initialset);
                StyleConstants.setFontSize(set, fontSize-1);
                textPane1.setCharacterAttributes(set, true);
                initialset.addAttributes(set);
            }
        });



        powiekszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fontSize = StyleConstants.getFontSize(initialset);
                SimpleAttributeSet set = new SimpleAttributeSet(initialset);
                StyleConstants.setFontSize(set, fontSize+1);
                textPane1.setCharacterAttributes(set, true);
                initialset.addAttributes(set);
            }
        });


        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String selectedColor = (String) comboBox1.getSelectedItem();
                System.out.println(selectedColor);
                SimpleAttributeSet set = new SimpleAttributeSet();
                if(selectedColor.equals("Czerwony")){
                    StyleConstants.setForeground(set, Color.red);
                    textPane1.setCharacterAttributes(set, true);
                    initialset.addAttributes(set);
                }
                if(selectedColor.equals("Czarny")){
                    StyleConstants.setForeground(set, Color.black);
                    textPane1.setCharacterAttributes(set, true);
                    initialset.addAttributes(set);
                }
                if(selectedColor.equals("Zielony")){
                    StyleConstants.setForeground(set, Color.green);
                    textPane1.setCharacterAttributes(set, true);
                    initialset.addAttributes(set);
                }
                if(selectedColor.equals("Niebieski")){
                    StyleConstants.setForeground(set, Color.blue);
                    textPane1.setCharacterAttributes(set,true);
                    initialset.addAttributes(set);
                }
                if(selectedColor.equals("Żółty")){
                    StyleConstants.setForeground(set, Color.yellow);
                    textPane1.setCharacterAttributes(set, true);
                    initialset.addAttributes(set);
                }
                if(selectedColor.equals("Szary")){
                    StyleConstants.setForeground(set, Color.gray);
                    textPane1.setCharacterAttributes(set,true);
                    initialset.addAttributes(set);
                }
                if(selectedColor.equals("Fioletowy")){
                    StyleConstants.setForeground(set, Color.magenta);
                    textPane1.setCharacterAttributes(set, true);
                    initialset.addAttributes(set);
                }
            }
        });
    }



    public static void main(String[] args) {

        example3 ex = new example3();
        ex.setVisible(true);
    }

}