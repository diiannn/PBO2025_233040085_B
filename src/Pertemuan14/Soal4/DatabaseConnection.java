package Pertemuan14.Soal4;

public class DatabaseConnection {
    private static String connectionString;

    // Static block - dijalankan sekali saat kelas pertama kali dimuat
    static {
        System.out.println("Menginisialisasi koneksi database...");
        connectionString = "jdbc:mysql://localhost:3306/myapp_db?useSSL=false&serverTimezone=UTC";
        System.out.println("Inisialisasi database selesai!");
        System.out.println("Connection string telah diset.");
    }

    public static String getConnectionString() {
        return connectionString;
    }

    // Method untuk simulasi koneksi
    public static void connect() {
        System.out.println("Menghubungkan ke database dengan: " + connectionString);
    }

    private DatabaseConnection() {
        // Utility class - tidak perlu diinstansiasi
    }
}
