package Pertemuan14.Soal3;

public class Counter {
    // Variabel static - dibagi oleh semua instance
    private static int instanceCount = 0;
    private int id;

    public Counter() {
        instanceCount++; // Increment setiap kali objek dibuat
        this.id = instanceCount;
        System.out.println("Counter #" + id + " telah dibuat");
    }

    // Method static untuk mengakses variabel static
    public static int getInstanceCount() {
        return instanceCount;
    }

    public int getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("Counter ID: " + id + ", Total instances: " + instanceCount);
    }
}
