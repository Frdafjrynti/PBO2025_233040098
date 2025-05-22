package Pertemuan9.Tes;

public class Pisang extends Buah {
    public Pisang(String varietas, String warna, double harga, double stok) {
        super("Pisang " + varietas, warna, harga, stok, "sisir");
    }

    // Metode khusus untuk buah pisang
    public void info() {
        super.info();
        System.out.println("Jenis: Pisang");
        System.out.println("Cara Konsumsi: Bisa langsung dikupas dan dimakan");
    }
}
