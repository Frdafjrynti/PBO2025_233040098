package Pertemuan14.Tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        System.out.println("=== Sistem Manajemen Data Mahasiswa ===");
        System.out.println("Total mahasiswa awal: " + Mahasiswa.getTotalMahasiswa());
        System.out.println("Maksimum SKS: " + Mahasiswa.MAX_SKS);
        System.out.println();

        // Membuat beberapa objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("2023001", "Ahmad Rizki");
        Mahasiswa mhs2 = new Mahasiswa("2023002", "Siti Nurhaliza");
        Mahasiswa mhs3 = new Mahasiswa("2023003", "Budi Santoso");

        System.out.println("\n=== Informasi Mahasiswa ===");

        // Menampilkan informasi masing-masing mahasiswa
        System.out.println("1. Mahasiswa 1");
        mhs1.displayFullInfo();

        System.out.println("2. Mahasiswa 2");
        mhs2.displayFullInfo();

        System.out.println("3. Mahasiswa 3");
        mhs3.displayFullInfo();

        // Menampilkan total mahasiswa
        System.out.println("=== Ringkasan ===");
        System.out.println("Total mahasiswa yang terdaftar: " + Mahasiswa.getTotalMahasiswa());

        // Demonstrasi error jika mencoba mengubah NIM (final variable)
        System.out.println("\nCatatan: NIM adalah final dan tidak dapat diubah");
        // mhs1.nim = "2023999"; // ERROR: Cannot assign a value to final variable

        // Demonstrasi perubahan nama (bukan final)
        System.out.println("\n--- Mengubah nama mahasiswa ---");
        mhs1.setNama("Ahmad Rizki Pratama");
        System.out.println("Nama mahasiswa 1 setelah diubah:");
        mhs1.displayInfo();

        // Membuat mahasiswa baru untuk membuktikan total terus bertambah
        System.out.println("\n--- Menambah mahasiswa baru ---");
        Mahasiswa mhs4 = new Mahasiswa("2023004", "Diana Sari");
        System.out.println("Total mahasiswa sekarang: " + Mahasiswa.getTotalMahasiswa());
    }
}
