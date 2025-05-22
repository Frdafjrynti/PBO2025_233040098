package Pertemuan14.Tugas4;

// inisialisasi dengan static block
public class DatabaseConnection {
    // Variabel static untuk menyimpan connection string
    private static String connectionString; // untuk menyimpan url koneksi ke db

    // Static block - dijalankan sekali saat kelas pertama kali di-load
    static { // menginisialisasi connectString
        System.out.println("Inisialisasi DatabaseConnection...");

        // Simulasi inisialisasi yang kompleks
        String server = "localhost";
        String database = "myapp_db";
        String port = "3306";
        String username = "admin";

        connectionString = "jdbc:mysql://" + server + ":" + port + "/" + database +
                "?user=" + username + "&useSSL=false";

        System.out.println("Database connection string berhasil diinisialisasi");
        System.out.println("Static block selesai dieksekusi");
    }

    // Method static untuk mengakses connection string
    public static String getConnectionString() {
        return connectionString;
    }

    // Method untuk simulasi koneksi
    public static void connect() {
        System.out.println("Menghubungkan ke database...");
        System.out.println("Connection String: " + connectionString);
        System.out.println("Koneksi berhasil!");
    }
}
