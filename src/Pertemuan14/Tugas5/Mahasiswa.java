package Pertemuan14.Tugas5;

// aplikasi manajemen data mahasiswa
public class Mahasiswa {
    // Variabel final - NIM tidak dapat diubah
    private final String nim;
    private String nama;

    // Variabel static - shared oleh semua instance
    private static int totalMahasiswa = 0;

    // Konstanta static final - nilai global yang tidak berubah
    public static final int MAX_SKS = 24;

    // Constructor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim; // Inisialisasi final variable
        this.nama = nama;
        totalMahasiswa++; // Increment setiap kali mahasiswa baru dibuat
        System.out.println("Mahasiswa baru terdaftar: " + nama);
    }

    // Method untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Maksimum SKS: " + MAX_SKS);
    }

    // Method static untuk mengakses total mahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    // Getter methods
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method untuk menampilkan informasi lengkap dengan total mahasiswa
    public void displayFullInfo() {
        displayInfo();
        System.out.println("Total mahasiswa terdaftar: " + getTotalMahasiswa());
        System.out.println("--------------------");
    }
}
