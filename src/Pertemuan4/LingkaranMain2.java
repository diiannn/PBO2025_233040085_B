package Pertemuan4;

public class LingkaranMain2 {
    public static void main(String[] args) {

        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;  // l2 mereferensikan objek yang sama dengan l1
        Lingkaran l3 = new Lingkaran(7); // l3 adalah objek baru

        System.out.println(l1.getJari2()); // Output: 5
        System.out.println(l2.getJari2()); // Output: 5
        System.out.println(l3.getJari2()); // Output: 7

        l2 = l3; // Sekarang l2 mereferensikan objek l3

        System.out.println(l1.getJari2()); // Output: 5
        System.out.println(l2.getJari2()); // Output: 7
        System.out.println(l3.getJari2()); // Output: 7
    }
}
