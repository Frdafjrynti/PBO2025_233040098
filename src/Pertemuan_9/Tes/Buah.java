package Pertemuan_9.Tes;

public class Buah {
    protected String nama;
    protected String warna;
    protected double harga;
    protected double stok;
    protected String jenisJual;

    public Buah(String nama, String warna, double harga, double stok, String jenisJual) {
        this.nama = nama;
        this.warna = warna;
        this.harga = harga;
        this.stok = stok;
        this.jenisJual = jenisJual;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double getStok() {
        return stok;
    }
    public void setStok(double stok) {
        this.stok = stok;
    }
    public String getJenisJual() {
        return jenisJual;
    }
    public void setJenisJual(String jenisJual) {
        this.jenisJual = jenisJual;
    }
    // menambah stok
    public void tambahStok(double jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok: " + nama + " bertambah" + jumlah + " " + jenisJual);
        }else {
            System.out.println("Jumlah tidak valid!");
        }
    }
    // mengurangi stok
    public boolean jual(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tidak valid!");
            return false;
        }
        if (jumlah > stok) {
            System.out.println("Stok " + nama + " tidak mencukupi!");
            return false;
        }
        stok -= jumlah;
        double total = jumlah * harga;
        System.out.println("Penjualan " + nama + " sebanyak " + jumlah + " " + jenisJual);
        System.out.println("Total harga: Rp." + total);
        return true;
    }
    // menghitung nilai total buah dalam stok
    public double hitungNilaiTotal() {
        return stok * harga;
    }
    // untuk memeberikan diskon
    public void diskon(double persentase) {
        if (persentase > 0 && persentase <= 100) {
            double hargaLama = harga;
            harga = harga * (1 -(persentase / 100));
            System.out.println("Harga: " + nama + " turun dari Rp." + hargaLama + " menjadi Rp." + harga + " per " + jenisJual);
        }else {
            System.out.println("Persentase diskon tidak valid!");
        }
    }
    // menampilkan informasi buah
    public void info() {
        System.out.println("==== Informasi Buah ===");
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna + " per " + jenisJual);
        System.out.println("Harga: Rp." + harga);
        System.out.println("Stok: " + stok + "  " + jenisJual);
        System.out.println("Nilai Total: Rp. " + hitungNilaiTotal());
        System.out.println("====================");
    }
}
