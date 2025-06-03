package Pertemuan14.Soal4;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        System.out.println("=== TEST DATABASE CONNECTION ===");
        System.out.println("Mengakses DatabaseConnection untuk pertama kali...");

        // Static block akan dijalankan saat kelas pertama kali diakses
        String connStr = DatabaseConnection.getConnectionString();
        System.out.println("Connection String: " + connStr);

        DatabaseConnection.connect();
        System.out.println();
    }
}
