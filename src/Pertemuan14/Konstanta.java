package Pertemuan14;

// kombinasi static final (konstanta global) bisa diakses dari mana saja tanpa membuat object
public class Konstanta {
    public static final double PI = 3.141592653589793;
    public static final String NAMA_APLIKASI = "MyApp";
//    public static final int VERSI_MAYOR = 1;
//    public static final int VERSI_MINOR = 0;

    // Method utility untuk menampilkan info aplikasi
    public static void tampilkanInfoAplikasi() {
        System.out.println("=== INFO APLIKASI ===");
        System.out.println("Nama: " + NAMA_APLIKASI);
//        System.out.println("Versi: " + VERSI_MAYOR + "." + VERSI_MINOR);
        System.out.println("Nilai PI: " + PI);
    }
}
