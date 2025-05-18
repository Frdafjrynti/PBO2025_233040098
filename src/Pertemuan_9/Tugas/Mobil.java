package Pertemuan_9.Tugas;

public class Mobil extends Kendaraan{
    private int jumlahPintu;
    private String tipeMesin;

    public Mobil(String merk, String warna, int tahunProduksi, int jumlahPintu, String tipeMesin) {
        super(merk, warna, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.tipeMesin = tipeMesin;
    }
    public int getJumlahPintu() {
        return jumlahPintu;
    }
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    public String getTipeMesin() {
        return tipeMesin;
    }
    public void setTipeMesin(String tipeMesin) {
        this.tipeMesin = tipeMesin;
    }
    @Override
    public void info() {
        System.out.println("\n---- Informasi Mobil ----");
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Tipe Mesin: " + tipeMesin);
    }
    public void klakson() {
        System.out.println("Mobil: " + merk + ", " + "bunyi: beep! beep!");
    }
}
