package Pertemuan14.Tugas2;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    // ERROR: Tidak bisa override method final
    // public void displayAccountInfo() { // COMPILE ERROR!
    //     System.out.println("Savings Account Info:");
    //     super.displayAccountInfo();
    // }

    // Solusi: Buat method baru dengan nama berbeda
    public void displaySavingsInfo() {
        System.out.println("=== Informasi Rekening Tabungan ===");
        displayAccountInfo(); // Memanggil method final dari parent
        System.out.println("Suku Bunga: " + interestRate + "%");
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Bunga ditambahkan: Rp " + interest);
    }
}
