package Pertemuan9.Tes;

public class Apel extends Buah {
    public Apel(String varietas, String warna, double harga, double stok) {
        super("Apel " + varietas, warna, harga, stok, "kg ");
    }

    // Metode khusus untuk apel
    public void info() {
        super.info();
        System.out.println("Jenis: Apel");
        System.out.println("Cara Konsumsi: Bisa langsung dimakan atau diparut untuk jus/salad");
    }
}
