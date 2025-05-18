package Pertemuan_9.Tes1;

public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku() {
        this.judul = "Tidak ada judul";
        this.pengarang = "Tidak ada pengarang";
        this.tahunTerbit = 0;
    }

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void displayInfo() {
        System.out.println("=== Informasi Buku ===");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
