package Pertemuan4;

import java.io.FileWriter;
import java.io.IOException;

public class Persistence {
    public void save(Lingkaran obj) {
        try {
            FileWriter writer = new FileWriter("lingkaran.txt", true); // Mode append
            writer.write("Lingkaran dengan jari-jari: " + obj.getJari2() + "\n");
            writer.close();
            System.out.println("Data disimpan ke file.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan data.");
        }
    }
}

