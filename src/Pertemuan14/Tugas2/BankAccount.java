package Pertemuan14.Tugas2;

// penggunaan final pada varibel dan method
public class BankAccount {
    // Variabel final - harus diinisialisasi dan tidak dapat diubah
    private final String accountNumber;
    protected double balance; // menyimpan saldo

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber; // Inisialisasi final variable
        this.balance = 0.0;
    }

    public void deposit(double amount) { // menambah saldo
        if (amount > 0) {
            balance += amount;
            System.out.println("Berhasil deposit: Rp " + amount);
        }
    }

    // Method final - tidak dapat di-override oleh subclass
    public final void displayAccountInfo() {
        System.out.println("Nomor Rekening: " + accountNumber);
        System.out.println("Saldo: Rp " + balance);
    }

    // Getter untuk accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
}
