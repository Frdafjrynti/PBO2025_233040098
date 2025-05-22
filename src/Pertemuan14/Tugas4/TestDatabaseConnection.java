package Pertemuan14.Tugas4;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        System.out.println("=== Test Database Connection ===");
        System.out.println("Memanggil getConnectionString() pertama kali...");

        // Static block akan dijalankan saat kelas pertama kali diakses
        String connStr = DatabaseConnection.getConnectionString();
        System.out.println("Connection String: " + connStr);

        System.out.println("\n--- Simulasi Koneksi ---");
        DatabaseConnection.connect();

        System.out.println("\n--- Memanggil lagi (static block tidak dijalankan lagi) ---");
        DatabaseConnection.connect();
    }
}
