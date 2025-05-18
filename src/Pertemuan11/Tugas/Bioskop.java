package Pertemuan11.Tugas;

// Kelas abstrak Bioskop sebagai blueprint untuk tiket bioskop
public abstract class Bioskop {
    // Properti yang menyimpan data tiket bioskop
    protected String kodeTiket;    // Kode unik tiket
    protected String namaFilm;     // Nama film yang diputar
    protected String studio;       // Studio bioskop tempat film diputar
    protected String jamTayang;    // Jam tayang film
    protected String nomorKursi;   // Nomor kursi penonton
    protected double harga;        // Harga tiket
    protected String tanggal;      // Tanggal pemutaran film

    // Konstruktor untuk menginisialisasi objek Bioskop dengan data lengkap
    public Bioskop(String kodeTiket, String namaFilm, String studio,
                   String jamTayang, String nomorKursi, double harga, String tanggal) {
        this.kodeTiket = kodeTiket;
        this.namaFilm = namaFilm;
        this.studio = studio;
        this.jamTayang = jamTayang;
        this.nomorKursi = nomorKursi;
        this.harga = harga;
        this.tanggal = tanggal;
    }

    // Method untuk memverifikasi apakah kode tiket sama dengan input
    public boolean verifikasi(String kode) {
        // Membandingkan kode tiket dengan kode input, case-insensitive
        return this.kodeTiket.equalsIgnoreCase(kode);
    }

    // Method untuk menampilkan informasi lengkap tiket bioskop
    public String info() {
        return "Kode Tiket : " + kodeTiket +
                "Film       : " + namaFilm +
                "Studio     : " + studio +
                "Jam Tayang : " + jamTayang +
                "Kursi      : " + nomorKursi +
                "Harga      : Rp" + harga +
                "Tanggal    : " + tanggal;
    }
}
