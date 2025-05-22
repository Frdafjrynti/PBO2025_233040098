package Pertemuan14.Tugas2;

public class TestBankAccount {
    public static void main(String[] args) {
        System.out.println("=== Test Bank Account ===");

        BankAccount account = new BankAccount("123456789");
        account.deposit(1000000);
        account.displayAccountInfo();

        System.out.println("\n=== Test Savings Account ===");
        SavingsAccount savings = new SavingsAccount("987654321", 2.5);
        savings.deposit(2000000);
        savings.addInterest();
        savings.displaySavingsInfo();

        System.out.println("\nCatatan: Method displayAccountInfo() adalah final dan tidak dapat di-override");
    }
}
