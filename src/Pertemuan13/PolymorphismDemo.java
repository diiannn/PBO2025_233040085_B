package Pertemuan13;

public class PolymorphismDemo {

     //Method main - Entry point program
     //Menjalankan berbagai demonstrasi polymorphism
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRASI POLYMORPHISM ===\n");

        // Membuat array dari tipe superclass (Bentuk)
        // Ini menunjukkan polymorphism: satu tipe dapat menampung berbagai objek
        Bentuk[] bentukArray = {
                new Lingkaran(5.0, "Merah"),
                new Tabung(3.0, 8.0, "Biru"),
                new Persegi(4.0, "Hijau"),
                new Lingkaran(7.0, "Kuning")
        };

        // Demonstrasi Polymorphism dengan loop
        System.out.println("1. POLYMORPHISM DALAM ARRAY:");
        for (Bentuk bentuk : bentukArray) {
            // Method yang sama dipanggil, tapi implementasi berbeda
            bentuk.tampilkanInfo();
        }

        // Demonstrasi Polymorphism dengan parameter method
        System.out.println("\n2. POLYMORPHISM DALAM METHOD PARAMETER:");
        hitungTotalLuas(bentukArray);

        // Demonstrasi Late Binding (Runtime Polymorphism)
        System.out.println("\n3. LATE BINDING DEMONSTRATION:");
        demonstrasiLateBinging();

        // Demonstrasi Interface Polymorphism
        System.out.println("\n4. INTERFACE POLYMORPHISM:");
        demonstrasiInterfacePolymorphism();
    }

    /**
     * Method hitungTotalLuas
     * Mendemonstrasikan polymorphism dalam parameter method
     * Menerima array bertipe superclass dan memproses berbagai objek turunan
     */
    public static void hitungTotalLuas(Bentuk[] bentukArray) {
        double totalLuas = 0;
        System.out.println("Menghitung total luas dari berbagai bentuk:");

        for (Bentuk bentuk : bentukArray) {
            double luas = bentuk.hitungLuas(); // Polymorphic method call
            System.out.printf("- %s: %.2f\n", bentuk.nama, luas);
            totalLuas += luas;
        }

        System.out.printf("Total Luas Semua Bentuk: %.2f\n", totalLuas);
    }

    /**
     * Method demonstrasiLateBinging
     * Menunjukkan konsep late binding dalam polymorphism
     * Runtime menentukan method mana yang dipanggil berdasarkan tipe objek sebenarnya
     */
    public static void demonstrasiLateBinging() {
        // Variabel bertipe superclass
        Bentuk bentuk;

        // Runtime menentukan method mana yang dipanggil
        bentuk = new Lingkaran(6.0, "Ungu");
        System.out.println("Bentuk sebagai Lingkaran:");
        prosessBentuk(bentuk);

        bentuk = new Tabung(4.0, 10.0, "Orange");
        System.out.println("Bentuk sebagai Tabung:");
        prosessBentuk(bentuk);
    }

    /**
     * Method prosessBentuk
     * Helper method untuk memproses objek Bentuk secara polymorphic
     */
    public static void prosessBentuk(Bentuk bentuk) {
        System.out.printf("Luas: %.2f\n", bentuk.hitungLuas());
        System.out.printf("Keliling: %.2f\n\n", bentuk.hitungKeliling());
    }

    /**
     * Method demonstrasiInterfacePolymorphism
     * Mendemonstrasikan polymorphism menggunakan interface
     * Objek dengan tipe interface yang berbeda dapat diperlakukan sama
     */
    public static void demonstrasiInterfacePolymorphism() {
        // Array bertipe interface
        Calculable[] objekCalculable = {
                new Lingkaran(3.0, "Pink"),
                new Tabung(2.0, 5.0, "Coklat"),
                new Persegi(6.0, "Abu-abu")
        };

        System.out.println("Menggunakan interface Calculable:");
        for (Calculable obj : objekCalculable) {
            System.out.printf("Objek dengan luas: %.2f dan keliling: %.2f\n",
                    obj.hitungLuas(), obj.hitungKeliling());
        }
    }
}