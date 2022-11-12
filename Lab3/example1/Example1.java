package com.example1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example1 extends JFrame {
    private JPanel panel1;
    private JLabel label1;
    private JComboBox comboBox1;
    private JButton button1;
    private JLabel label2;


    public static void main(String[] args) {

        JFrame frame = new JFrame("JComboBox Example");
        frame.setContentPane(new Example1().panel1);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    public Example1(){


        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText(comboBox1.getSelectedItem().toString());
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You selected the book: " + (comboBox1.getSelectedItem().toString()));
            }
        });
    }



}
