package Pertemuan9.Tugas;

public class Motor extends Kendaraan{
    private int cc;
    private String tipeTransmisi;

    public Motor(String merk, String warna, int tahunProduksi, int cc, String tipeTransmisi) {
        super(merk, warna, tahunProduksi);
        this.cc = cc;
        this.tipeTransmisi = tipeTransmisi;
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    public String getTipeTransmisi() {
        return tipeTransmisi;
    }
    public void setTipeTransmisi(String tipeTransmisi) {
        this.tipeTransmisi = tipeTransmisi;
    }
    @Override
    public void info(){
        System.out.println("\n---- Informasi Motor ----");
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Kapasitas Mesin: " + cc + " cc");
        System.out.println("Tipe Transmisi: " + tipeTransmisi);
    }
    public void rev() {
        System.out.println("Merk: " + merk + ", " + "bunyi: ngeengg!");
    }
}
