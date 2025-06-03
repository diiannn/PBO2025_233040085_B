package Pertemuan13;

public class Persegi extends Bentuk {
    private double sisi;

    public Persegi(double sisi, String warna) {
        super("Persegi", warna);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
