package Pertemuan14.Soal5;

public class Mahasiswa {
    // Variabel final - tidak dapat diubah setelah inisialisasi
    private  String nim;
    private String nama;
    // Variabel static - dibagi oleh semua instance
    private static int totalMahasiswa = 0;
    // Konstanta static final - nilai tetap untuk semua instance
    public static final int MAX_SKS = 24;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim; // Hanya dapat diset sekali
        this.nama = nama;
        totalMahasiswa++; // Increment setiap kali objek baru dibuat
        System.out.println("Mahasiswa baru terdaftar: " + nama + " (NIM: " + nim + ")");
    }

    public void displayInfo() {
        System.out.println("=== INFORMASI MAHASISWA ===");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Maksimum SKS yang diizinkan: " + MAX_SKS);
        System.out.println("Total mahasiswa terdaftar: " + totalMahasiswa);
    }

    // Method static untuk mengakses variabel static
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    public static void displayUniversityInfo() {
        System.out.println("=== INFORMASI UNIVERSITAS ===");
        System.out.println("Total mahasiswa terdaftar: " + totalMahasiswa);
        System.out.println("Maksimum SKS per semester: " + MAX_SKS);
    }

    // Getter methods
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

