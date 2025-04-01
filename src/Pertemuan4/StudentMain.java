package Pertemuan4;

public class StudentMain {
    public static void main(String[] args) {
        Student x = new Student();
        Student y = x; // y mengacu ke objek yang sama dengan x
        x.setNrp("23304001");
        y.setNrp("23304002"); // Karena y dan x menunjuk objek yang sama, perubahan juga berdampak pada x

        System.out.println(x.getNrp()); // Output: 23304002

        Student z = new Student();
        z.setNrp("23304003");
        x = z; // x sekarang menunjuk ke objek baru z, tetapi y masih menunjuk ke objek lama

        System.out.println(x.getNrp()); // Output: 23304003
        System.out.println(y.getNrp()); // Output: 23304002
    }
}


