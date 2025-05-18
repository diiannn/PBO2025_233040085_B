package Pertemuan11.Latihan1;

// Kelas Lingkaran adalah turunan dari kelas abstrak Bentuk
public class Lingkaran extends Bentuk {

    // Konstruktor menerima parameter jari-jari dan meneruskannya ke konstruktor Bentuk
    public Lingkaran(int jari2) {
        super(jari2);
    }

     // Rumus luas lingkaran: π * r * r
    public double luas() {
        return PHI * jari2 * jari2; // Menghitung dan mengembalikan luas lingkaran
    }
}

