package Pertemuan11.Tugas;

// Kelas TiketBioskop adalah implementasi spesifik tiket bioskop
// yang mewarisi properti dan method dari kelas abstrak Bioskop
// serta mengimplementasikan interface Tiket.
public class TiketBioskop extends Bioskop implements Tiket {

    // Konstruktor untuk menginisialisasi objek TiketBioskop dengan data lengkap
    public TiketBioskop(String kodeTiket, String namaFilm, String studio,
                        String jamTayang, String nomorKursi, double harga, String tanggal) {
        // Memanggil konstruktor kelas induk Bioskop untuk menginisialisasi properti
        super(kodeTiket, namaFilm, studio, jamTayang, nomorKursi, harga, tanggal);
    }

    // Implementasi method verifikasi dari interface Tiket
    // Menggunakan method verifikasi yang sudah ada di kelas Bioskop
    public boolean verifikasi(String kode) {
        return super.verifikasi(kode);
    }

    // Implementasi method info dari interface Tiket
    // Menggunakan method info yang sudah ada di kelas Bioskop
    public String info() {
        return super.info();
    }

    // Method tambahan untuk mencetak informasi tiket ke layar console
    public void cetakTiket() {
        System.out.println(info());
    }
}
