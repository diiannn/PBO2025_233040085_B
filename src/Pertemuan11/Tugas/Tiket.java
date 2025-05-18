package Pertemuan11.Tugas;

// Interface Tiket mendefinisikan kontrak yang harus dipenuhi oleh kelas tiket
public interface Tiket {
    // Method untuk memverifikasi apakah kode tiket sesuai dengan input
    boolean verifikasi(String kode);

    // Method untuk mengembalikan informasi detail tiket dalam bentuk String
    String info();
}
