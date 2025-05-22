package Pertemuan14;

// Final pada Kelas
// Final class tidak bisa dijadikan parent class (tidak bisa diwariskan)
// Contoh famous: String, Integer, Double adalah final class
final class KelasFinal {
    private String nama;

    public KelasFinal(String nama) {
        this.nama = nama;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
    }

    /* KAPAN MENGGUNAKAN FINAL CLASS:
     * - Ketika kelas sudah sempurna dan tidak perlu di-extend
     * - Untuk security (mencegah inheritance yang tidak diinginkan)
     * - Optimasi performance (JVM bisa melakukan optimasi lebih agresif)
     * - Immutable objects (seperti String)
     */
}
