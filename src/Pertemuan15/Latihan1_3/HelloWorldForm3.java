package Pertemuan15.Latihan1_3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class HelloWorldForm3 extends JFrame implements ActionListener {

    private JLabel label;
    private JButton button;

    public HelloWorldForm3() {
        label = new JLabel();
        label.setText("Hello world!");

        button = new JButton("Klik Me!");
        button.addActionListener(this);

        setLayout(new GridLayout(2, 1));

        add(label);
        add(button);

        setTitle("My First Program");
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Hallo Dunia!");
    }

    // Metode main untuk menjalankan aplikasi
    public static void main(String[] args) {
        new HelloWorldForm3();
    }
}
