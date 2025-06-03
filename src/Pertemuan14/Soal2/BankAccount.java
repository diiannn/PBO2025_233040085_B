package Pertemuan14.Soal2;

public class BankAccount {
    // Variabel final - tidak dapat diubah setelah inisialisasi
    private final String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber; // Hanya dapat diset sekali
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit berhasil. Saldo sekarang: " + balance);
        }
    }

    // Method final - tidak dapat di-override oleh subclass
    public final void displayAccountInfo() {
        System.out.println("Nomor Rekening: " + accountNumber);
        System.out.println("Saldo: " + balance);
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
