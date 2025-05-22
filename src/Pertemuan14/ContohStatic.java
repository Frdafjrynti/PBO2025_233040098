package Pertemuan14;

// static pada variabel dan method
public class ContohStatic {
    // Static variable: milik kelas, bukan instance
    // Shared oleh semua object dari kelas ini
    public static int hitungObyek = 0; // Variabel static untuk menghitung jumlah objek
//    private String nama;

    // Constructor
    public ContohStatic(String nama) {
//        this.nama = nama;
        hitungObyek++; // Increment setiap kali objek dibuat
    }

    // Method static
    // Static method: bisa dipanggil tanpa membuat object
    public static void tampilkanJumlahObyek() {
        System.out.println("Jumlah objek yang telah dibuat: " + hitungObyek);
        // System.out.println(nama); // Error! Static method tidak bisa akses instance variable
        /* KENAPA ERROR?
         * Static method dipanggil melalui class, bukan object
         * Jadi tidak tahu instance variable mana yang harus diakses
         */
    }

    // Method instance
    // Instance method: harus dipanggil melalui object
    // Bisa mengakses static dan instance members
    public void tampilkanNama() {
//        System.out.println("Nama objek: " + nama);
        System.out.println("Jumlah objek yang telah dibuat: " + hitungObyek); // Bisa akses static variable
    }
    /* PERBEDAAN STATIC vs INSTANCE:
     * Static: milik kelas, shared, akses tanpa object
     * Instance: milik object, individual, butuh object untuk akses
     */

}
