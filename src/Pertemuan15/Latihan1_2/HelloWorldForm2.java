package Pertemuan15.Latihan1_2;

import javax.swing.*;

public class HelloWorldForm2 extends JFrame {
    private JLabel label;//2

    //3
    public HelloWorldForm2() {
        label = new JLabel();
        label.setText("Haalo Dunia!");

        add(label);
        setTitle("Program Pertama ");

        setSize(600, 300);
    }

}
