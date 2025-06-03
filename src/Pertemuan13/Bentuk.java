package Pertemuan13;

abstract class Bentuk implements Calculable {
    protected String nama;
    protected String warna;

    public Bentuk(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    // Method konkret yang dapat digunakan semua turunan
    public void tampilkanInfo() {
        System.out.println("=== Informasi " + nama + " ===");
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
        System.out.println();
    }

    // Method abstrak yang harus diimplementasikan oleh subclass
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}