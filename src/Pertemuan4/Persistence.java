package Pertemuan4;

import java.io.FileWriter;         // Mengimpor FileWriter untuk menulis ke file
import java.io.IOException;       // Mengimpor IOException untuk menangani error I/O

public class Persistence {
    public void save(Lingkaran obj) {                                        // Method untuk menyimpan objek Lingkaran ke file
        try {
            FileWriter writer = new FileWriter("lingkaran.txt", true);      // Membuka file dalam mode append (tambah di akhir)
            writer.write("Lingkaran dengan jari-jari: " + obj.getJari2() + "\n");  // Menulis data jari-jari lingkaran ke file
            writer.close();                                                 // Menutup writer setelah selesai menulis
            System.out.println("Data disimpan ke file.");                   // Menampilkan pesan sukses ke layar
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan data.");   // Menangani error jika proses penyimpanan gagal
        }
    }
}
