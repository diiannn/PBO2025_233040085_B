package Pertemuan4;

public class LingkaranMain1 {
        public static void main(String[] args) {
        //contoh 1
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;  // l2 mereferensikan objek yang sama dengan l1

        System.out.println(l1.getJari2()); // Output: 5
        System.out.println(l2.getJari2()); // Output: 5

        l2.setJari2(10);

        System.out.println(l1.getJari2()); // Output: 10
        System.out.println(l2.getJari2()); // Output: 10
    }
}

