package Pertemuan9.Latihan4;

public class InheritanceMain {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("001", "Dian Astri", "Bandung");
        System.out.println(mhs.getNrp()+
                            "-"+ mhs.getNama()+
                            "-"+ mhs.getAlamat());
    }
}
