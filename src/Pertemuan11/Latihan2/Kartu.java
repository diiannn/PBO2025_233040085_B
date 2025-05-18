package Pertemuan11.Latihan2;

// Interface Kartu mendefinisikan dua method abstrak
public interface Kartu {
    // Method untuk autentikasi berdasarkan PIN
    public boolean otentikasi(String pin);

    // Method untuk mengembalikan data yang terenkripsi
    public String encode(String pin);
}
