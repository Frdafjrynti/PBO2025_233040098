package Pertemuan13.Latihan;

class Lingkaran extends Bentuk {
    private double jariJari;

    public Lingkaran(String warna, double jariJari) {
        super("Lingkaran", warna);
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jari-jari: " + jariJari);
        super.tampilkanInfo();
    }
}
