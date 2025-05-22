package Pertemuan13.Latihan;

abstract class Bentuk implements Geometri{
    protected String nama, warna;

    public Bentuk(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    // Method konkret yang dapat digunakan semua subclass
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
        System.out.println("-".repeat(30));
    }

    // Method abstrak yang harus diimplementasi subclass
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}
