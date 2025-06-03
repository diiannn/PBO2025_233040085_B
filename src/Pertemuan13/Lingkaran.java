package Pertemuan13;

public class Lingkaran extends Bentuk {
    private double jariJari;

    public Lingkaran(double jariJari, String warna) {
        super("Lingkaran", warna);
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }
}