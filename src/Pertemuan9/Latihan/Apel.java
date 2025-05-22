package Pertemuan9.Latihan;

public class Apel extends Buah{
    private String Varietas;
    private boolean manis;

    // konnatruktor yang memanggil kosntruktor kelas induk
    public Apel(String nama, String warna, boolean matang, String varietas, boolean manis) {
        super(nama, warna, matang);
        this.Varietas = varietas;
        this. manis = manis;
    }
    public String getVarietas() {
        return Varietas;
    }
    public void setVarietas(String varietas) {
        this.Varietas = varietas;
    }
    public boolean isManis() {
        return manis;
    }
    public void setManis(boolean manis) {
        this.manis = manis;
    }
    // override metode dari kelas induk
    @Override
    public void info() {
        System.out.println("APEL");
        System.out.println("Nama: " + getNama());
        System.out.println("Warna: " + getWarna());
        System.out.println("Matang: " + (isMatang() ? "Yes" : "No"));
        System.out.println("Varietas: " + getVarietas());
        System.out.println("Manis: " + (isManis() ? "Yes" : "No"));
    }
    public void kupas() {
        System.out.println("Apel " + nama + " sedang dikupas!");
    }
}

