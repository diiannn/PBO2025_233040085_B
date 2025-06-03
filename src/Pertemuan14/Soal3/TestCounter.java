package Pertemuan14.Soal3;

public class TestCounter {
    public static void main(String[] args) {
        System.out.println("=== TEST COUNTER ===");
        System.out.println("Instance count awal: " + Counter.getInstanceCount());

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Total objek Counter yang dibuat: " + Counter.getInstanceCount());

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
        System.out.println();
    }
}
