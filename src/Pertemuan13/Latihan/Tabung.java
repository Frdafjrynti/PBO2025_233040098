package Pertemuan13.Latihan;

class Tabung extends Lingkaran{
    private double tinggi;

    public Tabung(String warna, double jariJari, double tinggi) {
        super(warna, jariJari);
        this.nama = "Tabung"; // Override nama dari parent
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        // Luas permukaan tabung = 2πr² + 2πrt
        double luasAlas = super.hitungLuas(); // Menggunakan luas lingkaran
        double luasSelimut = 2 * Math.PI * getJariJari() * tinggi;
        return (2 * luasAlas) + luasSelimut;
    }

    @Override
    public double hitungKeliling() {
        // Keliling tabung sama dengan keliling lingkaran
        return super.hitungKeliling();
    }

    public double hitungVolume() {
        return super.hitungLuas() * tinggi; // Luas alas × tinggi
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jari-jari: " + getJariJari());
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
        System.out.println("Bentuk: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Luas Permukaan: " + hitungLuas());
        System.out.println("Keliling Alas: " + hitungKeliling());
        System.out.println("-".repeat(30));
    }
}
