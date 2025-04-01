package Pertemuan5;

public class MataKuliahMain {
    public static void main(String[] args) {
        // Membuat objek matakuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "A", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "E", 3);

        // Menampilkan daftar matakuliah
        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

         //Menghitung IPK
        double totalNilai = (mk1.nilaiIndex() * mk1.getSks()) +
                (mk2.nilaiIndex() * mk2.getSks()) +
                (mk3.nilaiIndex() * mk3.getSks());
        int totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();
        double ipk = totalNilai / totalSks;

        System.out.println("--- Nilai IPK ---");
        System.out.printf("IPK: %.2f%n", ipk);
    }
}

