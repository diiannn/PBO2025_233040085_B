package Pertemuan6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai
{
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa)
    {
        super();
        this.mahasiswa = mahasiswa;
        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
    }

    public void hitungIPK()
    {
        // Bagaimana hitung IPK?
        // Rumus: (index nilai*sks)+(index nilai*sks)+..+(index nilai*sks)/total_sks
        double totalNilaiSks = 0.0;
        int totalSks = 0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            // Mendapatkan daftar matakuliah dari setiap KHS
            List<Matakuliah> daftarMatakuliah = khs.getDaftarMatakuliah();

            for (Matakuliah mk : daftarMatakuliah) {
                totalNilaiSks += mk.getNilai() * mk.getSks();
                totalSks += mk.getSks();
            }
        }

        if (totalSks > 0) {
            this.ipk = totalNilaiSks / totalSks;
        } else {
            this.ipk = 0.0;
        }
    }

    public void addKHS(KartuHasilStudi khs)
    {
        kartuHasilStudi.add(khs);
    }

    public void display()
    {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi)
        {
            System.out.println(khs.display());
        }
    }

    /* Setter & Getter */
    public Date getTglCetak() {
        return tglCetak;
    }

    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
        this.kartuHasilStudi = kartuHasilStudi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}