import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class example1 extends JFrame{
    private JTree tree1;
    private JTextField textKursu;
    private JTextField textCena;
    private JButton opłaćKursButton;
    private JButton wyjścieButton;
    private JLabel LabelKurs;
    private JLabel NameKurs;
    private JPanel JPanel1;


    public example1(){
        super("JTree");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);



        tree1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                DefaultMutableTreeNode root =
                        (DefaultMutableTreeNode) tree1.getSelectionPath().getLastPathComponent();

                textKursu.setText(root.getUserObject().toString());

                String select = root.getUserObject().toString();
                if(select.equals("C++")) textCena.setText("1234");
                else if (select.equals("C#")) textCena.setText("4178");
                else if (select.equals("JAVA")) textCena.setText("1513");
                else if (select.equals("Python")) textCena.setText("5411");
                else if (select.equals("ASP.NET")) textCena.setText("7568");
                else if (select.equals("C")) textCena.setText("6753");
                else if (select.equals("Photoshop")) textCena.setText("5982");
                else if (select.equals("Corel")) textCena.setText("1652");
                else if (select.equals("AutoCad")) textCena.setText("1202");
                else if (select.equals("InDesign")) textCena.setText("5173");
            }

        });
    }

    private void createUIComponents(){


        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Moje kursy");

        DefaultMutableTreeNode Kprog = new DefaultMutableTreeNode("Programowanie");

        DefaultMutableTreeNode P1 = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode P2 = new DefaultMutableTreeNode("C#");
        DefaultMutableTreeNode P3 = new DefaultMutableTreeNode("JAVA");
        DefaultMutableTreeNode P4 = new DefaultMutableTreeNode("Python");
        DefaultMutableTreeNode P5 = new DefaultMutableTreeNode("ASP.NET");
        DefaultMutableTreeNode P6 = new DefaultMutableTreeNode("C");

        Kprog.add(P1);
        Kprog.add(P2);
        Kprog.add(P3);
        Kprog.add(P4);
        Kprog.add(P5);
        Kprog.add(P6);

        DefaultMutableTreeNode KGrafika = new DefaultMutableTreeNode("Grafika komputerowa");

        DefaultMutableTreeNode G1 = new DefaultMutableTreeNode("Photoshop");
        DefaultMutableTreeNode G2 = new DefaultMutableTreeNode("Corel");
        DefaultMutableTreeNode G3 = new DefaultMutableTreeNode("AutoCad");
        DefaultMutableTreeNode G4 = new DefaultMutableTreeNode("InDesign");

        KGrafika.add(G1);
        KGrafika.add(G2);
        KGrafika.add(G3);
        KGrafika.add(G4);

        root.add(Kprog);
        root.add(KGrafika);

        DefaultTreeModel myModel = new DefaultTreeModel(root);

        //tree1.setModel(myModel);

        tree1 = new JTree(myModel);
    }

    public static void main(String[] args) {
        example1 Jtree = new example1();
        Jtree.setVisible(true);
    }

}
