package Pertemuan13;

public class Tabung extends Lingkaran {
    private double tinggi;

    public Tabung(double jariJari, double tinggi, String warna) {
        super(jariJari, warna);
        this.nama = "Tabung";
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        // Luas permukaan tabung = 2πr² + 2πrt
        double luasAlas = super.hitungLuas(); // πr²
        double luasSelimut = super.hitungKeliling() * tinggi; // 2πr * t
        return (2 * luasAlas) + luasSelimut;
    }

    @Override
    public double hitungKeliling() {
        // Untuk tabung, keliling bisa diartikan sebagai keliling alas
        return super.hitungKeliling();
    }

    public double hitungVolume() {
        return super.hitungLuas() * tinggi; // πr² * t
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Informasi " + nama + " ===");
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Jari-jari: " + getJariJari());
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Luas Permukaan: " + hitungLuas());
        System.out.println("Keliling Alas: " + hitungKeliling());
        System.out.println("Volume: " + hitungVolume());
        System.out.println();
    }
}
