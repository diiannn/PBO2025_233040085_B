package Pertemuan9.Tugas;

public class InheritanceMain {

    public static void main(String[] args) {
        Kucing k= new Kucing ("Milo", 2, "Anggora","Putih", "Biru");
        System.out.println("Nama: "+ k.getNama());
        System.out.println("umur: "+ k.getUmur() + " tahun");
        System.out.println("Ras: "+ k.getRas());
        System.out.println("Warna Mata: "+ k.getWarnaMata());
        System.out.println("Warna Bulu: "+ k.getWarnaBulu());
    }
}
