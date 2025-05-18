package Pertemuan_9.Latihan;

public class Buah {
    protected String nama;
    protected String warna;
    protected boolean matang;

    public Buah(String nama, String warna, boolean matang) {
        this.nama = nama;
        this.warna = warna;
        this.matang = matang;
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
    public boolean isMatang() {
        return matang;
    }
    public void setMatang(boolean matang) {
        this.matang = matang;
    }
    public void info() {
//        System.out.println("=== BUAH ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Warna: " + getWarna());
        System.out.println("Matang: " + (isMatang() ? "Yes" : "No"));
    }
}
