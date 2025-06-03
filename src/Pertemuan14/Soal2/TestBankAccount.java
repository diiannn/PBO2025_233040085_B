package Pertemuan14.Soal2;

public class TestBankAccount {
    public static void main(String[] args) {
        System.out.println("=== TEST BANK ACCOUNT ===");

        BankAccount account = new BankAccount("123456789", 1000000);
        account.displayAccountInfo();
        account.deposit(500000);
        System.out.println();

        SavingsAccount savings = new SavingsAccount("987654321", 2000000, 2.5);
        savings.displaySavingsAccountInfo();
        savings.applyInterest();
        System.out.println();
    }
}
