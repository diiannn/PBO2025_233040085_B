package Pertemuan9.Tugas;

public class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur(){
        return umur;
    }
}
