package Pertemuan11.Latihan1;

// Kelas Tabung adalah turunan dari kelas abstrak Bentuk
public class Tabung extends Bentuk {
    private int tinggi; // Atribut tinggi untuk tabung

    // Konstruktor default
    public Tabung() {
        super(0); // Memanggil konstruktor Bentuk dengan nilai jari-jari 0
    }

    // Konstruktor dengan parameter jari-jari dan tinggi
    public Tabung(int jari2, int tinggi) {
        super(jari2); // Memanggil konstruktor Bentuk dengan jari-jari
        this.tinggi = tinggi; // Inisialisasi tinggi
    }

    // Rumus luas permukaan tabung: 2 * π * r * (r + t)

    public double luas() {
        return 2 * PHI * jari2 * (jari2 + tinggi); // Mengembalikan luas permukaan tabung
    }

    // Getter untuk tinggi
    public int getTinggi() {
        return tinggi;
    }

    // Setter untuk tinggi
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}

