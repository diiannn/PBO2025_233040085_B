package Pertemuan14.Soal5;

public class TestMahasiswa {
    public static void main(String[] args) {
        System.out.println("=== TEST MANAJEMEN DATA MAHASISWA ===");
        System.out.println("Total mahasiswa awal: " + Mahasiswa.getTotalMahasiswa());
        System.out.println();

        // Membuat beberapa objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("23304001", "Andi Pratama");
        Mahasiswa mhs2 = new Mahasiswa("23304002", "Sari Dewi");
        Mahasiswa mhs3 = new Mahasiswa("23304003", "Budi Santoso");
        Mahasiswa mhs4 = new Mahasiswa("23304004", "Citra Ayu");

        System.out.println();

        // Menampilkan informasi masing-masing mahasiswa
        mhs1.displayInfo();
        System.out.println();

        mhs2.displayInfo();
        System.out.println();

        // Menampilkan informasi universitas
        Mahasiswa.displayUniversityInfo();
        System.out.println();

        // Demonstrasi bahwa MAX_SKS adalah konstanta
        System.out.println("Mengakses konstanta MAX_SKS: " + Mahasiswa.MAX_SKS);
        System.out.println("Total mahasiswa melalui method static: " + Mahasiswa.getTotalMahasiswa());
    }
}
