package Pertemuan15.Latihan2_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kasus2_1 extends JFrame implements ActionListener {

    private JTextField textField1;
    private JTextField textField2;
    private JButton jumlahButton;

    public Kasus2_1() {
        setTitle("Penjumlahan Angka");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1)); // 3 baris: 2 textfield, 1 button

        // Inisialisasi komponen
        textField1 = new JTextField();
        textField2 = new JTextField();
        jumlahButton = new JButton("Jumlah");

        // Tambahkan action listener ke tombol
        jumlahButton.addActionListener(this);

        // Tambahkan komponen ke frame
        add(textField1);
        add(textField2);
        add(jumlahButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jumlahButton) {
            try {
                // Ambil teks dari textfield
                String input1 = textField1.getText();
                String input2 = textField2.getText();

                // Konversi teks ke integer
                int angka1 = Integer.parseInt(input1);
                int angka2 = Integer.parseInt(input2);

                // Hitung penjumlahan
                int hasilJumlah = angka1 + angka2;

                // Tampilkan hasil menggunakan JOptionPane
                JOptionPane.showMessageDialog(this, "Jumlah: " + hasilJumlah, "Message", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException ex) {
                // Tangani jika input bukan angka
                JOptionPane.showMessageDialog(this, "Mohon masukkan angka yang valid di kedua kolom.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        // Jalankan aplikasi di Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new Kasus2_1());
    }
}
