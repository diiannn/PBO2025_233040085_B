package Pertemuan6;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    //menyimpan daftar mata kuliah
    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    //Menambah matakuliah kedaftar
    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Semester: ").append(semester).append("\n");
        for (Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }

        return sb.toString();
    }

    //hitung IPs
    public void hitungIPS()
    {
        // Implementasi hitungIPS
        double totalSkor = 0;
        int totalSKS = 0;

        for (Matakuliah mk : daftarMatakuliah) {
            totalSkor += mk.getNilai() * mk.getSks();
            totalSKS += mk.getSks();
        }

        if (totalSKS != 0) {
            this.ips = totalSkor / totalSKS;
        } else {
            this.ips = 0.0;
        }
    }

    /* Setter & Getter ----> mmengambil mengatur nilai*/
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIps() {
        return ips;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }

    public int getTotalSks() {
        int totalSks = 0;
        for (Matakuliah mk : daftarMatakuliah) {
            totalSks += mk.getSks();
        }
        return totalSks; // mengembalikan total sks setelah seluruh perhitungan selesai
    }
}