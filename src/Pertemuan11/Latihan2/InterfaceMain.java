package Pertemuan11.Latihan2;

// Kelas utama untuk menjalankan program interface
public class InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek kartu dengan kode bank "Bank1" dan pin "1234"
        KartuElektronik kartu = new KartuElektronik("Bank1", "1234");
        // Menampilkan hasil otentikasi (true jika PIN cocok)
        System.out.println("Otentikasi: " + kartu.otentikasi("1234"));
    }
}

