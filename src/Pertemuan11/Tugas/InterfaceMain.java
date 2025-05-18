package Pertemuan11.Tugas;

public class InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek TiketBioskop dengan data tiket lengkap
        TiketBioskop tiket = new TiketBioskop("A001", "Spiderman", "Studio 1",
                "19:30", "A10", 50000, "18-05-2025");

        // Memanggil method cetakTiket untuk menampilkan info tiket ke console
        tiket.cetakTiket();

        // Mencoba memverifikasi kode tiket yang benar (harus true)
        System.out.println("Verifikasi kode 'A001': " + tiket.verifikasi("A001"));

        // Mencoba memverifikasi kode tiket yang salah (harus false)
        System.out.println("Verifikasi kode 'B002': " + tiket.verifikasi("B002"));
    }
}
