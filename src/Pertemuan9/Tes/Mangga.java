package Pertemuan9.Tes;

public class Mangga extends Buah{
    public Mangga(String varietas, String warna, double harga, double stok) {
        super("Mangga " + varietas, warna, harga, stok, "buah");
    }

    // Metode khusus untuk mangga
    public void info() {
        super.info();
        System.out.println("Jenis: Mangga");
        System.out.println("Cara Konsumsi: Lebih baik dikupas dan dipotong");
    }
}
