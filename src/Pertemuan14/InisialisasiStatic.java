package Pertemuan14;

// static block
public class InisialisasiStatic {
    public static int nilaiAwal;
    public static String konfigurasi;

    // Static block - dijalankan sekali saat kelas di-load
    // Static block - dijalankan SEKALI ketika kelas pertama kali di-load ke JVM
    // Dieksekusi SEBELUM constructor manapun dipanggil
    // Berguna untuk inisialisasi kompleks yang tidak bisa dilakukan di deklarasi variabl
    static {
        System.out.println("Static block dieksekusi");
        nilaiAwal = 10;
        konfigurasi = "Default Config";
        System.out.println("Inisialisasi selesai. Nilai awal: " + nilaiAwal);
    }

//    public static void tampilkanKonfigurasi() {
//        System.out.println("Konfigurasi: " + konfigurasi);
//    }
public static void main(String[] args) {
    System.out.println("Nilai awal diakses darai main: " + nilaiAwal);
}
    /* KEGUNAAN STATIC BLOCK:
     * - Inisialisasi static variables yang butuh logika kompleks
     * - Setup konfigurasi aplikasi
     * - Loading resources (file, database connection, dll)
     * - Validasi dan error handling saat class loading
     */
}
