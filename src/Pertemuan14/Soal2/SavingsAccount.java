package Pertemuan14.Soal2;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    /* ERROR: Method final tidak dapat di-override
    @Override
    public void displayAccountInfo() {
        // Compile error: Cannot override the final method from BankAccount
        System.out.println("Savings Account Info:");
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    */

    // SOLUSI: Buat method baru untuk kebutuhan khusus subclass
    public void displaySavingsAccountInfo() {
        System.out.println("=== SAVINGS ACCOUNT INFO ===");
        displayAccountInfo(); // Panggil method final dari parent
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Bunga " + interestRate + "% telah diterapkan.");
    }
}

