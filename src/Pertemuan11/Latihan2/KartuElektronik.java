package Pertemuan11.Latihan2;

// KartuElektronik mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu {
    private String kodeBank; // Menyimpan kode bank
    private String pin;      // Menyimpan PIN

    // Konstruktor menerima kode bank dan pin
    public KartuElektronik(String kodeBank, String pin) {
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    // Implementasi method otentikasi
    @Override
    public boolean otentikasi(String pinInput) {
        // Membandingkan input dengan PIN yang tersimpan
        return pin.equals(pinInput);
    }

    // Implementasi method encode
    @Override
    public String encode(String pin) {
        // Menggabungkan kode bank dan pin sebagai hasil encode
        return kodeBank + pin;
    }
}

