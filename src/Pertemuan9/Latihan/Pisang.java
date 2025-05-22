package Pertemuan9.Latihan;

public class Pisang extends Buah {
    private int panjang;
    private boolean kulitDikupas;

    // konstruktor yang memanggil konstruktor kelas induk
    public Pisang(String nama, String warna, boolean matang, int panjang, boolean kulitDikupas) {
        super(nama, warna, matang);
        this.panjang = panjang;
        this.kulitDikupas = kulitDikupas;
    }
    public int getPanjang() {
        return panjang;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public boolean isKulitDikupas() {
        return kulitDikupas;
    }
    public void setKulitDikupas(boolean kulitDikupas) {
        this.kulitDikupas = kulitDikupas;
    }
    @Override
    public void info() {
        System.out.println("PISANG");
        System.out.println("Nama: " + getNama());
        System.out.println("Warna: " + getWarna());
        System.out.println("Matang: " + (isMatang() ? "Yes" : "No"));
        System.out.println("Panjang: " + getPanjang() + "cm");
        System.out.println("Kulit Dikupas: " + (isKulitDikupas() ? "Yes" : "No"));
    }
    public void kupasKulit() {
        if (!isKulitDikupas()) {
            kulitDikupas = true;
            System.out.println("Pisang " + nama + " sedang dikupas kulitnya!");
        }else {
            System.out.println("Pisang " + nama + " sudah dikupas!");
        }
    }
}
