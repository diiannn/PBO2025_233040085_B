package Pertemuan3;

public class Lingkaran {
    private double jari2;
    private final static double PHI = 3.14;

    public Lingkaran () {
        jari2 = 10;
    }
    public double hitungluas (){
        return PHI * jari2 * jari2;
    }
}
